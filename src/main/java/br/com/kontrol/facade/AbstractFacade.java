package br.com.kontrol.facade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@SuppressWarnings("serial")
public abstract class AbstractFacade<T> implements Serializable {
    
    private Class<T> entityClass;
    
    protected abstract EntityManager getEntityManager();
    
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public void salvar(T objeto) {
        getEntityManager().merge(objeto);
    }
    
    public void excluir(T objeto) {
        getEntityManager().remove(getEntityManager().merge(objeto));
    }
    
    public T pesquisarId(Long id) {
        return getEntityManager().find(entityClass, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<T> listaTodos() {
        Query q = getEntityManager().createQuery("from " + entityClass.getSimpleName());
        return q.getResultList();
    }
    
}
