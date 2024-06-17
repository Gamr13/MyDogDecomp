import javax.microedition.media.Manager;
import javax.microedition.media.Player;

public class b {
   public static int c = -1;
   public static Player b;
   public static Player d;
   public static Class a = (new String("")).getClass();

   public static final void a() {
      if (d.C && d.j) {
         try {
            if (d == null) {
               d = Manager.createPlayer(a.getResourceAsStream("/theme.mid"), "audio/midi");
            }

            d.start();
         } catch (Throwable var1) {
         }
      }

   }

   public static final void b() {
      if (d.C && d.j && d != null) {
         try {
            d.stop();
         } catch (Throwable var3) {
         }

         try {
            d.deallocate();
         } catch (Throwable var2) {
         }

         try {
            d.close();
         } catch (Throwable var1) {
         }

         d = null;
      }

   }

   public static final void b(int var0) {
      if (d.C && d.j) {
         if (b != null && (b.getState() == 400 || var0 == c)) {
            return;
         }

         try {
            if (c != -1) {
               if (var0 == c) {
                  return;
               }

               b.stop();
               b.deallocate();
               b.close();
               b = null;
            }

            String var1 = null;
            switch(var0) {
            case 0:
               var1 = "/bark.mp3";
               break;
            case 1:
               var1 = "/drink.mp3";
               break;
            case 2:
               var1 = "/eat.mp3";
               break;
            case 3:
               var1 = "/howl.mp3";
               break;
            case 4:
               var1 = "/pee.mp3";
               break;
            case 5:
               var1 = "/snarl.mp3";
               break;
            case 6:
               var1 = "/snore.mp3";
               break;
            case 7:
               var1 = "/whimper.mp3";
               break;
            case 8:
               var1 = "/wash.mp3";
               break;
            case 9:
               var1 = "/door_open.mp3";
               break;
            case 10:
               var1 = "/door_close.mp3";
            }

            b = Manager.createPlayer(a.getResourceAsStream(var1), "audio/mpeg3");
            var1 = null;
            c = var0;
         } catch (Throwable var2) {
         }
      }

   }

   public static final void a(int var0) {
      if (d.C && d.j) {
         try {
            if (c != var0 || b == null) {
               b(var0);
            }

            b.start();
         } catch (Throwable var2) {
         }
      }

   }

   public static final void c() {
      if (d.C && d.j && b != null) {
         try {
            b.stop();
         } catch (Throwable var3) {
         }

         try {
            b.deallocate();
         } catch (Throwable var2) {
         }

         try {
            b.close();
         } catch (Throwable var1) {
         }

         b = null;
         c = -1;
      }

   }
}
