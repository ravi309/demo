package demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star{
  public static void main(String[] args) {
	  int i=0,j=0;
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  




		// TODO Auto-generated method stub
		for ( i = 1; i<=5; i++) {
			for ( j =1; j <=i; j++) {
				System.out.print("#");
				
			}
			System.out.println();
		}

		for ( i = 1; i<=5; i++) {
			for ( j =5; j >=i; j--) {
				System.out.print("#");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	
	

}
