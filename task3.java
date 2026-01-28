package switch_condition;
public class task3 {
	public static void main(String[] args) {
		char ch=66;
		switch(ch) {
		    case 65: case 97: System.out.println("Students marks are between 76-100");
		    break;
		    case 66: case 98: System.out.println("Students marks are between 51-75");
		    break;
		    case 67: case 99: System.out.println("Students marks are between 36-50");
		    break;
		    case 70: case 102: System.out.println("Students marks are between 0-35");
		    break;
		    default: System.out.println("*** invalid grade ***");
		}
	}
}
