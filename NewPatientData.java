import java.util.List;
import java.util.ArrayList;

public class NewPatientData {
	private List<Patient> patientList;
	private boolean finished;

	public NewPatientData(){
		patientList = new ArrayList<Patient>();
		finished = false;
	}
	public static void main(String args[]){
			NewPatientData npd = new NewPatientData();
			npd.launch();
		}
	private void launch(){
		String inputName = "";
		int birthYear = 0;
		while(!finished){
			System.out.println("Please key in a new patient name.  Enter (q) to (q)uit:");
			inputName = System.console().readLine();
			if(inputName.equals("q"){				//this check is not closing the loop
				finished = true;
				return;
			}
			System.out.println("Please the patient's year of birth:");
			birthYear = Integer.parseInt(System.console().readLine());
			try {
				Patient addPatient = new Patient(inputName,birthYear);
				patientList.add(addPatient);
			} catch (IllegalArgumentException ex){
				System.out.println("ERROR: you did not enter legitimate birth year Please try again:");
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
		}
		//print out patient list

	}
}