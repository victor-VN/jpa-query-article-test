package io.github.victor_vn.jpa_query_article_test.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class ParceiroEntity {
    @Id
    @Column(length = 14, nullable = false)
    private String cpf;

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(length = 255, nullable = false)
    private String estado;

    @Column(length = 2, nullable = false)
    private String uf;

    @Column(nullable = false)
    private int numeroFuncionarios;

    @Column(nullable = false)
    private int qtdFiliais;

    // Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getQtdFiliais() {
        return qtdFiliais;
    }

    public void setQtdFiliais(int qtdFiliais) {
        this.qtdFiliais = qtdFiliais;
    }
}
