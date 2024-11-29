import java.util.Scanner;
public class LeituraDeDoisValoresInteirosEPositivos{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.print("\f Digite dois números:");
        a=in.nextInt();
        b=in.nextInt();

        int numimpar=impares(a,b);
        int num=pares(a,b);
        boolean c=primos(a);
        boolean d=primos1(b);
        System.out.println("A soma dos números ímpares é:"+numimpar+"A quantidade de números pares é:"+num+ "a média dos números primos do intervalo é:"+c+d+".");
    }

    public static int impares(int a,int b){
        int i;  
        int soma=0;
        for(i=1;i%a !=0;i++){
            soma=soma+a;
            i++;
            return a;
        }
        for(i=1;i%b !=0;i++){
            soma=soma+b;
            i++;
            return b;
        }
        int numimpar=(a+b);
        return numimpar;
    }

    public static int pares(int a,int b){
        int num=a;
        while(a<=b){
            if(num%2==0){    
            }
        }
        num++;
        return num;
    }

    public static boolean primos(int a){
        int c=a;
        if(c<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(c);i++){
            if(c%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean primos1(int b){
        int d=b;
        if(d<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(d);i++){
            if(d%i==0){
                return false;
            }
        }
        return true;
    }
}