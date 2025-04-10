package LABERITO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class LABERITO{

    private final JFrame marco;
    private final JPanel panel;
    private final JLabel[][] cuadricula;
    private final int[][] laberinto;
    private int jugadorX, jugadorY, salidaX, salidaY;

    public LABERITO() {
        marco = new JFrame("EL PEPE");
        panel = new JPanel();
        cuadricula = new JLabel[12][12];
        laberinto = new int[12][12];

        inicializarInterfaz();
        generarLaberinto();
        inicializarJuego();
        cargarEventos();
    }

    private void inicializarInterfaz() {
        panel.setLayout(new GridLayout(12, 12, 1, 1));
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                cuadricula[i][j] = new JLabel();
                cuadricula[i][j].setOpaque(true);
                cuadricula[i][j].setBackground(Color.GRAY);
                cuadricula[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(cuadricula[i][j]);
            }
        }

        marco.add(panel);
        marco.setSize(600, 600);
        marco.setVisible(true);
    }

    private void generarLaberinto() {
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                laberinto[i][j] = rand.nextInt(2);
                if (laberinto[i][j] == 1) {
                    cuadricula[i][j].setBackground(Color.BLACK);
                }
            }
        }

        
        jugadorX = rand.nextInt(12);
        jugadorY = rand.nextInt(12);
        while (laberinto[jugadorX][jugadorY] == 1) {
            jugadorX = rand.nextInt(12);
            jugadorY = rand.nextInt(12);
        }
        cuadricula[jugadorX][jugadorY].setBackground(Color.PINK);

        do {
            salidaX = rand.nextInt(12);
            salidaY = rand.nextInt(12);
        } while ((salidaX == jugadorX && salidaY == jugadorY) || laberinto[salidaX][salidaY] == 1);

        cuadricula[salidaX][salidaY].setBackground(Color.GREEN);
    }

    private void inicializarJuego() {
        cuadricula[jugadorX][jugadorY].setBackground(Color.CYAN);
    }

    private void cargarEventos() {
        marco.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        marco.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int proximoX = jugadorX;
                int proximoY = jugadorY;

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> proximoX--;
                    case KeyEvent.VK_DOWN -> proximoX++;
                    case KeyEvent.VK_LEFT -> proximoY--;
                    case KeyEvent.VK_RIGHT -> proximoY++;
                }

                if (esMovimientoValido(proximoX, proximoY)) {
                    cuadricula[jugadorX][jugadorY].setBackground(Color.magenta);
                    jugadorX = proximoX;
                    jugadorY = proximoY;
                    cuadricula[jugadorX][jugadorY].setBackground(Color.CYAN);

                    if (jugadorX == salidaX && jugadorY == salidaY) {
                        JOptionPane.showMessageDialog(marco, "Ganaste");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });
    }

    private boolean esMovimientoValido(int x, int y) {
        return x >= 0 && x < 12 && y >= 0 && y < 12 && laberinto[x][y] == 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LABERITO::new);
    }
}