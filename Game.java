import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game {
    private ArrayList<Celebrity> celebrities;
    private int points = 0;
    private Swing swing;
    private int indexxx;
    Celebrity currentCelebrity;
    Random random;


    public Game() {
        celebrities = new ArrayList<Celebrity>();
        celebrities.add(new Celebrity("Leonardo DiCaprio", new ArrayList<>(List.of("talented", "handsome", "charismatic"))));
        celebrities.add(new Celebrity("Beyoncé", new ArrayList<>(List.of("powerful", "iconic", "beautiful"))));
        celebrities.add(new Celebrity("Elon Musk", new ArrayList<>(List.of("innovative", "ambitious", "controversial"))));
        celebrities.add(new Celebrity("Taylor Swift", new ArrayList<>(List.of("creative", "successful", "brilliant"))));
        celebrities.add(new Celebrity("Keanu Reeves", new ArrayList<>(List.of("kind", "humble", "legendary"))));
        celebrities.add(new Celebrity("Kanye West", new ArrayList<>(List.of("antisemitic", "majestic", "god"))));
        celebrities.add(new Celebrity("Ariana Grande", new ArrayList<>(List.of("vocal", "cute", "petite"))));
        celebrities.add(new Celebrity("Dwayne Johnson", new ArrayList<>(List.of("strong", "funny", "charitable"))));

        this.swing = new Swing();
        this.random = new Random();
        swing.setVisible(true);

        swing.label = new JLabel("Enter your guess: ");

        swing.textField = new JTextField(20);

        swing.add(swing.label);
        swing.add(swing.textField);

        swing.textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkInput(swing.textField.getText());
            }
        });

        newGuy();
    }

    public void checkInput(String guess) {
        try {
            System.out.println("Guess: " + guess + " Current: " + celebrities.get(indexxx).getName());
            if (guess.equals(celebrities.get(indexxx).getName())) {
                points++;
                System.out.println(guess + " is correct! You have " + points + " points.");
                celebrities.remove(indexxx);
                newGuy();
            } else {
                System.out.println(guess + " is incorrect!");
            }
        } catch(Exception e) {
            System.exit(69);
        }


    }

    public int newGuy() {
        if (celebrities.isEmpty()) {
            return -1;
        }

        indexxx = random.nextInt(celebrities.size());
        Celebrity currentCelebrity = celebrities.get(indexxx);
        swing.label.setText("Adjective: " + currentCelebrity.getAdjective());
        return indexxx;
    }
}
