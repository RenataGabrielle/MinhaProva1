import java.util.ArrayList;
import java.util.Scanner;

class Jogador {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }
}

public class Participantes {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = cadastrarJogadores();

        contabilizarVotos(jogadores);

        Jogador eliminado = encontrarEliminado(jogadores);

        exibirEliminacao(eliminado);
    }

    private static ArrayList<Jogador> cadastrarJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        return jogadores;
    }

    private static void contabilizarVotos(ArrayList<Jogador> jogadores) {
        Scanner scanner = new Scanner(System.in);
        String voto;
        System.out.println("Digite 'sair' para encerrar a votação.");
        do {
            System.out.println("Em quem você vota para sair da casa?");
            voto = scanner.nextLine();
            if (!voto.equalsIgnoreCase("sair")) {
                Jogador jogadorVotado = encontrarJogador(jogadores, voto);
                if (jogadorVotado != null) {
                    jogadorVotado.incrementaUmVoto();
                    System.out.println("Voto computado para " + jogadorVotado.getNome() + ".");
                } else {
                    System.out.println("Jogador não encontrado. Tente novamente.");
                }
            }
        } while (!voto.equalsIgnoreCase("sair"));
    }

    private static Jogador encontrarJogador(ArrayList<Jogador> jogadores, String nome) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }

    private static Jogador encontrarEliminado(ArrayList<Jogador> jogadores) {
        Jogador eliminado = jogadores.get(0);
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > eliminado.getVotos()) {
                eliminado = jogador;
            }
        }
        return eliminado;
    }

    private static void exibirEliminacao(Jogador eliminado) {
        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami,");
        System.out.println("se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão,");
        System.out.println("e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer,");
        System.out.println("aí terá chegado o dia em que eu vou conseguir te eliminar com alegria.");
        System.out.println("Com " + eliminado.getVotos() + " votos, é você quem sai " + eliminado.getNome());
    }
}