import java.util.ArrayList;

class TuringMachine {
    ArrayList<String > k = new ArrayList<>();
    ArrayList<Character> Alphabet = new ArrayList<>();
    ArrayList<Character> Alphabet2 = new ArrayList<>();

int n;

    String [][] sigma = new String[n][5];
    ArrayList<Character> Tape = new ArrayList<>();
    String StartState;
    int head;
    boolean flag = false;
    boolean g= false;
public void filltheTape(String s){
    for(int i = 0 ; i< s.length(); i++){
        Tape.add(i,s.charAt(i));
    }
   for (int i =s.length(); i<s.length()*4 ;i++){
        Tape.add(i,'#');
    }
}

   public void trace (String curr , int h){
        //icol
       while(flag== false && g == false) {
           for (int j = 0; j < sigma.length; j++) {     //jrow

               if (curr.equals(sigma[j][0])) {
                   if (Tape.get(h) == getChar(sigma[j][1])) {
                       curr = sigma[j][2];
                       Tape.set(h, getChar(sigma[j][3]));
                       switch (sigma[j][4]) {
                           case "R":
                               h++;
                               trace(curr, h);
                               break;
                           case "L":
                               h--;
                               trace(curr, h);
                               break;
                           case "Y":
                               flag = true;
                               break;
                           case "N":
                               g = true;
                               break;
                           default:
                               break;
                       }
                   }
               }
           }

       }



       }


   public void getres() {
       if (flag) {
System.out.println("Accept");
           for (int i = 0; i < Tape.size(); i++) {
               System.out.print(Tape.get(i));
           }
           System.out.println();
           System.out.println("the head at position  :"+ head);
       }else if(g = true) {
           System.out.println("reject");
       }
   }
   public  char getChar(String d){
      return d.charAt(0);
   }

}
