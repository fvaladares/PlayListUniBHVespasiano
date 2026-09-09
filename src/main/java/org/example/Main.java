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
                Musica musica = null;
                musica = coletarDadosMusica();
                try {
                    musica = new Musica(duracao,
                            titulo,
                            autor);

                    boolean retorno = playlist.adicionarMusica(musica);

                    if (retorno) {
                        print("Música adicionada com sucesso.\n\n");
                    } else {
                        print("Houve uma falha ao adicionar a música, tente novamente mais tarde\n\n");
                    }

                } catch (IllegalArgumentException e) {
                    print(e.getMessage());
                }
            }

            case 2 -> {
                println("Listrar músicas");
                String listaDeMusicas = playlist.listarMusicas();
                println();
                println(listaDeMusicas);
            }

            case 3 -> {
                println("Apagar música por título");
                String titulo = readln("Informe o título da música que deseja remover: ");
                boolean isRemovido = playlist.removerMusica(titulo);

                if(isRemovido) {
                    println();
                    println(titulo + " removida com sucesso.");
                } else {
                    println();
                    print(titulo + "Não consta da lista.");
                }

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