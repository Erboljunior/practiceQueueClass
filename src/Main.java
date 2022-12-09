import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
Person person1 = new Person("Erbol", LocalDate.of(2004,11,22)
        ,Gender.M,20000);
Person person2 = new Person("Adil",LocalDate.of(2003,12,4)
        ,Gender.M,30000);
Person person3 = new Person("Osmon",LocalDate.of(2004,12,22),Gender.M,25000);



PersonableImpl personable = new PersonableImpl();
Scanner scanner = new Scanner(System.in);






        while (true) {
            List<Person>people1=new ArrayList<>(List.of(person1,person2,person3));
            System.out.println("""
                    1 -> to create people
                    2 -> to find by name
                    3 -> to get all
                    4 -> to get ages
                    5 -> to borrow money
                    """);
            switch (scanner.nextInt()){
                case 1:
                    System.out.println(personable.createPeople(people1));
                    break;
                case 2:
                    System.out.println("Name: ");
                    String word = new Scanner(System.in).next();
                    System.out.println(personable.findByName(word, people1));
                    break;
                case 3:
                    System.out.println(people1);
                    break;
                case 4:
                    System.out.println(personable.getAllAges(people1));
                    break;
                default:
                    System.out.println("this program accepts numbers until 5 or something went not true\n");
            }

        }
        }
    }


