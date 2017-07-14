class number_3
{

public static void main(String ar[])
{
long n=60085232615455L;long max=0;
for(long i=2;i<n;i++)
{
if(n%i==0)
{
boolean b=prime(i);
if(b)
{
max=i;
}
}
}
System.out.println("Maximum"+max);
}
static boolean prime(long x)
{
long flag=0;
for(long j=2;j<x;j++)
{
if(x%j==0)
{
flag++;
}
}
if(flag==0)
{
return true;
}
else
{
return false;
}
}
}