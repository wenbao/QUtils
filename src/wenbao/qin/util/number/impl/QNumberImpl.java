package wenbao.qin.util.number.impl;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import wenbao.qin.util.number.QNumber;

public class QNumberImpl implements QNumber {

	Logger logger = Logger.getLogger(this.getClass().getName()) ;
	/*
	  * 判断是否为整数 
	  * @param str 传入的字符串 
	  * @return 是整数返回true,否则返回false 
	*/
	@Override
	public boolean isInteger(String str) {
		 Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
		 return pattern.matcher(str).matches(); 
	}
	
	public static void main(String[] args) {
		System.out.println(new QNumberImpl().isInteger("-1.12")) ;
	}

}
