import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class {
    public static void main(String[] args) {
        List<Person> enter = new ArrayList<>();
        enter.add(new Person(12, 13));
        enter.add(new Person(19, 5));
        enter.add(new Person(21, 13));
        List<Person> pass = enter.stream()
                .filter(person -> person.getAge()>17)
                .filter(person -> person.getMoney()>5)
                .map(person -> new Person(person.getAge(),person.getMoney()-5))
                .collect(Collectors.toList());
        pass.forEach(person -> System.out.println(person.toString()));
    }

}
