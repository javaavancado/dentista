package br.com.kontrol.controle;

import br.com.kontrol.converter.ConverterGenerico;
import br.com.kontrol.entidade.Paciente;
import br.com.kontrol.facade.CidadeFacade;
import br.com.kontrol.facade.EstadoFacade;
import br.com.kontrol.facade.PacienteFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class PacienteControle implements Serializable {

    @Inject
    private PacienteFacade pacienteFacade;
    @Inject
    private Paciente paciente;
    private EstadoFacade estadoFacade;
    private ConverterGenerico converterEstado;
    private CidadeFacade cidadeFacade;
    private ConverterGenerico converterCidade;

    public ConverterGenerico getConverterEstado() {
        if (converterEstado == null) {
            converterEstado = new ConverterGenerico(estadoFacade);
        }
        return converterEstado;
    }

    public ConverterGenerico getConverterCidade() {
        if (converterCidade == null) {
            converterCidade = new ConverterGenerico(cidadeFacade);
        }
        return converterCidade;
    }

    public void setConverterEstado(ConverterGenerico converterEstado) {
        this.converterEstado = converterEstado;
    }

    public void setConverterCidade(ConverterGenerico converterCidade) {
        this.converterCidade = converterCidade;
    }

    public void novo() {
        paciente = new Paciente();
    }

    public void excluir(Paciente p) {
        pacienteFacade.excluir(p);
    }

    public void editar(Paciente p) {
        this.paciente = p;
    }

    public void salvar() {
        pacienteFacade.salvar(paciente);
    }

    public List<Paciente> listaTodos() {
        return pacienteFacade.listaTodos();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
