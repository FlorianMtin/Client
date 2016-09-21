package metier;

public class Principale {

    private static String operation = "getPays";
    private static String destenvoi = "http://localhost:8080/services/PaysService";
    private static String destination = "http://pays"; // Nom du package


    private static SOAPReader unAppel = new SOAPReader();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            unAppel.connexion();
            unAppel.creationMessage(operation, destination);
            //unAppel.EmmissionReception(destenvoi, operation);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
