package Schatzsuche.States;
import Schatzsuche.Input.*;
public class TreasureIsland implements State{
      @Override
        public State transition(Action action){
       if(action.str() == 'A'){
           return new TreasureIsland();
       }else{
           return new TreasureIsland();
       }    
    }  


    @Override
    public String str(){  
        return "TreasureIsland";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> No change; Action b -> No Change";
        return temp;
    }  
}