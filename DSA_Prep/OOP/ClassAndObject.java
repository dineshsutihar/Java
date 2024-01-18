package DSA_Prep.OOP;

class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void trunOff(){
        isOn =  false;
        System.out.println("Light on? "+ isOn);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        
        // Create object led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by 
        // calling method turnOn()
        led.turnOn();

        // turn off the light by 
        // callign method turnOff()
        halogen.trunOff();
    }
}
