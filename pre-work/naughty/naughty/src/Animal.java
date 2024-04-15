public class Animal {
    String bioClass;
    String phylum;
    String race;
    int x;

    public Animal(String Aclass, String Aphylum, String Arace, int Ax){
        bioClass = Aclass;
        phylum = Aphylum;
        race = Arace;
        x = Ax;
    }

    public void start(){
        System.out.println("I am starting!");
    }
}
