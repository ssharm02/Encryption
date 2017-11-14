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
    
    //Create a new hash map that will hold character and string as key value pair
    public static HashMap<Character, String> cypher2 = new HashMap();
    
    //Method contains key value pair for the hash map
    public static void createCypher() {
        cypher2.put('A', "川");
        cypher2.put('B', "う");
        cypher2.put('C', "え");
        cypher2.put('D', "か");
        cypher2.put('E', "き");
        cypher2.put('F', "く");
        cypher2.put('G', "け");
        cypher2.put('H', "こ");
        cypher2.put('I', "が");
        cypher2.put('J', "ぎ");
        cypher2.put('K', "さ");
        cypher2.put('L', "げ");
        cypher2.put('M', "き");
        cypher2.put('N', "ぎ");
        cypher2.put('O', "せ");
        cypher2.put('P', "ざ");
        cypher2.put('Q', "ず");
        cypher2.put('R', "ぜ");
        cypher2.put('S', "ぞ");
        cypher2.put('T', "た");
        cypher2.put('U', "ち");
        cypher2.put('V', "と");
        cypher2.put('W', "だ");
        cypher2.put('X', "ぢ");
        cypher2.put('Y', "づ");
        cypher2.put('Z', "ぢ");
        cypher2.put(' ', "づ");
        cypher2.put('.',"ぢ");
        cypher2.put('@', "@");        
    }//End of the method
}


