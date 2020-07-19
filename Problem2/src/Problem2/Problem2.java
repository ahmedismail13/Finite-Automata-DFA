package Problem2;
import java.util.*;

public class Problem2 {
    
    public static void main(String[] args) {
        
        ArrayList<state> list = new ArrayList<>();
        list.add(new state("q1",1,3,3,false));  //0
        list.add(new state("q2",3,4,2,false));  //1
        list.add(new state("q3",3,3,3,true));   //2
        list.add(new state("q4",3,3,3,false));  //3
        list.add(new state("q5",3,4,5,false));  //4
        list.add(new state("q6",3,4,5,true));   //5
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
