import java.util.TreeSet;
import java.util.HashSet;

public class Chocolates{
    public static void main(String[] args){
        TreeSet<String> choco = new TreeSet<>();
        System.out.println("My Empty Set:"+choco);
        choco.add("Kit kat");
        choco.add("Wafer biscuit");
        choco.add("Silk oreo");
        choco.add("hazelnut");
        choco.add("fruit nut");
        // gods.add(null);
        // gods.add(null);
        
        
        
        System.out.println("My Empty Set after adding:"+choco);
        for(String new1: choco ){
            System.out.println("My  Empty Set using for loop:"+new1);
        }
    }
}
