/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: 下午5:42:39
*/
package cn.xysfxy.task01.example.preparedstatement;

public class MainClass {

	public static void main(String[] args) {
		AccountDAO ado = new AccountDAO();
		try {
			ado.insert("zhangsan", 1000.5);
			ado.insert("lisi", 0.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			if(ado.transform("zhangsan", "lisi", 1000.0)){
//				System.out.println("转账成功");
//			}else{
//				System.out.println("转账失败");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
