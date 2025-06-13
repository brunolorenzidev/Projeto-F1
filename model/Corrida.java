package model;


public class Corrida {

    private String nomeCorrida;
    private String dataCorrida;
    private String localCorrida;

    public Corrida(String nomeCorrida, String dataCorrida, String localCorrida) {
        this.nomeCorrida = nomeCorrida;
        this.dataCorrida = dataCorrida;
        this.localCorrida = localCorrida;
    }


    public String getLocalCorrida() {
        return localCorrida;
    }

    public void setLocalCorrida(String localCorrida) {
        this.localCorrida = localCorrida;
    }

    public String getDataCorrida() {
        return dataCorrida;
    }

    public void setDataCorrida(String dataCorrida) {
        this.dataCorrida = dataCorrida;
    }

    public String getNomeCorrida() {
        return nomeCorrida;
    }

    public void setNomePista(String nomePista) {
        this.nomeCorrida = nomePista;
    }

}