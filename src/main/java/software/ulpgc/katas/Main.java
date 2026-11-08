package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person borja = new Person("Borja", LocalDate.of(2000, 12, 23));
        System.out.println(borja);
    }

}
