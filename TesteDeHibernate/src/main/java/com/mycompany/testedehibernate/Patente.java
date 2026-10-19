/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Patente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_id")
    private Integer id;
    
    @Column(name = "pat_sigla", length = 10, unique = true, nullable = false)
    private String sigla;
    
    @Column(name = "pat_descrcao", length = 45, nullable = false)
    private String descricao;
    
    
    /* Associação com Bombeiro*/
    
    private Set<Bombeiro> bombeiro = new HashSet<Bombeiro>();

    public Set<Bombeiro> getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Set<Bombeiro> bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    /**/
    
    /*Associção inversa, bombeiro pra patente*/
    
    @ManyToMany(mappedBy = "patente")
    
    /**/
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

}
