public class ValueMin {
    public static void main(String[] args) {
        int[] array = {9,8,9,5,6,8,9,56,89,8,98,64,8,78,6,5,4,9};
        System.out.println("The smallest element in the array is: " + minValue(array));
    }
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        return min;
    }
}
