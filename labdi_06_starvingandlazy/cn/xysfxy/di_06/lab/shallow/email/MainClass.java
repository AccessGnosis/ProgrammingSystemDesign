/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: обнГ11:23:31
*/
package cn.xysfxy.di_06.lab.shallow.email;

public class MainClass {

	public static void main(String[] args) {
		Email email = new Email();
		Email copyEmail = (Email) email.clone();

		System.out.println(email == copyEmail); // false
		System.out.println(email.attachment == copyEmail.attachment); // true
		System.out.println(email.emailLevel == copyEmail.emailLevel); // true
		System.out.println(email.emailTitle == copyEmail.emailTitle); // true
	}

}
