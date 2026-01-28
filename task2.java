package switch_condition;
public class task2 {
	public static void main(String[] args) {
		char ch='A';
		switch(ch) {
		    case 'a': case 'A': System.out.println("Students Marks are between 76-100");
		    break;
		    case 'b': case 'B': System.out.println("Students Marks are between 51-75");
		    break;
		    case 'c': case 'C': System.out.println("Students Marks are between 36-50");
		    break;
		    case 'f': case 'F': System.out.println("Students Marks are between 0-35");
		    break;
		    default: System.out.println("Invalid Grade");
		}
	}
}
