import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a SSN:");
		String s=input.nextLine();
		
	//	String[] tokens= s.split("-");
//for (String t: tokens)
	
   int k=s.indexOf('-');
   
	String a=s.substring(0,k);
	String b=s.substring(k+1,k+3);
	String c=s.substring(k+4,k+8);
	
	if((a.length()==3 )&&(b.length()==2)&&(c.length()==4))
 
		{System.out.print( s +" is a valid social security number");}
	
 else if ((a.length()!=3 )||(b.length()!=2)||(c.length()!=4))
		System.out.print(s +" is an invalid social security number ");

	}

}
