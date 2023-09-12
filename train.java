import java.util.*;

public class train 
{

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int y=n%8;
if(y==1||y==4){
    System.out.println("lower");
} 
else if(y==2||y==5){
    System.out.println("middle");
}
else if(y==3||y==6){
    System.out.println("upper");
}
else if(y==7){
    System.out.println("side lower");
}
else if(y==0){
    System.out.println("side upper");
}
    }
}
