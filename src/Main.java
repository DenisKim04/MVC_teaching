import controller.UserController;
import model.UserModel;
import view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        UserModel userModel = new UserModel();
        UserController userController = new UserController(userModel);
        UserView userView = new UserView(userController);
        SwingUtilities.invokeLater(()->{

            userView.init();
        });
    }
}
