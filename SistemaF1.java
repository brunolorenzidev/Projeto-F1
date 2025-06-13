import view.MenuPrincipal;
import controller.PilotoController;
import controller.EquipeController;
import controller.EngenheiroController;
import controller.CorridaController;

public class SistemaF1 {
    public static void main(String[] args) {
        PilotoController.carregarPilotos();
        EquipeController.carregarEquipes();
        EngenheiroController.carregarEngenheiros();
        CorridaController.carregarCorridas();

        MenuPrincipal.exibirMenuPrincipal();

    }
}
