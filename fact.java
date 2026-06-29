import java.util.*;
class fact{
    public static long gt(int n){
        if(n==0||n==1)//Stopping condition of Recursive function without this function may causes  stack overflow Error
        {
            System.out.println("");
            return 1;
        }

        long value = gt(n-1);
        long theresult= n *value;
        return theresult;
 

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number =sc.nextInt();
        long result=gt(number);
        System.out.println("factorial of "+number+" is "+result);

        sc.close();
    }
}