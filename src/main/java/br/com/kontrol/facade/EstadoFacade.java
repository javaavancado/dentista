package br.com.kontrol.facade;

import br.com.kontrol.entidade.Estado;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.kontrol.persistencia.Transacional;

@SuppressWarnings("serial")
@Transacional
public class EstadoFacade extends AbstractFacade<Estado>{

    @Inject
    private EntityManager em;

    public EstadoFacade() {
        super(Estado.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
