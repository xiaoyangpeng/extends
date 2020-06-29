package 从一个构造器叫另一个构造器的方法;

public class constructor {
private int jaja=0;

	constructor() {
		this(5);//  当我们创造一个对象sin paramtero de entrada priemro va ejecuar el metodo de el construcotr que hemos llamado
		// depende con el parametro de entrada, 
		// sireve para caso por ejemplo  我们需要一个成员要用到另一个construcotr一样的办法,但是我们希望它是fijo 不变的
		System.out.println("construcot vacio ");
	}
	constructor(int valor) {
		System.out.println("construcotr con parametro entrada");
		jaja=valor;
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	 constructor prueba=new constructor();
	 System.out.println(prueba.jaja);
	}

}
