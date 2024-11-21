package com.cursoricardo.produto.produtoapi.model;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;

// POJO - Plain Old Java Object
@Entity
@Table
public class Produto {

    // =============================================

    @Id
    @Column
    private String id;

    //-------------------------

    @Column
    private String nome;

    //-------------------------

    @Column
    private String descricao;

    //-------------------------

    @Column
    private double valor;

    // =============================================

    public String getId() {
        return id;
    }

    // =============================================

    public void setId(String id) {
        this.id = id;
    }

    // =============================================

    public String getNome() {
        return nome;
    }

    // =============================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    // =============================================

    public String getDescricao() {
        return descricao;
    }

    // =============================================

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // =============================================

    public double getValor() {
        return valor;
    }

    // =============================================

    public void setValor(double valor) {
        this.valor = valor;
    }

    // ==============================================

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
