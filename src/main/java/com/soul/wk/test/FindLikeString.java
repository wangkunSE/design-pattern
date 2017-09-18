package com.soul.wk.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindLikeString {

    public static void main(String[] args) {

        try {
            long startTime = System.currentTimeMillis();
            List<String > strings  = readFromFile(new File("H:\\IDEA\\workspace\\designPattern\\src\\main\\resources\\test"));
            String str = "180";
            List<String> results = find(strings, str);
//            for (String result : results) {
//                System.out.println(result);
//            }
            long endTime = System.currentTimeMillis();
            System.out.println("===========================耗时：" + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<String> readFromFile(File file) throws Exception {

        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String string = null;
        ArrayList<String> result = new ArrayList<String>();
        while ((string = inputStream.readLine()) != null) {
            result.add(string.trim()) ;
        }

        return result;
    }

    private static List<String> find(List<String> strings, String str) {

        ArrayList<String> result = new ArrayList<String>();

        if (strings.size() <= 0)
            return null;
        for (String string : strings) {
            String temp = compare(string,str);
//            String temp= nativeCompare(string,str);
//            String temp = containCompare(string, str);
            if (temp != null) {
                result.add(temp);
            }
        }

        return result;
    }

    private static String nativeCompare(String string, String str) {

        for (int i = 0; i < string.length() - str.length() - 1; i++) {

            if (string.substring(i, i + str.length()).equals(str))
                return string;
        }
        return null;
    }

    private static String containCompare(String string, String str) {

        if (!string.contains(str)) {
            return null;
        } else {
            return string;
        }
    }


    private static String compare(String string, String str) {

        char[] chars = string.toCharArray();
        char[] mapper = str.toCharArray();
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] == mapper[j]) {
                int count = 0;
                int tempi = i;
                while (count < mapper.length) {
                    count++;
                    if (count == mapper.length && chars[tempi++] == mapper[j++])
                        return string;
                    if (chars[tempi++] != mapper[j++]) {
                        j = 0;
                        break;
                    }
                }
            }
        }
        return null;
    }
}
