

public class tenth {
    public static void main(String args[]){
        int arr1[][]={{6,9,5},{5,9,7}};
        int arr2[][]={{7,9},{6,7},{3,8}};
        int arr3[][]={{0},{0}};

 for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) { 
                arr3[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }
    System.out.println("Multiplication of matrix.");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println(arr3[i][j]+" ");
        }
        
    }

    }
}
