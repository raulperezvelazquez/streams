package lectures;

import beans.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            ArrayList::new,
            (List<String> list, String element) -> list.add(element),
            (List<String> list1, List<String> list2) -> list1.addAll(list2)
        );
    emails.forEach(System.out::println);
  }
}
