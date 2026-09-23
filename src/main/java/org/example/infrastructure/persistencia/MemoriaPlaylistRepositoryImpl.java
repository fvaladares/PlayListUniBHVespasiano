package org.example.infrastructure.persistencia;


import org.example.domain.musica.musica.Musica;

import java.util.ArrayList;

/**
 * Classe que usa o ArraList para armazenar a playlist
 */
public class MemoriaPlaylistRepositoryImpl implements PlaylistRepository {

    private ArrayList<Musica> playlist;

    public MemoriaPlaylistRepositoryImpl() {
        this.playlist = new ArrayList<>();
    }


    @Override
    public boolean inserirMusica(Musica musica) {
        return this.playlist.add(musica);
    }

    @Override
    public String listarMusicas() {
        StringBuilder listaDeMusicas = new StringBuilder();
        double tempoTotal = 0;

        if (!this.playlist.isEmpty()) {

            for (Musica musica : this.playlist) {
                listaDeMusicas.append(musica);
                tempoTotal += musica.getDuracao();
            }

            listaDeMusicas.append("\nTempo total: ").append(tempoTotal);
        } else {
            listaDeMusicas.append("A lista de músicas está vazia");
        }


        return listaDeMusicas.toString();
    }

    @Override
    public boolean excluirMusicaPorTitulo(String tituloDaMusica) {
        Musica musica = null;
        for (Musica m : playlist) {
            if (m.getTitulo().equalsIgnoreCase(tituloDaMusica)) {
                musica = m;
                break;
            }
        }
        if (musica != null) {
            return this.playlist.remove(musica);
        } else
            return false;
    }
}
