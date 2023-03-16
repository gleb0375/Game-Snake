package Snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (GamePanel.direction != 'D') {
                    GamePanel.direction = 'A';
            }
            break;

            case KeyEvent.VK_RIGHT:
                if (GamePanel.direction != 'A') {
                    GamePanel.direction = 'D';
                }
                break;

            case KeyEvent.VK_UP:
                if (GamePanel.direction != 'S') {
                    GamePanel.direction = 'W';
                }
                break;
            case KeyEvent.VK_DOWN:
                if (GamePanel.direction != 'W') {
                    GamePanel.direction = 'S';
                }
                break;
        }
    }
}
