package com.bridgelabz;

public  class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;
    public double distance;
    public int time;

    public double calculateFare(double distance, int time) {


        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        }else{
            return totalFare;
        }
    }


    public InvoiceSummery calculateFare(Ride[] rides) {
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare += this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummery(rides.length , totalFare);
    }

     }


