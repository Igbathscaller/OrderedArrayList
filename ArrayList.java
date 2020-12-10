public class ArrayList<T>{
    private T[] data;
    private int size;

    public ArrayList(){
        data = (T[])new Object[10];
        size = 0;
    }

    public ArrayList(int initialCapacity){
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Don't be so negative");
        }
        data = (T[])new Object[initialCapacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean add(T element){
        if (size < data.length){
            data[size++] = element;
        }
        else{
            resize();
            data[size++] = element;
        }
        return true;
    }

    public Object get(int index){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        return data[index];
    }

    public Object set(int index, T element){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        Object temp = data[index];
        data[index]=element;
        return temp;
    }

    private void resize(){
        Object[] temp = data;
        data = (T[])new Object[size*2+1];
        for (int i = 0; i<temp.length; i++){
            data[i]=(T)temp[i];
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        size = 0;
        data = (T[])new Object[10];
    }

    public String toString(){
        String out = "[";
        if (!isEmpty()){
            out += data[0]; 
            for (int i = 1; i<size; i++){
                out+=", " + data[i];
            }
        }
        out += "]";
        return out;
    }

    public boolean contains(T s){
        for(int i=0; i<size; i++){
            if (s != null && s.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    public void add(int index, T element){
        if (size<index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        if (size >= data.length){
            resize();
        }
        Object[] temp = data;
        data = (T[])new Object[data.length];
        for(int i = 0; i<index; i++){
            data[i]=(T)temp[i];
        }
        data[index]=element;
        for(int i = index; i<size; i++){
            data[i+1]=(T)temp[i];
        }
        size++;
    }

    public Object remove(int index){
        if (index>=size){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        Object temp = data[index];
        for(int i = index+1; i<size; i++){
            data[i-1]=data[i];
        }
        size--;
        return temp;
    }

    public int indexOf(T s){
        for(int i=0; i<size; i++){
            if (s != null && s.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value){
        for(int i=size-1; i>=0; i--){
            if (value != null && value.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean equals(ArrayList<T> other){
        if (other.size != size){
            return false;
        }
        for(int i=0; i<size; i++){
            if (!data[i].equals(other.get(i))){
                return false;
            }
        }
        return true;
    }

    public T[] toArray(){
        T[] out = (T[]) new Object[size];
        for(int i=0; i<size; i++){
            out[i]=data[i];
        }
        return out;
    }

}