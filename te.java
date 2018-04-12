import java.util.Date;
public class te extends Thread{  
	  public void run(){  
		   System.out.println("running...");  
		  }  
	  private volatile static boolean flag = true;
	  public void stopRunning()
	    {
	        flag = false;
	    }
		 public static void main(String args[]){  
			
			 te t1=new te();  
		
		  System.out.println("Name of t1:"+t1.getName());  
		
		  t1.start();  
	   
		  t1.setName("MyThreads");  
		  System.out.println("After changing name of t1:"+t1.getName());
		
		 
		  try {
			  while(flag)
			  {
				  Date today = new Date();
				  System.out.println("Current Time and Date :"+today.toString());
				  Thread.sleep(10000);
				  
			  }
			  System.out.println("Stopped Running....");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		t1.stopRunning();
	    
		 }  
		}  
 
