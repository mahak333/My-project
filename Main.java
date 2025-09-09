import java.util.Scanner;
Class Calculator{
  public static void main(String args[]){
    System.out.println("Enter two numbers:");
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("Enter the operator:");
    int operator=sc.next();
    switch(operator){
      case '+':
        Add(num1,num2);
        break;
      case '-':
        Sub(num1,num2);
        break;
      case'*':
        Mult(num1,num2);
        break;
      case'/':
        Div(num1,num2);
        break;
      default:
        System.out.println("Enter valid operator");
}
}
}
