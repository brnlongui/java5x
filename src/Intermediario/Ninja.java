package Intermediario;

public class Ninja {
    String nome = "";
    String aldeia= "";
    int idade;

    public void SharinganAtivado(){
        System.out.println("Sharingan ativou");
    }

    public String  EuSouUmNinja(){
        return "Olá, eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
