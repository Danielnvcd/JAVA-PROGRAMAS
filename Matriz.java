        import java.util.Random;

        public class Main {
        public static void main(String[] args) {
        int[][] matriz = new int[5][6];

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }

        System.out.println("matriz");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int sumapares = 0;
        int sumaimpares = 0;
        int sumadiagonal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                int valor = matriz[i][j];
                if (valor % 2 == 0) {
                    sumapares += valor;
                } else {
                    sumaimpares += valor;
                }
                if (i == j) {
                    sumadiagonal += valor;
                }
            }
        }

        System.out.println("suma de numeros pares " + sumaPares);
        System.out.println("suma de numeros impares " + sumaImpares);
        System.out.println("suma de la diagonal principal " + sumaDiagonal);

        int[][] matriztranspuesta = new int[6][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriztranspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("matriz transpuesta");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriztranspuesta[i][j] + " ");
            }
            System.out.println();
          }
          }
          }
