package br.com.kontrol.facade;

import br.com.kontrol.entidade.Grupo;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.kontrol.persistencia.Transacional;

@SuppressWarnings("serial")
@Transacional
public class GrupoFacade extends AbstractFacade<Grupo> implements Serializable {

    @Inject
    private EntityManager em;

    public GrupoFacade() {
        super(Grupo.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
