package Personagem;

public class LutadorCorpoACorpo extends Personagem{
    private String arteMarcial;

    public LutadorCorpoACorpo(String nomePersonagem, Integer forcaBase, String arteMarcial) {
        super(nomePersonagem, forcaBase);
        this.arteMarcial = arteMarcial;
    }


    @Override
    public String toString() {
        return super.toString() + "| Arte Marcial : " + arteMarcial;
    }
}
