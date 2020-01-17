package Exception;
import java.io.*;

public class IoEx4 {
	
	
		public static void main(String[] args) throws Exception
			{
			IoEx4 ex=new IoEx4();
			ex.execute();
			}
			
			public void execute() throws IOException
			{
				InputStreamReader reader=null;
				OutputStreamWriter writer=null;
				try
				{
					reader= new InputStreamReader(System.in);
					writer= new OutputStreamWriter(System.out);
					int read;
					while((read=reader.read())>=0)
					{
						writer.write(read);
						writer.flush();
						char ch=(char)read;
						if (ch=='z') 
						{
							break;
						}
					}
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
						if(reader!=null)
						{
							reader.close();
						}
						if(writer!=null)
						{
							writer.close();
						}
				}
				}
	}
