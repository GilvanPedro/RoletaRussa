package br.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> balas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            balas.add(i + 1);
        }

        int roleta = (int) (Math.random() * 6) + 1;
        int escolha = 0;

        while (escolha != roleta && balas.size() > 1) {

            System.out.println("Escolha uma bala: " + balas);
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                System.out.println("Digite apenas números!");
                sc.next();
                continue;
            }

            escolha = sc.nextInt();

            if (!balas.contains(escolha)) {
                System.out.println("Essa bala já foi usada!");
                continue;
            }
            if (escolha == roleta) {
                System.out.println("Você morreu com um tiro!!");
                break;
            }

            balas.remove(Integer.valueOf(escolha));
            System.out.println("Sobreviveu...");
        }

        if (balas.size() == 1 && balas.get(0) == roleta) {
            System.out.println("Só restou a bala mortal. Você venceu!");
        }
    }
}
