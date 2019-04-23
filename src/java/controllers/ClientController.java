/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author buddhika
 */
@Named(value = "clientController")
@ApplicationScoped
public class ClientController implements Serializable {

    private String clientName;
    private int clientNumber;
    
    private double height;
    private double weight;
    private double bmi = 0;
    
    public void calculateBmi(){
        
        bmi = weight / (height*height);
    }

    /**
     * Creates a new instance of ClientController
     */
    public ClientController() {
        clientName = "Buddhika";
        clientNumber = 3;
    }
    
    
    public void increaseClientNumber(){
        clientNumber++;
    }

    public String getClientName() {

        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    
    
}
