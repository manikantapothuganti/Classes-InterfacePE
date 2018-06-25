package com.statckroute.utility;

import java.util.Scanner;

public class StudentMarks {

	public int[] studentGrades(int marks[]) {
		int stuGrades[] = new int[marks.length];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<0||marks[i]>100)
			{
				throw new IllegalArgumentException("Invalid Marks");
			}
			stuGrades[i]=marks[i];
		}
		return stuGrades;
	}

}
