/**
 * Напишите обобщенный метод compareArrays(),
 * который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа
 * по парно по индексам.
 */
public class CompareArrays {
    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray) {
        if (firstArray==null || secondArray==null) return false;
        if (firstArray.length != secondArray.length) return false;
        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].getClass().equals(secondArray[i].getClass())) {
                return false;
            }
        }
        return true;
    }
}
