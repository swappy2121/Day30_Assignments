package com.bridgelabz;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoiceServiceTest {


    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(fare, 25, 0.0);
    }
        @Test
        public void givenDistanceAndTime_shouldReturnMinFare () {
            InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
            double distance = 0.1;
            int time = 1;
            double fare = invoiceGenerator.calculateFare(distance, time);
            Assert.assertEquals(fare, 5, 0.0);
        }
    @Test
    public void givenMultipleRides_shouldReturnTotalFare () {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(fare, 30, 0.0);
    }

    }

