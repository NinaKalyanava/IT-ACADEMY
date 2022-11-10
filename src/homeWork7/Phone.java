package homeWork7;

public class Phone {
    int number;
    int model;
    int weight;

    Phone(int number, int model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String callerName) {
        System.out.println("Calling " + callerName);
    }

    void getNumber(long phoneNumber) {
        System.out.println("Phone number is " + phoneNumber);
    }

    void receiveCall(String callerName, long phoneNumber) {
        System.out.println("Calling " + callerName + ", phone number is " + phoneNumber);
    }

    void sendMessage(long... phoneNumber) {
        for (long ele : phoneNumber) {
            System.out.println("Phone numbers: " + ele);
        }
    }
}
