import java.util.Set;

public class EncerradorJogo {
    public void encerrarJogo(Set<String> palavrasInformadas, Set<String> palavrasRepetidas) {
        System.out.println("Jogo encerrado!");
        System.out.println("Palavras informadas: " + palavrasInformadas.size());
        System.out.println("Palavras repetidas: " + palavrasRepetidas.size());
        System.out.println("Palavras repetidas: " + palavrasRepetidas);
    }
}
