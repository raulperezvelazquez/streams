package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    long countFemales = MockData.getPeople()
        .stream()
        .filter(person -> person.getGender().equals("Female"))
        .count();
    System.out.println(countFemales);

  }

  @Test
  public void min() throws Exception {
    double minPriceYellowCar = MockData.getCars()
        .stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .min()
        .orElse(0);
    System.out.println(minPriceYellowCar);
  }

  @Test
  public void max() throws Exception {
    double maxPriceYellowCar = MockData.getCars()
        .stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .max()
        .orElse(0);
    System.out.println(maxPriceYellowCar);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();
    double averagePrice = cars.stream().mapToDouble(Car::getPrice).average().orElse(0);
    System.out.println(averagePrice);

  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    double sum = cars.stream().mapToDouble(Car::getPrice).sum();
    System.out.println(BigDecimal.valueOf(sum));
  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics doubleSummaryStatistics = cars.stream()
        .mapToDouble(Car::getPrice)
        .summaryStatistics();
    double min = doubleSummaryStatistics.getMin();
    double max = doubleSummaryStatistics.getMax();
    double average = doubleSummaryStatistics.getAverage();
    double sum = doubleSummaryStatistics.getSum();
    System.out.println(min);
    System.out.println(max);
    System.out.println(average);
    System.out.println(BigDecimal.valueOf(sum));

  }

}