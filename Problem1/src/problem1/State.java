package problem1;

public class State {
    
    String name;
    int nextA,nextB;
    boolean accepted;

    public State(String name, int nextA, int nextB, boolean accepted) {
        this.name = name;
        this.nextA = nextA;
        this.nextB = nextB;
        this.accepted = accepted;
    }
    public int getNextState(char x)
    {
        if(x == 'a')
            return nextA;
        else if (x == 'b')
            return nextB;
        return 0;
    }
    public boolean isAccepted()
    {
        if(accepted)
            return true;
        else
            return false;
    }
}
