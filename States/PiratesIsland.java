package Schatzsuche.States;
import Schatzsuche.Input.*;

public class PiratesIsland implements State{

      @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new ShipwreckBay();
       }else{
           return new MusketHill();
       }
       
   }  


    @Override
    public String str(){  
        return "PiratesIsland";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> ShipwreckBay; Action b -> MusketHill";
        return temp;
    }  
}