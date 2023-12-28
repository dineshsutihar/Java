package JavaLearning.Lab_Work;

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 5.0;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 6.0;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 7.0;
    }
}

public class BankIntrestRate {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("Rate of Interest in SBI is " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in ICICI is " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in AXIS is " + axis.getRateOfInterest() + "%");
    }
}
