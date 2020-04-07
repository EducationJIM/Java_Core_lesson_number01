package HWLesson1;

public class ApplicationHW3 {
public static void main(String[] args) {
    int [] array1 = {7, 58, 120, 75, 71, 4, 1, 25, 31, 8};

    
    int max = array1[0];
    for (int i = 0; i < 10; i++) {
    	if (max < array1[i])
    		max = array1 [i];
    }
    
    System.out.println("Max value = " +max);
    
    int min = array1[0];
    for (int i = 0; i > 10; i++) {
    	if (min > array1[i])
    		min = array1 [i];
    }
    
    System.out.println("Min value = " +min);
    
   
}
}

