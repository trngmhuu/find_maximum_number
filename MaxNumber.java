package test;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
        
        // Gọi hàm findMax và in kết quả
        String max = findMax(arr);
        System.out.println("Số lớn nhất trong mảng là: " + max);
	}
	
	// Hàm tìm số lớn nhất trong mảng
    public static String findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng, không có số lớn nhất để tìm.");
        }

        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return Integer.toString(max);
    }

}
