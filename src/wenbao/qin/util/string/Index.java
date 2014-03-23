package wenbao.qin.util.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Index {

	
	public static void main(String[] args) {
		String str = "qqq,ede,def,frfr,hyh,kkf" ; 
		String str2 = new Index().getIndexString(str, ",", 4) ; 
		System.out.println( "" + str2 ) ; 
	}
	
	public String getIndexString(String str , String splitStr,int index )
	{
		return getIndexOfCustomStr(str, splitStr, index-1, index) ; 
	}
	
	public String getIndexOfCustomStr(String str, String splitStr,int splitFrom,int count )
	{
		int fromIndex = getCharacterPosition(str, splitStr,splitFrom ) ; 
		int findIndex = getCharacterPosition(str, splitStr,count ) ;  
		return str.substring(fromIndex+1, findIndex) ;
	}
	
	public int getCharacterPosition(String string,String splitStr,int fromCustomIndex){
	    //这里是获取"#"符号的位置
	    Matcher slashMatcher = Pattern.compile(splitStr).matcher(string);
	    int mIdx = 0;
	    while(slashMatcher.find()) {
	       mIdx++;
	       //当"#"符号第二次出现的位置
	       if( mIdx == fromCustomIndex ){
	          break;
	       }
	    }
	    return slashMatcher.start();
	}
}
