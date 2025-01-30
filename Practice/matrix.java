public class matrix {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
     int sumOfDiangonal1 = 0,sumOfDiangona2=0;
        for(int i=0;i<matrix.length;i++)
        {
            // for(int j=0;j<matrix[0].length;j++)
            // {
            //   if(i==j)
            //   {
                sumOfDiangonal1 += matrix[i][i]; 
              // } 
              // if()
              // {
                sumOfDiangona2+= matrix[i][(matrix.length-1-i)];
              //}
           // }
        }
        System.out.println(Math.abs(sumOfDiangonal1-sumOfDiangona2));
    }
    
}
