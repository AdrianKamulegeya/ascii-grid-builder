package com.company;

import static org.junit.Assert.*;

public class GridTest {

    private static int testHeight = 1;
    private static int testWidth = 12;


    @org.junit.Test
    public void testNoOfCorners() throws Exception {
        Grid tester = new Grid();
        int expectedValue = 0;
        tester.createGrid(testHeight,testWidth);

        if(testHeight == 1 && testWidth == 1) {
            expectedValue = 1;
        }else if((testHeight == 1 && testWidth > 1) || (testHeight > 1 && testWidth == 1)){
            expectedValue = 2;
        }else if(testHeight > 1 && testWidth > 1){
            expectedValue = 4;
        }

        assertEquals(expectedValue,tester.getNoOfCorners());

    }

    @org.junit.Test
    public void testNoOfVerticalLines() throws Exception {
        Grid tester = new Grid();
        int expectedValue = 0;
        tester.createGrid(testHeight,testWidth);

        if(testWidth == 1){
            expectedValue = testHeight - 2;
        }else if(testWidth > 1){
            expectedValue = (testHeight - 2) * 2;
        }

        assertEquals(Math.max(0,expectedValue),tester.getNoOfVerticalLines());

    }
    @org.junit.Test
    public void testNoOfHorizontalLines() throws Exception {
        Grid tester = new Grid();
        int expectedValue = 0;
        tester.createGrid(testHeight,testWidth);

        if(testHeight == 1){
            expectedValue = testWidth - 2;
        }else if(testHeight > 1){
            expectedValue = (testWidth - 2) * 2;
        }


        assertEquals(Math.max(0,expectedValue),tester.getNoOfHorizontalLines());

    }


}
