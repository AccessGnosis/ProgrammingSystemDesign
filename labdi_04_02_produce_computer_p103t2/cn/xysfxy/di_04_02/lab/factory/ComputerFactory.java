/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ComputerFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ10:07:50
*/
package cn.xysfxy.di_04_02.lab.factory;

import cn.xysfxy.di_04_02.lab.production.CPU;
import cn.xysfxy.di_04_02.lab.production.RAM;

public interface ComputerFactory {
	CPU produceCPU();
	RAM produceRAM();
}
