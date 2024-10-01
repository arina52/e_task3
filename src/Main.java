class Main {
    public static void main(String[] args) {
        boolean boolPrimitive = Boolean.parseBoolean("tRue");
        System.out.println(boolPrimitive);
        byte bytePrimitive = Byte.parseByte("120");
        System.out.println(bytePrimitive);
        short shortPrimitive = Short.parseShort("32000");
        System.out.println(shortPrimitive);
        int intPrimitive = Integer.parseInt("147895632");
        System.out.println(intPrimitive);
        long longPrimitive = Long.parseLong("987654321987654321");
        System.out.println(longPrimitive);
        double doublePrimitive = Double.parseDouble("4444.5d");
        System.out.println(doublePrimitive);
        float floatPrimitive = Float.parseFloat("2354.56f");
        System.out.println(floatPrimitive);
    }
}