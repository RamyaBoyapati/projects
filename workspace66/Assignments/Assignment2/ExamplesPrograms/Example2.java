package ExamplesPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		List<String> places = Arrays.asList("R");
		Predicate<String> startsWithB = (String place) ->  ! place.startsWith("B");
		 List<String> filteredPlaces =  places.stream()
                .filter(startsWithB)
                .collect(Collectors.toList());
        System.out.println(filteredPlaces);
	}

}
