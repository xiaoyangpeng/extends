package 方法叫另一个方法;

public class 方法叫另一个方法 {
 private int[] date;
 
 
 
 方法叫另一个方法(int valor_miembro){//constructor
	 date=new int[valor_miembro];
 }
	方法叫另一个方法(){
		
			this(10);// construcot
	 
 }
	
 public void metodo1() {
	 metodo(0);//方法叫另一个方法
	 this.metodo(5);//或者用this
 }
	
 public void metodo(int valor) {
	 System.out.println("metodo1");// 方法叫另一个方法
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
}
