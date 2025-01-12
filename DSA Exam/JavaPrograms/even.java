import java.io.*;

public class even{

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter a NUmber")
		String s = br.readLine();
		int i = Integer.parseInt(s);
		if(i%2==0){
			System.out.println(i+"is a Even Number");
		}
	}

} 
