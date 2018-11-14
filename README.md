# ascii-grid-builder

The ascii grid builder is a program built in Java that contains a method that will build a grid out of ascii characters based on a given height and width.

# Features

 - Creates ascii grid
 - Can output number of corners, horizontal edges and vertical lines
 - Comes complete with tests using the JUnit library
 
 # Pre-requisites
  
  - Must have the Java SDK installed
  - Must have Java Runtime Environment on your PC
  - Must have junit-4.12.jar installed or later
  - Must have hamcrest-core-1.3.jar installed
  
  # Basic Usage

You must first make an instance of the Grid class which contains the method createGrid(). 

This takes two variables (int: height, int: width.)

```java
Grid grid = new Grid();
grid.createGrid(4,4);
```

In the main class there is example code that will ask the user to enter a number for the width and height and will only accept if the result is above 0.

```console
Enter width: 0
Enter height: 0

Please enter a value above 0

Enter width: 3
Enter height: 4

┏ - ┓
|   |
|   |
┗ - ┛

```
 
 # Testing
 
 The GridTest class comes with 3 different methods to see if the result is as expected: testNoOfCorners(), testNoOfVerticalLines() and testNoOfHorizontalLines()
 
 You can simply run the class and change the test variables to see if it works in all cases.
  
