package wenbao.qin.util.number.impl;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import wenbao.qin.util.number.QNumber;

public class QNumberImpl implements QNumber {

	Logger logger = Logger.getLogger(this.getClass().getName()) ;
	/*
	  * �ж��Ƿ�Ϊ���� 
	  * @param str ������ַ��� 
	  * @return ����������true,���򷵻�false 
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
