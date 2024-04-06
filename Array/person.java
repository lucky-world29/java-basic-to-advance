public class person {
    private String Name;
    private String Age;


    //This is constructor
    public person (String Name, String Age){

        //Instance variable bcz use of this key word
        this.Name = Name;
        this.Age  = Age;
    }


    /*"get method"==> 
    
    getting data  from constructor 
    
    help of instance variable   
    
    */
    public String getName(){
        return Name;
    }
    public String getAge(){
        return Age;
    }

    public static void main(String[] args) {
        person per1 = new person("Love", "22");
        person per2 = new person("Venom", "2");
        System.out.println(per1.getName()); 
        System.out.println(per2.getName());
    }
}
