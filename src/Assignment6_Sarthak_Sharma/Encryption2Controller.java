/**
 *
 * Sarthak Sharma PROG24178 JAVA 2 Professor Johnathan Penava Summary:
 * Assignment 6 Hashmaps cypher controller class, adds functionality to the Encryption2.fxml
 */
package Assignment6_Sarthak_Sharma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * FXML Controller class
 *
 * @author SarthaksComp
 */
public class Encryption2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private TextField textToEncode;

    @FXML
    private Label codedText;

    @FXML
    private RadioButton textLine;

    @FXML
    private Button fileText;

    /**
     * Method converts user string into cyphered text
     * 
     * @param event
     * @exception bad exceptions caught using try and catch
     */
    @FXML
    private void textToEncode(ActionEvent event) {

        // call the cypher class and the cypher method that contains the hash map
        // <string, character>
        cypher.createCypher();

        try {
            // Get text from user and convert to upper case
            String UncodedText = textToEncode.getText().toUpperCase();
            String CodedText = "";
            // Returns the value to which the specified key is mapped, or null if this map
            // contains no mapping for the key.
            String HashMapChar = cypher.cypher_key_val_map.get(UncodedText);

            // for each loop converts one character at a time
            for (char user_string_char : UncodedText.toCharArray()) {
                // System.out.println("Value of x " + user_string_char);
                // if the cypher class/hashmap contains the key
                if (cypher.cypher_key_val_map.containsKey(user_string_char)) {
                    // Cypher2 is the hashmap containing key value pair
                    CodedText += cypher.cypher_key_val_map.get(user_string_char);
                    // System.out.println(output2);
                } else {
                    // don't translate
                    CodedText += HashMapChar;
                    // System.out.println(output2);
                }
            }
            // Display the encrypted text in the appropriate area
            codedText.setText(CodedText);
        } catch (NullPointerException npe) {
        } catch (Exception e) {
        }

    }// End of the method that encrypts what the user types in

    /**
     * When the user clicks the button a file is read and encrypted text file is
     * created
     * 
     * @param event
     */
    @FXML
    private void fileText(ActionEvent event) throws IOException {
        // Clear the text box
        codedText.setText("");
        // Call the readFromFile method that reads the text file and converts it to
        // encrypted text
        readFromFile();
        codedText.setText("encrypted_" + textToEncode.getText() + " was created.");
    }

    /**
     * Read and write method Read content of a file and put content in another file
     */
    private void readFromFile() throws IOException {

        // call the cypher class and the cypher method that contains the hash map
        // <string, character>
        cypher.createCypher();
        String EncryptedText = "";
        try {
            // Capture Contents of the file into the string UnencryptedText
            String UnencryptedText = new String(Files.readAllBytes(Paths.get("myMessage.txt"))).toUpperCase();
            // Returns the value to which the specified key is mapped, or null if this map
            // contains no mapping for the key.
            String HashMapChar = cypher.cypher_key_val_map.get(UnencryptedText);

            for (char x : UnencryptedText.toCharArray()) {
                // if the cypher class/hashmap contains the key
                if (cypher.cypher_key_val_map.containsKey(x)) {
                    // Cypher2 is the hashmap containing key value pair
                    EncryptedText += cypher.cypher_key_val_map.get(x);

                } else {
                    // don't translate
                    EncryptedText += HashMapChar;
                }
            }

        } // end of try
        catch (NullPointerException npe) {
        } catch (Exception e) {
        }

        // Write to Encrypted.txt
        try {

            File newTextFile = new File("encryptedFile.txt.");

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(EncryptedText);
            fw.close();

        } catch (IOException iox) {
        }
    }

    @FXML
    private void textLine(ActionEvent event) {
        textLine.setSelected(true);
    }
}
