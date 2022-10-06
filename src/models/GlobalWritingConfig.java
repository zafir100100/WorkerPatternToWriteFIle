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
public class GlobalWritingConfig{
    @JsonProperty("TextLines") 
    public ArrayList<String> textLines;
    @JsonProperty("Delay") 
    public String delay;
}