package POO.Aula07;

public class CadastroLutador implements Apresentacao {
    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String Categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public CadastroLutador(String nome, String nacionalidade, int idade, Double altura, Double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return Categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.Categoria = "Inválido";
        }else if (this.getPeso() <= 70.3) {
            this.Categoria = "Leve";
        }else if (this.getPeso() <= 83.9) {
            this.Categoria = "Médio";
        }else if (this.getPeso() <= 120.2) {
            this.Categoria = "Pesado";
        }else{
            this.Categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    @Override
    public void Apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("ALtura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    @Override
    public void Status() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    @Override
    public void GanharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    @Override
    public void PerderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }
    @Override
    public void EmpatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
    
}
