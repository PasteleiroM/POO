import java.util.*;

public class JogoDasPalavras {
    private List<String> palavras;
    private int tempoLimite;
    private List<Character> letras;
    private Set<String> palavrasInformadas;
    private Set<String> palavrasRepetidas;

    public JogoDasPalavras(List<String> palavras, int tempoLimite) {
        this.palavras = palavras;
        this.tempoLimite = tempoLimite;
        this.letras = new ArrayList<>();
        this.palavrasInformadas = new HashSet<>();
        this.palavrasRepetidas = new HashSet<>();
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        char letra = sortearLetra();
        System.out.println("Digite palavras que comecem com a letra '" + letra + "' (4 ou mais letras):");
        while ((System.currentTimeMillis() - startTime) < tempoLimite) {
            
            String palavra = scanner.nextLine().toLowerCase();

            if (validarPalavra(palavra, letra)) {
                if (palavrasInformadas.contains(palavra)) {
                    palavrasRepetidas.add(palavra);
                    System.out.println("Palavra repetida! Tente outra.");
                } else {
                    palavrasInformadas.add(palavra);
                }
            } else {
                System.out.println("Palavra inválida! Tente outra.");
            }
        }

        encerrarJogo();
    }

    private char sortearLetra() {
        Random random = new Random();
        char letra = (char) ('a' + random.nextInt(26));
        letras.add(letra);
        return letra;
    }

    private boolean validarPalavra(String palavra, char letra) {
        return palavra.length() >= 4 && palavras.contains(palavra) && palavra.startsWith(String.valueOf(letra));
    }

    private void encerrarJogo() {
        System.out.println("Jogo encerrado!");
        System.out.println("Palavras informadas: " + palavrasInformadas.size());
        System.out.println("Palavras repetidas: " + palavrasRepetidas.size());
        System.out.println("Palavras repetidas: " + palavrasRepetidas);
    }
}
