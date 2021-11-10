package model;

public class UserModel {
    private  int pin = 123 ;

    public UserModel() {

    }

    public UserModel(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}
