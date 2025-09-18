import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args[])
    {
        HashMap < String , Integer> map = new HashMap<>();
        map.put(key:"Antman", value:22);

        for (String key : map.keySet())
        {
            System.out.println("key" + key + ", value :" + map.get(key));
            
        }

    }
}
