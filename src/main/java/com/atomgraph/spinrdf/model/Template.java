/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atomgraph.spinrdf.model;

import java.util.List;
import java.util.Map;
import org.apache.jena.rdf.model.Resource;

/**
 *
 * @author Martynas Jusevičius <martynas@atomgraph.com>
 */
public interface Template extends Resource
{
    
    List<Argument> getArguments(boolean ordered);
    
    Map<String, Argument> getArgumentsMap();
    
    Query getBody();
    
}