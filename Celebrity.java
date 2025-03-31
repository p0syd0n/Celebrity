import java.util.ArrayList;
import java.util.Random;

public class Celebrity {
    private String name;
    private ArrayList<String> adjectives;

    public Celebrity(String name, ArrayList<String> adjectives) {
        this.name = name;
        this.adjectives = new ArrayList<>(adjectives); // Prevent external modification
    }

    public String getAdjective() {
        if (this.adjectives.isEmpty()) {
            return null; // No adjectives left
        }
        int index = new Random().nextInt(this.adjectives.size());
        return this.adjectives.get(index); // Remove and return
    }

    public int amountLeft() {
        return this.adjectives.size();
    }

    public String getName() {
        return this.name;
    }
}
