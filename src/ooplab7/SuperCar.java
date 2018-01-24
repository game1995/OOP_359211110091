package ooplab7;

public class SuperCar {
    private String CarBrand;
    private String CarColor;
    private String CarEngineSize;
    private String MaxSpeed;
    private String ContryofOrigin;
    private String SuperCarClass;

    public SuperCar (){}

    public SuperCar (String cb,String cc,String ce,String ms,String cto,String scc){
        this.CarBrand = cb;
        this.CarColor = cc;
        this.CarEngineSize = ce;
        this.MaxSpeed = ms;
        this.ContryofOrigin = cto;
        this.SuperCarClass = scc;

    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize='" + CarEngineSize + '\'' +
                ", MaxSpeed='" + MaxSpeed + '\'' +
                ", ContryofOrigin='" + ContryofOrigin + '\'' +
                ", SuperCarClass='" + SuperCarClass + '\'' +
                '}';
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarEngineSize() {
        return CarEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        CarEngineSize = carEngineSize;
    }

    public String getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getContryofOrigin() {
        return ContryofOrigin;
    }

    public void setContryofOrigin(String contryofOrigin) {
        ContryofOrigin = contryofOrigin;
    }

    public String getSuperCarClass() {
        return SuperCarClass;
    }

    public void setSuperCarClass(String superCarClass) {
        SuperCarClass = superCarClass;
    }
}//class
