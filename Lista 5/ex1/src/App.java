public class App {
    public static void main(String[] args) throws Exception {
        
        People people = new People(23, "pedro");

        System.out.println("Mudar nome: ");

        people.setName("João");
        people.setAge(32);

        System.out.println("Novo nome: " + people.getName());
        System.out.println("Nova idade: " + people.getAge());
        
        
    }
}
