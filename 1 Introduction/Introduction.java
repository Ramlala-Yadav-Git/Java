// Developed by Sun microsytem inc in 1991, later acquired by Oracle corporation
// Oracle Corp (NASDAQ : ORCL) and and Sun Microsystems (NASDAQ :JAVA) announced

// PARENT COMPANIES : Oracle Corporation.

// develpoed by James Gosling and Patrick Naughton with team.

class Intoduction { // class is keyword
    // Introduction id identifier created by develop

    public static void main(String arr[]) {
        System.out.println("Hello world ! by println"); // it will change the line after printing
        System.out.print("Hello world ! by print 1"); // it dosen't change the line after printing
        System.out.print("Hello world ! by print 2"); //
        /**
         * 
         */
        // Declaring varialbles --->
        // data-type variableName= value;

        // java is statically type langause which means you have to tell that which type
        // of value you want to store on that variable
        String a = "Ramlala";
        System.out.println(a);

        a = "Somesh";
        System.out.println(a);

        // Two types of data types

        // Primitive data types -> total 8
        // inbuilt with langauges

        /*
         * byte -> for normla value (integers) 8 bits -127 to 124
         * short -> 8*2 bits
         * int -> 32 bits
         * long -> 32*2 bits
         * 
         * float -> for decimal -> 32 bits
         * double -> for decimal -> 32*2 bits
         * 
         * boolean -> true or false, 1 bit
         * 
         * char -> unicode char -> 8*2 bits, for charectors
         * 
         */

        // Non Primitives data types -> / Reference data types -> User Defined Data
        // types
        // these are created by user -> String, Array, List etc.

        /**
         * TYPE CASTING ->>
         * 
         * Automatic conversion -> Implicit type casting.
         * 
         * Forcefully bymprogrammers -> Explicit type casting.
         * 
         * int i =90;
         * double d =i; << implicit conversion
         * 
         * double myval =34.23;
         * int myint = (int)myval << Explicit conversion, loosing value 0.23
         * 
         */

    }

}