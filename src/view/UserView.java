package view;

import controller.UserController;
import model.UserModel;

import javax.swing.*;
import java.awt.*;

public class UserView  extends JFrame {
    private JTextArea text;
    private JButton setButton;
    private JLabel info;
    private UserController userController;

    public UserView()  {
    }

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void init(){
        setSize(400,300);
    text = new JTextArea();
    setButton = new JButton("send");
    info = new JLabel("info");
    add(text, BorderLayout.CENTER);
    add(setButton, BorderLayout.SOUTH);
    add(info,BorderLayout.NORTH);

    setButton.addActionListener(e -> {
        int pin;
        String textPin = this.text.getText();
        pin = Integer.parseInt(textPin);
       info.setText("Go it: " + pin + " Waiting...");

        boolean result =  userController.checkPin(pin);
        String resultMessage ;
        if(result == true){
            resultMessage = "Right";

        }else {
            resultMessage = "Error";
        }
        info.setText(resultMessage);

    });
        setVisible(true);
    }
}
