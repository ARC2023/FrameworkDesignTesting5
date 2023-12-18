package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTables {

	
	@Given("I want to show data table as list")
	public void i_want_to_show_data_table_as_list() {
	    // Write code here that turns the phrase above into concrete actions
	}



	@When("I recevie below mentioned data in table as list")
	public void i_recevie_below_mentioned_data_in_table_as_list(DataTable dataTable) {
	    
		List<String> dataName=dataTable.asList();
		
		for(String str:dataName) {
			
			System.out.println("Names List : "+str);
			
		}
		
	
	}
	@Then("my list is iterated successfully")
	public void my_list_is_iterated_successfully() {
	    
	}

	
	@Given("I want to show data table as list of list")
	public void i_want_to_show_data_table_as_list_of_list() {
	    // Write code here that turns the phrase above into concrete actions
	}



	@When("I recevie below mentioned data in table as list of list")
	public void i_recevie_below_mentioned_data_in_table_as_list_of_list(DataTable dataTable) {
	 
		
		
		int i=1;
		  List<List<String>> listoflist= dataTable.asLists(String.class);
		  
		  for(List<String> str1:listoflist) {
			  System.out.println("Row No "+i++);

			  for(String str2:str1) {

				  System.out.println("Data Values: "+str2);
				  
			  }
			  
			  
		  }
		  
		  
	}
	@Given("I want to show data table as map")
	public void i_want_to_show_data_table_as_map() {
	    
	}



	@When("I recevie below mentioned data in table as map")
	public void i_recevie_below_mentioned_data_in_table_as_map(DataTable dataTable) {
	    
		int i=1;

		 List<Map<String, String>> listOfMaps = dataTable.asMaps(String.class,String.class);
		 
		 
		 for(Map<String, String> maps:listOfMaps) {
			  System.out.println("Row No "+i++);
			   
			  for(String keys:maps.keySet()) {
				  
				  System.out.println(keys+"-->"+maps.get(keys));
				  
			  }
			 
			 
		 }
		 
	}

}
