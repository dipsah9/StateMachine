package Schatzsuche.States;
import Schatzsuche.Input.*;

public class MutineersIsland implements State{
      @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new SmugglerCove();
       }else{
           return new DeadManIsland();
       }
       
   }  


    @Override
    public String str(){  
        return "MutineersIsland";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> SmugglerCove; Action b -> DeadsManIsland";
        return temp;
    }  
}