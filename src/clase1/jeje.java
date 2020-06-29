package clase1;

public class jeje {
public int a=0,c=0;;
public static int b; 
static int d=0;
public jeje() {
	
}
public jeje(int a) {
	a=5;
	System.out.println("constructor ");
	
}
{
	c++;
}
static {
	System.out.println("inicializador ");
}

public  static void get() {
	System.out.println("jeje");
}

public   void getsinstatic() {
	System.out.println("jeje sin static");
}

}
