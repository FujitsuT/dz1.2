public class Accountant implements Info{
    String jobTitle;
    int age;

    public Accountant(String jobTitle, int age) {
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Мне "+age+" лет и я занимаю должность: "+jobTitle);
    }
}
