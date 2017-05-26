package br.com.kontrol.facade;

import br.com.kontrol.entidade.Medico;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class MedicoFacade extends AbstractFacade<Medico> {

    @Inject
    private EntityManager em;

    public MedicoFacade() {
        super(Medico.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
