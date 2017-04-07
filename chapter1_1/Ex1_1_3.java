/**
 * @author dzq
 * @date createtime： 2017年3月29日上午9:08:30
 * @version 1.0
 */
package chapter1_1;

import edu.princeton.cs.introcs.StdOut;

public class Ex1_1_3
{
	public static void main(String[] args)
	{
		if((Integer.valueOf(args[0])==Integer.valueOf(args[1]))&(Integer.valueOf(args[0])==Integer.valueOf(args[2]))){
			StdOut.print("equal");
		}else{
			StdOut.print("not equal");
		}
		
	}
}
