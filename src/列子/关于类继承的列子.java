package 列子;
import java.util.Scanner;
 
class aa {
	
	int jaja;
	aa(){
		jaja=100;
		System.out.println("这个是jaja construcotr por defecto ");
	}
	
	aa(int o,int p){
		jaja=134;
		System.out.println("这个是 jaja   construcotr con o y p  ");
	}
	
	
	public void metodo1() {
		System.out.println("这个是aa类的metodo1 ");
	}
}
public class 关于类继承的列子 extends aa{
	int b;
	关于类继承的列子(int a,int p){
		super(a,p);  // super 必须在最前面，如下发会出错
		b=2000;
		System.out.println("这个是  关余继承的列子    constructor  con a 和   p "+b);
		
	}
	
	/*关于类继承的列子(int a,int p){
		System.out.println("这个是  关余继承的列子    constructor  con a 和   p "+b);
		super(a,p);
		b=2000;
		
		
	}*/
	
	关于类继承的列子(){
		super();// 这里面写什么，那么就代替父类里什么样constructor
		System.out.println("这个是    关余继承的列子   con el constructor por defecto");
	}
	void getsuper(int o,int u) {
	
	}
 
	  public static void main(String[] args) {
		  关于类继承的列子 xiao=new 关于类继承的列子(2,9);// 首先运行aa里面的jaja metodo ， 因为在  关余类继承的列子   里面的constructor 先运行super里的constructor
		  
		  System.out.println("我们直接可以用 关于继承的列子   里面的atributo  "+xiao.jaja);// 134  因为我们建造 objeto xiao 的时候， 用了construcotr con
		  // paremetro de entrada 用了 int a 和 int p ，它里面先运行 super(a,p) 所以先运行   关余类继承的列子 里对应的constructor， 然后
		  /// 在 关余类继承的列子  对应的constructor 里面 jaja 等于 134，
		  
		  System.out.println(" "+xiao.b);
		  
		  xiao.metodo1(); // 我们可以直接用   关余继承的列子   里面的metodo
		  关于类继承的列子 yang=new 关于类继承的列子();
             
  System.out.println(xiao.jaja+"fdsa"+xiao.b);
   
    }
}

