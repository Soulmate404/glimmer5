
//文字性的回答我单独写了一个markdown
//文字性的回答我单独写了一个markdown
//文字性的回答我单独写了一个markdown
public class Main {
    public static void main(String[] args) {
        Person a=new Person("1",2,3);
        Person copy=new Person(a);
        copy.eat();
        copy.introduce();
        Person.delete(a);
        System.out.println(Person.getCount());
    }
}
