package model;

public class PS5 {

    private String modelo;
    private int jogos;
    private String armazenamento;

    public PS5 (String modelo, int jogos, int armazenamento) {
        
        this.modelo = modelo;
        this.jogos = jogos;
        this.armazenamento = armazenamento;
        
    }
    public PS5 () {
        
        this.modelo = "Slim";
        this.jogos = 300;
        this.armazenamento = "350 Bytes";

    }

public void descricao(){

}


    public String getModelo (){
        return modelo;
    }

    public int getJogos (){
        return jogos
    }

    public String getArmazenamento (){
        return armazenamento
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setJogos(int jogos){
        this.jogos = jogos;
    }

    public void setArmazenamento(String armazenamento){
        this.armazenamento = armazenamento;
    }

}