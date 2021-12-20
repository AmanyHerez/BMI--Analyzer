package com.example.bmi_analyzer;

public class BMIRecord {
    String date;
    int weight;
    String message;
    int length;

    public BMIRecord(String date, int weight, String message, int length) {
        this.date = date;
        this.weight = weight;
        this.message = message;
        this.length = length;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getLength() {
        return length;

    }
    public void setLength(int length) {
        this.length = length;
    }
}
