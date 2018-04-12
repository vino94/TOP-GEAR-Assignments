package gear;

public class Service {
	public static void main(String args[]){    
		Instruement b;  
		b=new Piano();
		b.play();
		b=new Flute();  
		b.play();
		b=new Guitar();
		b.play();
		//Instruement[]inst = new Instruement[10];
		//inst[2].play();
		Instruement b1[] = {new Piano(),new Flute(),new Guitar(),new Veena(),new Tabla(),new Sitar(), new Melam(), new Sangu(),new Drum(),new violin()};
		b1[0].play();
		b1[1].play();
		b1[2].play();
		b1[3].play();
		b1[4].play();
		b1[5].play();
		b1[6].play();
		b1[7].play();
		b1[8].play();
		b1[9].play();
		
}
}
