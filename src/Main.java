public class Main {
    public static void main(String[] args) {
      Info info1 = new Worker("Рабочий", 20);
      Info info2 = new Accountant("Бухгалтер", 40);
      Info info3 = new Director("Директор", 25);
      info1.showInfo();
      info2.showInfo();
      info3.showInfo();
    }
}