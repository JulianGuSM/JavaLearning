package nothelloworld;

import javax.swing.*;

/**
 * @author : Julian
 * @date : 2019/2/25 14:53
 */
public class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}
