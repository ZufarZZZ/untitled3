public class Printer <T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
    void printValue(){
        System.out.println("Value is "+value);
    }
    void refresh(){
        value = null;
    }
}
