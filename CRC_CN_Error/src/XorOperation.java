

public class XorOperation {

	public static void main(String[] args) {
		XorOperation ob=new XorOperation();
		ob.xor("00111000", "1010");
	}
	public String xor(String dividend,String divisor)
	{
		int cur_index=0,end_index=divisor.length()-1;
		String zero="0000";
		
		{	String rem=dividend.substring(0, divisor.length());
			
			for(int i=0;i<dividend.length()-divisor.length();i++)
			{	
				//System.out.println(rem);
				String temp=divisor,temp1="";
				if(rem.charAt(0)=='0') temp=zero; 
				for(int j=0;j<divisor.length();j++)
				{	
					if(rem.charAt(j)==temp.charAt(j)) temp1+="0";
					else temp1+="1";
				}
				rem=temp1.substring(1,temp1.length());
				rem+=dividend.charAt(i+divisor.length());
			}
			
			return rem.substring(1, rem.length());
		}
	}

}
