package org.example.domain.playlist;

import org.example.domain.musica.musica.Musica;
import org.example.infrastructure.persistencia.MemoriaPlaylistRepositoryImpl;
import org.example.infrastructure.persistencia.PlaylistRepository;

/**
 * Classe concerta da regra de negócio (Playlist)
 * Ela implementa a interface PlaylistService,
 * e descreve como realizar as ações, ou seja,
 * como os métdoos descritos na interface devem funcionar
 */

public class PlaylistServiceImpl implements PlaylistService {
    private PlaylistRepository playlist;


    public PlaylistServiceImpl() {
        this.playlist = new MemoriaPlaylistRepositoryImpl();
    }

    /**
     *
     * @param musica
     * @return boolean
     */

    // Finalizar a implementação do método
    @Override
    public boolean adicionarMusica(Musica musica) {
        return this.playlist.inserirMusica(musica);
    }

    @Override
    public String listarMusicas() {
        String listaDeMusicas = playlist.listarMusicas();

        return listaDeMusicas;
    }

    @Override
    public boolean removerMusica(String titulo) {
        return playlist.excluirMusicaPorTitulo(titulo);
    }
}
