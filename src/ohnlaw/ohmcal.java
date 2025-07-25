/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ohnlaw;

/**
 *
 * @author 344_12
 */
public class ohmcal {
    public float calvoltage(float current,float resistance){
    
        float voltage = current*resistance;
        return voltage;
    }
    public float calcurrent(float voltage,float resistance){
    
        float current = voltage/resistance;
        return current;
    }
    public float calresistance(float voltage,float current){
    
        float resistance = voltage/current;
        return resistance;
    }
}
