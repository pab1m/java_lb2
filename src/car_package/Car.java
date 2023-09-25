package car_package;

public class Car {

    private int id;
    private String model;
    private int year;
    private int price;
    private int registration_Num;

    public Car(int id, String model, int year, int price, int registration_Num) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registration_Num = registration_Num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistration_Num(int registration_Num) {
        this.registration_Num = registration_Num;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Модель: " + model +
                ", Рік випуску: " + year +
                ", Ціна: " + price +
                ", Реєстраційний номер: " + registration_Num;
    }
}
