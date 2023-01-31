package java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Manoj");
		names.add("Kumar");
		names.add("Pentela");
		names.add("Yash");
		names.add("Satwik");
		names.stream().forEach(name -> System.out.println(name));

		System.out.println("<--------- Map --------->");

		Map<String, String> map = new HashMap<>();

		map.put("Manoj", "Pentela");
		map.put("Yash", "Singarapu");
		map.put("Satwik", "Jagarlamudi");
		map.put("Sunil", "Jude");

//		map.forEach((name, surname) -> System.out.println(name + " " + surname));

		map.entrySet().stream().forEach(obj -> System.out.println(obj));
	}
}
