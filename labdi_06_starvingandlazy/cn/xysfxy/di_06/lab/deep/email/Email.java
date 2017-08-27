/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Email.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: ÏÂÎç11:36:52
*/
package cn.xysfxy.di_06.lab.deep.email;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Email implements Serializable {
	Attachment attachment = null;
	String emailTitle;
	int emailLevel;

	public Email() {
		this.attachment = new Attachment();
		this.emailLevel = 0;
		this.emailTitle = "emailTitle";
	}
	public Object Clone()
			throws IOException, ClassNotFoundException, OptionalDataException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (ois.readObject());
	}
}
