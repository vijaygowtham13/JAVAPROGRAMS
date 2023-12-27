class swapping {
    public static void main(String[] args) {
        Swap obj = new Swap();
        int[] values = {2, 5};
        obj.swaps(values);
        System.out.println("After swapping: a = " + values[0] + ", b = " + values[1]);
    }
}

class Swap {
    void swaps(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
