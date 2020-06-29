package 开头父亲但指向儿子;

import java.util.ArrayList;
import java.util.Scanner;
//我们只能够覆盖父类的方法，却不能覆盖父类的成员变量。

class padre{
	 int valora=5;
	static int uu=9;
	public int valor1=9;
	padre(){
		System.out.println("constructor de a ");
	}
	padre(int entradad){
		System.out.println("constructor de a con parametro de entrada");
	}
	public void jeje() {
		System.out.println("jeje");
	}
	public void metodo() {
		System.out.println("Este es el metodo del a ");
	}
}

class hijo1 extends padre{
	int valor1=1111111;
	hijo1(){
		System.out.println("Soy constructo de hijo1");
	}
	public void jeje() {
		System.out.println("soy jeje de hijo1");
	}
	public void hijometodo() {
		System.out.println("este es el metodo del hijo1");
	}
}



public class test extends padre {
	
  int  valor1=222222;
	
	test(){
		super(7);// 不写这个的话，，调动 a默认的construcotr
		super.metodo();
		
		System.out.println("este es el constructor del test");
	}
	
	public void ok() {
	System.out.println("okkkkkkkkkk");
	}
	public void jeje() { //重写了父亲jeje的类
	System.out.println("儿子的jeje");
}
    public static void main(String[] args) {
   /*	
    //儿子有父亲一样的，就用儿子的。省点钱是点。儿子独有的，父亲不会用，所以不能用
    	//  System.out.println(prueba.equals(prueba1)	);
  
    	padre prueba1=new hijo1();
    	prueba1.jeje();// 因为我们在hijo1里重写了padre jeje的方法，所以我们调用的就是hijo1里面的
    	//在下面的时候padre指向的是test，test也重新写了 jeje方法，所以 就会显示test jeje的方法
   	 System.out.println(prueba1.valor1);
   
   	 hijo1 ja=new hijo1();
   	 
   	 	padre pradre1=(padre)ja;
 	
 	// fallooooo   pradre1.metodohijo; //因为对象pradre1，asginar el objeto ja ，但是强制弄成 padre的类，而padre 类里没有metodohijo
   	 	// 就像 numero=(int)7,88
   	 	//nuemro只能是int数值
   	 	// metodohijo1 那就不能运行 所以是错的
    /
    
    */
    
 /**   prueba sobre padre apunta a test*/
    
    
    /////////////////////////////////////////////////////////////////////////////// 	
    /* 	padre jaja=new test();
     	
     	jaja.metodo(); // 因为开头是padre，所以可以调试padre叫metodo的类
   
     		jaja.jeje();// 调用的是padre里面的jeje类
     		
     		//但是要是儿子test重写了jeje类那么调用的就是儿子的
     		//public void jeje() { // 把这个取消掉注释那么调用的就是儿子的jeje
     		//System.out.println("儿子的jeje");}

 		System.out.println("valor1 "+jaja.valor1); // 因为开头是父亲，虽然儿子里面重写了valor1 但是我们只能够覆盖父类的方法，却不能覆盖父类的成员变量。

    	 System.out.println(jaja.valora);  
     	
     //	jaja.ok();//这里就会出错，因为ok是test类 padre身为父亲并不能调用
    	
   //////////////////////////////////////////////////////// 
    	 
  ////////////////////////////////////////////////////////////////////  
   * 	 **/	 
  
   /* 	 test test=new test();
    	test.ok();// test 自己的类所以可以叫
    	 System.out.println("valor1 de clase test "+test.valor1);// 虽然a类里有这个， 但我们叫的是test类的，它重写了padre valor1
    	 //要是把test里面的valor1去掉 那么我们叫的就是a类里面的valor1 那就是9 
    	 System.out.println("valora"+test.valora);// test继承了padre的类所以可以叫,因为我们在valora 弄了个  5 ，所以他也会显示 5
    
    ////////////////////////////////////////////////////////////////////////////////////////////	*/
   	 	padre a=new padre();// 我们引用 padre的遥控器，它的功能为 jeje 和metodo
   	 	// 我们调用到padre的接收器，只能接收 jeje 和metodo
   	 	padre b=new hijo1();// 我们应用padred遥控器，它的功能为 jeje 和metodo
   	 	//我们调用 hijo的接收器，因为它继承了padre 所以 可以接收 jeje 和metodo 
   	 	//而且他还可以接收hijometodo
   	 	// hijo不仅继承了padre 的construcor， 还有自己的construor，就像开机一样，和a开机一样但是加了更多的动画
   	 	// 但是我们的遥控器只能发送 jeje 和 metodo，所以b只能接收jeje 和metodo 
   	 	b.metodo();
   	 	b.jeje();
   	 // fallllolololo
   	 	//b.hijometodo();
   	 	
   	/* 	
   	 	hijo1 c=(hijo1) b; // 现在我们用hijo的遥控器，来发送给b本来就是hijo1的接收器
   	 	 c.hijometodo();// 现在我们可以发送和接收hijometodo
   	 	
   	 	 hijo1 prueba1=new hijo1(); 
    	 padre prueba2=(padre) prueba1;// 我们prueba1本来是hijo1的接收器，但是我们现在强制用padre的遥控器去启动它
    	 // 那么就只能实现padre的功能就是jeje和metodo
    	 prueba2.jeje();
    	 prueba2.metodo();
    	 //fallllooooooo
    	 //prueba2.hijometodo(); //padre遥控器不能发送hijometo信号*/
    }

}