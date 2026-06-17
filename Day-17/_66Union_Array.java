
public class _66Union_Array {

    public static void union(int arr1[], int arr2[]) {

        int n = arr1.length + arr2.length;
        int union[] = new int[n];

        int j = 0;

        // arr1 copy karo
        for (int i = 0; i < arr1.length; i++) {
            union[j] = arr1[i];
            j++;
        }

        // arr2 ke elements add karo agar pehle se na ho
        for (int k = 0; k < arr2.length; k++) {

            boolean found = false;

            for (int l = 0; l < j; l++) {
                if (arr2[k] == union[l]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[j] = arr2[k];
                j++;
            }
        }

        // sirf valid elements print karo
        for (int i = 0; i < j; i++) {
            System.out.print(union[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5, 6};
        int arr2[] = {5, 6, 8, 2, 9};

        union(arr1, arr2);
    }
}