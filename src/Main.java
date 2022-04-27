import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> FAMILYMEMBERS = new HashMap<String, Integer>();

        FAMILYMEMBERS.put("Maria", 1999);
        FAMILYMEMBERS.put("Jesus", 2001);
        FAMILYMEMBERS.put("Chris", 2008);
        FAMILYMEMBERS.put("Cele", 2005);
        FAMILYMEMBERS.put("uri", 2004);

        System.out.println(FAMILYMEMBERS);

        for (String i : FAMILYMEMBERS.keySet()){
            System.out.println(i + ":" + FAMILYMEMBERS.get(i) );
        }

    }
}
