
/**
 * Write a description of WordsInFiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;
import java.io.*;

public class WordsInFiles {
    
    private HashMap<String, ArrayList<String>> wordFileMap;
    
    public WordsInFiles(){
        wordFileMap = new HashMap<String, ArrayList<String>>();
        
    }
    
    private void addWordsFromFile(File f){
        FileResource fr = new FileResource(f);
        String currFileName = f.getName();
        for(String word : fr.words()){
            ArrayList<String> fileName = new ArrayList<String>();
            if(wordFileMap.containsKey(word)){
                if(!fileName.contains(currFileName)){
                    fileName.add(currFileName);
                    wordFileMap.put(word,fileName);
                }
            }
            else {
                fileName.add(currFileName);
                wordFileMap.put(word,fileName);
            }
            
        }
        
        System.out.println(wordFileMap);
    }
    
    public void buildWordFileMap(){
        wordFileMap.clear();
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            addWordsFromFile(f);
        }
    }
    
    public int maxNumber(){
        
        return 0;
    }
    
    
    public void tester(){
        
    }
    

}
