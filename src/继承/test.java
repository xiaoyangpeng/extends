package 继承;
import java.util.ArrayList;
import java.util.Scanner;
 class a {
	 //我们只能够覆盖父类的方法，却不能覆盖父类的成员变量。
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
		 super(5);// 调用 a的constructor
		 super.metodoa();//   调用 a 类的metodo a
		 super.geta();
		 System.out.println("constructor de b con int b    然后我们调用了 construcor a 类里 的 int a  和 a类的办法 ");
	 }
 }

 class c extends b{
	 c(){
		
		 System.out.println("constructor de c");
	 }
	 c(int c){
		 super(5);
		  super.metodoa(); //   调用 a 类的metodo a
		 System.out.println("constructor de c con c    然后我们调用了 construcor b 类里 的 int b 和 a类的办法");
	 }
	public void metodoa() { // 这里我想重写 a 类里 同样名字的 方法， 但是 重写的之后 必须 写 public 因为 a类里的 方法就是public
									// 如果要重写的话 它的特权必须大于或者等于 a类 里 方法的特权
		 System.out.println("metodo a pero de clase c ");
	}
	
	/*private void metodoa(){ // 这样子就不可以因为 private 特权小于public
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
			 System.out.println("constructor de test con int tee 和 string tees ， 然后我们调用了 construcor c 类里 的 int c");
		}
	
		test(int tee){
			super.geta();
			super.metodoa();/// 因为在c类里有一个办法 和a类重名所以 把这个办法重写了
		 System.out.println("constructor de test con tee");
		}
    public static void main(String[] args) {

        //	 test tee=new test(); // 因为在继承的时候， 子类构造方法默认调用父类构造方法 所以 test 调用 c， c 调用b
        	 // 因为我们在默认的construcotr 里没有写super(什么什么），所以他们就调用默认的construcotr。 
     
    	//    test taa=new test(5,"f"); // 因为我们在construcotr 里写了super（什么什么）， 所以不会调用默认的construcotr ， 会直接调用
    	    // 对应的construcotr con su parametro de entrada. 
    	    
    	//    a aa=new a();  //a 是全部类的父亲，所以他只能调用自己的东西
    	    
    	//    b bb=new b();   //  b 是 a 的儿子 所以它 可以调 a 的东西和自己的东西
    	    
    	   c cc=new c();  // c 是 b 的儿子， b 是a 的儿子。   c可以调b 和a 的东西。 
    	    //但是因为c不是直接调用a的，而是通过b调用的所以，如果 在b里面 方法 和a一样的 ， 那么c就会就会使用b的那个（这个就叫做重写） 
    	   
    	    
        }

       }
    


