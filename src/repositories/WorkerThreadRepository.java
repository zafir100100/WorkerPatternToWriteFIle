/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import models.Worker;

/**
 *
 * @author x
 */
public class WorkerThreadRepository implements Runnable
{

    private final String textLine;
    private final String delay;
    private final ArrayList<Worker> workers;
    private String writingFilePath;

    public WorkerThreadRepository(String textLine, String delay, ArrayList<Worker> workers)
    {
        this.textLine = textLine;
        this.delay = delay;
        this.workers = workers;
    }

    @Override
    public void run()
    {
        try
        {
            String finalString = "\n" + "Worker - " + Thread.currentThread().getName().replace("pool-1-thread-", "") + " - " + textLine + " - " + getDatedTime() + "\n" + "*" + this.delay + " " + "delay" + "*";
            // System.out.println(finalString);
            this.writingFilePath = workers.get(Integer.parseInt(Thread.currentThread().getName().replace("pool-1-thread-", "")) - 1).writingFilePath;
            FileRepository fr = new FileRepository();
            fr.WriteFile(this.writingFilePath, finalString);
            processmessage();//call processmessage method that sleeps the thread for 'x' seconds
        }
        catch (Exception ex)
        {

        }
    }

    public String getDatedTime()
    {
        Calendar calendar = Calendar.getInstance();
        return new SimpleDateFormat("d/MMM/y h:m a").format(calendar.getTime());
    }

    private void processmessage()
    {
        try
        {
            int delayInSeconds = Integer.parseInt(this.delay.replace("s", ""));
            Thread.sleep(delayInSeconds * 1000);
        }
        catch (InterruptedException e)
        {

        }
    }
}
