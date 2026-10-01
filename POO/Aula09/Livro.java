package POO.Aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(pagAtual);
        this.setAberto(false);
        this.setLeitor(leitor);
    }
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
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
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
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("-----------------------------------");
        System.out.println("Detalhes do livro:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear() {
        if(this.getAberto()) {
            this.setPagAtual((int)(Math.random() * this.getTotPaginas()));
            System.out.println("Folheando o livro... Página atual: " + this.getPagAtual());
        }
    }
    @Override
    public void avancarPag() {
     if(this.getAberto()) {
        if(this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        }else {
            System.out.println("Você já está na última página.");
        }
     }else {
            System.out.println("O livro está fechado. Abra-o para avançar páginas.");
        }
    }
    @Override
    public void voltarPag() {
        if(this.getAberto()) {
            if(this.getPagAtual() > 0) {
                this.setPagAtual(this.getPagAtual() - 1);
            }else {
                System.out.println("Você já está na primeira página.");
            }
        }else {
            System.out.println("O livro está fechado. Abra-o para voltar páginas.");
        }
    }
    
}
