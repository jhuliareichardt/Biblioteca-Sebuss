package Sebus;

public class Livro implements Publicacao{
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    //MÉTODOS PERSONALIZADOS

    public String detalhes() {
        return "\n Título" + " Livro: " + titulo + '\'' + "\n Autor: " + autor + '\'' + "\n Total de Páginas: " + totPag + "\n Página Atual: " + pagAtual + "\n Aberto? " + aberto + "\n Leitor: " + leitor.getNome() + '\'' + "\n Idade = " + leitor.getIdade() + "\n Sexo: " + leitor.getSexo();
    }


    //MÉTODOS CONSTRUTORES

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }


    //MÉTODOS ESPECIAIS


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
        if (this.getAberto() == true){
            System.out.println("O livro já está aberto!");
        } else {
            System.out.println("Abrindo...");
        }
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        if(this.aberto == false) {
            System.out.println("O livro já está fechado!");

        } else if (this.aberto == true ){
            System.out.println("Fechando...");
        }
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        if (p > this.totPag){
            System.out.println("Voce não pode folhear mais do que " + totPag + " páginas");

        } else {
            System.out.println("Folheando...");
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}

