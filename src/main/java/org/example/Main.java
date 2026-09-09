import org.example.domain.musica.musica.Musica;
import org.example.domain.playlist.PlaylistService;
import org.example.domain.playlist.PlaylistServiceImpl;

import static java.lang.IO.*;

void main() {

    int opcao = 0;
    String entrada;
    boolean continuarMenu = true;
    PlaylistService playlist = new PlaylistServiceImpl();

    while (continuarMenu) {
        println("VibeMusic -- Uma nova forma de consumir suas músicas");
        println();
        println("Opções:");
        println("\t1. Cadastrar nova música");
        println("\t2. Listar músicas");
        println("\t3. Apagar músicas por titulo");
        entrada = readln("Informe sua opção: ");
        opcao = Integer.parseInt(entrada);

        switch (opcao) {
            case 1 -> {
                println("Cadastro de nova música");
                String autor = readln("Autor: ");
                String titulo = readln("Título: ");
                entrada = readln("Duração: ");
                double duracao = Double.parseDouble(entrada);

                Musica musica = null;
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
                println("Saindo do sistema...");
                println("Até mais...");
                continuarMenu = false;
            }

            default -> {
                println("Opção informada é inválida, tente novamente");
            }
        }


        // mostrar menu
        // solicita ação do usuario
        // switch/case para capturar a escolha.
    }

//
//    String titulo;
//    double duracao;
//
//
//    titulo = readln("Informe o titulo da música: ");
//    entrada = readln("Informe a duração da música: ");
//
//    duracao = Double.parseDouble(entrada);
//
//
//    println("O titulo da música é: "
//            + titulo + " duração " + duracao
//            + " segundos");
}