public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int Cap){
        super(Cap);
    }

    public boolean add(T element){
        int index = 0;
        for(int i = 0; i<super.size() && i == index;i++){
            if(super.get(i).compareTo(element)<0){
                index++;
            }
        }
        super.add(index,element);
        return true;
    }

    public T set(int index,T element){
        T output = super.get(index);
        super.remove(index);
        this.add(element);
        return output;
    }
    
}