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
    public void givenDistanceAndTime_shouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(fare, 5, 0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummery() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        InvoiceSummery summery = invoiceGenerator.calculateFare(rides);
        InvoiceSummery expectedInvoiceSummery = new InvoiceSummery(2, 30.0);
        Assert.assertEquals(summery, expectedInvoiceSummery);
    }

    @Test
    public void givenListOfRides_shouldReturnInvoiceDetails() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1, 1),
                        new Ride (2,2),
                        new Ride (5,3),
                        new Ride(4,1)
        };
        InvoiceSummery rideList = invoiceGenerator.calculateFare(rides);
        InvoiceSummery expectedInvoiceDetails = new InvoiceSummery(5, 146.0);
        Assert.assertEquals(rideList, expectedInvoiceDetails);

    }
}
