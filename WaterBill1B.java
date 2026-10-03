import java.util.Scanner;

    class WaterBill1B
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water consumption in litres");
        double consumption=sc.nextDouble();
        double bill;
        if(consumption<=500)
        {
            bill=100.0;
        }    
        else 
        {
            bill=200.0;
        }
        System.out.println("Water bill is "+bill);
        
    }
}