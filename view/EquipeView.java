package view;

import controller.EngenheiroController;
import controller.EquipeController;
import controller.PilotoController;
import model.Engenheiro;
import util.InputHelper;
import model.Equipe;
import model.Piloto;

import java.util.ArrayList;
import java.util.List;


public class EquipeView {


    public static void ExibirEquipe() {
        int opcao;
        do {
            MenuDisplay.exibirEquipe();
            opcao = InputHelper.lerInt("Escolha: ");

            switch (opcao) {
                case 1 -> EngenheiroView.cadastrarEngenheiro();
                case 2 -> EngenheiroView.listarEngenheiro();
                case 3 -> cadastrarEquipe();
                case 4 -> listarEquipe();
                case 5 -> atualizarEquipe();
                case 6 -> removerEquipe();
                case 0 -> {

                }
                default -> System.out.println("Opção inválida.");

            }

        } while (opcao != 0);
    }


    private static void cadastrarEquipe() {
        String nomeEquipe = InputHelper.lerString("Nome da Equipe: ");
        String patrocinadoresEquipe = InputHelper.lerString("Nome do Patrocinador:");


        List<Piloto> pilotos = PilotoController.listarPilotos();
        Piloto pilotoSelecionado = null;
        if (pilotos.isEmpty()) {
            System.out.println("Nenhum piloto cadastrado.");
        } else {
            System.out.println("Pilotos disponíveis:");
            for (Piloto piloto : pilotos) {
                System.out.println("- " + piloto.getNome());
            }

            String nomePiloto = InputHelper.lerString("Digite o nome do piloto para adicionar à equipe: ");
            for (Piloto piloto : pilotos) {
                if (piloto.getNome().equalsIgnoreCase(nomePiloto)) {
                    pilotoSelecionado = piloto;
                    break;
                }
            }

            if (pilotoSelecionado == null) {
                System.out.println("Piloto não encontrado.");
            }
        }

        List<Engenheiro> engenheiros = EngenheiroController.listarEngenheiro();
        Engenheiro engenheiroSelecionado = null;
        if (engenheiros.isEmpty()) {
            System.out.println("Nenhum engenheiro cadastrado.");
        } else {
            System.out.println("Engenheiros disponíveis:");
            for (Engenheiro engenheiro : engenheiros) {
                System.out.println("- " + engenheiro.getNome());
            }

            String nomeEngenheiro = InputHelper.lerString("Digite o nome do engenheiro para adicionar à equipe: ");
            for (Engenheiro engenheiro : engenheiros) {
                if (engenheiro.getNome().equalsIgnoreCase(nomeEngenheiro)) {
                    engenheiroSelecionado = engenheiro;
                    break;
                }
            }

            if (engenheiroSelecionado == null) {
                System.out.println("Engenheiro não encontrado.");
            }
        }

        Equipe equipe = new Equipe(nomeEquipe, patrocinadoresEquipe);


        if (pilotoSelecionado != null) {
            equipe.adicionarPiloto(pilotoSelecionado);
        }

        if (engenheiroSelecionado != null) {
            equipe.adicionarEngenheiro(engenheiroSelecionado);
        }

        EquipeController.cadastrarEquipe(equipe);

        System.out.println("Equipe cadastrada com sucesso!");
    }


    private static void listarEquipe() {
        System.out.println("---- Lista de Equipes ----");

        ArrayList<Equipe> equipes = EquipeController.listarEquipe();

        if (equipes.isEmpty()) {
            System.out.println("Nenhuma equipe cadastrada.");
        } else {
            for (Equipe e : equipes) {
                System.out.println("Equipe: " + e.getNomeEquipe());
                System.out.println("Patrocinador: " + e.getPatrocinadoresEquipe());
                System.out.println("Pontuação: " + e.getPontuacaoEquipe());

                System.out.print("Piloto: ");
                if (e.getPilotos().isEmpty()) {
                    System.out.println("Nenhum");
                } else {
                    System.out.println(e.getPilotos().get(0).getNome());
                }

                System.out.print("Engenheiro: ");
                if (e.getEngenheiros().isEmpty()) {
                    System.out.println("Nenhum");
                } else {
                    System.out.println(e.getEngenheiros().get(0).getNome());
                }

                System.out.println("---------------------------");
            }
        }
    }


    private static void atualizarEquipe() {
        MenuDisplay.menuAtualizarEquipe();
        String nome = InputHelper.lerString("Nome atual da equipe: ");
        String novoNome = InputHelper.lerString("Novo nome da equipe: ");
        String Patrocinador = InputHelper.lerString(" Novo patrocinador da equipe: ");
        EquipeController.atualizarEquipe(nome, novoNome, Patrocinador);
    }

    public static void removerEquipe() {
        MenuDisplay.menuRemoverEquipe();
        String nomeEquipe = InputHelper.lerString("Nome da equipe que você quer remover:");
        EquipeController.removerEquipe(nomeEquipe);
    }
}