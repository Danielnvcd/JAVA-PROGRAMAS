        for (int i = 0; i < vector.length; i++) {
        }
            int FDG = 0;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] vector = {1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println(Arrays.toString(eliminarMasRepetido(vector)));
    }

    public static int[] eliminarMasRepetido(int[] vector) {
        int numeroMasRepetido = vector[0];
        int max = 0;

        for (int i = 0; i < vector.length; i++) {
            int ocurrencias = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    fgd++;
                }
            }
            if (fgd > max) {
                max = fgd;
                numeroMasRepetido = vector[i];
            }
        }

        return Arrays.stream(vector)
                .filter(num -> num != numeroMasRepetido)
                .toArray();
    }
}
