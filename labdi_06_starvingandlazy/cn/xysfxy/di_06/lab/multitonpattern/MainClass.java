/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: ÏÂÎç11:47:42
*/
package cn.xysfxy.di_06.lab.multitonpattern;

public class MainClass {

	public static void main(String[] args) {
		LeaderOnly leader1 = LeaderOnly.getInstance();
		LeaderOnly leader2 = LeaderOnly.getInstance();

		System.out.println(leader1 == leader2);
		
		
		LeaderMuliti lm1 = LeaderMuliti.getInstance();
		LeaderMuliti lm2 = LeaderMuliti.getInstance();
		LeaderMuliti lm3 = LeaderMuliti.getInstance();
		LeaderMuliti lm4 = LeaderMuliti.getInstance();
		
		System.out.println(lm1);
		System.out.println(lm2);
		System.out.println(lm3);
		System.out.println(lm4);
	}

}
