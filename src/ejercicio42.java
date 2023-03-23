
public class ejercicio42 {
    public static boolean buscar(int e, int[] array) {
        int i = array.length / 2;
        while (i < array.length && i >= 0) {
            if (array[i] == e) {
                return true;
            } else if (array[i] > e) {
                i--;
            } else if (array[i] < e) {
                i++;
            }


        }
        return false;
    }

}
