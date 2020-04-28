package queryResultToJSON;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DBResultToJSON {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		 
		 ArrayList<CustomerDetails> al =new ArrayList<CustomerDetails>();
		//Accessing the class Name Dynamically
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		//Provide the DB Conn details, ID and PWD
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "Blockchain@2020");
		//to execute the query we use STatement classobj
		
		Statement query =conn.createStatement();
		ResultSet res = query.executeQuery("Select * from customerinfo ");
		
		while(res.next()) {
			CustomerDetails cust = new CustomerDetails();
			cust.setCourseName(res.getString(1));
			cust.setPurchasedDate(res.getString(2));
			cust.setAmount(res.getInt(3));
			
			cust.setLocation(res.getString(4));
			
			al.add(cust);
			
			/*
			 * System.out.println(cust.getCourseName());
			 * System.out.println(cust.getPurchasedDate());
			 * System.out.println(cust.getAmount()); System.out.println(cust.getLocation());
			 */
		
		}
		for(int i=0;i<al.size();i++) {
			ObjectMapper obj = new ObjectMapper();
			obj.writeValue(new File("C:\\Users\\Swaran\\SDET\\JSONJAVA\\dbresult"+i+".json"), al.get(i));	
		}
		
			conn.close();
	}

}
