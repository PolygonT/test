package user.demo;

public class demo_1 {
    //输出找到最大硬币数的路径
    public void getMaxPath(int[][] A){
        int rowA = A.length;
        int columnA = A[0].length;
        //在数组A最上面一行添加一行元素0，在最左边一列添加一列元素0
        int[][] changeA = new int[rowA+1][columnA+1];  //初始化，各个元素均为0
        int[][] maxA = new int[rowA+1][columnA+1];   //用于计算从A[0][0]到达各元素位置收集到的最大硬币数
        for(int i = 0;i < rowA;i++){
            for(int j = 0;j < columnA;j++)
                changeA[i+1][j+1] = A[i][j];
        }
        for(int i = 1;i <= rowA;i++){
            for(int j = 1; j <= columnA;j++){
                if(maxA[i-1][j] >= maxA[i][j-1])
                    maxA[i][j] = maxA[i-1][j] + changeA[i][j];
                else
                    maxA[i][j] = maxA[i][j-1] + changeA[i][j];
            }
        }

        //输出各个元素位置收集到的最大硬币数
        System.out.println("各个元素位置收集到的最大硬币数：");
        for(int i = 1;i <= rowA;i++){
            for(int j = 1;j <= columnA;j++)
                System.out.print(maxA[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args){
        demo_1 test = new demo_1();
        int[][] A ={{0,0,0,0,1,0},
                {0,1,0,1,0,0},
                {0,0,0,1,0,1},
                {0,0,1,0,0,1},
                {1,0,0,0,1,0}};
        test.getMaxPath(A);
    }
}