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
public class Worker
{
    @JsonProperty("Name") 
    public String name;
    @JsonProperty("InternalTextLines") 
    public ArrayList<String> internalTextLines;
    @JsonProperty("WritingFilePath") 
    public String writingFilePath;
}
