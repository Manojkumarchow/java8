package java8.consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach((element) -> System.out.println(element));
	}
}
