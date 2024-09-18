package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    System.out.println("Exclusive:");
    IntStream.range(0, 10).forEach(System.out::println);
    System.out.println("Inclusive:");
    IntStream.rangeClosed(0, 9).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    // Complete method bellow: loop through people using IntStream and print the each object.
    // Think weather you need to use range or range close.

    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size()).forEach(index -> System.out.println(people.get(index)));
  }

  @Test
  public void intStreamIterate() throws Exception {
    // Pintar números pares usando IntStream.iterate

    IntStream.iterate(0, operand -> operand + 1)
        .filter(value -> value % 2 == 0)
        .limit(20)
        .forEach(System.out::println);
  }
}
