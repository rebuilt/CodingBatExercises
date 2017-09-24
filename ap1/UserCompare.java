package ap1;

public class UserCompare {

	public static void main (String[] args) {
		String aName = "Aaron";
		int aId = 1;
		String bName ="Bart";
		int bId = 2;

		System.out.println(userCompare(aName, aId, bName, bId));
	}

	public static int userCompare(String aName, int aId, String bName, int bId) {
		int comparison = aName.compareTo(bName);
		
		if(comparison == 0) {
			if(aId < bId) {
				return -1;
			}else if (aId > bId) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else if(comparison > 0) {
			return 1;
		}
		else return -1;
	
	
	}
	

}
