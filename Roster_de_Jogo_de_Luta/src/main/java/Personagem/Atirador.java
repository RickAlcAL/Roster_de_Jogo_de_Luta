package Personagem;

public class Atirador extends Personagem{
    private String armaPrincipal;

    public Atirador(String nomePersonagem, Integer forcaBase, String armaPrincipal) {
        super(nomePersonagem, forcaBase);
        this.armaPrincipal = armaPrincipal;
    }


    @Override
    public String toString() {
        return super.toString() + "| Arma principal: " + armaPrincipal;
    }
}
