import org.example.domain.musica.musica.Musica;
import org.example.domain.playlist.PlaylistService;
import org.example.domain.playlist.PlaylistServiceImpl;
import org.example.util.ConsoleColor;

import static java.lang.IO.*;

void main() {

    int opcao;
    String entrada;
    boolean continuarMenu = true;
    PlaylistService playlist = new PlaylistServiceImpl();

    while (continuarMenu) {

        exibirMenu();
        entrada = readln(ConsoleColor.BLUE + "Informe sua opção: " + ConsoleColor.RESET);
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
                println(ConsoleColor.BOLD_RED +
                        "\n\nOpção informada é inválida, tente novamente" +
                        ConsoleColor.RESET);
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
    entrada = readln("Duração em segundos: ");
    double duracao = Double.parseDouble(entrada);

    return new Musica(duracao,
            autor,
            titulo);
}

private void exibirMenu() {
    println(ConsoleColor.BOLD_BLUE +
            "\nVibeMusic -- Uma nova forma de consumir suas músicas \uD83D\uDD0A" +
            ConsoleColor.RESET);
    println();

    println("Opções:");
    println("\t1. Cadastrar nova música");
    println("\t2. Listar músicas");
    println("\t3. Apagar músicas por titulo");
    println("\t4. Sair");
}