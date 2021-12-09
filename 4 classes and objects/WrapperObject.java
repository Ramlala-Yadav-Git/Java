
public class WrapperObject {
    public static void main(String[] args) {

        int num = Integer.valueOf("123");
        int s = 0;
        // for (int i = 0; i < args.length; i++) {

        // System.out.println(args[i]);
        // }
        for (int i = 0; i < args.length; i++) {
            s += Integer.parseInt(args[i]);
        }
        System.out.println(s);
    }
}
