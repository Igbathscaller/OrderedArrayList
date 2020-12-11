public class Tester {
    public static void main(String[]args){
        OrderedArrayList<Integer> k = new OrderedArrayList<Integer>();
        for(int i = 0; i<args.length-2; i++){
            k.add(Integer.parseInt(args[i]));
        }
        System.out.println(k);
        
        if(args.length>2){
            k.set(Integer.parseInt(args[args.length-2]),Integer.parseInt(args[args.length-1]));
            System.out.println(k);
        }
    }
}
