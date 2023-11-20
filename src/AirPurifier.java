public class AirPurifier {
    String make; //instance variable
    String model; //instance variable
    boolean power; //instance variable
    void turnOn(){power = true;} //instance method
    void turnOff(){power = false;} //instance method
    String getAirQuality(int pmLevel){ //instance method
        if(pmLevel >= 0 && pmLevel <= 50) return "คุณภาพอากาศดี";
        else if(pmLevel >= 51 && pmLevel <= 100) return "คุณภาพอากาศปานกลาง";
        else if(pmLevel >= 101 && pmLevel <= 300) return "มีผลกระทบต่อสุขภาพ";
        else return "อันตรายอย่างมาก";
    }

    void setMode(String airQuality){
        if(airQuality.equals("คุณภาพอากาศดี") || airQuality.equals("คุณภาพอากาศปานกลาง")) System.out.println("Sleep Mode");
        else if (airQuality.equals("มีผลกระทบต่อสุขภาพ")) System.out.println("Auto Mode");
        else System.out.println("Manual Mode");
    }

    static int makeCount = 3; //class variable นับจำนวนยี่ห้อที่ผลิตออกมา
    static String partOfMostOrder = "Northern part of Thailand"; //class variable
    static String mostPopularMake() { //class method
        return "Xiaomi";
    }
    static String mostPopularmodel(String make){ //class method
        if(make.equalsIgnoreCase("xiaomi")) return "Pro";
        else if(make.equalsIgnoreCase("simplus")) return "Smart";
        else if(make.equalsIgnoreCase("dyson")) return "PH03";
        else return "404 not found";
    }
    AirPurifier(String make, String model){ //constructor
        this.make = make;
        this.model = model;
    }
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("Simplus","Pro");
        System.out.println(a.getAirQuality(30));
        a.setMode(a.getAirQuality(30));
        System.out.println(AirPurifier.mostPopularmodel("DYSON"));
    }
}
