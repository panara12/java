import java.util.Scanner;
public class con_postfix{

    int top,ip,sp,r,rank;
    char stack[] = new char[100];
    String infix;
    int next;
    String polish="";


    public  void push(char x){
        if(top>99){
            System.out.println("stack ooverflow");
        }
        top++;
        stack[top]=x;
    }

    public  char pop(){
        if(top<1){
            System.out.println("stack underflow");
            return 0;
        }
        top--;
        return stack[top];
    }

    public void checkprece(char input,char stack){
        switch(input){
            case '+','-' -> {ip = 1;}
            case '*','/' -> {ip = 3;}
            case '^' -> {ip = 6;}
            case '(' -> {ip = 9;}
            case ')' -> {ip = 0;}
            default -> {ip=7;}
        }
        switch(stack){
            case '+','-' -> {sp = 2; r=-1;}
            case '*','/' -> {sp = 4; r=-1;}
            case '^' -> {sp = 5; r=-1;}
            case '(' -> {sp = 0; }
            default -> {sp=8; r=1;}
        }
    }

    public String eval(String infix){
        int str = infix.length();
        stack[top] = '(';
        for(int i=0;i<str;i++){
            char st = infix.charAt();
            checkprece(next,st);
            if(top<0){
                System.out.println("Invalid string");
            }
            while(sp>ip){
                char temp = pop();
                polish = polish+temp;
                rank = rank+r;

                if(rank<1){
                    System.out.println("invalid");
                }
                st=stack[top];
                checkprece(next , st);
            }
            if(sp!=ip){
                push(next);
            }
            else {
                pop();
            }
        }
        System.out.println("rank is =" +rank);
        if(top!= -1|| rank!=1 ){
            return("invalid");
        }
        return(polish);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String infix = sc.nextLine();
        con_postfix ob1 = new con_postfix();
        System.out.println("postfix ="+ob1.eval(infix+')')); 
    }
}