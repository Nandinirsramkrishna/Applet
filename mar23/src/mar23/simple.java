package mar23;
import java.awt.*;

import java.applet.*;

public class simple extends Applet
{
	Button b;
	TextField t;
  public void init()
    {
	  b=new Button();
	  t=new TextField();
	  b.setLabel("Submit");
	  add(b);
	  add(t);
    }
}

