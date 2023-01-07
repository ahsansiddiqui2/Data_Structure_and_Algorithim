class Question6{
    public static void main(String[] args) {
        Vehicle rikshaw = new Vehicle();
        Vehicle bike = new Vehicle();
        rikshaw.accelerate();
        rikshaw.accelerate();
        rikshaw.accelerate();
        rikshaw.accelerate();
        rikshaw.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        rikshaw.Display();
        bike.Display();
        rikshaw.brake();
        rikshaw.brake();
        bike.brake();
        bike.brake();
        rikshaw.Display();
        bike.Display();
    }
}
class Vehicle{
    int year;
    String manufacturer;
    int speed;
    Vehicle(){
        year = 0;
        manufacturer = " ";
        speed = 0;

    }
    public void accelerate(){
        speed+=5;
    }
    public void brake(){
        speed-=5;
    }
    public void Display(){
        System.out.println("Year : "+year);
        System.out.println("Manufacturer : "+ manufacturer);
        System.out.println("Speed : "+speed);
    }



}