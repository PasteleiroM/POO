import java.util.Random;

public class SorteadorLetra {
    public char sortearLetra() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }
}
