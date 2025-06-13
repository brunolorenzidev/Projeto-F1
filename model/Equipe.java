package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nomeEquipe;
    private String patrocinadoresEquipe;
    private int pontuacaoEquipe;
    private List<Piloto> pilotos;
    private List<Engenheiro> engenheiros;



    public Equipe(String nomeEquipe, String patrocinadoresEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.patrocinadoresEquipe = patrocinadoresEquipe;
        this.pilotos = new ArrayList<>();
        this.engenheiros = new ArrayList<>();
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public List<Engenheiro> getEngenheiros() {
        return engenheiros;
    }

    public void adicionarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public void adicionarEngenheiro(Engenheiro engenheiro) {
        engenheiros.add(engenheiro);
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getPatrocinadoresEquipe() {
        return patrocinadoresEquipe;
    }

    public void setPatrocinadoresEquipe(String patrocinadoresEquipe) {
        this.patrocinadoresEquipe = patrocinadoresEquipe;
    }

    public int getPontuacaoEquipe() {
        return pontuacaoEquipe;
    }





}