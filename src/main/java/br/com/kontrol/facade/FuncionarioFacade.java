package br.com.kontrol.facade;

import br.com.kontrol.entidade.Funcionario;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class FuncionarioFacade extends AbstractFacade<Funcionario> {

    @Inject
    private EntityManager em;

    public FuncionarioFacade() {
        super(Funcionario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
