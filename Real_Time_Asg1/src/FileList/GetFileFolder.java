package FileList;

import Issue.CountingIssue;
import java.io.File;
import java.util.LinkedList;

public class GetFileFolder {

    public CountingIssue iss = new CountingIssue();
    private LinkedList<String> listFile = new LinkedList();
    private String allList = "";

    public GetFileFolder() {

    }

    public GetFileFolder(String path) {

        final File folder = new File(path);
        listFolderFile(folder);

    }

    public void listFolderFile(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                this.listFolderFile(fileEntry);
            } else {
                String list[] = {fileEntry.getName()};
                for (int i = 0; i < list.length; i++) {
                    addFile(list[i]);
                }
            }
        }
        iss.calIssue(folder, getFileList());
    }

    public void addFile(String fileExt) {
        if (javaExt(fileExt)) {
            listFile.add(fileExt);
        }
    }

    public boolean javaExt(String ext) {
        if (ext.substring(ext.length() - 4).equalsIgnoreCase("Java")) {
            return true;
        }
        return false;
    }

    public String[] getFileList() {
        String arrayFile[] = new String[listFile.size()];

        for (int i = 0; i < listFile.size(); i++) {
            arrayFile[i] = listFile.get(i);
        }
        return arrayFile;
    }

    public String dispFile() {

        for (int i = 0; i < listFile.size(); i++) {
            allList += listFile.get(i);
        }
        return allList;
    }

    public int numberFile() {
        int noFile = listFile.size();
        return noFile;
    }
}
