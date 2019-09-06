package com.example.myexample;

public class HealthStatus {
    private double weight;
    private double height;
    private String status;
    private String lastupdate;

    public HealthStatus() {
        this(65.0, 170.0);
    }

    public HealthStatus(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // getter, setter
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public String getStatus() { return status; }
    public String getLastupdate() { return lastupdate; }
    public void setLastupdate(String lastupdate) { this.lastupdate = lastupdate; }
}
