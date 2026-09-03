package org.example.domain.playlist;

import jdk.jshell.spi.ExecutionControlProvider;
import org.example.domain.musica.musica.Musica;

import java.lang.classfile.attribute.ExceptionsAttribute;
import java.util.ArrayList;

/**
 * Classe concerta da regra de negócio (Playlist)
 * Ela implementa a interface PlaylistService,
 * e descreve como realizar as ações, ou seja,
 * como os métdoos descritos na interface devem funcionar
 */

public class PlaylistServiceImpl implements PlaylistService {
    private ArrayList<Musica> playlist;


    public PlaylistServiceImpl() {
        this.playlist = new ArrayList<>();
    }

    /**
     *
     * @param musica
     * @return boolean
     */

    // Finalizar a implementação do método
    @Override
    public boolean adicionarMusica(Musica musica) throws Exception {
        StringBuilder mensagemExcecao = new StringBuilder();
        mensagemExcecao.append("Os seguintes campos devem ser preenchidos: ");
        if (musica == null) {
            mensagemExcecao.append("Artista, Tĩtulo e duração");
            throw new Exception(mensagemExcecao.toString());
        }
        if (musica.getArtista().isBlank()) {
            mensagemExcecao.append("Nome artista");

            playlist.add(musica);
            return true;
        }
        return false;
    }

    @Override
    public String listarMusicas() {
        return "";
    }

    @Override
    public boolean removerMusica(String titulo) {
        return false;
    }
}
