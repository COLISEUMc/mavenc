package Tests;

public class NumSearch {
	public static void main (String[] args) {
		String searchMe = "piter pipers picked a " + "peck of pickled peppers";
		String picked = "pick";
		boolean foundIt = false;
		
		int max = searchMe.length() - picked.length();
		
		test:
			
			for (int i = 0; i <= max; i++) {
				int n = picked.length();
				int j = i;
				int k = 0;
				while(n-- != 0) {
				if (searchMe.charAt(j++) != picked.charAt(k++)) {
					continue test;
				}
			}
		foundIt = true;
		break test;
			}
	
		System.out.println(foundIt ? "Found it" : "didn't find it");
}

}
