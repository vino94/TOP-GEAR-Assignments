public class emp {
int id;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

String name;
String address;
float salary;

emp(int i,String a,String b, float c){
	this.id=i;
	this.name=a;
	this.address=b;
	this.salary=c;
}

}
