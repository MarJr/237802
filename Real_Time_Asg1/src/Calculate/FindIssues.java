package Calculate;

import FileList.GetFileFolder;
import Issue.CountingIssue;

public class FindIssues {

    static GetFileFolder folder;
    static CountingIssue countingIssue = new CountingIssue();
    static final String Path= "C:\\Users\\Mar Jr\\Documents\\NetBeansProjects\\File";

    public static void main(String[] args) {

        folder = new GetFileFolder(Path);
        int numberOfFile = folder.numberFile();
        int numberOfIssue = folder.iss.getIssue();
        
        System.out.println("Number of Java Files = " + numberOfFile);
        System.out.println("Number of Issue = " + numberOfIssue);
    }
}
