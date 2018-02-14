/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmongo;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
/**
 *
 * @author TOHX
 */
public class MongoConnect {
     private DB db;
    public DB getConnection() throws Exception {
      //MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://root:root@ds229918.mlab.com:29918/streaming"));
        return db = mongoClient.getDB("streaming");
        //return db = mongo.getDB("clouddb");
    }
}
