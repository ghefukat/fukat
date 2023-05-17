class Slip21
{
public static void main(String a[])
{
String S;
int p;
Thread t = Thread.currentThread();
S = t.getName();
System.out.println("\n Current Thread name : "+S);
p = t.getPriority();
System.out.println("\n Current thread priority : "+p);
}
}