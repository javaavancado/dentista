package br.com.kontrol.facade;

import br.com.kontrol.entidade.ContasPagarReceber;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class ContasPagarReceberFacade extends AbstractFacade<ContasPagarReceber> {

    @Inject
    private EntityManager em;

    public ContasPagarReceberFacade() {
        super(ContasPagarReceber.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
