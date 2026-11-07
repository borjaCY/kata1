package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person andres = new Person("Andres", LocalDate.of(1980, 2, 5));
        System.out.println(andres);
    }
}
