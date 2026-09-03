package org.example.domain.playlist;

import org.example.domain.musica.musica.Musica;

/**
 * Interface do contrato da Playlist
 * A interface diz O QUE DEVE FAZER *quais funcionalidades*
 * Mas, não diz COMO FAZER
 */

public interface PlaylistService {

    boolean adicionarMusica(Musica musica);

    String listarMusicas();

    boolean removerMusica(String titulo);
}
