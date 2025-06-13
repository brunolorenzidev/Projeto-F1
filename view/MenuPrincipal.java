package view;

import util.InputHelper;

public class MenuPrincipal {



    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    public static void exibirMenuPrincipal() {
        int opcao;
        do {
            MenuDisplay.exibirMenu();
            opcao = InputHelper.lerInt("Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    PilotoView.gerenciarPiloto();
                    break;

                case 2:
                    EquipeView.ExibirEquipe();
                    break;

                case 3:
                    CorridaView.menuCorrida();
                    break;

                case 4:
                    RelatoriosView.menuPontuacaoF1Switch();
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
