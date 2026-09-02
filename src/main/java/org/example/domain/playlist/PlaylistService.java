package org.example.domain.playlist;

import org.example.domain.musica.musica.Musica;

/**
 * Interface do contrato da Playlist
 */

public interface PlaylistService {

    boolean adicionarMusica(Musica musica);

    String listarMusicas();

    boolean removerMusica(String titulo);
}
