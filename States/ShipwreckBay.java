package Schatzsuche.States;
import Schatzsuche.Input.*;
public class ShipwreckBay implements State{
      @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new MusketHill();
       }else{
           return new DeadManIsland();
       }
       
   }  


    @Override
    public String str(){  
        return "ShipwreckBay";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> Muskett Hill; Action b -> DeadManIsland";
        return temp;
    }  
}