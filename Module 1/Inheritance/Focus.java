package Inheritance;

public class Focus extends Car{
    
    public Focus(){
        super();
        setMake("Ford");
        setModel("Focus");
        setType("Automatic");
        setTireSize("P215/55R16");
        setYear(2012);
    }

    public void drive(){
        System.out.println("Clank! Sssstttt brrrrr... puff");
    }
    public void park(){
        System.out.println("You parked inside the lines!");
    }
}
