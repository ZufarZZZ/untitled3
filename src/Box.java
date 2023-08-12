import java.util.ArrayList;
import java.util.List;


public class Box <T>{
    List<T> contents;
    public Box() {
        contents = new ArrayList<>();
    }
    public Box(List<T> contents){
        this.contents = contents;
    }
    public void add(T item){
        contents.add(item);
    }
    public List<T> getContents(){
        return contents;
    }
}
