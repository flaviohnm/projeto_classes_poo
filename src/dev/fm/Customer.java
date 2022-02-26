package dev.fm;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    //attributes

    private String name;
    private LocalDate birthday;

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer calculateAge(){

        LocalDate actualDate = LocalDate.now();
        int age = Period.between(this.birthday, actualDate).getYears();
        return age;

    }

}
