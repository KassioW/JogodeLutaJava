/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultraemoji;


import java.util.Collections;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author kwosilva
 */
public class Ultraemoji {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[8];
        l[0] = new Lutador("Davi jhones", "Bahia", 27, 1.70f, 65f, 14, 1, 2);
        l[1] = new Lutador("Raluca", "Sao Paulo", 22, 1.68f, 61f, 8, 4, 1);
        l[2] = new Lutador("Orochi", "Sao paulo", 24, 1.78f, 75f, 15, 1, 0);
        l[3] = new Lutador("Luan Gameplays", "Rio de janeiro", 27, 1.80f, 90f, 7, 3, 6);
        l[4] = new Lutador("Igao", "Santa Catarina", 29, 1.85f, 99f, 13, 0, 3);
        l[5] = new Lutador("Cocielo", "Goias", 27, 1.90f, 90f, 12, 6, 4);
        l[6] = new Lutador("Smzinho", "Alagoas", 30, 1.80f, 77f, 7, 2, 5);
        l[7] = new Lutador("Ratao", "Manaus", 31, 1.82f, 75f, 6, 3, 3);

        // Embaralhar a ordem dos lutadores
        List<Lutador> lutadores = Arrays.asList(l);
        Collections.shuffle(lutadores);

        Luta WFC01 = new Luta();
        WFC01.marcarLuta(lutadores.get(0), lutadores.get(1));
        WFC01.lutar();
        lutadores.get(0).status();
        lutadores.get(1).status();
    }
}