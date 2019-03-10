/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author cyrilelijahaurino
 */
public class RockPaperScissor {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private static Player player;
    private static int score = 0;
    private static boolean youLose = false;
    private static final String NAME = "PC: ";
    private static char pc = '$';
    public static void main(String[] args) throws IOException {
        String input = "";
        int op = 0;
        do {
            System.out.println("Rock, Paper, Scissor");
            System.out.println("Press 1 to play");
            System.out.println("Press 2 to view high score");
            System.out.println("Press 3 to exit");
            System.out.println("Choose operation:");
            input = reader.readLine();
            try {
                op = Integer.parseInt(input);
            } catch (NumberFormatException e) {

            }
            if (op == 1) {
                System.out.println("Enter 'r' for rock!");
                System.out.println("Enter 's' for scissor!");
                System.out.println("Enter 'p' for paper!");
                do {
                    playGame();
                    System.out.println("\nScore: " + score);
                    if (youLose) {
                        System.out.println("Enter your name: ");
                        String name = reader.readLine();
                        player = new Player(name);
                        player.setScore(score);
                        player.saveScore();
                        score = 0;//reset score
                        youLose = false;
                        break;
                    }
                } while (!youLose);
            } else if (op == 2) {
                viewHighScore();
            } else if (op == 3) {
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("Invalid operation!");
            }
        } while (true);
    }

    private static void playGame() throws IOException {
        System.out.print("Enter your turn: ");
        char turn = reader.readLine().charAt(0);
        pc = getTurn();
        System.err.println(pc);
        switch (turn) {
            case 'r':
            case 'R':
                System.out.println("You: Rock");
                if (pc == 'r') {
                    System.out.println(NAME + "Rock");
                    System.out.println("Draw!");
                } else if (pc == 's') {
                    System.out.println(NAME + "Scissor");
                    System.out.println("You win!");
                    score++;
                } else if (pc == 'p') {
                    System.out.println(NAME + "Paper");
                    System.out.println("You lose!");
                    youLose = true;
                }
                break;
            case 's':
            case 'S':
                System.out.println("You: Scissor");
                if (pc == 's') {
                    System.out.println(NAME + "Scissor");
                    System.out.println("Draw!");
                } else if (getTurn() == 'r') {
                    System.out.println(NAME + "Rock");
                    System.out.println("You lose!");
                    youLose = true;
                } else if (getTurn() == 'p') {
                    System.out.println(NAME + "Paper");
                    System.out.println("You win!");
                    score++;
                }
                break;
            case 'p':
            case 'P':
                System.out.println("You: Paper");
                if (pc == 'p') {
                    System.out.println(NAME + "Paper");
                    System.out.println("Draw!");
                } else if (pc == 's') {
                    System.out.println(NAME + "Scissor");
                    System.out.println("You lose!");
                    youLose = true;
                } else if (pc == 'r') {
                    System.out.println(NAME + "Rock");
                    System.out.println("You win!");
                    score++;
                } 
                break;
            default:
                System.out.println("Invalid turn!");
                break;
        }
    }

    private static void viewHighScore() {
        File file = new File("rpsScores.txt");
        FileReader fileReader = null;
        try {
            String line = null;
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("\nHigh Scores:");
            List<String> highScores = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                highScores.add(line);
            }
            sort(highScores);
            bufferedReader.close();// Always close files.   
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + file.getAbsolutePath() + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + file.getAbsolutePath() + "'");
        }
    }

    private static void sort(List<String> highScore) {
        int n = highScore.size();
        String[] names = new String[n];
        int[] scores = new int[n];
        String[] arr = new String[2];
        
        for (int i = 0; i < n; i++) {
            arr = highScore.get(i).split(":");//split ':' to get the name and the score
            names[i] = arr[0];
            scores[i] = Integer.parseInt(arr[1]);
        }
        for (int i = 0; i < n - 1; i++) {//bubble sort
            for (int j = 0; j < n - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    //sort scores
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    //arranged names
                    String tmp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {//print the sorted highscores
            System.out.printf("\t%s:\t%d\n", names[i], scores[i]);
        }
    }

    private static char getTurn() {
        char turn = '$';
        Random rand = new Random();
        int num = rand.nextInt(3);
        switch (num) {
            case 0:
                turn = 'r';
                break;
            case 1:
                turn = 'p';
                break;
            case 2:
                turn = 's';
                break;
        }
        return turn;
    }
}