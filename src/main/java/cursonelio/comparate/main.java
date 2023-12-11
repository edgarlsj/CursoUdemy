package cursonelio.comparate;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Personagem> personagens = new  ArrayList<Personagem>();
;

        personagens.add(new Personagem(5L, "Goku", 35, "lutador de artes marciais"));
        personagens.add(new Personagem(3L, "Vegeta", 25, "lutador de artes marciais irmao goku"));
        personagens.add(new Personagem(1L, "Cell", 21, "lutador de artes marciais filho goku"));
        personagens.add(new Personagem(2L, "Freeza", 95, "vilão"));
        personagens.add(new Personagem(4L, "Android18", 33, "esposa vegeta"));
        Collections.sort(personagens);
        for (Personagem p: personagens) {
            System.out.println(p);




        }

    }
}
