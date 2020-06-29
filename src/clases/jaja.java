package clases;

import clase1.jeje;//这是两个完全不一样的包，我们现在要用的到另一个包里的类那么要写impor 报名.类名 (注意另一个包一定要是public才能呼叫)

public class jaja {


    public static void main(String[] args) {/*// main 是static因为main函数其实也是所在类的一个方法，就比如一个类是test，那么该类的main其实就是test.main(String[] args)，众所周知如果一个方法不是静态的，则要先实例化该类，比如要这样 A a=new A();
    	然后才能调用 a.main();  如果是static我们可以直接运行*/
    	jeje p1=new jeje(3);
    /*	jeje p2=new jeje();
    	p1.getsinstatic();;
    	jeje.get();// 这个是static所以我们可以不用objeto直接调用
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
