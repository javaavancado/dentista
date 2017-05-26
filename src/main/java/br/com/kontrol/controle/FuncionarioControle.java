package br.com.kontrol.controle;

import br.com.kontrol.converter.ConverterGenerico;
import br.com.kontrol.entidade.Funcionario;
import br.com.kontrol.facade.FuncionarioFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class FuncionarioControle implements Serializable {

    @Inject
    private FuncionarioFacade funcionarioFacade;
    @Inject
    private Funcionario funcionario;
    private ConverterGenerico converterFuncionario;

    public ConverterGenerico getConverterFuncionario() {
        if (converterFuncionario == null) {
            converterFuncionario = new ConverterGenerico(funcionarioFacade);
        }
        return converterFuncionario;
    }

    public void setConverterFuncionario(ConverterGenerico converterFuncionario) {
        this.converterFuncionario = converterFuncionario;
    }

    public void novo() {
        funcionario = new Funcionario();
    }

    public void exclui(Funcionario f) {
        funcionarioFacade.excluir(f);
    }

    public void editar(Funcionario f) {
        this.funcionario = f;
    }

    public void salvar() {
        funcionarioFacade.salvar(funcionario);
    }

    public List<Funcionario> listaTodos() {
        return funcionarioFacade.listaTodos();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
