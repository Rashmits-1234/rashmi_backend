package javapackage;

import java.util.Arrays;

public class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int size) {
        this.size = size;
        this.array = new int[size];
    }

  
    public void createArray(int[] elements) {
        if (elements.length != size) {
            System.out.println("Array size mismatch!");
            return;
        }
        for (int i = 0; i < size; i++) {
            array[i] = elements[i];
        }
    }

   
    public void printArray() {
        //System.out.print(" print Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

   
    public void reverseArray() {
    	 System.out.print("Reversed Array: ");
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public void sortArray() {
    	 System.out.print(" Sorted Array: ");
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    
    public int findMinimum() {
    	 System.out.print(" Minimum Element: ");
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    
    public int findMaximum() {
    	 System.out.print(" Maximum Element: ");
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

   
    public void zigZagMerge(int[] arr1, int[] arr2) {
    	
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        boolean flag = true;

        while (i < arr1.length && j < arr2.length) {
            if (flag) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
            flag = !flag;
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        this.size = result.length;
        this.array = result;
    }

   
    public void intersection(int[] arr1, int[] arr2) {
    	 System.out.print(" Intersected Array: ");
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    temp[index++] = arr1[i];
                    break;
                }
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        this.size = result.length;
        this.array = result;
    }

    
    public void union(int[] arr1, int[] arr2) {
    	 System.out.print(" Union Array: ");
        int[] temp = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            temp[index++] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            boolean found = false;
            for (int k = 0; k < arr1.length; k++) {
                if (arr2[j] == arr1[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index++] = arr2[j];
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        this.size = result.length;
        this.array = result;
    }

  
    public void removeDuplicates() {
    	
        int[] tempArray = new int[size];
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        tempArray[j++] = array[size - 1];
        int[] result = new int[j];
        System.arraycopy(tempArray, 0, result, 0, j);
        this.size = j;
        this.array = result;
    }

 
    public int countPrimeNumbers() {
    	 
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {1, 3, 5, 7, 9};
        int size = arr1.length + arr2.length;
        ArrayOperations arrayOperations = new ArrayOperations(size);

        arrayOperations.zigZagMerge(arr1, arr2);
        arrayOperations.printArray();

        int[] arr3 = {2, 4, 6, 8, 10};
        int[] arr4 = {6, 8, 10, 12, 14};
        arrayOperations.intersection(arr3, arr4);
        arrayOperations.printArray();

        arrayOperations.union(arr3, arr4);
        arrayOperations.printArray();

        arrayOperations.removeDuplicates();
        arrayOperations.printArray();

        int[] arr5 = {2, 3, 5, 7, 11, 13, 17};
        arrayOperations.createArray(arr5);
        arrayOperations.printArray();
        System.out.println("Number of prime numbers: " + arrayOperations.countPrimeNumbers());
    }
}
