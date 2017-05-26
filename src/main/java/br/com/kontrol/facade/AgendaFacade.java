package br.com.kontrol.facade;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.kontrol.entidade.Agenda;
import br.com.kontrol.persistencia.Transacional;

@SuppressWarnings("serial")
@Transacional
public class AgendaFacade extends AbstractFacade<Agenda> {

    @Inject
    private EntityManager em;

    public AgendaFacade() {
        super(Agenda.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
