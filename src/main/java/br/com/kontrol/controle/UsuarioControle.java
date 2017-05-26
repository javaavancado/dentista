package br.com.kontrol.controle;

import br.com.kontrol.converter.ConverterGenerico;
import br.com.kontrol.enumerador.NivelAcesso;
import br.com.kontrol.entidade.Usuario;
import br.com.kontrol.facade.UsuarioFacade;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@ViewScoped
public class UsuarioControle implements Serializable {

    private Usuario usuario;
    @Inject
    private UsuarioFacade usuarioFacade;
    private ConverterGenerico converterGenerico;

    public ConverterGenerico converter() {
        if (converterGenerico == null) {
            converterGenerico = new ConverterGenerico(usuarioFacade);
        }
        return converterGenerico;
    }

    public void novo() {
        usuario = new Usuario();
    }

    public String salvar() {
        try {
            usuarioFacade.salvar(usuario);
            return "list?faces-redirect=true";
        } catch (Exception ex) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), "");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return null;
    }

    public String excluir(Usuario u) {
        usuarioFacade.excluir(u);
        return "list?faces-redirect=true";
    }

    public List<Usuario> listaTodos() {
        return usuarioFacade.listaTodos();
    }

    public NivelAcesso[] getNiveisAcesso() {
        return NivelAcesso.values();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
