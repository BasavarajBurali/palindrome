package collectionProgram;

public class Pelindrome {

	public static void main(String[] args) {
		int num=122;
		int org_num=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		if(org_num==rev) {
			System.out.println("its pelindrome "+rev);
		}else {
			System.out.println("its not pelindrome "+rev);
		}

	}
	//palindrome

}
