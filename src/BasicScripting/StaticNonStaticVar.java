package BasicScripting;

public class StaticNonStaticVar 
{
static int a = 10;
double b = 1.2;
	

public static void main(String[]args)
{
System.out.println(a);
deaf();
StaticNonStaticVar q1=new StaticNonStaticVar();

q1.dump();
q1.a=500;
//q1.a=50;
q1.b=100.7;
System.out.println(q1.a);
System.out.println(q1.b);
}

static void deaf()

{
System.out.println("You are deaf");
}

void dump()

{
System.out.println("You are dump");
}

}