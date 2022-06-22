package lesson8;

import lesson8.components.NumberJButton;
import lesson8.components.OperatorsJButton;
import lesson8.listeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {


    private JTextField inputField;

    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(500, 500, 350, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        /* Button button = new Button("button");
        super.add(button);
        button.addActionListener(e -> System.out.println("Event launch through the lambda"));
         */
        
        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
       
        add(createCenterPanel(), BorderLayout.CENTER);





        setVisible(true);
    }



    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenu menuHelp = new JMenu("Help");
        JMenu menuAbout = new JMenu("About");

        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);

        menuFile.add(new JMenuItem("Clear"));
        JMenuItem exitItem = menuFile.add(new JMenuItem("Exit"));
        menuBar.add(exitItem);


        /*
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
         */

        exitItem.addActionListener(new ExitButtonListener());





        return menuBar;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();

        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        inputField.setMargin(new Insets(18,0,6,0));
        inputField.setBackground(new Color(201,236,241));





        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);
        ActionListener buttonListenerNum = new ButtonListenerNum(inputField);



        centerPanel.add(createDigitsPanel(buttonListenerNum), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);






        return centerPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel operatorsPanel = new JPanel();
        operatorsPanel.setLayout(new GridLayout(4,1));

        JButton minus = new OperatorsJButton("-");
        minus.addActionListener(buttonListener);
        operatorsPanel.add(minus);

        JButton plus = new OperatorsJButton("+");
        plus.addActionListener(buttonListener);
        operatorsPanel.add(plus);

        JButton multiply = new OperatorsJButton("*");
        multiply.addActionListener(buttonListener);
        operatorsPanel.add(multiply);

        JButton divide = new OperatorsJButton("/");
        divide.addActionListener(buttonListener);
        operatorsPanel.add(divide);





        return operatorsPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListenerNum) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4,3));

        for(int i = 0; i < 10; i++){
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new NumberJButton(buttonTitle);

            btn.addActionListener(buttonListenerNum);
            digitsPanel.add(btn);

        }

        JButton equal = new OperatorsJButton("=");
        digitsPanel.add(equal);
        equal.addActionListener(new EqualListener(inputField));

        JButton clear = new OperatorsJButton("C");
        digitsPanel.add(clear);
        clear.addActionListener(new ClearButtonActionListener(inputField));



        return digitsPanel;
    }
}
