package ����;
import java.util.Scanner;
 
class aa {
	
	int jaja;
	aa(){
		jaja=100;
		System.out.println("�����jaja construcotr por defecto ");
	}
	
	aa(int o,int p){
		jaja=134;
		System.out.println("����� jaja   construcotr con o y p  ");
	}
	
	
	public void metodo1() {
		System.out.println("�����aa���metodo1 ");
	}
}
public class ������̳е����� extends aa{
	int b;
	������̳е�����(int a,int p){
		super(a,p);  // super ��������ǰ�棬���·������
		b=2000;
		System.out.println("�����  ����̳е�����    constructor  con a ��   p "+b);
		
	}
	
	/*������̳е�����(int a,int p){
		System.out.println("�����  ����̳е�����    constructor  con a ��   p "+b);
		super(a,p);
		b=2000;
		
		
	}*/
	
	������̳е�����(){
		super();// ������дʲô����ô�ʹ��游����ʲô��constructor
		System.out.println("�����    ����̳е�����   con el constructor por defecto");
	}
	void getsuper(int o,int u) {
	
	}
 
	  public static void main(String[] args) {
		  ������̳е����� xiao=new ������̳е�����(2,9);// ��������aa�����jaja metodo �� ��Ϊ��  ������̳е�����   �����constructor ������super���constructor
		  
		  System.out.println("����ֱ�ӿ����� ���ڼ̳е�����   �����atributo  "+xiao.jaja);// 134  ��Ϊ���ǽ��� objeto xiao ��ʱ�� ����construcotr con
		  // paremetro de entrada ���� int a �� int p �������������� super(a,p) ����������   ������̳е����� ���Ӧ��constructor�� Ȼ��
		  /// �� ������̳е�����  ��Ӧ��constructor ���� jaja ���� 134��
		  
		  System.out.println(" "+xiao.b);
		  
		  xiao.metodo1(); // ���ǿ���ֱ����   ����̳е�����   �����metodo
		  ������̳е����� yang=new ������̳е�����();
             
  System.out.println(xiao.jaja+"fdsa"+xiao.b);
   
    }
}

