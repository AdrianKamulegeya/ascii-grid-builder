package com.company;

public class Grid {

    private int noOfCorners;
    private int noOfHorizontalLines;
    private int noOfVerticalLines;

    public Grid(){
        noOfCorners = 0;
        noOfHorizontalLines = 0;
        noOfVerticalLines = 0;
    }

    public  void createGrid(int height, int width){
        for(int i = 0; i < height; i++){

            for(int j = 0; j < width; j++){
                //add lines to the top of the box
                if(i==0){
                    if(j==0){
                        System.out.print("┏");
                        noOfCorners++;
                    }else if (j==width - 1){
                        System.out.println("┓");
                        noOfCorners++;
                    }else{
                        System.out.print(" - ");
                        noOfHorizontalLines++;
                    }
                    //add lines to the bottom of the box
                }else if(i==height-1){
                    if(j==0){
                        System.out.print("┗");
                        noOfCorners++;
                    }else if (j==width - 1){
                        System.out.println("┛");
                        noOfCorners++;
                    }else{
                        System.out.print(" - ");
                        noOfHorizontalLines++;
                    }
                }else{
                    //add lines to the sides of the box
                    if(j==0){
                        System.out.print("|");
                        noOfVerticalLines++;
                    }else if (j==width-1){
                        System.out.println("|");
                        noOfVerticalLines++;
                    }
                    else{   //if there's no lines to add we add a blank space
                        System.out.print("   ");
                    }
                }
            }
            //if we have a 1x4 box it will show just the left side of the box
            if(width==1){
                System.out.println();
            }
        }
    }

    public int getNoOfCorners() {
        return noOfCorners;
    }

    public int getNoOfHorizontalLines() {
        return noOfHorizontalLines;
    }

    public int getNoOfVerticalLines() {
        return noOfVerticalLines;
    }
}
