package Section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsTest1 {

	public static void main(String[] args) {
		StreamsTest1 a = new StreamsTest1();
		a.streamCollect();
	}

	// count names that start with A
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amanda");
		names.add("Bella");
		names.add("Addie");
		names.add("Asanda");
		names.add("Ram");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);

	}

	// using streams
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amanda");
		names.add("Bella");
		names.add("Addie");
		names.add("Asanda");
		names.add("Ram");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		// dcreating a stream
		long d = Stream.of("Amanda", "Nolife", "Asanda", "Aggie", "ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// print all names
		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

		// limit the results
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	// stream map
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amanda");
		names.add("Anabella");
		names.add("AddieG");
		names.add("Asanda");
		names.add("Ram");

		Stream.of("Amanda", "Nolife", "Asanda", "Aggie", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("===");
		// print in a sorted names
		List<String> names1 = Arrays.asList("Amanda", "Nolife", "Asanda", "Aggie", "Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("===");
		// merging two lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s->System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Aggie"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	public void streamCollect() {
		
		List<String> ls = Stream.of("Amanda", "Nolife", "Asanda", "Aggie", "ram").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//
		List<Integer> numbers = Arrays.asList(8,5,4,2,2,1,2,4,5,7,9,7);
		numbers.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("===");
		List<Integer> n =numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(n.get(2));
		
	}

}
