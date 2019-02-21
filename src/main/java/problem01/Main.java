package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
	
		// 코드를 완성 하십시오.
		int[] mul = new int[10];

		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				mul[num++] = arr[i] * arr[j];
				
			}
			
		}

		
		
		int max = mul[0];
		int pos = 0;
	    for (int i = 0; i < mul.length; i++) {
	    	if (mul[i] > max) {
	            max = mul[i];
	            pos = i;
	        }
	    }
	    //System.out.println(max);
	    
	    
	    //결과
	    if(pos<=3) {
	    	System.out.println("[" + max/arr[pos+1] + "," + arr[pos+1] +"]");
	    } else if(pos<=6) {
	    	System.out.println("[" + max/arr[pos+1] + "," + arr[pos-2] +"]");   
	    } else 
	    	System.out.println("[" + max/arr[pos+1] + "," + arr[pos-4] +"]");
	    }


		
	}

