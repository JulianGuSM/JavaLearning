package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author : Julian
 * @date : 2019/2/26 11:50
 */
public class CalculatorTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            JFrame jFrame = new JFrame();
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
            jFrame.setTitle("CalculatorPanel");
            jFrame.setBounds(200, 200, 500, 400);
            jFrame.add(new CalculatorPanel());
        });

    }
}
class CalculatorPanel extends JPanel{
    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel(){
        setLayout(new BorderLayout());
        result = 0;
        lastCommand = "=";
        start = true;

        //add the display
        display = new JButton("0");
        display.setEnabled(false);
        add(display,BorderLayout.NORTH);

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        //add the buttons in a 4*4 grid
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/" ,command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*" ,command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-" ,command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", insert);
        addButton("+" ,command);

        add(panel,BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (start) {
                if (command.equals("-")){
                    display.setText(command);
                    start = false;
                }else {
                    lastCommand = command;
                }
            }else {
                calculate(Double.parseDouble((display.getText())));
                lastCommand = command;
                start = true;
            }
        }

        private void calculate(double parseDouble) {
            if (lastCommand.equals("+")) {
                result += parseDouble;
            }else if (lastCommand.equals("-")){
                result -= parseDouble;
            }else if (lastCommand.equals("*")){
                result *= parseDouble;
            }else if (lastCommand.equals("/")){
                result /= parseDouble;
            }else if (lastCommand.equals("=")){
                result = parseDouble;
            }
            display.setText("" + result);
        }
    }
}
