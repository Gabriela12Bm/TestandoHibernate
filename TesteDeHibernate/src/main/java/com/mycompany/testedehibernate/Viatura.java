/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;


import java.util.Date;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Viatura")

public class Viatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "via_id")
    private Integer id;
    @Column(name = "via_placa", lenght = 45)
    private String placa;
    @Column(name = "via_combutivel", lenght = 45)
    private String combutivel;
    @Column(name = "via_revisao")
    private Date revisao;
    @Column(name = "via_km")
    private Integer km;
    
    public Viatura() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCombutivel() {
        return combutivel;
    }

    public void setCombutivel(String combutivel) {
        this.combutivel = combutivel;
    }

    public Date getRevisao() {
        return revisao;
    }

    public void setRevisao(Date revisao) {
        this.revisao = revisao;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

}