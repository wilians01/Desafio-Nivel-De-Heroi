package desafio.simples;

import java.util.Scanner;

public class ClassificadorNivelDeheroi {

    public static void main(String[] args) {

        String nome ;
        int xp;
        String nivel;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá jogador, sejá bem-vindo !!");
        System.out.println("Qual é seu nome ?");
        nome = ler.nextLine();
        System.out.println("Atualmente qual é sua quantidade de XP ?");
        xp = ler.nextInt();

        if(xp <= 1000){
            nivel = "Ferro";
        }else if(xp >= 1001 && xp <= 2000 ){
            nivel = "Bronze";
        }else if(xp >= 2001 && xp <= 5000 ){
            nivel = "Prata";
        }else if(xp >= 5001 && xp <= 7000 ){
            nivel = "Ouro";
        }else if(xp >= 7001 && xp <= 8000 ){
            nivel = "Platina";
        }else if(xp >= 8001 && xp <= 9000 ){
            nivel = "Ascendente";
        }else if(xp >= 9001 && xp <= 10000 ){
            nivel = "Imortal";
        }else {
            nivel = "Radiante";
        }
        System.out.println("O Herói de nome "+nome+" está no nível de " + nivel);

        ler.close();

    }
}
