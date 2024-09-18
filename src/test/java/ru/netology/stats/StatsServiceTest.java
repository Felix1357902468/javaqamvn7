package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
   private org.junit.jupiter.api.Assertions Assertions;

   @Test
    public void testCalculateTotalSale(){
       long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       StatsService service = new StatsService();

      Long actual;
       actual = service.calculateTotalSale(sales);
       Long expected = (long) (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18);

       Assertions.assertEquals(expected, actual);
   }

    @Test
    public void testcalCulateAverageSale(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        Long actual;
        actual = service.calculateAverageSale(sales);
        Long expected = (long) (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) / 12;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testCalculateMonthMaximum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


      Long actual = (long) service.calculateMonthMaximumSale(sales);
        Long expected = 8L;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthMinimum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        Long actual = (long) service.calculateMonthMinimumSale(sales);
        Long expected = 9L;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthsBelowAverage() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        Long actual = (long) service.calculateMonthsBelowAverage(sales);
        Long expected = 5L;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthsAboveAverage() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();


        Long actual = (long) service.calculateMonthsAboveAverage(sales);
        Long expected = 5L;

        Assertions.assertEquals(expected, actual);
    }
}














