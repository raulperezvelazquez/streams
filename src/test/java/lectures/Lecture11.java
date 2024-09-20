package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    // Complete method bellow: Concatenate names into one String joined by comma
    // You may have to remove the last comma

    String namesJoined = "";
    for (String name : names) {
      namesJoined = namesJoined.concat(name).concat(", ");
    }
    System.out.println(namesJoined.substring(0, namesJoined.lastIndexOf(",")));
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String namesJoined = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.joining(", "));
    System.out.println(namesJoined);
  }
}
