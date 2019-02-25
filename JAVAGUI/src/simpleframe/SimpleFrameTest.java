package simpleframe;

import javax.swing.*;
import java.awt.*;

/**
 * The type Simple frame test.
 *
 * @author : Julian
 * @date : 2019/2/25 14:06
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        );
    }
}
