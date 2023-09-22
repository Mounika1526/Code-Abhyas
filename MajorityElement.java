import java.util.*;
public class MajorityElement {
    //N/2
	public static int majorityElement(int[] v) {
		int n = v.length;
		int cnt = 0;
		int el = 0;
		
		for(int i=0;i<n;i++) {
			if(cnt==0) {
				cnt = 1;
				el = v[i];
			}
			else if(el == v[i]){
				cnt++;
				
			}
			else {
				cnt--;
			}
		}
		int cnt1=0;
		for(int i=0;i<n;i++) {
			if(v[i]==el) {
				cnt1++;
			}
		}
		if(cnt1>(n/2)) {
			return el;
		}
		else {
			return -1;
		}
		
	}
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of the array (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            arr[i]  = scanner.nextInt();
        }

        scanner.close();
        int ans = majorityElement(arr);
        System.out.println("The Majority element is: "+ans);
	}
}
	
