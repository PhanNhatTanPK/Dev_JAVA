/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Phan Nhat Tan
 */
public class Database {
    private String dbname;
    private static Database db;
    
    private Database() {}
    
    public static Database getDB()
    {
        if (db == null) 
            db = new Database();
        return db;

    }
    
    public void connect() {}
    
    public void add(){}
    
    public void remove(){}
    
    public void modify(){}
}
