/* RESULT: 
 * compute π^7 = 3020.2932277767914
 * compute 10^π = 1385.4557313670107
 */

package w1pack.l2;

import java.util.*;

public class Prog1 {

	public static void main(String[] args){
		
		Integer x = RandomNumbers.getRandomInt(1, 9);
		Integer y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("compute π^" + x +" = "+Math.pow(Math.PI, x) );
		System.out.println("compute "+ y + "^π = " +Math.pow(y,Math.PI) ); 
		
	}
}
