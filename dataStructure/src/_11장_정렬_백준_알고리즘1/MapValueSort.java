package _11장_정렬_백준_알고리즘1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
 
 
public class MapValueSort {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ValueComparator bvc =  new ValueComparator(map);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);
 
        map.put("test3", 6);
        map.put("test4", 8);
        map.put("test5", 3);
        map.put("test1", 1);
        map.put("test2", 5);
 
        sorted_map.putAll(map);
         
        for (Map.Entry<String,Integer> entry : sorted_map.entrySet()) {
            //정렬한 리스트에서 순번을 배열번호로 변경하여 원본 리스트에서 추출
            System.out.println(entry.getKey()+" : "+map.get(entry.getKey()));
        }
 
    }
 
}
 
class ValueComparator implements Comparator<String> {
 
    Map<String, Integer> base;
     
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
 
    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) { //반대로 하면 오름차순 <=
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}