package ru.netology.sqr;

public class SQRService {
    public int squareService(int from, int to) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int iScure = i * i;
            if (iScure > to) {
                break;
            }
            if (iScure >= from) {
                if (iScure <= to) {
                    counter++;
                }

            }

        }
        return counter;
    }
}
