import java.util.Date;

public class Patient {
	private String name;
	private int yearOfBirth;

	public Patient(String name,int yearOfBirth){
		if(2014 - yearOfBirth > 130){
			throw new IllegalArgumentException("Person is too old to be correct");
		} else if(2014 - yearOfBirth < 0){
			throw new IllegalArgumentException("Person is too young to be correct");
		} else {
		this.yearOfBirth = yearOfBirth;
		}
	}
	public String getName(){
		return name;
	}
	public int getYearOfBirth(){
		return yearOfBirth;
	}
}