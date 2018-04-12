package gear;

import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Instruement{    
abstract void play();    
}    

class Flute extends Instruement{    
      @Override
      	void play(){
    	  	System.out.println("Flute is playing  toot toot toot toot");
      	}
      }
class Guitar extends Instruement{    
      @Override
      void play(){
    	  System.out.println("Guitar is playing  tin  tin  tin ");

}
}
class Piano extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  tan tan tan tan");
    }
 }
class Veena extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Veena is playing  toi toi");
    }
 }
class Tabla extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  tab tab tab tab");
    }
 }
class Sitar extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  cling cling");
    }
 }
class Melam extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  tang tang tang tang");
    }
 }
class Sangu extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  oooo ooo oo");
    }
 }
class Drum extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing dam dam dam");
    }
 }
class violin extends Instruement{ 
    @Override
    void play(){
    	 System.out.println("Piano is playing  soing soing soing");
    }
 }




