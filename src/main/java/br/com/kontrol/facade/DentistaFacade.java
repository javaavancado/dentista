package br.com.kontrol.facade;

import br.com.kontrol.entidade.Dentista;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class DentistaFacade extends AbstractFacade<Dentista> {

    @Inject
    private EntityManager em;

    public DentistaFacade() {
        super(Dentista.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
