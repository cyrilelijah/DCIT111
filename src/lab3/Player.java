
package lab3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author cyrilelijahaurino
 */
public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
    
    public void saveScore() throws IOException{
        Path path = Paths.get("rpsScores.txt");
        File file = new File(path.toString());
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(name + ":" + score);
            bw.newLine();
            System.out.println("Successfully saved!");
            bw.close();
        } catch (IOException ex) {
            System.out.println("Unable to write file '" + file.getAbsolutePath() + "'");
        } finally {
            fileWriter.close();
        }
    }
}
