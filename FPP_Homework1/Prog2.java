/* RESULT: 
 * 1. SUM: 14
 * 2. SUM: 15
 */

package w1pack.l2;

public class Prog2 {
	
	public static void main(String[] args){

	float a = (float) 1.27;
	float b =  (float) 3.881;
	float c =  (float) 9.6;
	int sum = (int)(a+b+c);

	System.out.println("1. SUM: " + sum);
	System.out.println("2. SUM: " + Math.round(a + b + c));	
	
	}
}
