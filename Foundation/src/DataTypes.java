public class DataTypes {
    public static void main(String[] args) {
        // Java Data Types
        // Integers

        byte byteType = 127; //Max byte value

        System.out.println("byteType = " + byteType);

        short shortType = 32000; // Max short value
        
        System.out.println("shortType = " + shortType);

        int intType = 2147483647; // Max int value
        
        System.out.println("intType = " + intType);

        long longType = 987654321098765432L; // Max long value
        
        System.out.println("longType = " + longType);

        // Floats

        float floatType = 3.14F; // F to indicates float type

        System.out.println("floatType = " + floatType);

        double doubleType = 3.1315D; // D to idicates double (optional)

        System.out.println("doubleType = " + doubleType);

        // Character

        char charType = 'A';

        System.out.println("charType = " + charType);

        charType = 65;

        System.out.println("charType = " + charType);

        // Boolean

        boolean boolType = true; // true or false;

        System.out.println("boolType = " + boolType);

        // Object

        String name = null; // Default value
        System.out.println(name);
        name = "Gustavo Perez";
        System.out.println(name);
    }
}
