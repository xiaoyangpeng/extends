package ��һ������������һ���������ķ���;

public class constructor {
private int jaja=0;

	constructor() {
		this(5);//  �����Ǵ���һ������sin paramtero de entrada priemro va ejecuar el metodo de el construcotr que hemos llamado
		// depende con el parametro de entrada, 
		// sireve para caso por ejemplo  ������Ҫһ����ԱҪ�õ���һ��construcotrһ���İ취,��������ϣ������fijo �����
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
