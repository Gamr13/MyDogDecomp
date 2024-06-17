import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class MyDogMIDlet extends MIDlet {
   public static d b = null;
   public static Display a = null;

   public MyDogMIDlet() {
      System.gc();
   }

   public final void startApp() throws MIDletStateChangeException {
      if (b == null) {
         a = Display.getDisplay(this);
         b = new d(this);
      } else {
         b.m();
      }

   }

   public final void pauseApp() {
      d.at = true;
   }

   public final void destroyApp(boolean var1) throws MIDletStateChangeException {
      if (b != null) {
         d var10000 = b;
         d.i = true;
         var10000 = b;
         d.v();
         b = null;
      }

      this.notifyDestroyed();
   }
}
