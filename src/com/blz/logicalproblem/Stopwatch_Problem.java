/*@Purpose::Java Program for Stopwatch Problem.
 *@File::Logical_Problem
 *@Author::Kishlay Kishan
 */

package com.blz.logicalproblem;

import java.util.Scanner;

public class Stopwatch_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 to start the stop watch");
		double startWatch = sc.nextDouble();

		startWatch = System.currentTimeMillis();

		System.out.println("Press 0 to stop the stop watch");
		double stopwatch = sc.nextDouble();
		stopwatch = System.currentTimeMillis();

		System.out.println("The Elapsed time is  " + ((stopwatch - startWatch) / 1000) + " seconds ");

		sc.close();

	}

}
