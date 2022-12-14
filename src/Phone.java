import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private  int weight;


    public int getNumber() {
        return number;
    }

   void receiveCall (String name) {
        System.out.println("Звонит " + name + " " + getNumber());
    }

    void receiveCall (String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public Phone (int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone () {
    }

    void sendMessage(int...numbers) {
        System.out.println(Arrays.toString(numbers) + " будет отправлено сообщение");

    }


    public static void main(String[] args) {
        Phone onePhone = new Phone();
        Phone twoPhone = new Phone(2223344, "Apple", 190);
        Phone threePhone = new Phone(3334455, "HONOR");

        onePhone.receiveCall("Василий");
        twoPhone.receiveCall("Анна", 2223344);
        threePhone.receiveCall("Вероника");

        onePhone.sendMessage(1112233);
        twoPhone.sendMessage(55555555, 6666666, 2222222);
        threePhone.sendMessage(4444444, 7778899);

        System.out.println(onePhone);
        System.out.println(twoPhone);
        System.out.println(threePhone);


    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
