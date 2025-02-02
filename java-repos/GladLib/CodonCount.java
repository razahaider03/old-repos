
/**
 * Write a description of CodonCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import edu.duke.*;

public class CodonCount {
    
    private HashMap<String, Integer> codonMap; 
    
    public CodonCount(){
        codonMap = new HashMap<String, Integer>();
        
    }
    
    public void buildCodonMap(int start, String dna){
        codonMap.clear();
        int counter = 0;
        for(int i=start; i+3<dna.length();i=i+3){
            String codons = dna.substring(i,i+3);
            if(codonMap.containsKey(codons)){
                   int value = codonMap.get(codons);
                   codonMap.put(codons,value+1);
            } else
            {
                codonMap.put(codons,1);
            }
        }
        System.out.println(codonMap);
    }
    
    public void getMostCommonCodon(){
        int largestSoFar = 0;
        String commonCodon = null;
        for(String s : codonMap.keySet()){
            if(codonMap.get(s) > largestSoFar){
                largestSoFar =  codonMap.get(s); 
                commonCodon = s;
            }
        }
        System.out.println("Common Codon= "  + commonCodon 
                            +"\t" +codonMap.get(commonCodon));
    }
    
    public void printCodonCounts(int start, int end){
        for(String s : codonMap.keySet()){
            if(codonMap.get(s) >= start && codonMap.get(s) <= end){
                System.out.println(s + "\t"+ codonMap.get(s));
            }
        }
        
    }
    
    public void tester(){
        FileResource fr = new FileResource();
        String word = fr.asString().toUpperCase();
        buildCodonMap(0,word);
        getMostCommonCodon();
        printCodonCounts(1,5);
        buildCodonMap(1,word);
        getMostCommonCodon();
        printCodonCounts(1,5);
        buildCodonMap(2,word);
        getMostCommonCodon();
        printCodonCounts(1,5);
        
        
    }

}
