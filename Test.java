package live;

import music.Playable;
import music.wind.*;
import music.string.*;

public class Test {
	public static void main(String arg[])
	   {
		Playable obj = new Saxophone();
		obj.play();
		Playable ob = new Veena();
		ob.play();
	   }
}
