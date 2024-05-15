package Schatzsuche.States;
import Schatzsuche.Input.*;

public interface State{
 
    // gives the next state according to the input provided which is either 'A' or 'B'
    public State transition(Action action);
    
    //give the state in the form of the string 
    public String str();

    //give the information about the next states according to the input provided to the current states 
    public String info();

}