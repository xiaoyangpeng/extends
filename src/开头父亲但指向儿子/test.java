package ��ͷ���׵�ָ�����;

import java.util.ArrayList;
import java.util.Scanner;
//����ֻ�ܹ����Ǹ���ķ�����ȴ���ܸ��Ǹ���ĳ�Ա������

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
		super(7);// ��д����Ļ��������� aĬ�ϵ�construcotr
		super.metodo();
		
		System.out.println("este es el constructor del test");
	}
	
	public void ok() {
	System.out.println("okkkkkkkkkk");
	}
	public void jeje() { //��д�˸���jeje����
	System.out.println("���ӵ�jeje");
}
    public static void main(String[] args) {
   /*	
    //�����и���һ���ģ����ö��ӵġ�ʡ��Ǯ�ǵ㡣���Ӷ��еģ����ײ����ã����Բ�����
    	//  System.out.println(prueba.equals(prueba1)	);
  
    	padre prueba1=new hijo1();
    	prueba1.jeje();// ��Ϊ������hijo1����д��padre jeje�ķ������������ǵ��õľ���hijo1�����
    	//�������ʱ��padreָ�����test��testҲ����д�� jeje���������� �ͻ���ʾtest jeje�ķ���
   	 System.out.println(prueba1.valor1);
   
   	 hijo1 ja=new hijo1();
   	 
   	 	padre pradre1=(padre)ja;
 	
 	// fallooooo   pradre1.metodohijo; //��Ϊ����pradre1��asginar el objeto ja ������ǿ��Ū�� padre���࣬��padre ����û��metodohijo
   	 	// ���� numero=(int)7,88
   	 	//nuemroֻ����int��ֵ
   	 	// metodohijo1 �ǾͲ������� �����Ǵ��
    /
    
    */
    
 /**   prueba sobre padre apunta a test*/
    
    
    /////////////////////////////////////////////////////////////////////////////// 	
    /* 	padre jaja=new test();
     	
     	jaja.metodo(); // ��Ϊ��ͷ��padre�����Կ��Ե���padre��metodo����
   
     		jaja.jeje();// ���õ���padre�����jeje��
     		
     		//����Ҫ�Ƕ���test��д��jeje����ô���õľ��Ƕ��ӵ�
     		//public void jeje() { // �����ȡ����ע����ô���õľ��Ƕ��ӵ�jeje
     		//System.out.println("���ӵ�jeje");}

 		System.out.println("valor1 "+jaja.valor1); // ��Ϊ��ͷ�Ǹ��ף���Ȼ����������д��valor1 ��������ֻ�ܹ����Ǹ���ķ�����ȴ���ܸ��Ǹ���ĳ�Ա������

    	 System.out.println(jaja.valora);  
     	
     //	jaja.ok();//����ͻ������Ϊok��test�� padre��Ϊ���ײ����ܵ���
    	
   //////////////////////////////////////////////////////// 
    	 
  ////////////////////////////////////////////////////////////////////  
   * 	 **/	 
  
   /* 	 test test=new test();
    	test.ok();// test �Լ��������Կ��Խ�
    	 System.out.println("valor1 de clase test "+test.valor1);// ��Ȼa����������� �����ǽе���test��ģ�����д��padre valor1
    	 //Ҫ�ǰ�test�����valor1ȥ�� ��ô���ǽеľ���a�������valor1 �Ǿ���9 
    	 System.out.println("valora"+test.valora);// test�̳���padre�������Կ��Խ�,��Ϊ������valora Ū�˸�  5 ��������Ҳ����ʾ 5
    
    ////////////////////////////////////////////////////////////////////////////////////////////	*/
   	 	padre a=new padre();// �������� padre��ң���������Ĺ���Ϊ jeje ��metodo
   	 	// ���ǵ��õ�padre�Ľ�������ֻ�ܽ��� jeje ��metodo
   	 	padre b=new hijo1();// ����Ӧ��padredң���������Ĺ���Ϊ jeje ��metodo
   	 	//���ǵ��� hijo�Ľ���������Ϊ���̳���padre ���� ���Խ��� jeje ��metodo 
   	 	//�����������Խ���hijometodo
   	 	// hijo�����̳���padre ��construcor�� �����Լ���construor�����񿪻�һ������a����һ�����Ǽ��˸���Ķ���
   	 	// �������ǵ�ң����ֻ�ܷ��� jeje �� metodo������bֻ�ܽ���jeje ��metodo 
   	 	b.metodo();
   	 	b.jeje();
   	 // fallllolololo
   	 	//b.hijometodo();
   	 	
   	/* 	
   	 	hijo1 c=(hijo1) b; // ����������hijo��ң�����������͸�b��������hijo1�Ľ�����
   	 	 c.hijometodo();// �������ǿ��Է��ͺͽ���hijometodo
   	 	
   	 	 hijo1 prueba1=new hijo1(); 
    	 padre prueba2=(padre) prueba1;// ����prueba1������hijo1�Ľ�������������������ǿ����padre��ң����ȥ������
    	 // ��ô��ֻ��ʵ��padre�Ĺ��ܾ���jeje��metodo
    	 prueba2.jeje();
    	 prueba2.metodo();
    	 //fallllooooooo
    	 //prueba2.hijometodo(); //padreң�������ܷ���hijometo�ź�*/
    }

}