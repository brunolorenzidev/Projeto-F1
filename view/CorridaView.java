package view;

import controller.CorridaController;
import model.Corrida;
import util.InputHelper;

import java.util.ArrayList;

public class CorridaView {

    public static void main(String[] args) {
        CorridaView.menuCorrida();
    }

    public static void menuCorrida() {
        int opcao;
        do {
            MenuDisplay.exibirMenuCorrida();
            opcao = InputHelper.lerInt("Escolha: ");


            switch (opcao) {
                case 1:
                    cadastrarCorrida();
                    break;
                case 2:
                    listarCorridas();
                    break;
                case 3:
                    removerCorrida();
                    break;
                case 4:
                    atualizarCorrida();
                    break;
                case 0:
                    System.out.println("Saindo... ");
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCorrida() {
        String nome = InputHelper.lerString("Nome da corrida: ");
        String data = InputHelper.lerString("Data da corrida: ");
        String local = InputHelper.lerString("Local da corrida: ");

        CorridaController.cadastrarCorrida(nome, data, local);
        System.out.println("Corrida cadastrada com sucesso! ");
    }

    public static void listarCorridas() {
        MenuDisplay.menuListarCorrida();
        ArrayList<Corrida> corridas = CorridaController.listarCorridas();
        if (corridas.isEmpty()) {
            System.out.println("Nenhuma corrida agendada.");
        } else {
            for (Corrida c : corridas) {
                System.out.println("Corrida: " + c.getNomeCorrida());
                System.out.println("Data da corrida: " + c.getDataCorrida());
                System.out.println("Local da corrida: " + c.getLocalCorrida());
            }
        }
    }


    private static void removerCorrida() {
        MenuDisplay.menuRemoverPista();
        String nomeCorrida = InputHelper.lerString("Nome da corrida que você quer retirar");
        CorridaController.removerCorrida(nomeCorrida);
    }

    public static void atualizarCorrida() {
        MenuDisplay.menuAtualizarCorrida();
        String nomeCorridaAntiga = InputHelper.lerString("Nome atual da corrida: ");
        String nomeCorridaNova = InputHelper.lerString("Novo nome da corrida: ");
        String novaDataCorrida = InputHelper.lerString(" Nova data da corrida: ");
        String novoLocalCorrida = InputHelper.lerString("Onde vai ser a corrida? ");
        CorridaController.atualizarCorrida(nomeCorridaAntiga, nomeCorridaNova, novaDataCorrida, novoLocalCorrida);
    }
}