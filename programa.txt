public class Main {
    public static void main(String[] args) {
        String mensaje = "hola"; 

        System.out.println("Mensaje Original: " + mensaje);
        String mensajeCifrado = cifrar(mensaje);
        System.out.println("Mensaje Cifrado: " + mensajeCifrado);
    }

    public static String cifrar(String mensaje) {
        char[] alfabetoOriginal = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alfabetoCifrado = "defghijklmnopqrstuvwxyzabc".toCharArray();
        char[] mensajeCifrado = new char[mensaje.length()];

        for (int j = 0; j < mensaje.length(); j++) {
            for (int i = 0; i < alfabetoOriginal.length; i++) {
                if (mensaje.charAt(j) == alfabetoOriginal[i]) {
                    mensajeCifrado[j] = alfabetoCifrado[i];
                    break;
                }
            }
        }

        return new String(mensajeCifrado);
    }
}
