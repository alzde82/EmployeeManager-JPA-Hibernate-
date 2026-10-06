import jakarta.persistence.*;

public class Main {
public static void main(String [] args){
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
    System.out.println("TestinAround");

    emf.close();
}
}
