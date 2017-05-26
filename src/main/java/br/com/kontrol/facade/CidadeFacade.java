package br.com.kontrol.facade;

import br.com.kontrol.entidade.Cidade;
import br.com.kontrol.persistencia.Transacional;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@SuppressWarnings("serial")
@Transacional
public class CidadeFacade extends AbstractFacade<Cidade> {

    @Inject
    private EntityManager em;

    public CidadeFacade() {
        super(Cidade.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
