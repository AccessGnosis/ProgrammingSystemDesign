/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: ÏÂÎç11:23:42
*/
package cn.xysfxy.di_06.lab.deep.email;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		Email email = new Email();
		Email copyEmail = null;

		try {
			copyEmail = (Email) email.Clone();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		System.out.println(email == copyEmail); // false
		System.out.println(email.attachment == copyEmail.attachment); // false
		System.out.println(email.emailLevel == copyEmail.emailLevel); // true
		System.out.println(email.emailTitle == copyEmail.emailTitle); // false
	}

}
