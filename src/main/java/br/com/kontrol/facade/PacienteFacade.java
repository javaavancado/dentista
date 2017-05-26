package br.com.kontrol.facade;

import br.com.kontrol.entidade.Paciente;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class PacienteFacade extends AbstractFacade<Paciente> {

    @Inject
    private EntityManager em;

    public PacienteFacade() {
        super(Paciente.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
