/*
array types -->

*/
class Myarray{
    public static void main(String args[]){
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

        int m[][] = {
            {1,2},
            {3,4}
        };
        for (int i = 0 ; i < m.length ; i++){
            for(int j = 0; j < m[i].length ; j++){
                System.out.println(m[i][j] + " ");
            }
        }
    }
}