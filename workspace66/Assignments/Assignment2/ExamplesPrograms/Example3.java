package ExamplesPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example3 {
	public static void main(String[] args) {
		List<String> places = Arrays.asList("H");
		Predicate<String> startsWithB = (String place) ->  ! place.startsWith("B");
		 List<String> filteredPlaces =  places.stream()
               .filter(startsWithB)
               .collect(Collectors.toList());
       System.out.println(filteredPlaces);
		
	}

}

//public class Example4 {
//	public static void main(String[] args) {
//		List<String> places = Arrays.asList("I");
//		Predicate<String> startsWithL = (String place) -> place.startsWith("I");
//		List<String> filteredPlaces = places.stream();
//		      .filter(startsWithB)
//              .collect(Collectors.toList());
//System.out.println(filteredPlaces);
//	}
//}
