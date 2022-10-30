package domain;

public class Client {

        private int id;

        private final String name;

        private final String surname;

        private final int phoneNumber;


    public Client(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
}
