package Personagem;

public class Personagem {
    private String nomePersonagem;
    private Integer forcaBase;

    public Personagem (String nomePersonagem,Integer forcaBase){
        this.nomePersonagem = nomePersonagem;
        this.forcaBase = forcaBase;
    }

    public Personagem() {

    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public Integer getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(Integer forcaBase) {
        this.forcaBase = forcaBase;
    }

    @Override
    public String toString() {
        return "Nome do personagem: " + nomePersonagem + "| Força do personagem: " + forcaBase;
    }
}
