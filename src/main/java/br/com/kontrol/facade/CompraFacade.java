package br.com.kontrol.facade;

import br.com.kontrol.entidade.Compra;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class CompraFacade extends AbstractFacade<Compra> {

    @Inject
    private EntityManager em;

    public CompraFacade() {
        super(Compra.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
