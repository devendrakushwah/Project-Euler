class number_2
{
public static void main(String args[])
{
int sum=0,a=1,b=2,c=0;
System.out.print(a+","+b+",");
c=a+b;
while (c<=4000000)
{
System.out.print(c+",");
a=b;
b=c;
c=a+b;
if(c%2==0)
{
sum+=c;
}
}
System.out.println("Sum= "+sum);
}
}