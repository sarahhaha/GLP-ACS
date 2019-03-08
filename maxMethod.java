// Returns the largest value in the given array.
public static int max(int[] data) {
    int max = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] > max) {
            max = data[i];
        }
    }
    return max;
}
