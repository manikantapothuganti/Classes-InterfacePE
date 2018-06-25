package com.statckroute.utility;

public class ConsecutiveChecker {
	public boolean isConsecutive(String string) 
    {	
		int z=0;
		String splitedString[] = string.trim().split(",");
		if(splitedString.length!=7) 
		{
			return false;
		}
		else 
		{
			for(int i=0;i<splitedString.length-1;i++)
			{
				try 
				{
					if((Integer.parseInt(splitedString[i])-(Integer.parseInt(splitedString[i+1]))==1)||
							(Integer.parseInt(splitedString[i])-(Integer.parseInt(splitedString[i+1]))==-1))
					{
						z++;
					}
				}
				catch(Exception e) {
		    			throw new IllegalArgumentException("only numbers are allowed");
		    		}
				
			}
			System.out.println(z);
			if (z==6)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
    }


}
