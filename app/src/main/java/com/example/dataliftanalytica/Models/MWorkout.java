package com.example.dataliftanalytica.Models;

public class MWorkout {
    private MExcer excercises[] = new MExcer[15];
    private int numExcercises = excercises.length;
    private String dateTime;
    //date and time of the workout, will need to utilize java API for this, likely format 00-00-0000 M-D-Y Min:Sec
    public MWorkout(){
        dateTime = "";
    }
    //when acquiring date and time of workout convert to prior mentioned format for ease of use
    public MWorkout(String date){
        dateTime = date;
    }
    public void addExcercise(MExcer excercise){
        excercises[numExcercises] = excercise;
    }
    public MExcer[] getExcercises(){
        return excercises;
    }
    public int getNumExcercises(){
        return numExcercises;
    }
    public String getDateNTime(){
        return dateTime;
    }
}
