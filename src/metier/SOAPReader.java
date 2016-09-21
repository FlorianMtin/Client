package metier;

/**
 * Created by Florian on 19/09/2016.
 */


import org.w3c.dom.NodeList;

import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import java.util.ArrayList;
import java.util.Iterator;


public class SOAPReader {

    private SOAPConnection connection;
    private SOAPConnectionFactory soapConnFactory;
    private MessageFactory messageFactory;
    private SOAPMessage message;
    private SOAPPart soapPart;
    private SOAPEnvelope envelope;
    private SOAPBody body;
    private SOAPElement bodyElement;
    private  TransformerFactory transformerFactory;
    private Transformer transformer;
    private Source sourceContent;


    public void connexion()
    {
        try {

            soapConnFactory =SOAPConnectionFactory.newInstance();
            connection = soapConnFactory.createConnection();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void creationMessage(String operation, String destination){
        try {
            messageFactory = MessageFactory.newInstance();
            message = messageFactory.createMessage();
            soapPart = message.getSOAPPart();
            envelope = soapPart.getEnvelope();
            body = envelope.getBody();


            body.getChildElements()
            ArrayList<Pays> listePays = new ArrayList<>();

            for (int i = 0; i < listeNoeud.getLength(); i++) {
                Node n = listeNoeud.item(i);
                NodeList l = n.getChildNodes();

                Node nbHabitantNode = (Node) l.item(0);
                float nbHabitants = Float.parseFloat(nbHabitantNode.getTextContent());


                Node capitalNode = (Node) l.item(1);
                String nomCapitale = capitalNode.getTextContent();

                Node nomPaysNode = (Node) l.item(2);
                String nomPays = nomPaysNode.getTextContent();

                Pays unpays = new Pays(nomPays, nomCapitale, nbHabitants);

                listePays.add(unpays);
                System.out.println(unpays.getNomCapitale());
            }

            message.saveChanges();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }


}
