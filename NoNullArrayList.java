import java.util.ArrayList;
 
public class NoNullArrayList<T> extends ArrayList<T>{
    public NoNullArrayList(){
        super();
    }
    public NoNullArrayList(int intialCapacity){
        super(intialCapacity);
    }
}
