/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UnSupportedShapeException.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: 下午6:14:25
*/
package cn.xysfxy.di_03.lab.exception;

/**
 * 自定义异常
 * 1.运行时异常 
 * 2.非运行时异常  一定要处理  try……catch 或者通过 throws
 * @author gnosis
 *
 */
public class UnSupportedShapeException extends Exception {
	public UnSupportedShapeException(String message){
		super(message);
	}
}
