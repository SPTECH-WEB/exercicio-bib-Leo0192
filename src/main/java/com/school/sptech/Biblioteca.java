package com.school.sptech;

public class Biblioteca {

    private String nome;
    private Double multaDiaria;
    private Integer qtdLivros;
    private Boolean ativa;


    public Biblioteca (String nome, Double multaDiaria){
        this.nome = "Deodoro";
        this.multaDiaria = 2.5;
        this.qtdLivros = 0;
        this.ativa = true;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrarLivro(Integer quantidade){
        if (quantidade != null && quantidade > 0){
            if(ativa == true){
                this.qtdLivros += quantidade;
            }
        }
    }
    public Integer emprestar(Integer quantidade){
            if ( quantidade != null && ativa == true && quantidade > 0 && quantidade <= qtdLivros) {
                this.qtdLivros -= quantidade;
        } else {return null;}
        return quantidade;
    }

    public Integer devolver(Integer quantidade){
        if(ativa == true){
            if (quantidade!= null && quantidade > 0 ){

                this.qtdLivros += quantidade;
            }
        } return quantidade;

    }


    public Integer desativar(){
        if (ativa == true){
            Integer qtdLivrosAnterior = this.qtdLivros;
            this.ativa = false;
            qtdLivros = 0;
            return qtdLivrosAnterior;
        } else {return null;}
    }

    public void transferir(Biblioteca destino, Integer quantidade){
        if (destino.ativa == true && ativa == true){
            if (quantidade <= qtdLivros){
                destino.qtdLivros += quantidade;
                this.qtdLivros -= quantidade;
            }
        }
    }

    public double getMultaDiaria() {
        return multaDiaria;
    }


    public Boolean reajustarMulta(Double percentual){
        if (percentual != null && percentual > 0){
            percentual = 0.1;
            this.multaDiaria = multaDiaria + (multaDiaria * percentual);
            return true;
        }return false;
    }
}
