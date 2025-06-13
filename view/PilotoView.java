package view;

import controller.PilotoController;
import model.Piloto;
import util.InputHelper;
import view.MenuDisplay;

import java.util.ArrayList;

public class PilotoView {

    public static void main(String[] args) {
        PilotoView.gerenciarPiloto();
    }

    public static void gerenciarPiloto() {
        int opcao;
        do {
            MenuDisplay.exibirPiloto();
            opcao = InputHelper.lerInt("Escolha uma opção: ");
            switch (opcao) {

                case 1 -> cadastrarPiloto();
                case 2 -> listarPiloto();
                case 3 -> removerPiloto();
                case 4 -> atualizarPiloto();

            }
        } while (opcao != 0);

    }

    private static void cadastrarPiloto() {
        MenuDisplay.menuCadastroPiloto();
        String nome = InputHelper.lerString(" Digite o nome do piloto: ");
        int idade = InputHelper.lerInt(" Digite a idade do piloto: ");
        int numero = InputHelper.lerInt(" Qual o número do piloto: ");

        PilotoController.cadastrarPiloto(nome, idade, numero);

        System.out.println(" Piloto cadastrado com sucesso!");
    }


    public static void listarPiloto() {
        MenuDisplay.menuListaPiloto();
        ArrayList<Piloto> listaPilotos = PilotoController.listarPilotos();
        if (listaPilotos.isEmpty()) {
            System.out.println("Nenhum piloto cadastrado.");
        } else {
            for (Piloto p : listaPilotos) {
                System.out.println("Nome: " + p.getNome() + " | Idade: " + p.getIdade() + " | Número: " + p.getNumero());
            }
        }
    }

    public static void removerPiloto() {
        MenuDisplay.menuRemoverPiloto();
        String nome = InputHelper.lerString("Nome do piloto que quer remover:");
        PilotoController.removerPiloto(nome);
    }

    public static void atualizarPiloto(){
        MenuDisplay.menuAtualizarPiloto();
        String nomePilotoAntigo = InputHelper.lerString("Nome atual do piloto: ");
        String novoNomePiloto = InputHelper.lerString( "Novo nome do piloto: ");
        int idadePilotoNova = InputHelper.lerInt(" Nova idade do Piloto: ");
        int numeroPilotoNovo = InputHelper.lerInt("Qual o novo numero do piloto: ");
        PilotoController.atualizarPiloto(nomePilotoAntigo, novoNomePiloto, idadePilotoNova, numeroPilotoNovo);
    }
}

