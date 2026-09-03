package org.example.domain.musica.musica;


/**
 * Classe entidade -- Representando a música
 */
public class Musica {
    private String artista;
    private String titulo;
    private double duracao;

    public Musica(double duracao,
                  String titulo,
                  String artista) {
        this.duracao = duracao;
        this.titulo = titulo;
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
}
