package com.programmers.Level1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] a = new int[commands.length];
        for(int x = 0; x < commands.length; x++) {
            int[] result = new int[commands[x][1] - (commands[x][0]-1)];
            for(int z = 0; z < result.length; z++){
                result[z] = array[z + commands[x][0]-1];
            }
            Arrays.sort(result);
            a[x] = result[commands[x][2]-1];
        }
        return a;
    }
}