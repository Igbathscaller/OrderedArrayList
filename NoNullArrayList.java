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
            return super.add(element);
        }
    }

    public void add(int index, T element){
        if (element == null){
            throw new IllegalArgumentException("NULL");
        }
        else{
            super.add(index,element);
        }
    }

    public T set(int index, T element){
        if (element == null){
            throw new IllegalArgumentException("NULL");
        }
        else{
            return super.set(index,element);
        }
    }

}
