public class Pair <A, B>{
    A first;
    B second;

    public Pair(){

    }
    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }
    public A getFirst(){
        return first;
    }
    public B getSecond(){
        return second;
    }
    public void setFirst(A first){
        this.first = first;
    }
    public void setSecond(B second){
        this.second = second;
    }
}
