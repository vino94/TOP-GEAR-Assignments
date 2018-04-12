import java.util.*;  
	public class testd{  
	 public static void main(String args[]){  
		 Scanner sc = new Scanner(System.in);
	  //Creating user-defined class objects  
	  emp s1=new emp(101,"vino","aasxv",27000);  
	  emp s2=new emp(102,"Ravi","swxdcv",21000);  
	  emp s3=new emp(103,"Hanumat","busbc",25000);  
	  //creating arraylist  
	  ArrayList<emp> al=new ArrayList<emp>();  
	  al.add(s1);//adding Student class object  
	  al.add(s2);  
	  al.add(s3);  
	  //Getting Iterator  
	  Iterator itr=al.iterator();  
	  //traversing elements of ArrayList object  
	  while(itr.hasNext()){  
		  emp st=(emp)itr.next();  
	    System.out.println(st.id+" "+st.name+" "+st.address+" "+st.salary);  
	  }
	  System.out.println("Enter name to be searched");
	  
	  String name1=sc.next();
	  System.out.println("Enter id to be searched");
	  
	  int id=sc.nextInt();
	  for (int i=0;i<=al.size();i++)
	  {
		  if(al.get(i).getName().equals(name1)&& al.get(i).getId()==id)
		  {
			  System.out.println("Address :"+al.get(i).getAddress());
			  System.out.println("sal :"+al.get(i).getSalary());
			  break;
		  }
	  }
	   
	 }  
	}  
