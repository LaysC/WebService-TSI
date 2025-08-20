package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Book extends PanacheEntity {
    public String titulo;
    public String autor;
    public String editor;
    public int ano;
    public boolean estaDisponivel;

    public Book() {

    }

    public Book(String titulo, String autor, String editor, int ano, boolean estaDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
        this.ano = ano;
        this.estaDisponivel = estaDisponivel;
    }
}
