package PracticePack;

public class AverageAndTotalMarks {
	
	public static void main(String[] args) {
		int maths = 82;
		int science = 88;
		int english = 75;

		int totalmarks = maths + science + english;
		int averageMarks = totalmarks / 3;
		float averageMarksDecimal = totalmarks / 3;

		System.out.println("Total marks are " + totalmarks);
		System.out.println("Average marks are " + averageMarks);
		System.out.println("Average marks in Decimals are " + averageMarksDecimal);

	}

}
