/**
 * @author dzq
 * @date createtime： 2017年4月7日上午8:05:52
 * @version 1.0
 */
package chapter1_1;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;

public class Ex1_1_5
{
	public static void main(String[] args)
	{
		double x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		if((0<x & x<1)&(0<y & y<1)){
			StdOut.print(true);
		}else{
			StdOut.print(false);
		}
	}
}
