package br.com.kontrol.facade;

import br.com.kontrol.entidade.Usuario;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.kontrol.persistencia.Transacional;
import br.com.kontrol.util.Criptografia;

@SuppressWarnings("serial")
@Transacional
public class UsuarioFacade extends AbstractFacade<Usuario> implements Serializable {

    @Inject
    private EntityManager em;

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Usuario pesquisaUsuario(String login, String senha) {
        Query query = em.createQuery("FROM Usuario AS u WHERE u.login='" + login + "' AND u.senha='" + Criptografia.md5(senha) + "'");
        if (query.getResultList().size() == 1) {
            return (Usuario) query.getResultList().get(0);
        }
        return null;
    }

}
