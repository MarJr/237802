package Issue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountingIssue {

    private final String keyword = "public static void main";
    private String pathFile = "";
    private int countIssue;

    public int calIssue(final File folder, String[] ext) {

        int noIssue = 0;
        for (int i = 0; i < ext.length; i++) {
            pathFile = folder + "\\" + ext[i];

            try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains(keyword)) {
                        noIssue++;
                    }
                }
            } catch (IOException e) {

            }
        }
        setIssue(noIssue);
        return countIssue;
    }

    public void setIssue(int count) {
        countIssue = count;
    }

    public int getIssue() {
        return countIssue;
    }
}
