package com;

import java.util.LinkedList;
import java.util.Queue;

public class EBTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EBTMain mainObj=new EBTMain();
		//Tree 1
		TreeStruct tsRoot=new TreeStruct();
		tsRoot.setData(1);
		TreeStruct ts1=new TreeStruct();
		ts1.setData(2);
		TreeStruct ts2=new TreeStruct();
		ts2.setData(3);
		TreeStruct ts3=new TreeStruct();
		ts3.setData(4);
		TreeStruct ts4=new TreeStruct();
		ts4.setData(5);
		
		ts1.setLch(ts3);
		ts1.setRch(ts4);
		
		tsRoot.setLch(ts1);
		tsRoot.setRch(ts2);
		
		ts2.setLch(null);
		ts2.setRch(null);
		
		ts3.setLch(null);
		ts3.setRch(null);
		
		ts4.setLch(null);
		ts4.setRch(null);
	
		
		//Tree2
		TreeStruct tsRoot1=new TreeStruct();
		tsRoot1.setData(1);
		TreeStruct ts11=new TreeStruct();
		ts11.setData(2);
		TreeStruct ts12=new TreeStruct();
		ts12.setData(3);
		TreeStruct ts13=new TreeStruct();
		ts13.setData(4);
		TreeStruct ts14=new TreeStruct();
		ts14.setData(5);
		
		ts11.setLch(ts13);
		ts11.setRch(ts14);
		
		tsRoot1.setLch(ts11);
		tsRoot1.setRch(ts12);
		
		ts12.setLch(null);
		ts12.setRch(null);
		
		ts13.setLch(null);
		ts13.setRch(null);
		
		ts14.setLch(null);
		ts14.setRch(null);
	
		if(mainObj.areEqual(tsRoot, tsRoot1))
			System.out.println("they are equal");
		else
			System.out.println("Not eqaul");
		
	}

	public boolean areEqual(TreeStruct root1,TreeStruct root2)
	{
		boolean var=false;
		int flag1=0,flag2=0,flag3=0,flag4=0;
		TreeStruct temp1,temp2;
		Queue<TreeStruct> q1=new LinkedList<TreeStruct>();
		Queue<TreeStruct> q2=new LinkedList<TreeStruct>();
		q1.add(root1);
		q2.add(root2);
		while(!q1.isEmpty() && !q2.isEmpty())
		{
			temp1=q1.poll();
			temp2=q2.poll();
			if((flag1==1 && flag2==1 && flag3==1 && flag4==1) && temp1.getData()!=temp2.getData())
			{
				break;
			}
			else if((flag1==0 && flag2==0 && flag3==0 && flag4==0) && temp1.getData()!=temp2.getData())
			{
				break;
			}
//			else if(flag1==0 || flag2==0 ||flag3==0||flag4==0)
//				break;
			else 
			{
				flag1=0;
				flag2=0;
				flag3=0;
				flag4=0;
				var=true;
				if((temp1.getLch()!=null))
				{
					temp1=temp1.getLch();
					q1.add(temp1);
					flag1=1;
				}
				if((temp1.getRch()!=null))
				{
					temp1=temp1.getRch();
					q1.add(temp1);
					flag2=1;
				}
				if((temp2.getLch()!=null))
				{
					temp2=temp2.getLch();
					q2.add(temp2);
					flag3=1;
				}
				if((temp2.getRch()!=null))
				{
					temp2=temp2.getRch();
					q2.add(temp2);
					flag4=1;
				}
			}
		}
		System.out.println("var is:"+var);
		return var;
	}
}
