package org.example.cw2;

// определить, есть ли в массиве дубликат

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(isDublicat(arr));
    }
    public static boolean isDublicat(int[] inpArr){
        Map<Integer, Integer> testMass = new HashMap<>();
        for(int i = 0; i < inpArr.length; i++){
            if(testMass.containsKey(inpArr[i])){
                return false;
            }
            else{
                testMass.put(inpArr[i], 1);
            }
        }
        return true;
    }
}
