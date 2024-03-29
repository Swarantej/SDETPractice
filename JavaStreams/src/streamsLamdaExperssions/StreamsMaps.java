package streamsLamdaExperssions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In Streams we have Maps
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swaran");
		list.add("Santosh");
		list.add("Vishwa");
		list.add("Swarantej");
		
		list.stream().filter(s ->s.startsWith("S")).map(s->s.toUpperCase())
		.forEach(s->System.out.println("Converting to upper case using Maps "+s));
		
		//now print the samein sorting order --USING other terminal operation called SORT
		
		list.stream().filter(s ->s.startsWith("S")).map(s->s.toUpperCase()).sorted()
		.forEach(s->System.out.println("Sorted order "+s));

		//We ca also use streams on Arrays, we need to convert Arrays to Arrays List and apply stream
		
		List<String> listConverted = Arrays.asList("Anand","avinash","abhishek","amrutha");
		listConverted.stream().sorted()
		.forEach(s->System.out.println("COnverted arrays to array list and sorted "+s));
		
		
		
	}

}
