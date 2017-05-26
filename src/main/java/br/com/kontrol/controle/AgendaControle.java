package br.com.kontrol.controle;

import br.com.kontrol.entidade.Agenda;
import br.com.kontrol.facade.AgendaFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class AgendaControle implements Serializable {

    @Inject
    private AgendaFacade agendaFacade;
    private Agenda agenda;

    public void novo() {
        agenda = new Agenda();
    }

    public void excluir(Agenda ag) {
        agendaFacade.excluir(ag);
    }

    public void editar(Agenda ag) {
        this.agenda = ag;
    }

    public void salvar() {
        agendaFacade.salvar(agenda);
    }

    public List<Agenda> listaTodos() {
        return agendaFacade.listaTodos();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

}
