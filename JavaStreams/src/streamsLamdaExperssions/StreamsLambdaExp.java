package streamsLamdaExperssions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList();
		listToStreams();
		directStream();
		otherTerminalOps();
		concateTwoArrayLists();
		
	}
	
	/**
	 * 
	 */
	
	public static void arrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swaran");
		list.add("Santosh");
		list.add("Vishwa");
		list.add("Swarantej");
		//To find the string which are starting with S
		int count =0;
		for(int i =0; i<list.size();i++) {
			String name = list.get(i);
			if(name.startsWith("S")) {
				count++;
			}
			
		}
		System.out.println("ArrayList Method::Num of names starting with character S are : "+count);
	}
	
	//Using Streams concept
	/**
	 * First convert the array list into Streams
	 * Then filter method on the stream
	 * On this filter method we need to have some opertaion(Using Lamba exp)
	 * THIS FILTER METHOD IS CALLED INTERMEDIATE OPERTION
	 * After this we need to have TERMINAL OPERTAION Like count or some methods
	 * Only if we have terminal operation/method this code will execute
	 * ALSO only when the intermediate operation is returned tru only then terminal op will exec
	 *
	 *
	 *BELOW CODE "COUNT" is the TERMINAL OPERATION
	 *S->S.StartsWIth() is intermediate operation
	 */
	
	public static void listToStreams() {
		// TODO Auto-generated method stub
					ArrayList<String> listStream = new ArrayList<String>();
					listStream.add("INDIA");
					listStream.add("Santosh");
					listStream.add("IRELAND");
					listStream.add("Australia");
					//Now converting to streams
					Long count = listStream.stream().filter(s ->s.startsWith("I")).count();
					System.out.println("Stream conversion:Num of names starting with character I are : "+count);
	}
	
	
	//Directly writing using streams
	
	public static void directStream() {
		long count = Stream.of("ASIA","AUSTRALIA","EUROPE","AFRICA","antartica","NA").filter(s->s.startsWith("A")).count();
		System.out.println("Direct Stream:Num of names starting with character A are : "+count);
	}
	
	//OTHER TERMINAL OPERATION IN STREAMS
	
	public static void otherTerminalOps() {
		
	 Stream.of("ASIA","AUSTRALIA","EUROPE","AFRICA","antartica","NA").
	 filter(s->s.length()>4).filter(s->s.startsWith("E")).forEach(s->System.out.println("Diff Termianl Actions "+s));
	
	 //Other Operation
	 ArrayList<String> listStream = new ArrayList<String>();
		listStream.add("INDIA");
		listStream.add("Santosh");
		listStream.add("IRELAND");
		listStream.add("Australia");
		//Now converting to streams
	listStream.stream().filter(s ->s.startsWith("I")).limit(1).forEach(s->System.out.println("2nd Ter op "+s));
	 
		
	}

	public static void concateTwoArrayLists() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swaran");
		list.add("Santosh");
		list.add("Vishwa");
		list.add("Swarantej");
		
		 ArrayList<String> listStream = new ArrayList<String>();
			listStream.add("INDIA");
			listStream.add("Santosh");
			listStream.add("IRELAND");
			listStream.add("Australia");
			
			Stream concatedStream =Stream.concat(list.stream(), listStream.stream());
			
			//concatedStream.sorted().forEach(s->System.out.println("Concated Arraylist : "+s));
			
			//To identify if the element is present of not
			
			boolean test = concatedStream.anyMatch(s->s.equals("INDIA"));
			System.out.println("Fnding the elements "+test);
	}
	
}
