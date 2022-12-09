import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;
    private Gender gender;
    private int money;

    public Person(Person person1, Person person2, Person person3) {
    }

    @Override
    public String toString() {
        return  "\n Name: "+name+"\n"+
                " Birthday: "+birthday+"\n"+
                " Gender: "+gender+"\n"+
                " Money: "+money;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person(String name, LocalDate birthday, Gender gender, int money) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.money = money;
    }
}
