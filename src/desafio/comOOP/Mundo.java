package desafio.comOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Mundo {
        public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);
            Heroi heroi = new Heroi();
            try {
                System.out.println("Olá jogador, sejá bem-vindo !!");

                System.out.println("Qual é seu nome ?");
                String nome = ler.nextLine();
                heroi.setNome(nome);

                System.out.println("Atualmente qual é sua quantidade de XP ?");
                int xp = ler.nextInt();
                if(xp < 0){
                    System.out.println("XP não pode ser negativo. Tente novamente.");

                }else {
                    heroi.setXp(xp);
                    heroi.status();
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de inserir um número inteiro válido para o XP.");
            } finally {

                ler.close();
            }




        }
    }

