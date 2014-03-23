package wenbao.qin.util.string;


public class UuidGenerator {
	
	static long currentTimeMillis = System.currentTimeMillis();
	/**
     * 获得long型内码
     * @return long型唯一内码
     */
    static synchronized public long getLongId(){
        return currentTimeMillis++;
    }
    
	   /*
     * Demonstraton and self test of class
     */
    public static void main(String args[]) {
    	/**
    	 *test getLongId
    	 */
    	for (int i=0;i<100;i++){
    		System.out.println(i+"   getLongId=" + getLongId()); 
    	}
    }
}
