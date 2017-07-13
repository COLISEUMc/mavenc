package Tests;

public class WhileDemo {
	public static void main (String[] args) {
		int[][] array = {
				{1, 2, 4, 6, 15, 16, 1992, 19, 24, 32},
				{3, 4, 5, 10, 12, 17, 18},
				{4, 5, 1, 3, 6, 10}
		};
		int searchfor = 12;
		
		int i;
		int j = 0;
		boolean foundIt = false;
		
		search:
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++){
			
			if (array[i][j] == searchfor) {
				foundIt = true;
				break search;
			}
			
			}
			
 		}
		if (foundIt) {
			System.out.println("Print number 12: "+searchfor + "; at index: " +i + ", " +j);
			
		}
		else {
			System.out.println(+searchfor + "not in the array");
		}
		return;
	}
}
