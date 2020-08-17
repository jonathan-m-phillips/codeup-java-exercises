import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


    public static void randomElement () {
        String[] adj = {"big", "bald", "chubby", "fit", "plain", "witty", "fierce", "fat", "great", "itchy"};
        String[] noun = {"designer", "doctor", "fox", "house", "fan", "laptop", "lung", "gift", "medicine", "gloves"};
        Random rand = new Random();
        int randAdjInt = rand.nextInt(adj.length);
        String randAdj = adj[randAdjInt];
        int randNounInt = rand.nextInt(noun.length);
        String randNoun = noun[randNounInt];

        System.out.printf("%s-%s", randAdj, randNoun);

    }

    public static void main(String[] args) {
        randomElement();

    }
}
