package Schatzsuche;
import Schatzsuche.Input.*;
import Schatzsuche.States.*;
import java.util.Scanner;

public class StateMachine{

    private static  State currentState;
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        currentState = new PiratesIsland();
       
        System.out.println(currentState.info());
        String way = currentState.str();
            
        while(!currentState.str().equals("TreasureIsland")){
            String input = sc.nextLine();
            Action action = Action.valueOf(String.valueOf(input.charAt(0)));
            currentState = currentState.transition(action);
            way += " -> " + currentState.str();
            System.out.println(currentState.info());
            
        }
        System.out.println(way);
        System.out.println();

       sc.close();

    }
}