package nothelloworld;

import java.awt.*;

/**
 * @author : Julian
 * @date : 2019/2/25 14:54
 */
public class NotHelloWorldComponent extends Component {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics graphics){
        graphics.drawString("Not a HelloWorld program", MESSAGE_X, MESSAGE_Y);
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
