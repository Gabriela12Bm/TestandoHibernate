/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testedehibernate;

import com.mycompany.testedehibernate.util.HibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiros {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sessão Estabelecida");
        Transaction transacao = null;
        
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf("12345678");
        bombeiro.setData(LocalDate.of(1990,2,2));
        bombeiro.setNome("Fulano da Silva");
        bombeiro.setGuerra("Silva");
        
        try{
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro);
            transacao.commit();
            
            System.out.println("Bombeiro salvo");
            sessao.close();
            
        }catch (Exception e){
            if(transacao != null){
                transacao.rollback();
                
                System.out.println("Deu errado e tentaremos de novo");
            }
            
        }
        
        HibernateUtil.shutdown();
            
        sessao.close();
    }
    
}
