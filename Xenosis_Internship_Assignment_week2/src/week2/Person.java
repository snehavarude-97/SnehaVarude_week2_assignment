//1.Create a class Person with attributes like name, age, and methods to display these attributes.

package week2;

public class Person {
	//Attributes of person class
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	//Method to set name
	public void setName(String name)
	{
		this.name = name;
	}
	//Method to get name
	public String getName()
	{
		return name;
	}
	//Method to set age
	public void setAge(int age)
	{
		this.age = age;
	}
	//Method to get age
	public int getAge()
	{
		return age;
	}
	//Methods to display person's details
	public void displayPerson()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		//creating a person object using parameterized constructor
		Person person =  new Person("Supriya", 28);
		person.displayPerson();
		
		//Modify Person's Details
		person.setName("Sneha");
		person.setAge(27);
		System.out.println("\n Persons updated details");
		person.displayPerson();

	}

}
