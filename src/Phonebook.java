import java.util.HashMap;

import java.util.Map;

public class Phonebook {
    private Map<String, String> map = new HashMap<>();

    void add(String name, String number){
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name)){
            if (!map.containsValue(number)){
                stringBuilder.append(map.get(name));
                stringBuilder.append(";");
                stringBuilder.append(number);
//                stringBuilder.append(";");
            }
            map.put(name, stringBuilder.toString());

        }else{

            map.put(name, number);
        }

    }
    String getByName(String name){
        return name + ":" + map.get(name);
    }

//    String getByNumber(String number){
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Map.Entry entry: map.entrySet()) {
//            if (entry.getValue().equals(number)){
//                stringBuilder.append(entry.getKey());
//                stringBuilder.append(" ; ");
//                stringBuilder.append(entry.getValue());
//                stringBuilder.append("\n");
//            }
//        }
//        return stringBuilder.toString();
//    }

    String printAll(){

        return map.toString();
    }



}
