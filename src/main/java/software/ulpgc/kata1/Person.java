package software.ulpgc.kata1;

import java.time.LocalDate;
import java.util.Objects;

public final class Person {
    public static final int DAYS_TO_YEAR = 365;
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }
    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/ DAYS_TO_YEAR);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "birthday=" + birthday + ", " +
                "age=" + getAge() +']';
    }


}
