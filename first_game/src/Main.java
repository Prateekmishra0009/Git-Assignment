import java.util.Scanner;
import java.util.Random;
class Game{
    private int uN;
    private int cN;


    public void UN(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        this.uN=sc.nextInt();

    }
    public void CN(){
        Random land = new Random();
        this.cN=land.nextInt(50);

    }
    boolean isCorrect(){
        if(this.uN==this.cN){
            System.out.println("yes you get the no.");
            return true;
        }else if(this.uN<this.cN){
            System.out.println("The no. is too low !! " + this.cN);
        }else if(this.uN>this.cN){
            System.out.println("The no. is too high !! " + this.cN);
        }
        else{
            System.out.println("No, the correct no. is " + this.cN);

        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Game g= new Game();
        // boolean a= true;
        g.CN();
        g.UN();
        g.isCorrect();
        // System.out.println(a);
    }
}