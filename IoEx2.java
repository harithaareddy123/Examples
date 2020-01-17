package Exception;
import java.io.*;

public class IoEx2 {
	
		public static void main(String[] args) throws Exception
		{
			IoEx2 ex=new IoEx2();
		ex.execute();
		}
		
		public void execute() throws Exception
		{
			InputStream is=null;
			OutputStream os=null;
			try
			{
				//String path= "D:/ramya/abc.txt" ;
			//File inputFile=new File(path);
			//is =new FileInputStream(inputFile);
			//File outFile=new File("D:/new");
				is=System.in;
			
			//os =new FileOutputStream(outFile);
			int read;
			while((read=is.read())>=0)
				{
				//System.out.print(read);
				//os.write(read);
				System.out.write(read);
				}
			
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		finally{
			
			if((is!=null)) {
				is.close();
			}
			if((os!=null)) {
				os.close();
			}
		
	}
	}
}