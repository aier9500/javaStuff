class Main {

    public static void main(String[] args) {

        start();
        System.out.println();
    }

    public static void changeIt(int[] arr, int val, String word) {

        arr = new int[5];
        val = 0;
        word = word.substring(0, 5);

        for (int k = 0; k < arr.length; k++) {

            arr[k] = 0;
        }
    }

    public static void start() {

        int[] nums = { 1, 2, 3, 4, 5 };
        int value = 6;
        String name = "blackboard";

        changeIt(nums, value, name);

        for (int k = 0; k < nums.length; k++) {

            System.out.print(nums[k] + " ");
        }

        System.out.print(value + " ");
        System.out.print(name);
    }
}