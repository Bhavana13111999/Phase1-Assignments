//19th Program//
//Class,Objects and  OOP's Concepts//
package com.Bhavana.sl.PracticeProjects;
class Person
{  
    String name; 
    int age; 
    String color; 
    public Person(String name, 
 int age, String color) 
    { 
        this.name = name; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
   public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ " ,my age is " + this.getAge()+ ", and my color is "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Person p = new Person("Bhavana", 20, "white"); 
        System.out.println(p.toString()); 
    } 
}
//Polymorphism//
class Sum 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 

}
//Inheritance//
class Bicycle  
{ 
    public int gear; 
    public int speed; 
    public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
    }
    public static void main(String args[]) {   
    Sum s = new Sum(); 
    System.out.println(s.sum(10, 20)); 
    System.out.println(s.sum(10, 20, 30)); 
    System.out.println(s.sum(10.5, 20.5)); 
} }
//Encapsulation//
class MountainBike extends Bicycle  
{ 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
}
public class Test1  
{ 
    public static void main(String args[])  
    { 
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString());
    } 
    } 

 class Encapsulate 
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getRoll()  
    { 
       return Roll; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      Roll = newRoll; 
    } 
}
 class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 

}
 //Abstraction//
 abstract class Shape  
 { 
     String color; 
     abstract double area(); 
     public abstract String toString(); 
     public Shape(String color) 
     { 
         System.out.println("Shape constructor called"); 
         this.color = color; 
     } 
     public String getColor() 
     { 
         return color; 
     } 
 } 
 class Circle extends Shape 
 { 
     double radius; 
     public Circle(String color,double radius) 
     { 
         super(color); 
         System.out.println("Circle constructor called"); 
         this.radius = radius; 
     }
     @Override
     double area() 
     { 
         return Math.PI * Math.pow(radius, 2); 
     } 
     @Override
     public String toString() 
     { 
         return "Circle color is " + super.color + "and area is : " + area(); 
     } 
 } 
 class Rectangle extends Shape
 { 
     double length; 
     double width; 
     public Rectangle(String color,double length,double width) 
     { 
         super(color); 
         System.out.println("Rectangle constructor called"); 
         this.length = length; 
         this.width = width; 
     } 
     @Override
     double area() 
     { 
         return length*width; 
     } 
     @Override
     public String toString() 
     { 
         return "Rectangle color is " + super.color +  
                            "and area is : " + area(); 
     } 
 } 
 class Test2 
 { 
     public static void main(String[] args) 
     { 
         Shape s1 = new Circle("Red", 2.2); 
         Shape s2 = new Rectangle("Yellow", 2, 4);
         System.out.println(s1.toString()); 
         System.out.println(s2.toString()); 
     } 
 }
