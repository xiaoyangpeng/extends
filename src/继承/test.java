package �̳�;
import java.util.ArrayList;
import java.util.Scanner;
 class a {
	 //����ֻ�ܹ����Ǹ���ķ�����ȴ���ܸ��Ǹ���ĳ�Ա������
	public  int atributoa=0;
	a(){
		 System.out.println("constructor de a");
	 }
	 
	a(int a){
		 System.out.println("constructor de a con int a");
	 }
	
	public  int  geta() {
		 return this.atributoa;
	}
	
	public void metodoa() {
		 System.out.println("metodo a");
	}
	
}

 class b extends a {
	 
	public  int atributoa=5;
	 b(){ 
		 
		 System.out.println("constructor de b");
	 }
	
	 b(int a){
		 super(5);// ���� a��constructor
		 super.metodoa();//   ���� a ���metodo a
		 super.geta();
		 System.out.println("constructor de b con int b    Ȼ�����ǵ����� construcor a ���� �� int a  �� a��İ취 ");
	 }
 }

 class c extends b{
	 c(){
		
		 System.out.println("constructor de c");
	 }
	 c(int c){
		 super(5);
		  super.metodoa(); //   ���� a ���metodo a
		 System.out.println("constructor de c con c    Ȼ�����ǵ����� construcor b ���� �� int b �� a��İ취");
	 }
	public void metodoa() { // ����������д a ���� ͬ�����ֵ� ������ ���� ��д��֮�� ���� д public ��Ϊ a����� ��������public
									// ���Ҫ��д�Ļ� ������Ȩ������ڻ��ߵ��� a�� �� ��������Ȩ
		 System.out.println("metodo a pero de clase c ");
	}
	
	/*private void metodoa(){ // �����ӾͲ�������Ϊ private ��ȨС��public
	 * 
	 * System.out.println("metodo a pero de clase c ");
	 * }
	 * 
	 * 
	 * 
	 */
	
 }

public class test extends c{

		test(){
			 System.out.println("constructor de test");
			}
	
	test(int tee,String tees){
			super(5);
			 System.out.println("constructor de test con int tee �� string tees �� Ȼ�����ǵ����� construcor c ���� �� int c");
		}
	
		test(int tee){
			super.geta();
			super.metodoa();/// ��Ϊ��c������һ���취 ��a���������� ������취��д��
		 System.out.println("constructor de test con tee");
		}
    public static void main(String[] args) {

        //	 test tee=new test(); // ��Ϊ�ڼ̳е�ʱ�� ���๹�췽��Ĭ�ϵ��ø��๹�췽�� ���� test ���� c�� c ����b
        	 // ��Ϊ������Ĭ�ϵ�construcotr ��û��дsuper(ʲôʲô�����������Ǿ͵���Ĭ�ϵ�construcotr�� 
     
    	//    test taa=new test(5,"f"); // ��Ϊ������construcotr ��д��super��ʲôʲô���� ���Բ������Ĭ�ϵ�construcotr �� ��ֱ�ӵ���
    	    // ��Ӧ��construcotr con su parametro de entrada. 
    	    
    	//    a aa=new a();  //a ��ȫ����ĸ��ף�������ֻ�ܵ����Լ��Ķ���
    	    
    	//    b bb=new b();   //  b �� a �Ķ��� ������ ���Ե� a �Ķ������Լ��Ķ���
    	    
    	   c cc=new c();  // c �� b �Ķ��ӣ� b ��a �Ķ��ӡ�   c���Ե�b ��a �Ķ����� 
    	    //������Ϊc����ֱ�ӵ���a�ģ�����ͨ��b���õ����ԣ���� ��b���� ���� ��aһ���� �� ��ôc�ͻ�ͻ�ʹ��b���Ǹ�������ͽ�����д�� 
    	   
    	    
        }

       }
    


