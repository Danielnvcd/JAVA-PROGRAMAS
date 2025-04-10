package vandresca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Vandresca {

    private final JFrame frame;
    private final JPanel panel;
    private final JLabel[][] grid;
    private final int[][] maze;
    private int playerX, playerY, endX, endY;

    public Vandresca() {
        frame = new JFrame("Laberinto");
        panel = new JPanel();
        grid = new JLabel[12][12];
        maze = new int[12][12];

        initializeUI();
        generateMaze();
        initializeGame();
        loadEvents();
    }

    private void initializeUI() {
        panel.setLayout(new GridLayout(12, 12, 1, 1));
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                grid[i][j] = new JLabel();
                grid[i][j].setOpaque(true);
                grid[i][j].setBackground(Color.LIGHT_GRAY);
                grid[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(grid[i][j]);
            }
        }

        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    private void generateMaze() {
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                maze[i][j] = rand.nextInt(2);
                if (maze[i][j] == 1) {
                    grid[i][j].setBackground(Color.BLACK);
                }
            }
        }

        // Generate entrance and exit
        playerX = rand.nextInt(12);
        playerY = rand.nextInt(12);
        while (maze[playerX][playerY] == 1) {
            playerX = rand.nextInt(12);
            playerY = rand.nextInt(12);
        }
        grid[playerX][playerY].setBackground(Color.GREEN);

        do {
            endX = rand.nextInt(12);
            endY = rand.nextInt(12);
        } while ((endX == playerX && endY == playerY) || maze[endX][endY] == 1);

        grid[endX][endY].setBackground(Color.RED);
    }

    private void initializeGame() {
        grid[playerX][playerY].setBackground(Color.BLUE);
    }

    private void loadEvents() {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int nextX = playerX;
                int nextY = playerY;

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> nextX--;
                    case KeyEvent.VK_DOWN -> nextX++;
                    case KeyEvent.VK_LEFT -> nextY--;
                    case KeyEvent.VK_RIGHT -> nextY++;
                }

                if (isValidMove(nextX, nextY)) {
                    grid[playerX][playerY].setBackground(Color.LIGHT_GRAY);
                    playerX = nextX;
                    playerY = nextY;
                    grid[playerX][playerY].setBackground(Color.BLUE);

                    if (playerX == endX && playerY == endY) {
                        JOptionPane.showMessageDialog(frame, "¡Has encontrado la salida!");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < 12 && y >= 0 && y < 12 && maze[x][y] == 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Vandresca::new);
    }
}