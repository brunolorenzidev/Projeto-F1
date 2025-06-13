package view;
import controller.PilotoController;
import controller.CorridaController;
import model.Piloto;
import model.Corrida;
import util.InputHelper;
import java.util.ArrayList;
import java.util.List;


public class RelatoriosView {

    public static void menuPontuacaoF1Switch() {
        int opcao;
        do {
            System.out.println("--- Menu Pontuação F1 ---");
            System.out.println("1 - Pilotos Salvos");
            System.out.println("0 - Sair");

            opcao = InputHelper.lerInt("Escolha: ");

            switch (opcao) {
                case 1:
                    menuPontuacaoF1();
                    break;
                case 0:
                    System.out.println("Saindo do menu de pontuação...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void menuPontuacaoF1() {
        List<Piloto> pilotos = PilotoController.listarPilotos();

        if (pilotos.isEmpty()) {
            System.out.println("Nenhum piloto cadastrado.");
            return;
        }

        System.out.println("--- Pilotos Cadastrados ---");
        for (Piloto p : pilotos) {
            System.out.println("- " + p.getNome());
        }

        List<Piloto> escolhidos = new ArrayList<>();

        Piloto top1 = PilotoPorNome("Digite o nome do Top 1: ", pilotos, escolhidos);
        escolhidos.add(top1);

        Piloto top2 = PilotoPorNome("Digite o nome do Top 2: ", pilotos, escolhidos);
        escolhidos.add(top2);

        Piloto top3 = PilotoPorNome("Digite o nome do Top 3: ", pilotos, escolhidos);
        escolhidos.add(top3);


        List<Corrida> corridas = CorridaController.listarCorridas();

        if (corridas.isEmpty()) {
            System.out.println("Nenhuma corrida cadastrada.");
            return;
        }

        System.out.println("--- Corridas Disponíveis ---");
        for (Corrida c : corridas) {
            System.out.println("- " + c.getNomeCorrida());
        }

        Corrida corridadigitada = null;
        while (corridadigitada == null) {
            String nomeCorrida = InputHelper.lerString("Digite o nome da corrida desse Ranking : ");
            for (Corrida c : corridas) {
                if (c.getNomeCorrida().equalsIgnoreCase(nomeCorrida)) {
                    corridadigitada = c;
                    break;
                }
            }
            if (corridadigitada == null) {
                System.out.println("Corrida não encontrada. Tente novamente.");
            }
        }

        System.out.println("--- Classificação Final da Corrida de " + corridadigitada.getNomeCorrida() + " ---");
        System.out.println(" Top 1: " + top1.getNome() + " com 300 Pontos");
        System.out.println(" Top 2: " + top2.getNome() + " com 200 Pontos");
        System.out.println(" Top 3: " + top3.getNome() + " com 100 Pontos");
    }

    private static Piloto PilotoPorNome(String mensagem, List<Piloto> pilotos, List<Piloto> escolhidos) {
        while (true) {
            String nome = InputHelper.lerString(mensagem);

            Piloto encontrado = null;
            for (Piloto p : pilotos) {
                if (p.getNome().equalsIgnoreCase(nome)) {
                    encontrado = p;
                    break;
                }
            }

            if (encontrado == null) {
                System.out.println("Piloto não encontrado. Tente novamente.");
                continue;
            }

            for (Piloto p : escolhidos) {
                if (p.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Piloto já escolhido. Escolha outro.");
                    encontrado = null;
                    break;
                }
            }

            if (encontrado != null) {
                return encontrado;
            }
        }
    }

}
