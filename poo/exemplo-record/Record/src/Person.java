public record Person(String name, int age) {

    /*public static String name;*/

    /*public String name(){
        return "";
    }*/

    public Person{
    }

    public Person(String name){
        this(name, 13);
    }

    public String getInfo(){
        return "Name: " + name + ", Age: " + age;
    }

}
