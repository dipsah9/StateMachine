package Schatzsuche.Input;
public enum Action{
    A('A'), B('B');

    private final char value;

    private Action(char value){
        this.value = value;
    }

    public char str(){
        return value;
    }

}