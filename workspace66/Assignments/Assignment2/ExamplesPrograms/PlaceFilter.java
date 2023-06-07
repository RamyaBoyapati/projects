package ExamplesPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlaceFilter{
	public static void main(String[] args) {
		List<String> places = Arrays.asList("Hyderabad", "Bangalore", "Chennai", "Bhopal", "Bhubaneswar", "Vizag");
		 Predicate<String> startsWithB = (String place) ->  ! place.startsWith("B");
		 List<String> filteredPlaces =  places.stream()
				                             .filter(startsWithB)
                                             .collect(Collectors.toList());
		 System.out.println(filteredPlaces);
	}
}
//The program creates a Predicate called startsWithB that checks whether a given 
//string starts with the letter "B". It then uses the filter method on the stream
//of places to return only those that satisfy this Predicate. Finally, it converts
//the filtered stream back into a List using the toList method, and prints the
//resulting list of filtered places.



