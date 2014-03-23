package wenbao.qin.util.string;


public class UuidGenerator {
	
	static long currentTimeMillis = System.currentTimeMillis();
	/**
     * ���long������
     * @return long��Ψһ����
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
