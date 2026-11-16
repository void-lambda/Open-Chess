
import java.awt.Color;
import java.awt.Graphics2D;

public class Board {

    // 800x800
    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    public void draw(Graphics2D g2) {

        boolean c = true;

        for (int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COL; col++) {

                if (c) {
                    g2.setColor(new Color(210, 165, 125));
                    c = false;
                } else {
                    g2.setColor(new Color(175, 115, 70));
                    c = true;
                }

                g2.fillRect(col*SQUARE_SIZE, row*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);  //xywh
            }

            if (c) {
                c = false;
            } else {
                c = true;
            }
        }
    }


}
