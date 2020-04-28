package streamsLamdaExperssions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To convert the Streams after modifications back to the collections using COLLECT Method
		List<String> convertedList =  Stream.of("ASIA","AUSTRALIA","EUROPE","AFRICA","antartica","NA").sorted()
		 .map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(convertedList);
		System.out.println(convertedList.get(0));
		

		
		//Print the Uniquee numbers from Array
		
		List<Integer> values = Arrays.asList(1,2,3,4,6,5,2,5,6,7,8,9);
		values.stream().sorted().distinct().forEach(s->System.out.println("Unique numbers "+s));
		
		List<Integer> list = values.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Get the 3rd element :"+list.get(3));
	
	}

}
