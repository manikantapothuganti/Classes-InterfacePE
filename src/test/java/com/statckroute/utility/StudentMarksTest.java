package com.statckroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentMarksTest {

		@Test(expected = IllegalArgumentException.class)
		public void testForIllegalArgumentException() {
			StudentMarks studentMarks = new StudentMarks();
			studentMarks.studentGrades(new int[]{21,76,64,122});
		}
	}


