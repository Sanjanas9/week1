
 class MaxElement {
    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 55, 33 };
        int max = 0,temp=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                max = arr[i];
            }
        }
        System.out.println(+max);
    }
}
