package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Streaming extends PanacheEntity {

    public String titulo;
    public String criador;
    public String estudio;
    public int anoLancamento;
    public String genero;
    public boolean estaDisponivel;
    public Streaming() {
    }

    public Streaming(String titulo, String criador, String estudio, int anoLancamento, String genero, boolean estaDisponivel) {
        this.titulo = titulo;
        this.criador = criador;
        this.estudio = estudio;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.estaDisponivel = estaDisponivel;
    }
}