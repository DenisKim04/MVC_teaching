package controller;

import model.UserModel;

public class UserController {
    private UserModel userModel;

    public UserController(UserModel userModel) {
        this.userModel = userModel;
    }
    public boolean checkPin(int pin){
        return userModel.getPin() == pin;
    }
}
