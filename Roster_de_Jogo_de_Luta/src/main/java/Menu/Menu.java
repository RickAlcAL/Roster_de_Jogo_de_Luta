package Menu;

import Personagem.Atirador;
import Personagem.LutadorCorpoACorpo;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void menuInterface () {
        List<LutadorCorpoACorpo> coisaBoa = new ArrayList<>();
        List<Atirador> coisaRuim = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\personagens_db.csv"))){
            String line;
            while ((line = br.readLine()) != null){

                String [] dados = line.split(";");
                String passador = dados[2].trim();
                Integer numero = Integer.parseInt(passador);

                if (line.charAt(0)=='L'){

                    coisaBoa.add(new LutadorCorpoACorpo(dados[1],numero,dados[3]));

                } else if (line.charAt(0)=='A') {

                    coisaRuim.add(new Atirador(dados[1],numero,dados[3]));

                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Lutadores");
        for (LutadorCorpoACorpo corpo : coisaBoa){
            System.out.println(corpo);
        }
        System.out.println("Atiradores");
        for (Atirador carry : coisaRuim){
            System.out.println(carry);
        }
    }
}
