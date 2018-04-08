import java.util.Scanner;
public class Person {
    private int age;	
  
	public Person(int initialAge) {
        this.age=initialAge;
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
  		    if(this.age<0)
            {
              System.out.println("Age is not valid, setting age to 0.");
                this.age=0;
                amIOld();
            }
        else if (this.age<13)
            System.out.println("You are young.");
        else if (this.age<18) 
            System.out.println("You are a teenager.");
        else if (this.age>=18) 
        System.out.println("You are old.");
        // Write code determining if this person's age is old and print the correct statement:
        
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age+=1;
	}
