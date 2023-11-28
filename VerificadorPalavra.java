import java.util.List;

public class VerificadorPalavra {
    public boolean validarPalavra(String palavra, char letra, List<String> palavras) {
        return palavra.length() >= 4 && palavras.contains(palavra) && palavra.startsWith(String.valueOf(letra));
    }
}
