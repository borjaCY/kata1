package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person gabriel = new Person("Gabriel", LocalDate.of(2001, 10, 23));
        System.out.println(gabriel);
    }
}
