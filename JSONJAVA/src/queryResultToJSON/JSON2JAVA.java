package queryResultToJSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON2JAVA {
	public static void main(String[] args) throws IOException {
		ObjectMapper obj =new ObjectMapper();
	JSON2JAVACustomerDetails jsonValues=	obj.readValue(new File("C:\\Users\\Swaran\\SDET\\JSONJAVA\\dbresult1.json"), JSON2JAVACustomerDetails.class);
		System.out.println(jsonValues.getCourseName());
		System.out.println(jsonValues.getLocation());
		
	
	
	}

}
