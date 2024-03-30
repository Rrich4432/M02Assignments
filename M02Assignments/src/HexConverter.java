public class HexConverter {
    public static int hex2Dec(String hexString) throws HexFormatException {
        // Check if the string contains only hexadecimal characters
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (!Character.isDigit(ch) && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f')) {
                throw new HexFormatException("Invalid hexadecimal string: " + hexString);
            }
        }

        // Convert hexadecimal string to decimal
        int decimal = Integer.parseInt(hexString, 16);
        return decimal;
    }

    public static void main(String[] args) {
        try {
            String hexString = "1A3F";
            int decimal = hex2Dec(hexString);
            System.out.println("Hexadecimal " + hexString + " is equal to Decimal " + decimal);
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}