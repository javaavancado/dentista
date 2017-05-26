package br.com.kontrol.facade;

import br.com.kontrol.entidade.Consulta;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class ConsultaFacade extends AbstractFacade<Consulta> {

    @Inject
    private EntityManager em;

    public ConsultaFacade() {
        super(Consulta.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
