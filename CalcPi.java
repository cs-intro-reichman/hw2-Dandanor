// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int num = Integer.parseInt(args[0]);
		double divisor = 3.0;
		int count = 1;
		double aprox = 1.0;
		while (count<num)
		{
			if (count%2!=0){
				aprox -= 1/divisor;
			}
			else{
				aprox += 1/divisor;
			}
			divisor+=2;
			count++;
		}
		System.out.println("pi according to Java: " +Math.PI);
		System.out.println("pi, approximated:     " +aprox*4);
	}
}