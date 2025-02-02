
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.*;


public class fileChoser { 

    public Path filePath;
    
    public fileChoser(){

        JFileChooser j = new JFileChooser();
        j.setMultiSelectionEnabled(false);
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            filePath = j.getSelectedFile().toPath();
        }

    }


public Path chooseDir()
    {
        Path dirPath = null;
                
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser();
 
            // set the selection mode to directories only
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 
            // invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION) {
                // set the label to the path of the selected directory
                dirPath = j.getSelectedFile().toPath();
                
            }
            return dirPath;
    }

// public Path chooseFile()
//     {
//         Path file = null;
//         JFileChooser j = new JFileChooser();
//         j.setMultiSelectionEnabled(false);
//         j.setFileSelectionMode(JFileChooser.FILES_ONLY);
//         int r = j.showOpenDialog(null);
//         if (r == JFileChooser.APPROVE_OPTION) {
//             return  file = j.getSelectedFile().toPath();
//         }
//         return file;
//     }

public String asString() throws IOException
    {
    String str = Files.readString(filePath);
    return str;
    }
}

class filesChoser{

    public Path filePath[];

    public filesChoser(){

            int k = 0;
            File [] files = null;
        
            JFileChooser j = new JFileChooser();
            j.setMultiSelectionEnabled(true);
            int r = j.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                files = j.getSelectedFiles();
            }
            for (File file : files) {
                System.out.println(file.toPath());
                filePath [k] = file.toPath();
                k++;
                // System.out.println(filePath [k]);
            }
    }

    public String asString() throws IOException
    {
        String string = "";
        for (Path path : filePath) {
            String str = Files.readString(path);
            string = string + str;
        }
        return string;
    }


}
