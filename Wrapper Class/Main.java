public class Main {
    public static void main(String[] args) {

        // Wrapper classes for each primitive type
        Boolean boolObj = Boolean.valueOf(true);
        Byte byteObj = Byte.valueOf((byte) 123);
        Short shortObj = Short.valueOf((short) 456);
        Integer intObj = Integer.valueOf(789);
        Long longObj = Long.valueOf(123456789L);
        Float floatObj = Float.valueOf(3.14f);
        Double doubleObj = Double.valueOf(2.71828);
        Character charObj = Character.valueOf('A');

        // Convert into primitive types
        boolean bool = boolObj.booleanValue();
        byte byteValue = byteObj.byteValue();
        short shortValue = shortObj.shortValue();
        int intValue = intObj.intValue();
        long longValue = longObj.longValue();
        float floatValue = floatObj.floatValue();
        double doubleValue = doubleObj.doubleValue();
        char charValue = charObj.charValue();

        // Print the values
        System.out.println("boolean: " + bool);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
    }
}
