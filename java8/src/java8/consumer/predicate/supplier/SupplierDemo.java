package java8.consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(() -> 10));

	}

}
