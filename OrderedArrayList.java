public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int Cap){
        super(Cap);
    }

    public boolean add(T element){
        if (element == null){
            throw new IllegalArgumentException("NULL");
        }
        else{
            return this.add(element);
        }
    }

    
}