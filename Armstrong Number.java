import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    int n = (int) Math.log10(num) + 1;
		int x = num;
		int sum = 0;
		while(x>0){
			int p = x % 10;
			sum += (int) Math.pow(p, n);
			x /= 10;
		}

		return (num == sum) ? true : false;
	}
}

