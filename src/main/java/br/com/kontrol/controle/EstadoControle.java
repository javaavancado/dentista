package br.com.kontrol.controle;

import br.com.kontrol.entidade.Estado;
import br.com.kontrol.facade.EstadoFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class EstadoControle implements Serializable {

    @Inject
    private EstadoFacade estadoFacade;
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void novo() {
        estado = new Estado();
    }

    public void excluir(Estado e) {
        estadoFacade.excluir(e);
    }

    public void editar(Estado e) {
        this.estado = e;
    }

    public void salvar() {
        estadoFacade.salvar(estado);
    }

    public List<Estado> listaTodos() {
        return estadoFacade.listaTodos();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
