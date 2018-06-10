//sumOfOdd
package sumofodd;
import java.util.*;
public class SumOfOdd {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]= new int[n];
        for (int i=0; i<n;i++){
            a[i]=s.nextInt();
        }
        int query = s.nextInt();
        int q[][]= new int[query][2];
        for (int i=0; i<query; i++){
            q[i][0]=s.nextInt();
            q[i][1]=s.nextInt();
        }
        int sum[][]=new int[2][n];
        int finalsum=0;
        for (int r=0;r<query;r++){
            finalsum=0;
            for (int i=q[r][0]-1; i<q[r][1];i++){
                for (int j=0; j<n;j++){
                    if (a[i]!=sum[0][j]&&sum[1][j]==0){
                        sum[0][j]=a[i];
                        sum[1][j]=1;
                        System.out.println("sum[0]["+j+"] ="+ sum[0][j]+ " sum[1]["+j+"] = "+sum[1][j]);
                        break;
                    } else if(a[i]==sum[0][j]&&sum[1][j]!=0){
                        sum[1][j]++;
                        System.out.println("sum[0]["+j+"] ="+ sum[0][j]+ " sum[1]["+j+"] = "+sum[1][j]);
                        break;
                    } else if(a[i]!=sum[0][j]&&sum[1][j]!=0){
                        
                        continue;
                    }
                }
            }
            for(int i=0; i<n;i++){
                if(sum[1][i]%2==1){
                    finalsum += sum[0][i]*sum[1][i];
                }
            }
            System.out.println(finalsum);
            for (int i=0; i<n;i++){
                sum[0][i]=0;
                sum[1][i]=0;
            }
        }
    }
    
}
