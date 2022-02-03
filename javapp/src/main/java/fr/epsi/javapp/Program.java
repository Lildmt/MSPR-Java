package fr.epsi.javapp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {



    public static void main(String[] args)
    {
        List<String> toutesMesLigne = getFileLines("C:\\Users\\tasoe\\Desktop\\doc.txt");
    }
    
   static List<String> getFileLines(String fileNames) throws IOException
    {
        List<String> fileLines = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileNames)))
        {
            for (String currentLine = reader.readLine(); //avant toute chose, je lit la première ligne
            currentLine !=null; //suis-je à la fin du fichier
            currentLine = reader.readLine() ) //A la fin des instructions je récupère la ligne suivante
            {
                if (!currentLine.equals(""))//je ne stocke pas les lignes vides....
                {                                       
                    fileLines.add(currentLine);
                }
            }
        }
        return fileLines;
    }
}
