package in.coreJava.Methods;

public class Country {
	
	//Instance variables
	int countryId;
	String countryName;
	String countryCaptial;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To access instance variables , we need a Object to be created.
		
		Country in=new Country();//Object1 created
		
		//Initializing the instance variables, by using Object
		in.countryId=101;
		in.countryName="India";
		in.countryCaptial="Delhi";
		
		Country us=new Country();//Object 2 created
		us.countryId=102;
		us.countryName="USA";
		us.countryCaptial="NY";
		
	}

}
