package br.com.kontrol.controle;

import br.com.kontrol.converter.ConverterGenerico;
import br.com.kontrol.entidade.Cidade;
import br.com.kontrol.facade.CidadeFacade;
import br.com.kontrol.facade.EstadoFacade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class CidadeControle implements Serializable {

    @Inject
    private CidadeFacade cidadeFacade;
    @Inject
    private EstadoFacade estadoFacade;
    private Cidade cidade;
    private ConverterGenerico converterEstado;

    public ConverterGenerico getConverterEstado() {
        if (converterEstado == null) {
            converterEstado = new ConverterGenerico(estadoFacade);
        }
        return converterEstado;
    }

    public void setConverterEstado(ConverterGenerico converterEstado) {
        this.converterEstado = converterEstado;
    }

    public void novo() {
        cidade = new Cidade();
    }

    public void excluir(Cidade cid) {
        cidadeFacade.excluir(cid);
    }

    public void editar(Cidade cid) {
        this.cidade = cid;
    }

    public void salvar() {
        cidadeFacade.salvar(cidade);
    }

    public List<Cidade> listaTodos() {
        return cidadeFacade.listaTodos();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
