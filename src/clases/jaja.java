package clases;

import clase1.jeje;//����������ȫ��һ���İ�����������Ҫ�õĵ���һ�����������ôҪдimpor ����.���� (ע����һ����һ��Ҫ��public���ܺ���)

public class jaja {


    public static void main(String[] args) {/*// main ��static��Ϊmain������ʵҲ���������һ���������ͱ���һ������test����ô�����main��ʵ����test.main(String[] args)��������֪���һ���������Ǿ�̬�ģ���Ҫ��ʵ�������࣬����Ҫ���� A a=new A();
    	Ȼ����ܵ��� a.main();  �����static���ǿ���ֱ������*/
    	jeje p1=new jeje(3);
    /*	jeje p2=new jeje();
    	p1.getsinstatic();;
    	jeje.get();// �����static�������ǿ��Բ���objetoֱ�ӵ���
    	System.out.println(p1.a);
    	System.out.println(p1.b);
    	System.out.println(p1.c);
    	System.out.println(p2.b);
    	System.out.println(p2.c);*/
    	jeje p2=new jeje();
    	p2=p1;
    	if((p1.toString())!=(p2.toString() )) 	System.out.println("ok");
    	/*System.out.println(p1.toString());
    	
    	System.out.println(p2.toString() );*/
    }
}
