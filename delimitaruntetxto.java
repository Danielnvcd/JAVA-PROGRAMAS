public class SubstringBeforeDelimiter {
    public static void main(String[] args) {
        String input = "Este es un ejemplo, otro ejemplo, y otro más.";
        String delimiter = ", ";
        int occurrence = 2;
        
        int index = -1;
        for (int i = 0; i < occurrence; i++) {
            index = input.indexOf(delimiter, index + 1);
            if (index == -1) {
                break;
            }
        }
        
        String result = (index != -1) ? input.substring(0, index) : input;
        System.out.println("Texto antes del delimitador: " + result);
    }
}
