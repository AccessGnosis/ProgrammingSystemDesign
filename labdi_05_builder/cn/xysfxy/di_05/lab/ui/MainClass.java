/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:13:53
*/
package cn.xysfxy.di_05.lab.ui;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;
import cn.xysfxy.di_05.lab.factory.ComputerBuilderFactory;
import cn.xysfxy.di_05.lab.factory.DesktopComputerBuilderFactory;
import cn.xysfxy.di_05.lab.factory.NotebookComputerBuilderFactory;
import cn.xysfxy.di_05.lab.factory.ServerComputerBuilderFactory;
import cn.xysfxy.di_05.lab.production.Computer;
import cn.xysfxy.di_05.lab.util.xml.XMLUtil;
import cn.xysfxy.di_05.lab.worker.Worker;

public class MainClass {
	public static void main(String[] args) {
		ComputerBuilderFactory cbf;
		ComputerBuilder comBuilder;
		Worker worker = new Worker();
		Computer computer;

		cbf = new DesktopComputerBuilderFactory();
		comBuilder = cbf.newComputerBuilder();
		worker.setComputerBuilder(comBuilder);
		computer = worker.construct();
		printResult(computer);

		cbf = new ServerComputerBuilderFactory();
		comBuilder = cbf.newComputerBuilder();
		worker.setComputerBuilder(comBuilder);
		computer = worker.construct();
		printResult(computer);

		cbf = new NotebookComputerBuilderFactory();
		comBuilder = cbf.newComputerBuilder();
		worker.setComputerBuilder(comBuilder);
		computer = worker.construct();
		printResult(computer);
		
		ComputerBuilderFactory combuilfac = XMLUtil.getBean();
		ComputerBuilder combuilder = combuilfac.newComputerBuilder();
		Worker workers = new Worker();
		workers.setComputerBuilder(combuilder);
		Computer com = workers.construct();
		System.out.println("Computer builder with:");
		System.out.println(com.getCPU());
		System.out.println(com.getRAM());
		System.out.println(com.getHDD());

	}
	public static void printResult(Computer computer) {
		System.out.println("Computer builder with:");
		System.out.println(computer.getCPU());
		System.out.println(computer.getRAM());
		System.out.println(computer.getHDD());
		System.out.println();
	}
}
