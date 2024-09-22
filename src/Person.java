
//文字性的回答我单独写了一个markdown
//文字性的回答我单独写了一个markdown
//文字性的回答我单独写了一个markdown
public class Person {
    private String name;
    private int age;
    private  int sex;
    public static int count=0;//count用于计数
    void eat() {
        System.out.println(name+"正在吃东西");
    }

    private void sleep() {

    }

    private void dadoudou() {

    }

    public Person(String name,int age,int sex)//用构造方法创建对象
    {
        this.age=age;
        this.name=name;
        this.sex=sex;
        count++;//计数
    }
    public Person(Person copy)//进行复制
    {
        this.age=copy.age;
        this.name=copy.name;
        this.sex=copy.sex;
        count++;//计数
    }
    public  void introduce(){
        System.out.println("我叫"+name+",今年"+age+"岁");//实验一下是否复制成功
    }

    public static int getCount()//返回对象数量
    {
        return count;
    }
    public static void delete(Person a){
        a.name=null;
        a.sex=0;
        a.age=0;
        count--;//删除对象时计数
        /*
        * 关于对对象的删除我网上找了好久，但大多不是看不懂就是没用所以就写了这么个方法，理论上垃圾回收器会对空值的对象进行回收
        * 但我试了好多次，不太行，只好先这样了
        * 如果学长有空的话还是能不能给点指导？*/
    }

}

