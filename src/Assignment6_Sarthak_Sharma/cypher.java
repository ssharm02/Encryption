package Assignment6_Sarthak_Sharma;

import java.util.HashMap;

/*
 *
 * Sarthak Sharma PROG24178 JAVA 2 Professor Johnathan Penava Summary:
 * Assignment 6 Hashmaps cypher class, cotains the cypher values and keys
*/

/**
 *
 * @author SarthaksComp
 */
public class cypher {

    // Create a new hash map that will hold character and string as key value pair
    public static HashMap<Character, String> cypher_key_val_map = new HashMap();

    // Method contains key value pair for the hash map
    public static void createCypher() {
        cypher_key_val_map.put('A', "川");
        cypher_key_val_map.put('B', "う");
        cypher_key_val_map.put('C', "え");
        cypher_key_val_map.put('D', "か");
        cypher_key_val_map.put('E', "き");
        cypher_key_val_map.put('F', "く");
        cypher_key_val_map.put('G', "け");
        cypher_key_val_map.put('H', "こ");
        cypher_key_val_map.put('I', "が");
        cypher_key_val_map.put('J', "ぎ");
        cypher_key_val_map.put('K', "さ");
        cypher_key_val_map.put('L', "げ");
        cypher_key_val_map.put('M', "き");
        cypher_key_val_map.put('N', "ぎ");
        cypher_key_val_map.put('O', "せ");
        cypher_key_val_map.put('P', "ざ");
        cypher_key_val_map.put('Q', "ず");
        cypher_key_val_map.put('R', "ぜ");
        cypher_key_val_map.put('S', "ぞ");
        cypher_key_val_map.put('T', "た");
        cypher_key_val_map.put('U', "ち");
        cypher_key_val_map.put('V', "と");
        cypher_key_val_map.put('W', "だ");
        cypher_key_val_map.put('X', "ぢ");
        cypher_key_val_map.put('Y', "づ");
        cypher_key_val_map.put('Z', "ぢ");
        cypher_key_val_map.put(' ', "づ");
        cypher_key_val_map.put('.', "ぢ");
        cypher_key_val_map.put('@', "@");
    }
}