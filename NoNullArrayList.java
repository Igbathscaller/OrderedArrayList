import java.util.ArrayList;
 
public class NoNullArrayList<T> extends ArrayList<T>{
    public NoNullArrayList(){
        super();
    }
    public NoNullArrayList(int intialCapacity){
        super(intialCapacity);
    }

    public boolean add(T element){
        if (element == null){
            throw new IllegalArgumentException("NULL");
        }
        else{
            return this.add(element);
        }
    }

    public void add(int index, T element){
        if (element == null){
            throw new IllegalArgumentException("NULL");
        }
        else{
            this.add(index,element);
        }
    }

    
}
