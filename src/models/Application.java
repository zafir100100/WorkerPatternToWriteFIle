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
public class Application
{
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("Version") 
    public String version;
    @JsonProperty("WorkerConfig") 
    public WorkerConfig workerConfig;
    @JsonProperty("GlobalWritingConfig") 
    public GlobalWritingConfig globalWritingConfig;
    @JsonProperty("Workers") 
    public ArrayList<Worker> workers;
}
