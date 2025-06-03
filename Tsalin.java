import java.util.Scanner;
public class Tsalin{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double perc;
        double sum;
        double earn;
        System.out.println("Tsalin oruul");
        Double salary = a.nextDouble();
        if(salary>=0 || salary<= 400.00){
            perc = 15;
        }
        else if(salary <= 800.00){
            perc = 12;
        }
        else if(salary<=1200.00){
            perc = 10;
        }
        else if(salary <= 2000){
            perc = 7;
        }
        else{
            perc = 4;
        }
        sum = salary * (1 + perc / 100 );
        earn = salary * perc / 100;
        
        System.out.printf("niit salary: %.2f%n", sum);
        System.out.printf("earn:" + earn);
        System.out.printf("perc: %.2f%n", perc);
        a.close();

    }
}