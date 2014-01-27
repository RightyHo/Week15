import java.util.List;
import java.util.ArrayList;

public class MeanAverage {
	private int count;
	private List<Integer> intList;

	public MeanAverage(){
		count =0;
		intList = new ArrayList<Integer>();
	}

	public static void main(String args[]){
		MeanAverage ma = new MeanAverage();
		ma.launch();
	}
	private void launch(){
		System.out.println("Please advise how many numbers you wish to enter: ");
		int numberOfNums = Integer.parseInt(System.console().readLine());
		double sum = readAllNums(numberOfNums);
		double average = sum/count;
		System.out.println("The mean average of those " + String.valueOf(count) + " numbers is " + String.valueOf(average));
	}
	public double readAllNums(int num){
		double total = 0;
		while(count<num){
			System.out.println("Please key in a number:");
			try {
				int inputNum = Integer.parseInt(System.console().readLine());
				intList.add(inputNum);
				total = total +inputNum;
				count++;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR: you did not enter a number!  Please try again:");
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
		}
		return total;
	}
}