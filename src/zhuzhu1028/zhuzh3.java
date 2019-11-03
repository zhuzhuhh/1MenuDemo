package zhuzhu1028;
class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
public class zhuzh3 {
    public static void main(String[] args) {
        Person per1=null;
        Person per2=null;
        per1=new Person();
        per2=new Person();
        per1.name="何雨航";
        per1.age=18;
        per2.name="朱映彤";
        per2.age=18;
        System.out.println("per1对象中的内容-->");
        per1.tell();
        System.out.println("per2中的对象内容是-->");
        per2.tell();
    }
}
