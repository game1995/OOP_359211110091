package ooplab7;

public class getSuperCarInfo {

        public static void main(String[] args) {
            SuperCar c1 = new SuperCar();
            c1.setCarBrand("Purche");
            c1.setCarColor("Black");
            c1.setCarEngineSize("5000");
            c1.setContryofOrigin("ITALI");
            c1.setMaxSpeed("344 km/h");
            c1.setSuperCarClass("S");

            System.out.println(c1.getCarBrand());
            System.out.println(c1.getCarColor());
            System.out.println(c1.getCarEngineSize());
            System.out.println(c1.getContryofOrigin());
            System.out.println(c1.getMaxSpeed());
            System.out.println(c1.getSuperCarClass());

        }
    }//class

