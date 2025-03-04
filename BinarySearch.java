import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();

        int datas[] = new int[size];
        int low = 0;
        int high = datas.length-1;
        int postion = -1;

        System.out.println("Enter the Values:");
        
        for(int i=0; i<size; i++){
            datas[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        while(low<=high){
            int mid = (low + high) / 2;
            if(datas[mid] == target){
                postion = mid;
                break;
            }
            if (datas[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(postion == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("The Position is:" +postion);
        }

        }
}
