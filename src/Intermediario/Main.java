package Intermediario;

public class Main {
    public static void main(String[] args) {
        //Criar Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        //Criar Sassuke
        Ninja Sassuke = new Ninja();
        Sassuke.nome = "Sassuke Uchiha";
        Sassuke.aldeia = "Aldeia da Folha";
        Sassuke.idade = 18;
        Sassuke.SharinganAtivado();
        String chamandoMetodo = Sassuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int qtTempoFalta = Sassuke.anosParaSeTornarHokage(50);
        System.out.println("Faltam "+qtTempoFalta+" para ser hokage");

        //Criar Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;


    }

}
