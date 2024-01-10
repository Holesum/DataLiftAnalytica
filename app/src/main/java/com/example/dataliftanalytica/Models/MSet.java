package com.example.dataliftanalytica.Models;

public class MSet {
    private int reps;
    private float weight;

    public MSet() {
        reps = 0;
        weight = 0;
    }
    public MSet(int repCount, float weightValue) {
        reps = repCount;
        weight = weightValue;
    }
    public void setReps(int numReps){
        reps = numReps;
    }
    public void setWeight(float weightAmount){
        weight = weightAmount;
    }
    public int getReps(){
        return reps;
    }
    public float getWeight(){
        return weight;
    }
}
