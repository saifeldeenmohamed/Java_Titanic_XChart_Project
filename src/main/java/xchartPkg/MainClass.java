/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xchartPkg;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    public static void main(String[] args) throws IOException{
        
        List<TitanicPassenger> passengersDataset = new ReadingJsonFile().getPassengersFromJsonFile();
        
        // the 4 graphing methods
        Graphing.graphPassengerAges(passengersDataset);
        Graphing.graphPassengerClass(passengersDataset);
        Graphing.graphPassengerSurvived(passengersDataset);
        Graphing.graphPassengerSurvivedGender(passengersDataset);
    }
}
