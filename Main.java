import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Carregar palavras do arquivo palavras.txt
        List<String> palavras = carregarPalavrasDoArquivo("palavras.txt");

        // Criar instância do jogo
        JogoDasPalavras jogo = new JogoDasPalavras(palavras, 60000); // Tempo limite: 60 segundos

        // Iniciar o jogo
        jogo.iniciarJogo();
    }

    private static List<String> carregarPalavrasDoArquivo(String arquivo) {
        List<String> palavras = new ArrayList<>();
    
        try (Scanner scanner = new Scanner(new File(arquivo))) {
            while (scanner.hasNext()) {
                String palavra = scanner.next();
                palavras.add(palavra);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    
        return palavras;
    }
}
