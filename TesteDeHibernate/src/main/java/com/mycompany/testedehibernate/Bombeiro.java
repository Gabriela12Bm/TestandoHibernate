/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Bombeiro")
public class Bombeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bom_id")
    private Integer id;
    @Column(name = "bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;
    @Column(name = "bom_data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "bom_nome_completo", nullable = false, length = 45)
    private String nome;
    @Column(name = "bom_nome_guerra", nullable = false, length = 45, unique = true)
    private String guerra;

    public Bombeiro() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return dataNascimento;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the guerra
     */
    public String getGuerra() {
        return guerra;
    }

    /**
     * @param guerra the guerra to set
     */
    public void setGuerra(String guerra) {
        this.guerra = guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId().equals(this.id) && (aux.getCpf().equals(this.cpf)))) {
                if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {

                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
