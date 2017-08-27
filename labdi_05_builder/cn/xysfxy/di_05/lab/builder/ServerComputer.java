/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ServerComputer.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: обнГ5:33:26
*/
package cn.xysfxy.di_05.lab.builder;

public class ServerComputer extends ComputerBuilder {

	@Override
	public void builderCPU() {
		computer.setCPU("Server Computer's CPU was built");
	}

	@Override
	public void builderRAM() {
		computer.setRAM("Server Computer's RAM was built");
	}

	@Override
	public void builderHDD() {
		computer.setHDD("Server Computer's HDD was built");
	}

}
