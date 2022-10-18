package oops3Abstract_Interface1;

public class UseSportsCar {
	public static void main(String[] args) {
		
		SportsCar c=new SportsCar();
		c.brand="nissan";
		c.color="black";
		System.out.println("Car Name : "+c.brand+"\n"+"color : "+c.color+"\n"+"Mileage : "+c.getMileage(60)+"\n"+"Engine cc : "+c.showEngine(250)+"\n"+"Speed : "+c.showSpeed(250));
	}

}
