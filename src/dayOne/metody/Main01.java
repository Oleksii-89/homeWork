package dayOne.metody;

public class Main01 {
    public static double dogAge(double dogAge){
        double age;
        if(dogAge < 2){
            age = dogAge * 10.5;
        } else {
            age = ((dogAge - 2) * 4 + 21);
        }
        return age;
    }
}
