package br.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> balas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        double rand = Math.random();
        int roleta = (int)(rand*8)+1;
        int escolha = 0;

        for (int i = 0; i < 8; i++) {
            balas.add(i + 1);
        }

        while(escolha != roleta && balas.size() != 1){

            System.out.println("Escolha uma bala: " + balas);
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            for (int i = 0; i < balas.size(); i++) {
                if (balas.get(i) == escolha) {
                    balas.remove(i);
                }
                if (roleta == escolha) {
                    System.out.println("Você morreu com um tiro!!");
                    break;
                } else if(balas.size() == 1){
                    System.out.println("Só resta a bala de verdade agora!! Você venceu");
                    break;
                }
            }

        }
    }
}
