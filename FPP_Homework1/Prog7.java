/* 
 * ARGUMENT INPUT: HahA  Tran YAN MaA
 * RESULT: 
 * Length of all String: 4
 * String Input : HahA  Length of each String: 4
 * String Input : Tran  Length of each String: 4
 * String Input : YAN  Length of each String: 3
 * String Input : MaA  Length of each String: 3
 * Number of A letter: 3 
 */
package w1pack.l2;

import java.util.*;

public class Prog7 {

	public static void main(String [] args){
		
		/*Scanner xx = new Scanner(System.in);
		System.out.println("Input: " );
		String a = xx.nextLine();
		*/
		
		System.out.println("Length of all String: " + args.length);
		int count = 0;
		for( String i :args)
		{
			System.out.println("String Input : " + i+"  Length of each String: " +i.length());
			for(int j = 0; j < i.length() ; j++)
			{
				if(i.substring(j, j+1).equals("A"))
					count++;
			}
		}	
		System.out.println("Number of A letter: " + count);
	}
}
