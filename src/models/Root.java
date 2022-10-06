/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author x
 */
public class Root
{
    @JsonProperty("Application") 
    public Application application;
}
