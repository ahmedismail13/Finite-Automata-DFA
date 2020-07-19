package Problem2;

public class state {
    
    String name;
    int nextA,nextB,nextC;
    boolean accepted;

    public state(String name, int nextA, int nextB, int nextC, boolean accepted) {
        this.name = name;
        this.nextA = nextA;
        this.nextB = nextB;
        this.nextC = nextC;
        this.accepted = accepted;
    }
    public int getNextState(char x)
    {
        if(x == 'a')
            return nextA;
        else if (x == 'b')
            return nextB;
        else if(x =='c')
            return nextC;
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
