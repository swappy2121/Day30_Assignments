package com.bridgelabz;

public class InvoiceSummery {
    public final int numOfRides;
    public final double totalFare;
    public final double averageFare;

    public InvoiceSummery(int numOfRides , double totalFare){
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare/this.numOfRides;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummery that = (InvoiceSummery) o;
        return numOfRides == that.numOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
        Double.compare(that.averageFare, averageFare) == 0;
    }
    }

