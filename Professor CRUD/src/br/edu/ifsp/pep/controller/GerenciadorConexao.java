/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pc-eduardo
 */
public class GerenciadorConexao {

    private static EntityManagerFactory emf;

    public static EntityManagerFactory getFabrica() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("conexaoPU");
        }
        return emf;
    }

    public static EntityManager getGerente() {
        return getFabrica().createEntityManager();
    }

}
