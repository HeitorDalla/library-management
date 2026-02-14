package com.heitor;

import com.heitor.model.Emprestimo;
import com.heitor.model.Endereco;
import com.heitor.model.Usuario;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setBairro("Burle max");
        endereco.setEstado("Parana");

        Usuario usuario = new Usuario();
        usuario.setEmail("teste@gmail.com");
        usuario.setTelefone("4395686840");
        usuario.setNome("Heitor mito");
        usuario.setEndereco(endereco);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo(LocalDate.of(2020, 5, 1));
        emprestimo.setDataDevolucao(LocalDate.of(2020, 5, 5));
        emprestimo.setUsuario(usuario);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.heitor.model.Usuario.class)
                .addAnnotatedClass(com.heitor.model.Endereco.class)
                .addAnnotatedClass(com.heitor.model.Emprestimo.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(endereco);
        session.persist(usuario);
        session.persist(emprestimo);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(usuario);
        System.out.println(endereco);
        System.out.println(emprestimo);
    }
}