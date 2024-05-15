package Schatzsuche.States;
import Schatzsuche.Input.*;

public class DeadManIsland implements State {

    @Override
   public State transition(Action action){
       if(action.str() == 'A'){
           return new MusketHill();
       }else{
           return new ShipwreckBay();
       }
       
   }  


    @Override
    public String str(){  
        return "DeadManIsland";
    }

    @Override
    public String info(){
        String temp = "you are on  " + "'"+this.str()+ "'" + "\nAction A -> Muskett Hill; Action b -> Shipwreck Bay";
        return temp;
    }  


}