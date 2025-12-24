public class ArrayTools {

    // دالة إدراج عنصر في بداية المصفوفة (Shift Right)
    public static int[] insertAtBeginning(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];

        // نضع العنصر الجديد في أول خانة
        newArr[0] = value;

        // نحرك بقية العناصر للخانة التالية
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }


    public static int[] insert(int[] arr, int value) {
        return insertAtBeginning(arr,value);
}}

