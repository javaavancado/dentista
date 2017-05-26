package br.com.kontrol.controle;

import br.com.kontrol.entidade.Dentista;
import br.com.kontrol.facade.DentistaFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class DentistaControle implements Serializable {

    @Inject
    private DentistaFacade dentistaFacade;
    private Dentista dentista;

    public void novo() {
        dentista = new Dentista();
    }

    public void excluir(Dentista d) {
        dentistaFacade.excluir(d);
    }

    public void editar(Dentista d) {
        this.dentista = d;
    }

    public void salvar() {
        dentistaFacade.salvar(dentista);
    }

    public List<Dentista> listaTodos() {
        return dentistaFacade.listaTodos();
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

}
