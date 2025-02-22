package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer anyNumberMatching =
        Arrays.stream(numbers)
            .filter(n -> n > 5 && n < 10)
            .findAny()
            .get();
    System.out.println(anyNumberMatching);
  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer anyNumberMatching =
        Arrays.stream(numbers)
            .filter(n -> n > 5 && n < 10)
            .findFirst()
            .get();
    System.out.println(anyNumberMatching);
  }
}

