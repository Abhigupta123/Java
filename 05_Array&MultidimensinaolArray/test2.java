public class test2{
    public static void main(String s[])
    {
        int arr[][] = new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //  Another short way to write for loop

        for(int n[] : arr)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }


    }
}