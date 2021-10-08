package com.company;
class box
{
    int height;
    int width;
    int depth;
    box(int height, int width, int depth)     //3args constructor
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    box(int height, int width)    //2 args constructor
    {
        this.height = height;
        this.width = width;
        this.depth = 1;         //default value
    }
    void volume()
    {
        System.out.println("Volume of the Box : " + (height * width * depth) );
    }
}

class box_new extends box
{
    int weight;
    box_new(int height, int width, int depth, int weight)
    {
        super(height, width, depth);     //parent 3 Args constructor access
        this.weight = weight;
    }
    box_new(int height, int width, int weight)
    {
        super(height, width);    //parent 2 Args constructor access
        this.weight = weight;
    }
    void volume()
    {
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
        System.out.println("Weight : " + weight);
        super.volume(); //accessing the method of parent class
    }
}
public class Main {

    public static void main(String[] args) {
        box_new first = new box_new(10,9,8,7);//will invoke 4-arg constructor
        first.volume();

        System.out.println("\n------------------\n");
        box_new second = new box_new(10,9,7);     //will invoke 3-arg constructor
        second.volume();
    }
}
