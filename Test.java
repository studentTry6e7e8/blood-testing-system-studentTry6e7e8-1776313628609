import java.util.Scanner;

public class A1B2 { // declare a class, name A1B2
    public static void main(String[] args){ // main() method, the entry point where the program starts
        int Tc;
        int Hdlc; //declaring variable for later use
        int Tg;
        double Ldlc;
        
        System.out.println("--- START of A1B2, Blood Testing ---\n");
        Scanner kb = new Scanner(System.in); // scanner class to get user input
        System.out.print("Enter Total Cholesterol : ");
        Tc = kb.nextInt();

        System.out.println("");
        System.out.print("Enter HDL Cholesterol : "); // format and take user input for a int
        Hdlc = kb.nextInt();
        
        System.out.println("");
        System.out.print("Enter Triglyceride : ");
        Tg = kb.nextInt();
        
        System.out.println("");
        Ldlc = (Tc-Hdlc-(Tg/5.0)); // calculation , 5.0 instead of 5 to avoid turning tg/5 into a int
        String message1 = String.format("LDL Cholesterol = %.2f", Ldlc);
        System.out.println(message1); // print out message
        
        // METHOD BODY TO BE FINISHED BY STUDENT
        int min = 1;
        int max = 100;
        int x = (int) (Math.random() * (max-min) + 1) + min;
        System.out.println(x);
        System.out.println("\n>>> END of main(). Done by <MaxmusAtta>, <20270694>, <Cl09>, <2025> <<<");                
    }
}