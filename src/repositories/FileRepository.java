/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import models.Root;

/**
 *
 * @author x
 */
public class FileRepository
{

    public Root ReadConfig()
    {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            Root root = mapper.readValue(new File("asset/ServerWorkerConfig.json"), Root.class);
            return root;
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public void WriteFile(String filePath, String fileContent)
    {
        try
        {
            FileWriter fw = new FileWriter(filePath, true);
            fw.write(fileContent);
            fw.close();
        }
        catch (Exception ex)
        {
            System.out.println("Something happened");
            System.out.println(ex.getMessage());
        }
    }
}
