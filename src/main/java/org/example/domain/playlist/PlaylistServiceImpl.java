package org.example.domain.playlist;

import org.example.domain.musica.musica.Musica;
import org.example.infrastructure.persistencia.MemoriaPlaylistRepositoryImpl;
import org.example.infrastructure.persistencia.PlaylistRepository;

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
    public boolean adicionarMusica(Musica musica) {
        return this.playlist.add(musica);
    }

    @Override
    public String listarMusicas() {
        StringBuilder listaDeMusicas = new StringBuilder();
        double tempoTotal = 0;

        if (!this.playlist.isEmpty()) {
            for (int i = 0; i < playlist.size(); i++) {
                Musica musica = playlist.get(i);
                listaDeMusicas.append(String.format("%d. %s - %s (%d seg)%n",
                        i + 1,
                        musica.getTitulo(),
                        musica.getArtista(),
                        (int) musica.getDuracao()));
                tempoTotal += musica.getDuracao();
            }

            listaDeMusicas.append(String.format("%nTempo total: %d seg", (int) tempoTotal));
        } else {
            listaDeMusicas.append("A lista de músicas está vazia");
        }


        return listaDeMusicas.toString();
    }

    @Override
    public boolean removerMusica(String titulo) {
        Musica musica = null;
        for (Musica m : playlist) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
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
