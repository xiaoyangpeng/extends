package ��������һ������;

public class ��������һ������ {
 private int[] date;
 
 
 
 ��������һ������(int valor_miembro){//constructor
	 date=new int[valor_miembro];
 }
	��������һ������(){
		
			this(10);// construcot
	 
 }
	
 public void metodo1() {
	 metodo(0);//��������һ������
	 this.metodo(5);//������this
 }
	
 public void metodo(int valor) {
	 System.out.println("metodo1");// ��������һ������
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
}
