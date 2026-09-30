package POO.Aula07;
import java.util.Random;

public class Luta {
    private CadastroLutador desafiado;
    private CadastroLutador desafiante;
    private int rounds;
    private boolean aprovada;


    public CadastroLutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(CadastroLutador desafiado) {
        this.desafiado = desafiado;
    }
    public CadastroLutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(CadastroLutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(CadastroLutador l1, CadastroLutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            desafiado = l1;
            desafiante = l2;
        }else{
            this.setAprovada(false);
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){
        if (getAprovada()) {
            System.out.println("### DESAFIADO ###");
            desafiado.Apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.Apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    desafiado.EmpatarLuta();
                    desafiante.EmpatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.GanharLuta();
                    desafiante.PerderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome());
                    desafiado.PerderLuta();
                    desafiante.GanharLuta();
                default:
                    System.out.println("Opção inválida");
                    break;
            } 
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
    
}
