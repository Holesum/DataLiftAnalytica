package com.example.dataliftanalytica.Models;

public class MExcer {
    //name of excercize i.e.:flat bench press
    private String name;
    //array of the sets within the excercize
    private MSet sets[] = new MSet[10];
    //number of sets in the excercize
    private int numSets = sets.length;

    public MExcer(){
        name = "";
    }
    public MExcer(String Name){
        name = Name;
    }
    public void addSet(int numReps, int weightAmount){
        MSet toAdd = new MSet(numReps,weightAmount);
        sets[numSets] = toAdd;

    }
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
    public MSet[] getSets(){
        return sets;
    }
    public int getNumSets(){
        return numSets;
    }

}
