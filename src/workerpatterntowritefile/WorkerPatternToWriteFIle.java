package workerpatterntowritefile;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import models.Root;
import repositories.FileRepository;
import repositories.WorkerThreadRepository;

public class WorkerPatternToWriteFIle
{

    public static void main(String[] args)
    {
        FileRepository fr = new FileRepository();
        //read config
        Root root = fr.ReadConfig();
        if (root != null)
        {
            // count task
            if (root.application != null && root.application.workers != null && root.application.workers.size() > 0)
            {
                //creating a pool of 3 threads (workers)
                ExecutorService executor = Executors.newFixedThreadPool(root.application.workers.size());
                if (root.application.globalWritingConfig != null && root.application.globalWritingConfig.textLines.size() > 0)
                {
                    // getting all the jobs for workers
                    ArrayList<String> myTextLines = root.application.globalWritingConfig.textLines;
                    int myTotalTextLines = root.application.globalWritingConfig.textLines.size();
                    for (int i = 1; i <= myTotalTextLines; i++)
                    {
                        // sending job to worker
                        Runnable worker = new WorkerThreadRepository(myTextLines.get(i - 1), root.application.globalWritingConfig.delay, root.application.workers);
                        executor.execute(worker);//calling execute method of ExecutorService  
                    }
                    executor.shutdown();
                    while (!executor.isTerminated())
                    {

                    }
                }
            }
        }
    }

}
