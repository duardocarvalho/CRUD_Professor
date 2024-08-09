/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author pc-eduardo
 */
public class ProfessorController {

    public void adcionar(Professor professor) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(professor);
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void alterar(Professor professor) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        gerente.getTransaction().begin();
        gerente.merge(professor);
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Professor professor) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        Professor professorBuscado = gerente.find(Professor.class, professor.getProntuario());
        gerente.getTransaction().begin();
        gerente.remove(professorBuscado);
        gerente.getTransaction().commit();
        gerente.close();
    }

    public Professor pesquisar(Professor professor) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        Professor professorBuscado = gerente.find(Professor.class, professor.getProntuario());
        return professorBuscado;
    }

    public List<Professor> listarTodos() {
        EntityManager gerente = GerenciadorConexao.getGerente();
        TypedQuery<Professor> query = gerente.createNamedQuery("Professor.findAll", Professor.class);
        return query.getResultList();
    }

    public List<Professor> buscarPorProntuario(String prontuario) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        TypedQuery<Professor> query = gerente.createNamedQuery("Professor.findProntuarioLike", Professor.class);
        query.setParameter("prontuario", "%" + prontuario + "%");
        return query.getResultList();
    }

    public Professor buscarPorProntuarioExato(String prontuario) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        TypedQuery<Professor> query = gerente.createQuery("SELECT p FROM Professor p WHERE p.prontuario = :prontuario", Professor.class);
        query.setParameter("prontuario", prontuario);
        return query.getSingleResult();
    }

}
