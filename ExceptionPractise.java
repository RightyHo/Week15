import java.util.List;
import java.util.ArrayList;

public class ExceptionPractise {
	public static void main(String args[]){
		ExceptionPractise ep = new ExceptionPractise();
		ep.launch();
	}
	private void launch(){
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Starting Exception Test.  Please enter an integer: ");
		int newElement = Integer.parseInt(System.console().readLine());
		try {
			System.out.println("About to add element");
			list.add(newElement);
			System.out.println("Element added");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}