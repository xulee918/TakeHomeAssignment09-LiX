package android.example.firebase2;

public class Pokemon {

    private String name;
    private int age;
    private boolean evolved;

    public Pokemon(){}

    public Pokemon(String name, int age, boolean evolved){
        this.name=name;
        this.age=age;
        this.evolved=evolved;
    }

    public String getName(){return name;}
    public int getAge(){return age;};
    public boolean evolved(){return evolved;}
}
