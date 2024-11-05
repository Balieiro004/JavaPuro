import model.FileSystemItem;
import model.Folder;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FileSystemItem file1 = new model.File("File1.txt");
        FileSystemItem file2 = new model.File("File2.txt");
        FileSystemItem file3 = new model.File("File3.txt");
        FileSystemItem file4 = new model.File("File4.txt");

        FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
        FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

        folder.print("");
    }
}