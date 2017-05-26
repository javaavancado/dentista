package br.com.kontrol.controle;

import br.com.kontrol.converter.ConverterGenerico;
import br.com.kontrol.entidade.Grupo;
import br.com.kontrol.facade.GrupoFacade;
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
public class GrupoControle implements Serializable {

    private Grupo grupo;
    @Inject
    private GrupoFacade grupoFacade;
    private ConverterGenerico converterGenerico;

    public ConverterGenerico converter() {
        if (converterGenerico == null) {
            converterGenerico = new ConverterGenerico(grupoFacade);
        }
        return converterGenerico;
    }

    public void novo() {
        grupo = new Grupo();
    }

    public String salvar() {
        try {
            grupoFacade.salvar(grupo);
            return "list?faces-redirect=true";
        } catch (Exception ex) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), "");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return null;
    }

    public String excluir(Grupo g) {
        grupoFacade.excluir(g);
        return "list?faces-redirect=true";
    }

    public List<Grupo> getlistaTodos() {
        return grupoFacade.listaTodos();
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
