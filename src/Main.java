import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    Particle particle;

    public Main() {
        particle = new Particle(200, 200, 9, 9, 100000);
        Timer timer = new Timer(1, e -> {
            if (particle.isAlive()) {
                particle.update(getWidth(), getHeight());
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (particle.isAlive()) {
            g.setColor(Color.RED);
            g.fillOval((int) particle.x, (int) particle.y, 10, 10);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Single Particle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Main());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
