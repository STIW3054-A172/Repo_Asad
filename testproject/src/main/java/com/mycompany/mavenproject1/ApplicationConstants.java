/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class ApplicationConstants {
 
    // Twitter application specific secret constants.   
    public static final String CONSUMER_KEY_KEY = "K2gUouDEN2oS5wk1oWmly1IEA";
    public static final String CONSUMER_SECRET_KEY = "fvXkxbP7ao9zgRbiMZebUCwz5aY3uc1p7xpDbHvGh2rcGmgNid";
    public static final String ACCESS_TOKEN_KEY = "434039210-iY0myfmXVSOivGCc6QL8MimL1raZcFCs59ihMPaV";
    public static final String ACCESS_TOKEN_SECRET_KEY = "jEL9epBXGsnpWREeMO7u3rpYUEikr2gfUGSpsekHDFBuY";
 
    // constants
    public static final String NOT_AVAILABLE = "Not Available";
    public static final String EMPTY = "";
 
    // Topology Constants 
    public static final String TOPOLOGY_NAME = "twitter-topology";
    public static final String TWITTER_SPOUT_ID = "twitterSpout";
    public static final String DETAILS_BOLT_ID = "detailsExtractorBolt";
    public static final String RETWEET_DETAILS_BOLT_ID = "retweetDetailsExtractorBolt";
    public static final String FILE_WRITER_BOLT_ID = "fileWriterBolt";
}