package com.company;

import static org.junit.Assert.*;

public class GridTest {

    private static int testHeight = 12;
    private static int testWidth = 0;


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

        tester.createGrid(testHeight,testWidth);

        assertEquals(Math.max(0,(testHeight-2)*2),tester.getNoOfVerticalLines());

    }
    @org.junit.Test
    public void testNoOfHorizontalLines() throws Exception {
        Grid tester = new Grid();

        tester.createGrid(testHeight,testWidth);
        assertEquals(Math.max(0,(testWidth-2)*2),tester.getNoOfHorizontalLines());

    }


}
