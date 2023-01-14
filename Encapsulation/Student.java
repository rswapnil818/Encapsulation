package Encapsulation;

public class Student {
	//student has id ,name and age.
	
	//NOTE
	//Definition : Encapsulation is nothing but wrapping or binding the data
	// Class is the best example of Encapsulation
	//1. Make your GLOBLE variable as a private to achieve Data security.
	//2.Make your METHODS as a PUBLIC to assign the VAlue for private globle variable,using Getter and Setter method
	
	private int id;
	private String name;
	private int age;
	
	//Setter and Getter method for id
	   public void setId(int id){
		if(id>0){
			/*we put if method to validate id is greater than 0
			without if method -ve value also set but id isn't in -ve number.*/
			
		this.id=id;
		System.out.println(id);
		}
		else{
			System.out.println("Invalide Inpute");
		}
		}
	public int getId(){
		return id;
	    }
		//setter and getter method for name
		
	public void setName(String name){
		this.name=name;
		System.out.println(name);
	    }
	public String getName(){
		return name;
	    }
	
	//setter and getter method for age.
	
	public void setAge(int age){
		this.age=age;
		System.out.println(age);
	    }
	public int getAge(){
		return age;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
