package com.heitor;

import com.heitor.model.Endereco;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.heitor.model.Usuario.class)
                .addAnnotatedClass(com.heitor.model.Endereco.class)
                .addAnnotatedClass(com.heitor.model.Emprestimo.class)
                .addAnnotatedClass(com.heitor.model.Reserva.class)
                .addAnnotatedClass(com.heitor.model.Exemplar.class)
                .addAnnotatedClass(com.heitor.model.ItemEmprestimo.class)
                .addAnnotatedClass(com.heitor.model.Multa.class)
                .addAnnotatedClass(com.heitor.model.Livro.class)
                .addAnnotatedClass(com.heitor.model.LivroAutor.class)
                .addAnnotatedClass(com.heitor.model.LivroCategoria.class)
                .addAnnotatedClass(com.heitor.model.Categoria.class)
                .addAnnotatedClass(com.heitor.model.Autor.class)
                .addAnnotatedClass(com.heitor.model.Editora.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        String estado = "PR";
        int id = 1;

        Query query2 = session.createQuery("select logradouro, cidade from Endereco where id = ?1 and estado = ?2");

        query2.setParameter(1, id);
        query2.setParameter(2, estado);

        List<Endereco> enderecos = query2.getResultList(); // `List<Endereco>` e usado pois tem apenas 1 coluna
        List<Object[]> logradouroCiddade = query2.getResultList(); // `List<Object[]>` e usados pois tem varias colunas

        System.out.println("Consulta realizada");
        System.out.println(logradouroCiddade);

        session.close();
        sf.close();
    }
}