import java.util.List;
import java.util.Map;

public interface Personable {
    String createPeople(List<Person>people);
    List<Person>getAll();
    Map< Integer, Person> getAllAges(List<Person>people);
    String debt(String borrower, String lender, int money, List<Person> peoplle);

     List<Person>findByName(String name, List<Person>people);
}
