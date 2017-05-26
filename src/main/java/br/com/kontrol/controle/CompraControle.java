package br.com.kontrol.controle;

import br.com.kontrol.entidade.Compra;
import br.com.kontrol.facade.CompraFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class CompraControle implements Serializable {

    @Inject
    private CompraFacade compraFacade;
    private Compra compra;

    public void novo() {
        compra = new Compra();
    }

    public void excluir(Compra comp) {
        compraFacade.excluir(comp);
    }

    public void editar(Compra comp) {
        this.compra = comp;
    }

    public void salvar() {
        compraFacade.salvar(compra);
    }

    public List<Compra> listaTodos() {
        return compraFacade.listaTodos();
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

}
