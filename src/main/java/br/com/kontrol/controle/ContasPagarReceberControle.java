package br.com.kontrol.controle;

import br.com.kontrol.entidade.ContasPagarReceber;
import br.com.kontrol.facade.ContasPagarReceberFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ContasPagarReceberControle implements Serializable {

    @Inject
    private ContasPagarReceberFacade contasPagarReceberFacade;
    private ContasPagarReceber contasPagarReceber;

    public void novo() {
        contasPagarReceber = new ContasPagarReceber();
    }

    public void excluir(ContasPagarReceber cpr) {
        contasPagarReceberFacade.excluir(cpr);
    }

    public void editar(ContasPagarReceber cpr) {
        this.contasPagarReceber = cpr;
    }

    public void salvar() {
        contasPagarReceberFacade.salvar(contasPagarReceber);
    }

    public List<ContasPagarReceber> listaTodos() {
        return contasPagarReceberFacade.listaTodos();
    }

    public ContasPagarReceber getContasPagarReceber() {
        return contasPagarReceber;
    }

    public void setContasPagarReceber(ContasPagarReceber contasPagarReceber) {
        this.contasPagarReceber = contasPagarReceber;
    }

}
