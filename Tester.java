public class Tester {
    public static void main(String[]args){
        OrderedArrayList<Integer> k = new OrderedArrayList<Integer>();
        for(int i = 0; i<args.length; i++){
            k.add(Integer.parseInt(args[i]));
        }
        System.out.println(k);
    }
}
