import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean leapyear = false;
	        
	        Scanner input = new Scanner(System.in);
	        int in = input.nextInt();
	        
	        if(in%400==0){
	           leapyear = true; 
	        }
	        else if(in%4==0 && in%100!=0){
	            leapyear = true;
	        }
	        else{
	            leapyear = false;
	        }
	        
	        if(leapyear){
	            System.out.println(in + " is a leap year.");
	        }
	        else{
	            System.out.println(in + " is not a leap year.");
	        }
	}

}
