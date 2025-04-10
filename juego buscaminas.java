package javaapplication1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication1 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean jugar1 = true;
    while (jugar1) {
       try {
       System.out.print("Ingrese el tamaño del tablero n ");
       int n = scanner.nextInt();
       char[][] tablero = creartablero(n);
       colocarminas(tablero, n);
       mostrartablero(tablero);
       while (!juegoterminado(tablero)) {
       jugar(tablero);
       mostrartablero(tablero);
            }
      System.out.println("Has ganado el juego");
        } catch (InputMismatchException e) {
      System.out.println(" error introduce un tipo de dato entero");
      scanner.nextLine(); 
        }}} 
    private static char[][] creartablero(int n) {
      char[][] tablero = new char[n][n];
       for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
      tablero[i][j] = '-';
            }}
        return tablero;
       }
    private static void colocarminas(char[][] tablero, int n) {
       int minas = n * n / 4; 
       for (int i = 0; i < minas; i++) {
       int fila = (int) (Math.random() * n);
       int columna = (int) (Math.random() * n);
    while (tablero[fila][columna] == '*') {
      fila = (int) (Math.random() * n);
    columna = (int) (Math.random() * n);
    }
    tablero[fila][columna] = '*';
     }}  
    private static void mostrartablero(char[][] tablero) {
      System.out.println("Tablero");
      for (char[] fila : tablero) {
      for (char celda : fila) {
      System.out.print(celda + " ");
    }
    System.out.println();
   }
        System.out.println();
    }
    private static boolean juegoterminado(char[][] tablero) {
    for (char[] fila : tablero) {
    for (char celda : fila) {
    if (celda == '-') {
    return false; 
    }}}
    return true; 
    }
    private static void jugar(char[][] tablero) {
    Scanner scanner = new Scanner(System.in);
    try {      
      System.out.print("Ingrese la fila y columna separadas por espacio para descubrir ");
      int fila = scanner.nextInt();
     int columna = scanner.nextInt();
      if (tablero[fila][columna] == '*') {
     System.out.println("Has encontrado una mina Fin");
      } else 
      {
      int minasA = contarminas(tablero, fila, columna);
      tablero[fila][columna] = (char) (minasA + '0');
   }   
     } catch (InputMismatchException e) {
     System.out.println("error poner tipo de tipo de dato int");
     scanner.next(); 
    }}
    private static int contarminas(char[][] tablero, int fila, int columna) {
        int minas = 0;
        int n = tablero.length;
         for (int i = fila - 1; i <= fila + 1; i++) {
        for (int j = columna - 1; j <= columna + 1; j++) {
        if (i >= 0 && i < n && j >= 0 && j < n && tablero[i][j] == '*') {
        minas++;
         }}}
    return minas;
  }
  }
