package tipo;

public interface Checkable {
       default void checkIn(){
          System.out.println("Il dipendente ha effettuato il check-in");
      };
}
