

class calculator{
int a;
public int add(int n1,int n2)
{
    int result = n1+n2;
    return result;
}


}



public class test
{

    public static void main(String a[])
    {
        int num1=4;
        int num2=5;

        calculator cal = new calculator();

       int r= cal.add(num1,num2);
        System.out.print(r);

    }
   

}