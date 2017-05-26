package br.com.kontrol.controle;

import br.com.kontrol.entidade.Medico;
import br.com.kontrol.facade.MedicoFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class MedicoControle implements Serializable {

    @Inject
    private MedicoFacade medicoFacade;
    private Medico medico;

    @PostConstruct
    public void init() {
        novo();
    }

    public void novo() {
        medico = new Medico();
    }

    public void excluir(Medico m) {
        medicoFacade.excluir(m);
    }

    public void editar(Medico m) {
        this.medico = m;
    }

    public void salvar() {
        medicoFacade.salvar(medico);
    }

    public List<Medico> listaTodos() {
        return medicoFacade.listaTodos();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
