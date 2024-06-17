import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public class a {
   public static int[] a;
   public static int[] c;
   public static boolean b;

   public static final byte[] a(String var0, int var1) {
      DataInputStream var2 = null;
      byte[] var3 = null;
      int var5 = 2;
      int var6 = -1;
      if (var1 == 0) {
         var1 = 4096;
      }

      byte[] var4;
      Object var9;
      try {
         var3 = new byte[var1];
         var2 = new DataInputStream((new String("")).getClass().getResourceAsStream(var0));

         while(var6 != 0) {
            var3[var5] = var2.readByte();
            ++var5;
            if (var5 == var1 && var6 != 1) {
               var4 = var3;
               var3 = new byte[var1 + 1024];
               System.arraycopy(var4, 0, var3, 0, var5);
               var1 += 1024;
               var9 = null;
            }

            if (var5 > 4 && var3[var5 - 1] == 68 && var3[var5 - 2] == 78 && var3[var5 - 3] == 69 && var3[var5 - 4] == 73) {
               var6 = 5;
            }

            if (var6 > 0) {
               --var6;
            }
         }
      } catch (Exception var8) {
         System.out.println("ERROR in loadImage(" + var0 + ")after " + var5 + " bytes : " + var8);
      }

      if (var5 != var1) {
         var4 = var3;
         var3 = new byte[var5];
         System.arraycopy(var4, 0, var3, 0, var5);
         var9 = null;
      }

      var3[0] = (byte)(var5 & 255);
      var3[1] = (byte)(var5 >> 8);
      System.gc();
      return var3;
   }

   public static final Image c(byte[] var0) {
      int var1 = (var0[1] << 8 & '\uff00') + (var0[0] & 255);
      Image var2 = null;

      try {
         var2 = Image.createImage(var0, 2, var1 - 2);
      } catch (Exception var4) {
      }

      return var2;
   }

   public static final Image b(String var0) {
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (Throwable var3) {
      }

      return var1;
   }

   public static final String[] d(String var0) {
      String[] var4 = new String[10];
      StringBuffer var6 = new StringBuffer();
      String var7 = "";
      boolean var8 = false;
      int var11 = 0;
      boolean var12 = false;
      DataInputStream var13 = new DataInputStream((new String("")).getClass().getResourceAsStream(var0));

      try {
         String[] var5;
         while(!var12) {
            var8 = false;
            var6.setLength(0);

            while(!var8) {
               byte var9 = var13.readByte();
               switch(var9) {
               case 10:
                  var8 = true;
               case 13:
                  break;
               case 92:
                  byte var14 = var13.readByte();
                  if (var14 == 110) {
                     var6.append('\n');
                  }
                  break;
               default:
                  char var10 = (char)(var9 & 255);
                  var6.append(var10);
               }
            }

            var7 = var6.toString();
            if (var7.equals("<EOF>")) {
               var12 = true;
            } else {
               if (var11 == var4.length) {
                  var5 = var4;
                  var4 = new String[var11 + 10];
                  System.arraycopy(var5, 0, var4, 0, var11);
                  var5 = null;
               }

               var4[var11++] = var7;
            }
         }

         var5 = var4;
         var4 = new String[var11];
         System.arraycopy(var5, 0, var4, 0, var11);
         var5 = null;
         System.gc();
      } catch (Throwable var23) {
      } finally {
         var6.setLength(0);
         var6 = null;

         try {
            var13.close();
         } catch (IOException var22) {
         }

         var13 = null;
      }

      System.gc();
      return var4;
   }

   public static final String[] a(String var0, int var1, int var2) {
      if (var0 == null && var2 > 0) {
         return null;
      } else {
         Vector var4 = new Vector();
         if (var0.trim().length() == 0) {
            var4.addElement("");
            String[] var12 = new String[var4.size()];
            var4.copyInto(var12);
            var4.setSize(0);
            System.gc();
            return var12;
         } else {
            Vector var5 = a(var0, '\n');

            Vector var6;
            StringBuffer var7;
            for(int var3 = 0; var3 < var5.size(); ++var3) {
               if (((String)var5.elementAt(var3)).length() == 0) {
                  var4.addElement("");
               } else {
                  var6 = a((String)var5.elementAt(var3), ' ');
                  var7 = new StringBuffer();
                  String var8 = (String)var6.elementAt(0);
                  if (d.a(var8, var1) > var2) {
                     String var9 = "";

                     for(short var11 = 0; var11 < var8.length(); ++var11) {
                        char var10 = var8.charAt(var11);
                        if (d.a(var9 + var10, var1) > var2) {
                           var4.addElement(var9);
                           var9 = "-" + var10;
                        } else {
                           var9 = var9 + var10;
                        }
                     }

                     var7.append(var9);
                  } else {
                     var7.append(var8);
                  }

                  for(short var14 = 1; var14 < var6.size(); ++var14) {
                     var8 = (String)var6.elementAt(var14);
                     if (d.a(var7.toString() + " " + var8, var1) > var2) {
                        var4.addElement(var7.toString());
                        var7.setLength(0);
                     } else {
                        var7.append(" ");
                     }

                     var7.append(var8);
                  }

                  var4.addElement(var7.toString());
                  var7.setLength(0);
                  var6.setSize(0);
               }

               var4.trimToSize();
            }

            String[] var13 = new String[var4.size()];
            var4.copyInto(var13);
            var4.setSize(0);
            var6 = null;
            var7 = null;
            System.gc();
            return var13;
         }
      }
   }

   private static final Vector a(String var0, char var1) {
      Vector var2 = new Vector();
      if (var0 != null && var0.length() != 0) {
         String var3 = var0.trim();
         if (!var3.endsWith(String.valueOf(var1))) {
            var3 = var3 + var1;
         }

         short var4 = 0;

         for(short var5 = (short)var3.indexOf(var1, var4); var5 >= 0; var5 = (short)var3.indexOf(var1, var4)) {
            var2.addElement(var3.substring(var4, var5));
            var4 = (short)(var5 + 1);
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static final String a(String var0, String[] var1) {
      StringBuffer var2 = new StringBuffer(var0.length());
      int var3 = 0;

      for(int var4 = var0.indexOf(36); var4 != -1; var4 = var0.indexOf(36, var3)) {
         char var5 = var0.charAt(var4 + 1);
         if (var5 >= 'A' && var5 <= 65 + var1.length) {
            var2.append(var0.substring(var3, var4));
            var2.append(var1[var5 - 65]);
            ++var4;
         } else {
            var2.append(var0.substring(var3, var4 + 1));
         }

         var3 = var4 + 1;
      }

      var2.append(var0.substring(var3));
      return var2.toString();
   }

   public static String a(String var0) {
      int var1 = var0.length();
      byte var2 = 0;
      byte var3 = 0;

      for(char[] var4 = var0.toCharArray(); var2 < var1 && var4[var3 + var1 - 1] <= ' '; --var1) {
      }

      return var2 <= 0 && var1 >= var0.length() ? var0 : var0.substring(var2, var1);
   }

   public static final int d(int var0) {
      var0 &= 255;
      return a[var0];
   }

   public static final int a(int var0) {
      var0 = var0 + 64 & 255;
      return a[var0];
   }

   private static final byte[] b(String var0, int var1) {
      byte[] var2;
      try {
         InputStream var6 = (new String()).getClass().getResourceAsStream(var0);
         var2 = new byte[var1];
         int var3 = 0;

         int var5;
         for(int var4 = var1; var4 != 0; var4 -= var5) {
            var5 = var6.read(var2, var3, var4);
            var3 += var5;
         }

         var6.close();
      } catch (Exception var7) {
         var2 = null;
      }

      return var2;
   }

   public static final void b() {
      a = new int[256];
      byte[] var0 = b("/sin.bin", 128);
      int var5 = 0;

      for(int var3 = 0; var3 < 2; ++var3) {
         int var6 = 2;
         int var1 = 0;

         for(int var2 = 0; var1 < 128; var2 += var6) {
            int var4;
            if (var1 == 64) {
               var4 = 65536;
               var6 = -var6;
            } else {
               var4 = var0[var2 + 0] & 255 | (var0[var2 + 1] & 255) << 8;
            }

            if (var3 == 1) {
               var4 = -var4;
            }

            a[var5] = var4;
            ++var5;
            ++var1;
         }
      }

      Object var7 = null;
      System.gc();
   }

   public static final int b(int var0) {
      return (var0 << 8) / 360;
   }

   public static final int c(int var0) {
      return var0 >= 0 ? var0 : -var0;
   }

   public static final int a(int var0, int var1) {
      short var2 = 8192;
      short var3 = 24576;
      int var4 = var1 >= 0 ? var1 : -var1;
      if (var4 == 0) {
         var4 = 1;
      }

      int var5;
      int var6;
      if (var0 >= 0) {
         var5 = (var0 - var4 << 8) / (var0 + var4);
         var6 = var2 - (var2 * var5 >> 8);
      } else {
         var5 = (var0 + var4 << 8) / (var4 - var0);
         var6 = var3 - (var2 * var5 >> 8);
      }

      var6 >>= 8;
      return var1 < 0 ? 256 - var6 : var6;
   }

   public static final byte[] c(String var0) {
      byte[] var1 = null;

      try {
         DataInputStream var2 = new DataInputStream((new String("")).getClass().getResourceAsStream(var0));
         int var3 = var2.readInt();
         int var4 = var2.readInt();
         var2.readInt();
         var1 = new byte[var4];
         var2.read(var1);
         var2.close();
         var2 = null;
         System.gc();
      } catch (Exception var5) {
      }

      return var1;
   }

   public static void a() {
      c = new int[256];

      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = -306674912 ^ var0 >> 1 & Integer.MAX_VALUE;
            } else {
               var0 = var0 >> 1 & Integer.MAX_VALUE;
            }
         }

         c[var1] = var0;
      }

      b = true;
   }

   public static final int b(byte[] var0) {
      boolean var1 = false;

      int var2;
      for(var2 = 0; var0[var2] != 80 || var0[var2 + 1] != 76 || var0[var2 + 2] != 84 || var0[var2 + 3] != 69; ++var2) {
      }

      return var2 - 4;
   }

   public static final byte[] a(byte[] var0) {
      int var1 = b(var0);
      int var3 = ((var0[var1++] & 255) << 24) + ((var0[var1++] & 255) << 16) + ((var0[var1++] & 255) << 8) + (var0[var1++] & 255);
      var1 += 4;
      byte[] var4 = new byte[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var0[var1++];
      }

      return var4;
   }

   public static final int a(byte[] var0, byte[] var1, byte[] var2, int var3, int var4) {
      if (!b) {
         a();
      }

      int var5;
      if (var4 != 0) {
         var5 = var4;
      } else {
         var5 = b(var0);
         var4 = var5;
      }

      int var7 = ((var0[var5++] & 255) << 24) + ((var0[var5++] & 255) << 16) + ((var0[var5++] & 255) << 8) + (var0[var5++] & 255);
      var5 += 4;
      int var6 = -1269336406;

      for(int var8 = 0; var8 < var7; ++var8) {
         int var9 = var1[var8] + ((var2[var8] - var1[var8]) * var3 >> 8);
         var0[var5] = (byte)var9;
         var6 = c[(var6 ^ var0[var5]) & 255] ^ var6 >> 8 & 16777215;
         ++var5;
      }

      var6 = ~var6;
      var0[var5++] = (byte)(var6 >> 24);
      var0[var5++] = (byte)(var6 >> 16);
      var0[var5++] = (byte)(var6 >> 8);
      var0[var5++] = (byte)var6;
      return var4;
   }

   static {
      new Random();
      c = null;
      b = false;
      byte[][] var10000 = new byte[c.bj.length][];
   }
}
