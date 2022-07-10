public class Director implements Info{
    String jobTitle;
    int age;

    public Director(String jobTitle, int age) {
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Мне "+age+" лет и я занимаю должность: "+jobTitle);
    }
}
