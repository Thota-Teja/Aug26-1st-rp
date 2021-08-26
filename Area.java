abstract class A
{
abstract void show();
}
class Area extends A
{
void show()
{
int l=4,h=4,a=3,r=6;
System.out.println("the area of rectangle is:"+(l*h));
System.ou.println("the area of square is:"+(a*a));
System.out.println("the area of circle is:"+(3.14*r*r);
}
public static void main(String args[])
{
A a=new Area();
a.show();
}
}
