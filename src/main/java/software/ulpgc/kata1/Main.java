package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person pepe = new Person("Pepe", LocalDate.of(2003, 6, 9));
        System.out.println(pepe);
    }

}
