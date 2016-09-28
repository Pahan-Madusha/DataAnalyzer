package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pahan
 */
public class DataReader 
{
    static String read;
    public DataReader()
    {
        init();
    }   
    
    public void init()
    {
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader("/home/pahan/file2.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            read = sb.toString();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }   
    
    public ArrayList<Double> getData()
    {
        String[] dataStr = read.split(",");
        ArrayList<Double> list = new ArrayList<Double>();
        
        for(int i = 0; i<dataStr.length; i++)
            list.add(Double.parseDouble(dataStr[i]));
        
        return list;
    }        
}
