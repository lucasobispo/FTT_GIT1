import java.util.ArrayList;
import java.util.Scanner;

public class Ftt_acumuladores {

	public static void main(String[] args) {
		System.out.print("Ftt acumuladores");
		System.out.println("Eita ");
		
		ArrayList<String> userMessages = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int acumulador = 0;		
		
		while(sc.hasNext()){
			String userText = sc.nextLine();
			if (userText.isEmpty()())
				break;
			
	     try 
	          {
		      acumulador += Integer.valueOf(userText);
	           } catch(Exception e){
	        	   System.err.println("ops!");
	        	   e.printStackTrace();
	           }
	     
	     System.out.println("valor acumulado: " + acumulador);
	     
	           }
		sc.close();
		
		for(int x=0; x< userMessages.size(); x++)
			System.out.println(userMessages.get(x));
		
	}

}
