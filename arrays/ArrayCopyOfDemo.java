package arrays;

public class ArrayCopyOfDemo {
	
	public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        //char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        char[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);
                
        System.out.println(new String(copyTo));
        
        char[] dupe1=copyFrom; //dupe1 is just a reference
        char[] dupe2=copyFrom.clone(); // create a clone not just the reference
        copyFrom[copyFrom.length-1]='r';
        System.out.println(new String(copyFrom));
        System.out.println(new String(dupe1));
        System.out.println(new String(dupe2));
    }
	
}
