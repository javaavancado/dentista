package br.com.kontrol.facade;

import br.com.kontrol.entidade.Fornecedor;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class FornecedorFacade extends AbstractFacade<Fornecedor> {

    @Inject
    private EntityManager em;

    public FornecedorFacade() {
        super(Fornecedor.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
