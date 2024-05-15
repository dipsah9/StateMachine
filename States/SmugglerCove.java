package Schatzsuche.States;
import Schatzsuche.Input.*;

public class SmugglerCove implements State{
      @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new PiratesIsland();
       }else{
           return new TreasureIsland();
       }
       
   }  


    @Override
    public String str(){  
        return "SmugglerCove";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> PiratesIsland; Action b -> TreasureIsland";
        return temp;
    }  
}