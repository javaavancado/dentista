package br.com.kontrol.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pac_id")
    private Long id;
    @Column(name = "pac_nome", nullable = false)
    private String nome;
    @Column(name = "pac_cpf", nullable = false)
    private String cpf;
    @Column(name = "pac_rg", nullable = false)
    private String rg;
    @Column(name = "pac_tel1", nullable = false)
    private String telefone1;
    @Column(name = "pac_tel2", nullable = false)
    private String telefone2;
    @Column(name = "pac_telCom", nullable = false)
    private String telefoneComercial;
    @Column(name = "pac_email", nullable = false)
    private String email;
    @Column(name = "pac_endereco", nullable = false)
    private String endereco;
    @Column(name = "pac_numero", nullable = false)
    private String numero;
    @Column(name = "pac_bairro", nullable = false)
    private String bairro;
    @Column(name = "pac_cep", nullable = false)
    private String cep;
    @Column(name = "pac_estCivil", nullable = false)
    private String estadoCivil;
    @Column(name = "pac_nomeConj", nullable = false)
    private String nomeConjuge;
    @Column(name = "pac_profConj", nullable = false)
    private String profissaoConjuge;
    @Column(name = "pac_profPac", nullable = false)
    private String profissaoPaciente;
    @Column(name = "pac_empTrab", nullable = false)
    private String empresaTrabalho;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "pac_dataNasc", nullable = false)
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "est_id", nullable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "cid_id", nullable = false)
    private Cidade cidade;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private List<Agenda> agendaList;

    public Paciente() {
    }

    public Paciente(Long id) {
        this.id = id;
    }

    public Paciente(Long id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public String getProfissaoConjuge() {
        return profissaoConjuge;
    }

    public void setProfissaoConjuge(String profissaoConjuge) {
        this.profissaoConjuge = profissaoConjuge;
    }

    public String getProfissaoPaciente() {
        return profissaoPaciente;
    }

    public void setProfissaoPaciente(String profissaoPaciente) {
        this.profissaoPaciente = profissaoPaciente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmpresaTrabalho() {
        return empresaTrabalho;
    }

    public void setEmpresaTrabalho(String empresaTrabalho) {
        this.empresaTrabalho = empresaTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
