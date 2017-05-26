package br.com.kontrol.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "contas")
public class ContasPagarReceber implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "con_id")
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "con_dataVen", nullable = false)
    private Date dataVencimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "con_dataPag", nullable = false)
    private Date dataPagamento;
    @Column(name = "con_valorTotal", nullable = false)
    private BigDecimal valorTotal;
    @Column(name = "con_receber", nullable = false)
    private String receber;
    @Column(name = "con_pagar", nullable = false)
    private String pagar;
    @Column(name = "con_obs", nullable = false)
    private String observacaoConta;
    @Column(name = "con_quant", nullable = false)
    private Integer quantidade;
    @Column(name = "con_numParc", nullable = false)
    private Integer numeroParcela;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getReceber() {
        return receber;
    }

    public void setReceber(String receber) {
        this.receber = receber;
    }

    public String getPagar() {
        return pagar;
    }

    public void setPagar(String pagar) {
        this.pagar = pagar;
    }

    public String getObservacaoConta() {
        return observacaoConta;
    }

    public void setObservacaoConta(String observacaoConta) {
        this.observacaoConta = observacaoConta;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContasPagarReceber other = (ContasPagarReceber) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ContasPagarReceber{" + "id=" + id + '}';
    }

}
