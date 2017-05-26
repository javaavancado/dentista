package br.com.kontrol.controle;

import br.com.kontrol.entidade.Fornecedor;
import br.com.kontrol.facade.FornecedorFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class FornecedorControle implements Serializable {

    @Inject
    private FornecedorFacade fornecedorFacade;
    private Fornecedor fornecedor;

    public void novo() {
        fornecedor = new Fornecedor();
    }

    public void excluir(Fornecedor fo) {
        fornecedorFacade.excluir(fo);
    }

    public void editar(Fornecedor fo) {
        this.fornecedor = fo;
    }

    public void salvar() {
        fornecedorFacade.salvar(fornecedor);
    }

    public List<Fornecedor> listaTodos() {
        return fornecedorFacade.listaTodos();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
