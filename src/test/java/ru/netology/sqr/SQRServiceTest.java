package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldServuise() {
        SQRService service = new SQRService();

        int actual = service.squareService(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNegativeRange() {
        SQRService service = new SQRService();


        int actual = service.squareService(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudInTheRangeRange() {
        SQRService service = new SQRService();


        int actual = service.squareService(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudTheRangeRange() {
        SQRService service = new SQRService();


        int actual = service.squareService(1, 1000);
        int expected = 22;

        Assertions.assertEquals(expected, actual);

    }


}
