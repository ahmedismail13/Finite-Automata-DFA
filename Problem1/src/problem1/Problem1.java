package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {


    public static void main(String[] args) {
        
        ArrayList<State> list = new ArrayList<>();
        list.add(new State("q1",1,0,false));  //0
        list.add(new State("q2",1,2,false));  //1
        list.add(new State("q3",1,3,false));   //2
        list.add(new State("q4",1,0,true));  //3
        
        while(true)
        {
            Scanner reader = new Scanner(System.in);
            String input = reader.next();
            int currentState =0;
            for(int i=0;i<input.length();i++)
            {
                currentState = list.get(currentState).getNextState(input.charAt(i));
            }
            System.out.println(list.get(currentState).isAccepted());
        }
    }
    
}
