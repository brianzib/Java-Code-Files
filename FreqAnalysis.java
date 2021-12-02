import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class FreqAnalysis {

	public static void main(String[] args) throws FileNotFoundException {

		int numChar = 0; 
		int tallyA = 0; 
		int tallyB = 0;		
		int tallyC = 0;
		int tallyD = 0;
		int tallyE = 0;
		int tallyF = 0;
		int tallyG = 0;
		int tallyH = 0;
		int tallyI = 0;
		int tallyJ = 0;
		int tallyK = 0;
		int tallyL = 0;
		int tallyM = 0;
		int tallyN = 0;
		int tallyO = 0;
		int tallyP = 0;
		int tallyQ = 0;
		int tallyR = 0;
		int tallyS = 0;
		int tallyT = 0;
		int tallyU = 0;
		int tallyV = 0;
		int tallyW = 0;
		int tallyX = 0;
		int tallyY = 0;
		int tallyZ = 0;

		File file = new File("Z:\\Computer Science\\Programming (Practical)\\JavaScript Code list.txt");

		// Opens files for analysis (encrypted)

		@SuppressWarnings("resource")

		Scanner scan = new Scanner(file);

		// Scans each line of the file

		while(scan.hasNextLine()) {

			System.out.println(scan.next(). charAt(0));

			numChar ++;

			System.out.println(numChar);

		}
	}

	

		

	}


