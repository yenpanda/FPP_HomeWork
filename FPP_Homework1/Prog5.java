/* RESULT: 
 *  4	 57	 63	 78	
 *  +29	+41	+86	+87	
 *  
 *  ---	---	---	---	
 *  
 *  72	 7	 61	 63	
 *  +21	+59	+42	+93	
 *  
 *  ---	---	---	---
*/
package w1pack.l2;
import java.util.*;

public class Prog5 {
	
	public static void main (String[] args)
	{		
		Integer [][] arr = new Integer[4][4];
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		
		System.out.println(" "+ arr[0][0]+ "	" + " "+ arr[0][1]+ "	" +" "+ arr[0][2]+ "	" +" "+ arr[0][3]+ "	");
		System.out.println("+"+ arr[1][0]+ "	" + "+"+ arr[1][1]+ "	" +"+"+ arr[1][2]+ "	" +"+"+ arr[1][3]+ "	");
		System.out.println();
		System.out.println("---" + "	" + "---" + "	" +"---" + "	" +"---" + "	");
		
		System.out.println();
		System.out.println(" "+ arr[2][0]+ "	" + " "+ arr[2][1]+ "	" +" "+ arr[2][2]+ "	" +" "+ arr[2][3]+ "	");
		System.out.println("+"+ arr[3][0]+ "	" + "+"+ arr[3][1]+ "	" +"+"+ arr[3][2]+ "	" +"+"+ arr[3][3]+ "	");
		System.out.println();
		System.out.println("---" + "	" + "---" + "	" +"---" + "	" +"---" + "	");
		
	}
}
