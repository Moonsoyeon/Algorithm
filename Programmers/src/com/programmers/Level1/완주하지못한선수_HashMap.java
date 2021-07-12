package com.programmers.Level1;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수_HashMap {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : participant){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for(String str : completion){
            map.put(str, map.get(str) - 1);
        }

        for(String key : map.keySet()){
            if(map.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }
}
