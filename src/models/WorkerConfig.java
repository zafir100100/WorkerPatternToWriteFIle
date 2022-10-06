/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 *
 * @author x
 */
public class WorkerConfig
{
    @JsonProperty("WorkerName") 
    public String workerName;
    @JsonProperty("WorkerPath") 
    public String workerPath;
    @JsonProperty("WorkerArgs") 
    public ArrayList<String> workerArgs;
}
