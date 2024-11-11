/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author HP
 */
public class InsertionSort {

    public static void sortWithSwap(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int k = i;
            while (k > 0 && nums[k - 1] > nums[k]) {
                int temp = nums[k];
                nums[k] = nums[k - 1];
                nums[k - 1] = temp;
                k--;
            }
        }
        display("Sorted with swap method:", nums);
    }

    public static void sortOptimized(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        display("Sorted with optimized insertion:", nums);
    }

    public static void sortDescending(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] < current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        display("Sorted in descending order:", nums);
    }

    public static void display(String message, int[] nums) {
        System.out.print(message + " ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 7, 1};
        
        System.out.println("Original array:");
        display("", nums);

        sortWithSwap(nums.clone());
        sortOptimized(nums.clone());
        sortDescending(nums.clone());
    }
}

