package Schatzsuche.States;
import Schatzsuche.Input.*;

public class MusketHill implements State{
      @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new PiratesIsland();
       }else{
           return new MutineersIsland();
       }    
    }  


    @Override
    public String str(){  
        return "MuskettHill";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> PiratesIsland; Action b -> MutineersIsland";
        return temp;
    }  
}