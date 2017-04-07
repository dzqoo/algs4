/**
 * @author dzq
 * @date createtime： 2017年4月7日上午8:34:03
 * @version 1.0
 */
package chapter1_1;

import edu.princeton.cs.introcs.StdOut;

public class Ex1_1_6
{
	public static void main(String[] args)
	{
		int f = 0;
		int g = 1;
		for(int i=0;i<=15;i++){
			StdOut.println(f);
			f = f+g;
			g = f-g;
		}
	}
}
