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

        this.validarDadosMusica(duracao, titulo, artista);

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

    private void validarDadosMusica(double duracao,
                                    String titulo,
                                    String artista) throws IllegalArgumentException {
        if (duracao <= 0 || titulo == null || artista == null)
            throw new IllegalArgumentException("Atenção, verifique os dados preenchidos: " +
                    "\n\tOs campos autor e título são obrigatórios, o tempo deve ser maior do que zero.");

    }
}
