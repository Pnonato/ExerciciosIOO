
public class People {
    
    private int age;
    private String name;


    public People(int age, String name){
        this.age = age;
        this.name = name;

    }

    public String getName(){
        
        return name;
    }

    public int getAge(){
        
        return age;
    }

    public void setName(String novoNome){
        this.name = novoNome;
    }
    
     public void setAge(int novaIdade){
        this.age = novaIdade;
    }




}
