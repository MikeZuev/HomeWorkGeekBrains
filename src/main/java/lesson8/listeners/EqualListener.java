package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualListener implements ActionListener {

    private JTextField inputField;
    private StringBuilder numbers;
    private int a;
    private int b;
    private String operator;
    private String result;

    public EqualListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String StrInputField = inputField.getText();


        String[] list = StrInputField.split(" ");

        operatorsNumbers(list);

        result = Integer.toString(calc(a, b, operator));
        inputField.setText("");
        inputField.setText(result);







    }
    private void operatorsNumbers(String[] list){
        for(int i = 0; i < list.length; i++){
            if(i == 0){
                a = Integer.parseInt(list[i]);
            }else if(i % 2 != 0){
                operator = list[i];
            }else if (i % 2 == 0){
                b = Integer.parseInt(list[i]);
            }
        }

    }

    private int calc(int a, int b, String operator){
        switch(operator){
            case"+":
                return a + b;
            case"-":
                return a - b;
            case"/":
                return a / b;
            case "*":
                return a * b;
            default:
                return 0;
        }

    }


}
