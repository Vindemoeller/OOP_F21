package session8.e_iterator;

public class Demo {

    public static void main(String[] args) {

        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");

        SolarSystem solarSystem = new SolarSystem(venus,earth,mars);

        for (Planet system: solarSystem){
            System.out.println(system);
        }

    }

}
