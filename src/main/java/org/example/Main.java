import org.example.domain.musica.musica.Musica;
import org.example.domain.playlist.PlaylistService;
import org.example.domain.playlist.PlaylistServiceImpl;

import static java.lang.IO.*;

void main() {

    int opcao;
    String entrada;
    boolean continuarMenu = true;
    PlaylistService playlist = new PlaylistServiceImpl();

    while (continuarMenu) {

        exibirMenu();
        entrada = readln("Informe sua opção: ");
        opcao = Integer.parseInt(entrada);

        switch (opcao) {
            case 1 -> {
                Musica musica = coletarDadosMusica();
                playlist.adicionarMusica(musica);
            }

            case 2 -> {
                println();
                println(".:|Listrar músicas|:.");
            }

            case 3 -> {
                println();
                println(".:|Apagar música por título|:.");

            }

            case 4 -> {
                println();
                println(".:|Saindo do sistema...|:.");
                println("Até mais... \uD83D\uDC4B\uD83C\uDFFD");
                continuarMenu = false;
            }

            default -> {
                println("Opção informada é inválida, tente novamente");
                continuarMenu = true;
            }
        }


        // mostrar menu
        // solicita ação do usuario
        // switch/case para capturar a escolha.
    }
}

private Musica coletarDadosMusica() {
    String entrada;
    println();
    println(".:|Cadastro de nova música|:.");

    String autor = readln("Autor: ");
    String titulo = readln("Título: ");
    entrada = readln("Duração: ");
    double duracao = Double.parseDouble(entrada);

    return new Musica(duracao,
            autor,
            titulo);
}

private void exibirMenu() {
    println("\nVibeMusic -- Uma nova forma de consumir suas músicas \uD83D\uDD0A");
    println();

    println("Opções:");
    println("\t1. Cadastrar nova música");
    println("\t2. Listar músicas");
    println("\t3. Apagar músicas por titulo");
}