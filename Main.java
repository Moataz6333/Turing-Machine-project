// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuringMachine m = new TuringMachine();
        Scanner input = new Scanner(System.in);
        Scanner bb = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter the set of States  :");
    System.out.println("Press = when you end");
while(flag){
    String s ;
 s =input.next();
 if(!s.equals("=")){
     m.k.add(s);
 }else {
     flag = false;
 }
}
        System.out.println("Enter the 1st Alpabet  :");
        System.out.println("press = when you end");
   boolean flag1 = true;
   while(flag1){
       char r = input.next().charAt(0);
       if(r != '='){
           m.Alphabet.add(r);
       }else{
           flag1=false;
       }
   }
        System.out.println("Enter the 2nd Alpabet  :");
        System.out.println("press = when you end");
        boolean flag2 = true;
        while(flag2){
            char w = input.next().charAt(0);
            if(w != '='){
                m.Alphabet2.add(w);
            }else{
                flag2=false;
            }
        }
        System.out.println("Enter the start state  :");
        String h = input.next();

m.n=m.Alphabet2.size()*m.k.size();
m.sigma=new String[m.n][5];

        System.out.println("Fill the 2D Array with the Transetion functions");
        for(int i =0 ; i<m.sigma.length ;i++){
            for (int j=0 ; j<5;j++){
                System.out.print("Enter the elemnt of type Sting in position sigma"+"["+i+"]"+"["+j+"]");
                m.sigma[i][j]= bb.next();
            }
            System.out.println("");
        }






    System.out.println("Enter the String that you want to Trace :");
    String st = input.next();

    System.out.println("Enter the position of the head");
    int q = input.nextInt();

    m.head = q;
    m.StartState = h;
    m.filltheTape(st);
    m.trace(m.StartState, m.head);
    m.getres();

    }



}