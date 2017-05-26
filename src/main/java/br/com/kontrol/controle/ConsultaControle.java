package br.com.kontrol.controle;

import br.com.kontrol.entidade.Consulta;
import br.com.kontrol.facade.ConsultaFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ConsultaControle implements Serializable {

    @Inject
    private ConsultaFacade consultaFacade;
    private Consulta consulta;

    public void novo() {
        consulta = new Consulta();
    }

    public void excluir(Consulta cons) {
        consultaFacade.excluir(cons);
    }

    public void editar(Consulta cons) {
        this.consulta = cons;
    }

    public void salvar() {
        consultaFacade.salvar(consulta);
    }

    public List<Consulta> listaTodos() {
        return consultaFacade.listaTodos();
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
