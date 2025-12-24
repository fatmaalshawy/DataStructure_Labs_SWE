public class Main2 {
    public static void main(String[] args) {

        // المصفوفة الأصلية
        int[] arr = {2, 3, 4, 5, 6};

        // القيمة اللي نريد ندخلها
        int value = 1;

        // استدعاء دالة الإدراج من ArrayTools
        int[] newArr = ArrayTools.insert(arr, value);

        // طباعة النتيجة
        System.out.print("After insert: ");
        for (int x : newArr) {
            System.out.print(x + " ");

}}}
