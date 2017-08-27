/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Email.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: обнГ11:23:55
*/
package cn.xysfxy.di_06.lab.shallow.email;

public class Email implements Cloneable {
	Attachment attachment = null;
	String emailTitle;
	int emailLevel;

	public Email() {
		this.attachment = new Attachment();
		this.emailLevel = 0;
		this.emailTitle = "emailTitle";
	}

	public Object clone() {
		Email clone = null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone failure");
			e.printStackTrace();
		}
		return clone;
	}
}
