package Project.client;
// Jenish Patel - jp989 - IT- 114-001 12/14/2023
import javax.swing.JPanel;

public interface ICardControls {
    void next();

    void previous();

    void show(String cardName);

    void addPanel(String name, JPanel panel);

    void connect();
}
