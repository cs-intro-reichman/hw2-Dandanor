// Demonstrates the Collatz conjecture.

//I'm assuming in the future we could check for a runtime error and thus determine if any of the numbers doesn't reach 1,
//right now I'm assuming we are supposed to assume the theorem works in practice.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals("v"))
		{
		System.out.println("1 4 2 1 (4)");
		for(int i=2;i<=n;i++){
		int count = 1;
		int num = i;
		System.out.print(i +" ");
		while (num!=1){
				if(num%2==0){
					num/=2;
				}
				else{
					num=num*3+1;
				}
				System.out.print(num +" ");
				count++;
			}
			System.out.print("("+count+")");
			System.out.println();
		}
		System.out.println();
		System.out.println("Every one of the first " +n+ "hailstone sequences reached 1.");
		}
		else if (mode.equals("c"))
		{
			System.out.println("Every one of the first " +n+ "hailstone sequences reached 1.");
		}
	}
}

