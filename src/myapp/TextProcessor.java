package src.myapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TextProcessor {

    public static void main(String[] args) throws IOException{
        
        Path p = Paths.get(args[0]);
        File f = p.toFile();

        Map<String, Integer> wordFreq = new HashMap<>();

        // Open a file as input stream
        InputStream is = new FileInputStream(f);

        // Convert input stream to a reader byte -> char (2 bytes)
        InputStreamReader isr = new InputStreamReader(is);

        // 
        BufferedReader br = new BufferedReader(isr);
        String line;
        int numWords = 0;
        while ((line = br.readLine()) != null){
            System.out.printf("> %s\n", line.toUpperCase());
            String[] words = line.split(" ");
            numWords += words.length;
            // Iterate all the words in line
            for (String w: words){
                String t = w.trim().toLowerCase();
                if (t.length() <= 0){
                    continue;
                }
                if (!wordFreq.containsKey(t)){
                    // if word not in map, initialise the word with freq 1
                    wordFreq.put(t,1);
                } else {
                    // if word is in map, increase freq count by 1
                    int c = wordFreq.get(t);
                    wordFreq.put(t, c + 1);
                }
            }
        }

        // Get a list of all the words
        Set<String> words = wordFreq.keySet();
        for (String w: words){
            int count = wordFreq.get(w);
            System.out.printf(": %s = %d\n", w, count);
        }

        System.out.printf("Number of words: %d\n", numWords);
        System.out.printf("Number of unique words: %d\n", words.size());
        

        br.close();
        isr.close();
        is.close();
    }
    
}
