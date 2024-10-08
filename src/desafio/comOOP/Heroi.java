package desafio.comOOP;

public class Heroi {
    private String nome;
    private int xp;

    public String getNome() {
        return nome;
    }

    public int getXp() {
        return xp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void status(){
        System.out.println("O Herói de nome "+getNome()+" está no nível de " +Classificador(xp) );
    }

      private String Classificador (int xp){
          if (xp <= 1000) {
              return "Ferro";
          } else if (xp <= 2000) {
              return "Bronze";
          } else if (xp <= 5000) {
              return "Prata";
          } else if (xp <= 7000) {
              return "Ouro";
          } else if (xp <= 8000) {
              return "Platina";
          } else if (xp <= 9000) {
              return "Ascendente";
          } else if (xp <= 10000) {
              return "Imortal";
          } else {
              return "Radiante";
          }
    }

}
