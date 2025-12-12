package Sebus;

public class Main {
    public static void main(String[] args) {
        Pessoa[]p = new Pessoa[2];
        Livro []l = new Livro[3];

        p[0] = new Pessoa("Lais", 17, "Feminino");
        p[1] = new Pessoa("Julia", 18, "F");

        l[0] = new Livro("Verity", "Colleen Hoover", 320, p[0]);
        l[1] = new Livro("Diário de Anne Frank", "Anne Frank", 244, p[1]);
        l[2] = new Livro("Os mistérios do Universo", "Iberê Tenório", 224,p[0]);

       l[2].abrir();
       l[2].folhear(350);
       l[2].voltarPag();
       l[2].fechar();

        System.out.println("===================================");
        System.out.println(l[0].detalhes());
        System.out.println("===================================");
        System.out.println(l[1].detalhes());
        System.out.println("===================================");
        System.out.println(l[2].detalhes());


    }
}