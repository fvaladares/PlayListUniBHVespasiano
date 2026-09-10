package org.example.infrastructure.persistencia;

import org.example.domain.musica.musica.Musica;

/**
 * Interface de acesso aos dados
 *
 */

/*
    TODO(implemente os métodos responsáveis por inserir, listar e excluir músicas da playlist)
 */
public interface PlaylistRepository {
    boolean inserirMusica(Musica musica);

    String listarMusicas();

    boolean excluirMusicaPorTitulo(String tituloDaMusica);
}
