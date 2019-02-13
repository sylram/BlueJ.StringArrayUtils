 

/**
 * Created by leon on 1/29/18.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.LinkedHashSet;



public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int x = array.length-1;
        return array[x];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int x = array.length-2;
        return array[x];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0; i<array.length;i++){
            if(array[i].equals(value)){
                
        }}return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] x = new String[array.length];
        for(int i=0;i<=array.length-1;i++){
            x[i]=array[array.length-i-1];   
        }
        System.out.print(Arrays.toString(x));
           return x;  
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        for(int i=0;i<array.length;i++){
            reversedArray[i]=array[array.length-i-1];  
        }
        
        if(Arrays.equals(array,reversedArray)){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayAsString = Arrays.toString(array).toLowerCase();
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i=0; i<alphabet.length;i++){
            if (!arrayAsString.contains(String.valueOf(alphabet[i]))){
                return false;}
            
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String arrayToString = Arrays.toString(array).toLowerCase();
        int sum =0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value)){
                sum = sum+1;}
            }
            
        return sum;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int valuePosition = Arrays.asList(array).indexOf(valueToRemove);
        List<String> ListArray = new ArrayList<>(Arrays.asList(array));
            ListArray.remove(valuePosition);
            String[] nuevo = new String[array.length-1];
            nuevo= ListArray.toArray(nuevo);
            
        return nuevo;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> neroArray = new ArrayList<String>();
        for (int y = 0; y <array.length-1; y++) {
            String current = array[y];
            String result = array[y+1];
            if (current != result) {
                neroArray.add(current);}
      }
      neroArray.add(array[array.length-1]);
      String[] itemsRemoved = new String[neroArray.size()];
        itemsRemoved=neroArray.toArray(itemsRemoved);
        return itemsRemoved;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> neroArray = new ArrayList<String>();
        String guardar = array[0];
        for (int y = 1; y <array.length; y++) {
            String previous = array[y-1];
            String current = array[y];
            if (previous.equals(current)) {
                guardar += current;
           
            } else {
                neroArray.add(guardar);
                guardar = current;
            }
        }

        neroArray.add(guardar);
        String[] itemsRemoved = new String[neroArray.size()];
        itemsRemoved=neroArray.toArray(itemsRemoved);
        return itemsRemoved;
    }


}
