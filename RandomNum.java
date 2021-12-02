import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class RandomNum {

	public static void main(String[] args) {		
		int iNum;
		int iNum2;
		double dNum;
		int iTotal;

		dNum = Math.random();
		iNum = (int) (dNum * 10) + 1;  
		
		dNum = Math.random();
		iNum2 = (int) (dNum * 20) + 1;  
		
		iTotal = iNum + iNum2;
	}

}
