class ikan {
    public void swim(){
        System.out.println("Ikan bisa berenang");
    }    
}
class piranha extends ikan {
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}
public class fish {
    public static void main(String[] args) {
        ikan a = new ikan();
        ikan b = new piranha();
        a.swim();
        b.swim();
    }
}