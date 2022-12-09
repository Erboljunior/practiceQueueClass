import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonableImpl implements Personable {

    List<Person> people = new ArrayList<>();

    @Override
    public String createPeople(List<Person> people) {
        this.people.addAll(people);
        return "people created successfully\n";
    }

    @Override
    public List<Person> getAll() {
          return this.people;
    }

    @Override
    public Map<Integer,Person> getAllAges(List<Person>people) {
        Map<Integer,Person>personMap=new HashMap<>();
        for (Person person : people) {
           int age = Period.between(person.getBirthday(), LocalDate.now()).getYears();
           personMap.put(age,person);

        }
        return personMap;
    }

    @Override
    public String debt(String borrower, String lender, int money, List<Person> peoplle) {
        return null;
    }

    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person> res = new ArrayList<>();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                 res.add(person);
            }
        }
        return res;
    }
}


