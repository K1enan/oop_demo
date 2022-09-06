package oop_exercises.ex1;

public class Car {

    private int id;
    private int year;
    private String model;
    private String colour;
    private double motorSize;

    public static void drive (String model, double motorSize) {

        System.out.println(model  + " with motor " + motorSize + " can drive now. ");
    }

  /*  // another example.
  public Car(String m, int y, String c) {
     this.model = m;
     this.year = y;
     this.colour = c;
        System.out.println(" A new Car");
    }
    public Car() {

        model = "BMW";
        year = 2000;
        colour = "red";
        System.out.println("a new car");
    }

    // setters
    public void setModel(String m) {
        model = m;
    }
    public void setYear(int y) {

        year = y;
    }
    public void setCollar(String c) {

        colour = c;
    }

    // getters

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCollar() {
        return colour;
    }

    // just print method
    public void printData (){

        System.out.println(model);
        System.out.println(year);
        System.out.println(colour);

    }

   */

}

