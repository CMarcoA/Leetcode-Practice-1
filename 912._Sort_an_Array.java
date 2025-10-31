import java.util.concurrent.ThreadLocalRandom;

class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    // Randomized 3 way quicksort
    private void quicksort(int[] a, int lo, int hi) {
        if (lo >= hi)
            return;

        int pIdx = ThreadLocalRandom.current().nextInt(lo, hi + 1);
        int pivot = a[pIdx];

        int lt = lo, i = lo, gt = hi;
        while (i <= gt) {
            if (a[i] < pivot) {
                swap(a, lt++, i++);
            } else if (a[i] > pivot) {
                swap(a, i, gt--);
            } else {
                i++;
            }
        }

        // recurse on parts
        quicksort(a, lo, lt - 1);
        quicksort(a, gt + 1, hi);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
