package gui;
import logic.Camera;
import javax.swing.JPanel;
import java.awt.*;


/**
 * Ta klasa, rozszerzająca JPanel, odpowiada za malowanie sceny na ekranie.
 * @author alebar
 */
public class DrawingPanel extends JPanel {
    private final int PANEL_WIDTH = 640;
    private final int PANEL_HEIGHT = 480;
    private Camera mainProgram;
    private Integer[] p = new Integer[4];

    public DrawingPanel (Camera mP, GUI mouseList) {
        this.addMouseListener(mouseList);
        mainProgram = mP;
        
        Dimension d = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
        this.setMinimumSize(d);
        this.setPreferredSize(d);
        this.setMaximumSize(d);
        
        this.setBackground(Color.BLACK);
    }

    /**
     * Przesłonięta metoda paintComponent(g) mojego autorstwa pobiera odpowiednie dane
     * z programu głównego i maluje je na ekranie w panelu.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        p = mainProgram.getPunkty();
        g.setColor(Color.WHITE);
        g.drawLine(p[0], p[1], p[2], p[3]);
    }

}