
public class Box {
    // for one type data we can make a variable
    // Object is real world entity
    // Object is an intance/example of a class

    int length, breadth, height; // instance variables
    // static int length, breadth, height; // static variables
    // public void fun1(){} instance member function
    // public static coid fun2(){} static member function
    // function ke andar static variable nhi bna skte

    // static waale poori class ke variable hote hai
    // jabki instance variable har baar nya class bnane per nya varible banta hai

    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    // private variable ko class ke bahar se use nhi ker skte

    public void showDimensions() {
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }

    public static void main(String[] args) {

        Box smallBox = new Box();
        smallBox.setDimensions(10, 5, 8);
        smallBox.showDimensions();
    }

}
