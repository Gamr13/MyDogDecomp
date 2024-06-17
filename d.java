import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class d extends Canvas implements CommandListener, Runnable {
   public static final short[][] V;
   public static String[] Z;
   public static boolean ag;
   public static boolean u;
   public static int s;
   public static int q;
   public static final long d;
   public static boolean n;
   public static int al;
   public static int au;
   public static String aM;
   public static boolean an;
   public static int ad;
   public static boolean C;
   public static boolean ab;
   public static boolean aD;
   public static boolean M;
   public static String g;
   public static boolean c;
   public static boolean a;
   public static long aG;
   public static int aH;
   public static int aL;
   public static long b;
   public Thread aA;
   public static boolean at;
   public static boolean ac;
   public static boolean aw;
   public static boolean aj;
   public static int U;
   public long w;
   public int ak;
   public static long I;
   public static long K;
   public static boolean y;
   public static Image O;
   public static MyDogMIDlet Q;
   public static c S;
   public static boolean ai;
   public static int D;
   public static int m;
   public static long k;
   public static boolean j;
   public static boolean p;
   public static boolean as;
   public static int aq;
   public static String P;
   public static String ah;
   public static boolean Y;
   public static long aC;
   public static int H;
   public static int B;
   public static int J;
   public static int v;
   public static long ay;
   public static boolean i;
   public static boolean f;
   public static boolean W;
   public static boolean[] e;
   public static boolean aJ;
   public static int ax;
   public static int aB;
   public static byte[] aa;
   public static int av;
   public static byte[] az;
   public static Command X;
   public static Command z;
   public static final byte[][] h;
   public static final boolean[] ap;
   public static final int[] l;
   public static int af;
   public static int T;
   public static final int[] L;
   public static int N;
   public static boolean ao;
   public static boolean o;
   public static boolean x;
   public static Image[] E;
   public static short[][] aF;
   public static short[][] am;
   public static byte[][] r;
   public static byte[] t;
   public static int[] aI;
   public static String aE;
   public static int ar;
   public static String[] aK;
   public static byte[] aN;
   public static Image[] R;
   public static short[][] G;
   public static byte[] A;
   public static byte[] ae;
   public static byte F;

   public d() {
      System.gc();
   }

   public final void c() {
      this.setFullScreenMode(true);
   }

   public static final void a(String var0, String var1) {
      boolean var2 = false;

      try {
         var2 = Q.platformRequest(var0);
      } catch (Throwable var5) {
         e.b(26);
      }

      if (var2) {
         try {
            if (!ag) {
               c.f();
               c.K();
               l();
            }

            Q.destroyApp(true);
         } catch (Exception var4) {
         }
      }

   }

   static {
      String var10000 = "";
      short[][] var0 = new short[35][];
      short[] var10003 = new short[]{5, 0, 90, 1, 90, 2, 89, 3, -4076, 7, -4076, 18, 0};
      f var10006 = c.C;
      var10003[12] = 41;
      var0[0] = var10003;
      var10003 = new short[]{24, 0, 91, 1, 91, 2, 89, 3, -4076, 7, -4076, 18, 0};
      var10006 = c.C;
      var10003[12] = 41;
      var0[1] = var10003;
      var10003 = new short[]{28, 0, 95, 1, 95, 2, 89, 3, -3052, 7, -3052, 18, 0};
      var10006 = c.C;
      var10003[12] = 44;
      var0[2] = var10003;
      var10003 = new short[]{27, 0, 93, 1, 93, 2, 89, 3, -3820, 7, -3820, 18, 0};
      var10006 = c.C;
      var10003[12] = 42;
      var0[3] = var10003;
      var10003 = new short[]{26, 0, 92, 1, 92, 2, 89, 3, -3564, 7, -3564, 18, 0};
      var10006 = c.C;
      var10003[12] = 43;
      var0[4] = var10003;
      var10003 = new short[]{25, 0, 94, 1, 94, 2, 89, 3, -3308, 7, -3308, 18, 0};
      var10006 = c.C;
      var10003[12] = 49;
      var0[5] = var10003;
      var10003 = new short[]{29, 0, 143, 1, 143, 2, 89, 3, 3584, 7, 3584, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 45;
      var10003[13] = 11;
      var10003[14] = 3584;
      var10003[15] = 14;
      var10003[16] = 12;
      var10003[17] = 15;
      var10003[18] = 8;
      var10003[19] = 16;
      var10003[20] = 0;
      var10003[21] = 17;
      var10003[22] = 0;
      var0[6] = var10003;
      var10003 = new short[]{23, 0, 142, 1, 142, 2, 89, 3, 1024, 7, 1024, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 40;
      var10003[13] = 16;
      var10003[14] = 0;
      var10003[15] = 17;
      var10003[16] = 0;
      var10003[17] = 14;
      var10003[18] = 8;
      var10003[19] = 15;
      var10003[20] = 8;
      var0[7] = var10003;
      var10003 = new short[]{20, 0, 151, 1, 151, 2, 89, 3, 4352, 7, 4352, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 33;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var10003[21] = 12;
      var10003[22] = 25;
      var10003[23] = 13;
      var10003[24] = 0;
      var0[8] = var10003;
      var10003 = new short[]{36, 0, 152, 1, 152, 2, 89, 3, 3840, 7, 3840, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 32;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 12;
      var10003[18] = 25;
      var10003[19] = 13;
      var10003[20] = 0;
      var10003[21] = 14;
      var10003[22] = 0;
      var10003[23] = 15;
      var10003[24] = 0;
      var0[9] = var10003;
      var10003 = new short[]{31, 0, 145, 1, 145, 2, 89, 3, 3328, 7, 3328, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 48;
      var10003[13] = 14;
      var10003[14] = 12;
      var10003[15] = 15;
      var10003[16] = 8;
      var10003[17] = 16;
      var10003[18] = 0;
      var10003[19] = 17;
      var10003[20] = 0;
      var0[10] = var10003;
      var10003 = new short[]{6, 0, 141, 1, 141, 2, 89, 3, 4096, 7, 4096, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 39;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var10003[21] = 12;
      var10003[22] = 25;
      var10003[23] = 13;
      var10003[24] = 0;
      var0[11] = var10003;
      var10003 = new short[]{33, 0, 156, 1, 156, 2, 89, 3, 11520, 7, 11520, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 38;
      var10003[13] = 16;
      var10003[14] = -4;
      var10003[15] = 17;
      var10003[16] = -28;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var0[12] = var10003;
      var10003 = new short[]{22, 0, 155, 1, 155, 2, 89, 3, 12032, 7, 12032, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 50;
      var10003[13] = 16;
      var10003[14] = -16;
      var10003[15] = 17;
      var10003[16] = -15;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var0[13] = var10003;
      var10003 = new short[]{35, 0, 149, 1, 149, 2, 89, 3, 11264, 7, 11264, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 31;
      var10003[13] = 16;
      var10003[14] = -13;
      var10003[15] = 17;
      var10003[16] = -28;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var0[14] = var10003;
      var10003 = new short[]{17, 0, 147, 1, 147, 2, 89, 3, 11776, 7, 11776, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 29;
      var10003[13] = 16;
      var10003[14] = -6;
      var10003[15] = 17;
      var10003[16] = -6;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var0[15] = var10003;
      var10003 = new short[]{7, 0, 139, 1, 139, 2, 89, 3, 3072, 7, 3072, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 27;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var10003[21] = 12;
      var10003[22] = 25;
      var10003[23] = 13;
      var10003[24] = 0;
      var0[16] = var10003;
      var10003 = new short[]{16, 0, 140, 1, 140, 2, 89, 3, 1792, 7, 1792, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 27;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var10003[21] = 12;
      var10003[22] = 25;
      var10003[23] = 13;
      var10003[24] = 0;
      var0[17] = var10003;
      var10003 = new short[]{8, 0, 106, 1, 106, 2, 107, 7, 10752, 8, 6, 9, 1000, 10, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[16] = 51;
      var10003[17] = 16;
      var10003[18] = 0;
      var10003[19] = 17;
      var10003[20] = 10;
      var10003[21] = 14;
      var10003[22] = 20;
      var10003[23] = 15;
      var10003[24] = 89;
      var0[18] = var10003;
      var10003 = new short[]{30, 0, 144, 1, 144, 2, 89, 3, 12544, 7, 12544, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 46;
      var10003[13] = 12;
      var10003[14] = 25;
      var10003[15] = 13;
      var10003[16] = 0;
      var10003[17] = 16;
      var10003[18] = -20;
      var10003[19] = 17;
      var10003[20] = -20;
      var10003[21] = 14;
      var10003[22] = -18;
      var10003[23] = 15;
      var10003[24] = 0;
      var0[19] = var10003;
      var10003 = new short[]{18, 0, 148, 1, 148, 2, 89, 3, 12800, 7, 12800, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 30;
      var10003[13] = 16;
      var10003[14] = -20;
      var10003[15] = 17;
      var10003[16] = -20;
      var10003[17] = 14;
      var10003[18] = 0;
      var10003[19] = 15;
      var10003[20] = 0;
      var10003[21] = 12;
      var10003[22] = 25;
      var10003[23] = 13;
      var10003[24] = 0;
      var0[20] = var10003;
      var10003 = new short[]{9, 0, 108, 1, 108, 2, 109, 7, 11008, 8, 4, 9, 200, 10, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[16] = 51;
      var10003[17] = 16;
      var10003[18] = 1;
      var10003[19] = 17;
      var10003[20] = 18;
      var10003[21] = 14;
      var10003[22] = 24;
      var10003[23] = 15;
      var10003[24] = 65;
      var0[21] = var10003;
      var0[22] = new short[]{11, 0, 96, 1, 96, 2, 89, 3, -1, 7, 2305, 16, 0, 17, -10, 14, 10, 15, 18};
      var0[23] = new short[]{12, 0, 96, 1, 96, 2, 89, 3, -1, 7, 2560, 9, 166, 8, 3, 10, 0, 16, 3, 17, -5, 14, 0, 15, 0};
      var0[24] = new short[]{13, 0, 96, 1, 96, 2, 89, 3, -1, 7, 2816, 9, 100, 8, 3, 10, 0, 16, -16, 17, 5, 14, 0, 15, 0};
      var10003 = new short[]{21, 0, 154, 1, 154, 2, 89, 3, -4076, 7, -4076, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      var10006 = c.C;
      var10003[12] = 27;
      var10003[13] = 16;
      var10003[14] = -10;
      var10003[15] = 17;
      var10003[16] = -10;
      var10003[17] = 14;
      var10003[18] = 25;
      var10003[19] = 15;
      var10003[20] = 0;
      var0[25] = var10003;
      var0[26] = new short[]{38, 7, 12288, 16, 0, 17, 0, 14, 0, 15, 0};
      var0[27] = new short[]{0, 0, 69, 1, 69, 2, 69, 3, 537, 7, 537, 16, -20, 17, -10, 14, 0, 15, -5};
      var0[28] = new short[]{10, 0, 69, 1, 69, 2, 69, 3, 538, 7, 538, 16, -24, 17, -10, 14, 0, 15, -5};
      var0[29] = new short[]{1, 0, 70, 1, 70, 2, 71, 16, 0, 17, 0, 14, 0, 15, 20};
      var0[30] = new short[]{15, 0, 70, 1, 70, 2, 71, 16, 0, 17, 0, 14, 0, 15, 33};
      var0[31] = new short[]{14, 0, 70, 1, 70, 2, 71, 16, 0, 17, 0, 14, 0, 15, 44};
      var0[32] = new short[]{2, 0, 97, 1, 97, 2, -1, 7, 2048, 9, 100, 8, 6, 10, 0, 16, -2, 17, 10, 14, 10, 15, 24};
      var0[33] = new short[]{3, 0, 86, 1, 86, 2, 88, 3, 1280, 7, 1282, 16, -24, 17, -11, 14, 25, 15, -8};
      var0[34] = new short[]{4, 0, 87, 1, 87, 2, 88, 3, 1281, 7, 1283, 16, -18, 17, -10, 14, 25, 15, -8, 16, -24, 17, -14, 14, 0, 15, 0};
      V = var0;
      ag = false;
      boolean var1 = false;
      var1 = false;
      var1 = true;
      var1 = true;
      long var2 = 0L;
      var10000 = "";
      u = true;
      s = 19;
      q = 19;
      d = System.currentTimeMillis();
      n = false;
      aM = null;
      M = false;
      g = null;
      var10000 = null;
      c = false;
      a = false;
      aG = 0L;
      aH = 0;
      aL = 0;
      b = 0L;
      at = false;
      ac = false;
      aw = false;
      Q = null;
      S = null;
      ai = false;
      D = 0;
      m = 0;
      k = 0L;
      j = false;
      p = false;
      as = false;
      aq = 0;
      P = "";
      ah = "";
      Y = false;
      aC = 0L;
      H = 0;
      B = 0;
      J = 0;
      v = 0;
      ay = 0L;
      i = false;
      f = false;
      W = false;
      e = new boolean[7];
      aJ = true;
      var10000 = null;
      ax = -4;
      aB = -4;
      var1 = false;
      X = null;
      z = null;
      h = new byte[][]{{35, 50, 48, 48, 53}, {42, 57}, {42, 42}, {42, 35, 42, 35}, {35, 35}, {35, 56, 51, 56}, {35, 50, 50, 55, 52}, {35, 56, 51, 57, 56}, {35, 56, 52, 55, 55}, {35, 55, 50, 52, 54, 56}, {35, 55, 52, 52, 56}};
      ap = new boolean[11];
      l = new int[8];
      af = 0;
      T = 0;
      L = new int[5];
      N = 0;
      x = false;
      aE = "/EN.txt";
      ar = -1;
   }

   public static int a(Calendar var0) {
      return var0.get(11);
   }

   public static final void a(Graphics var0, Image var1, int var2, int var3, int var4) {
      try {
         var0.drawImage(var1, var2, var3, var4);
      } catch (Throwable var6) {
      }

   }

   public static final void b(Graphics var0, int var1, int var2, int var3, int var4) {
      try {
         if (var4 < 0 || R[var1] == null) {
            return;
         }

         int var5 = var4 * 6;
         if (var5 > G[var1].length) {
            return;
         }

         var2 += G[var1][var5 + 0];
         var3 += G[var1][var5 + 1];
         var0.setClip(var2, var3, G[var1][var5 + 4], G[var1][var5 + 5]);
         var2 -= G[var1][var5 + 2];
         var3 -= G[var1][var5 + 3];
         a(var0, (Image)R[var1], var2, var3, 20);
      } catch (Throwable var6) {
      }

   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var4 * 6;

      try {
         if (var5 < 0 || var5 > G[var1].length || R[var1] == null) {
            return;
         }

         var0.setClip(var2, var3, G[var1][var5 + 4], G[var1][var5 + 5]);
         var2 -= G[var1][var5 + 2];
         var3 -= G[var1][var5 + 3];
         a(var0, (Image)R[var1], var2, var3, 20);
      } catch (Throwable var7) {
      }

   }

   public static final int a(int var0, int var1) {
      return var1 * 6 > G[var0].length ? 0 : G[var0][var1 * 6 + 5];
   }

   public static final int b(int var0, int var1) {
      return var1 * 6 > G[var0].length ? 0 : G[var0][var1 * 6 + 4];
   }

   public static final void a(int var0) {
      try {
         if (var0 != -1) {
            aN[var0] = -1;
            R[var0] = null;
            A[var0] = 0;
            ae[var0] = 0;
            G[var0] = null;
         }
      } catch (Exception var2) {
      }

   }

   private static int a(byte var0, Image var1, short[] var2) {
      if (aN == null) {
         aN = new byte[15];
         R = new Image[15];
         A = new byte[15];
         ae = new byte[15];
         G = new short[15][];
         F = 0;
         System.gc();
      }

      int var3;
      for(var3 = 0; var3 < F; ++var3) {
         if (var0 == aN[var3]) {
            return var3;
         }
      }

      int var4 = F;

      for(var3 = 0; var3 < F; ++var3) {
         if (aN[var3] == -1) {
            var4 = var3;
            break;
         }
      }

      if (var4 == F && F >= aN.length) {
         byte[] var5 = aN;
         aN = new byte[F + 5];
         System.arraycopy(var5, 0, aN, 0, F);
         Object var8 = null;
         Image[] var6 = R;
         R = new Image[F + 5];
         System.arraycopy(var6, 0, R, 0, F);
         var6 = null;
         var5 = A;
         A = new byte[F + 5];
         System.arraycopy(var5, 0, A, 0, F);
         var8 = null;
         var5 = ae;
         ae = new byte[F + 5];
         System.arraycopy(var5, 0, ae, 0, F);
         var8 = null;
         short[][] var7 = G;
         G = new short[F + 5][];

         for(var3 = 0; var3 < F; ++var3) {
            G[var3] = new short[var7[var3].length];
            System.arraycopy(var7[var3], 0, G[var3], 0, var7[var3].length);
         }

         var7 = (short[][])null;
         System.gc();
      }

      aN[var4] = var0;
      R[var4] = var1;
      G[var4] = var2;
      A[var4] = (byte)G[var4][4];
      ae[var4] = (byte)G[var4][5];
      if (var4 == F) {
         ++F;
      }

      System.gc();
      return var4;
   }

   public static final int a(byte var0, byte[] var1, String var2, boolean var3) {
      int var4 = -1;
      DataInputStream var5 = null;

      try {
         Image var6 = null;
         if (var3) {
            var6 = a.c(var1);
         }

         var5 = new DataInputStream((new String("")).getClass().getResourceAsStream(var2));
         short var7 = var5.readShort();
         short[] var8 = new short[var7];

         for(int var9 = 0; var9 < var7; ++var9) {
            var8[var9] = var5.readShort();
         }

         var4 = a(var0, var6, var8);
         Object var20 = null;
         System.gc();
      } catch (IOException var18) {
         var18.printStackTrace();
      } finally {
         if (null != var5) {
            try {
               var5.close();
            } catch (IOException var17) {
               var17.printStackTrace();
            }

            var5 = null;
            System.gc();
         }

      }

      return var4;
   }

   public static final int a(byte var0, byte[] var1, String var2) {
      int var3 = a(var0, var1, var2, true);
      return var3;
   }

   public static final void f(int var0) {
      if (var0 < R.length) {
         R[var0] = null;
         System.gc();
      }

   }

   public static final void a(int var0, byte[] var1) {
      System.gc();
      if (var0 < R.length) {
         R[var0] = a.c(var1);
      }

   }

   public static final void u() {
      ax = -4;
      aB = -4;
      c.H();
      c.N();
      c.p = -1;
      c.ay = -2;
      c.aK = -1;
      f var10000 = c.C;
      f.bo = 0;
      var10000 = c.C;
      f.bc = 0L;
      e.g = 0;
      e.Y = true;
      p = true;
      p();
      l();
      c.f();
      c.K();
      System.gc();
   }

   public static final void d() {
      ++B;
      v += 15;
      e.c(71);
   }

   public static final void c(int var0) {
      H += 1 << var0;
      v += 2;
      e.c(70);
   }

   public static final int a(long var0) {
      int var2 = (int)((var0 - aC) / 86400000L);
      long var3 = aC + (long)(var2 * 86400000);
      Calendar var5 = Calendar.getInstance();
      var5.setTime(new Date(var0));
      Calendar var6 = Calendar.getInstance();
      var6.setTime(new Date(var3));
      if (var5.get(5) != var6.get(5)) {
         ++var2;
      }

      return var2;
   }

   public static final long t() {
      long var0 = System.currentTimeMillis();
      aC = var0;
      return var0;
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var5 > 100) {
         var5 = 100;
      }

      int var11 = var3 - 1;
      int var12 = var4 - 1;
      var0.setClip(var1, var2, var11 + 1, var12 + 1);
      var0.setColor(var6);
      var0.drawRect(var1, var2, var11, var12);
      int var9 = var1 + 2;
      int var10 = var2 + 2;
      var11 -= 3;
      var12 -= 3;
      if (var7 != var8) {
         var0.setClip(var9, var10, var11, var12);
         var0.setColor(var7);
         var0.fillRect(var9, var10, var11, var12);
      }

      int var13 = var5 * var11 / 100;
      if (var13 > 0) {
         var0.setColor(var8);
         var0.fillRect(var9, var10, var13, var12);
      }

   }

   public static final void i(int var0) {
      O = a.b("/title.png");
      d(var0);
      I = System.currentTimeMillis() + 10000L;
   }

   public static final void a(Graphics var0, int var1) {
      var0.setClip(0, 0, al, au);
      var0.setColor(var1);
      var0.fillRect(0, 0, al, au);
   }

   public static boolean b() {
      boolean var0 = true;
      var0 = true;
      return var0;
   }

   private static final void w() {
      String var0 = Q.getAppProperty("MIDlet-Version");
      if (var0 != null) {
         aM = var0.trim();
      }

      var0 = Q.getAppProperty("FORCEDSCREENWIDTH");
      if (var0 != null) {
         al = Integer.parseInt(var0.trim());
      }

      var0 = Q.getAppProperty("FORCEDSCREENHEIGHT");
      if (var0 != null) {
         au = Integer.parseInt(var0.trim());
      }

      C = true;
      var0 = Q.getAppProperty("SOUNDNOTPRESENT");
      if (var0 != null) {
         var0 = var0.trim();
         if (var0.equals("Y") || var0.equals("y")) {
            C = false;
         }
      }

      ab = true;
      var0 = Q.getAppProperty("SOUNDDEFAULTOFF");
      if (var0 != null) {
         var0 = var0.trim();
         if (var0.equals("Y") || var0.equals("y")) {
            ab = false;
         }
      }

      j = ab;
      aD = false;
      var0 = Q.getAppProperty("SOFTKEYSWAP");
      if (var0 != null) {
         var0 = var0.trim();
         if (var0.equals("Y") || var0.equals("y")) {
            aD = true;
         }
      }

      ad = 1;
      var0 = Q.getAppProperty("UNITYFORCELANGUAGE");
      if (var0 != null) {
         var0 = var0.trim();
         an = true;
         if (!var0.equals("EN") && !var0.equals("en")) {
            if (!var0.equals("FR") && !var0.equals("fr")) {
               if (!var0.equals("IT") && !var0.equals("it")) {
                  if (!var0.equals("DE") && !var0.equals("de")) {
                     if (var0.equals("ES") || var0.equals("es")) {
                        ad = 5;
                     }
                  } else {
                     ad = 4;
                  }
               } else {
                  ad = 3;
               }
            } else {
               ad = 2;
            }
         } else {
            ad = 1;
         }
      }

      if (b()) {
         var0 = Q.getAppProperty("UNITYGAMECATALOGURL");
         if (var0 != null) {
            g = var0.trim();
         }
      }

      var0 = Q.getAppProperty("TIMECHEAT");
      if (var0 != null) {
         c = true;
      }

      var0 = Q.getAppProperty("AICHEAT");
      if (var0 != null) {
         a = true;
      }

   }

   public static final void l() {
      Object var0 = null;
      RecordStore var1 = null;

      try {
         var1 = RecordStore.openRecordStore("PPPet", true);
         if (var1 != null) {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3 = new DataOutputStream(var2);

            byte[] var24;
            try {
               var3.writeBoolean(as);

               int var4;
               for(var4 = 0; var4 < c.bn.length; ++var4) {
                  var3.writeShort(c.bn[var4]);
               }

               var3.writeBoolean(i);
               var3.writeBoolean(f);
               var3.writeBoolean(W);

               for(var4 = 0; var4 < 7; ++var4) {
                  var3.writeBoolean(e[var4]);
               }

               var3.writeInt(aq);

               for(var4 = 0; var4 < 10; ++var4) {
                  if (var4 < P.length()) {
                     var3.writeChar(P.charAt(var4));
                  } else {
                     var3.writeChar(0);
                  }
               }

               for(var4 = 0; var4 < 10; ++var4) {
                  if (var4 < ah.length()) {
                     var3.writeChar(ah.charAt(var4));
                  } else {
                     var3.writeChar(0);
                  }
               }

               var3.writeBoolean(Y);
               var3.writeLong(aC);
               var3.writeInt(H);
               var3.writeInt(B);
               var3.writeInt(c.N);
               var3.writeInt(J);
               var3.writeInt(v);
               var3.writeLong(ay);
               var3.writeInt(c.bH);
               f var10001 = c.C;
               var3.writeInt(f.ba);
               var3.writeInt(c.C.aE);
               var10001 = c.C;
               var3.writeInt(f.bH);
               var3.writeInt(c.bc);
               var3.writeInt(c.ad);
               var3.writeInt(c.aV);
               var3.writeInt(c.T);
               var3.writeInt(c.am);
               var3.writeBoolean(c.D);
               var3.writeInt(c.aK);
               var3.writeByte(c.by);
               var3.writeByte(c.bF);
               var3.writeByte(c.t);
               var4 = 0;

               label412:
               while(true) {
                  var10001 = c.C;
                  if (var4 >= 3) {
                     int var5;
                     for(var4 = 0; var4 < c.ce; ++var4) {
                        for(var5 = 0; var5 < c.bM[var4]; ++var5) {
                           for(int var6 = 0; var6 < 5; ++var6) {
                              var3.writeShort(c.ax[var4][var5 * 5 + var6]);
                           }
                        }
                     }

                     var4 = 0;

                     while(true) {
                        var10001 = c.C;
                        if (var4 >= 3) {
                           var10001 = c.C;
                           var3.writeInt(f.bv);
                           var10001 = c.C;
                           var3.writeInt(f.bD);
                           var10001 = c.C;
                           var3.writeInt(f.ca);
                           var10001 = c.C;
                           var3.writeInt(f.ci);
                           var10001 = c.C;
                           var3.writeInt(f.cv);
                           var10001 = c.C;
                           var3.writeInt(f.x);
                           var10001 = c.C;
                           var3.writeInt(f.cI);
                           var10001 = c.C;
                           var3.writeInt(f.h);
                           var10001 = c.C;
                           var3.writeInt(f.R);
                           var10001 = c.C;
                           var3.writeInt(f.L);
                           var10001 = c.C;
                           var3.writeInt(f.E);
                           var10001 = c.C;
                           var3.writeInt(f.D);
                           var10001 = c.C;
                           var3.writeInt(f.c);
                           var10001 = c.C;
                           var3.writeInt(f.K);
                           var10001 = c.C;
                           var3.writeInt(f.bL);
                           c var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.aQ);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.bs);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.av);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.A);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.ax);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.y);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.n);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.N);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.s);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.aM);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.cr);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeLong(f.bc);
                           var10001 = c.C;
                           var3.writeInt(f.bo);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.af);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.cs);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.p);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.k);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.e);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.ap);
                           var25 = S;
                           var10001 = c.C;
                           var3.writeInt(f.aa);
                           var10001 = c.C;
                           var3.writeLong(f.aN);
                           f var10000 = c.C;
                           b = f.aN;
                           var3.flush();
                           var24 = var2.toByteArray();
                           break label412;
                        }

                        var3.writeByte(c.ca[var4]);
                        var3.writeByte(c.ak[var4]);

                        for(var5 = 0; var5 < 20; ++var5) {
                           var3.writeByte(c.bW[var4][var5]);
                           var3.writeByte(c.ch[var4][var5]);
                           var3.writeByte(c.bh[var4][var5]);
                           var3.writeShort(c.bv[var4][var5]);
                           var3.writeShort(c.bL[var4][var5]);
                           var3.writeShort(c.O[var4][var5]);
                           var3.writeShort(c.aJ[var4][var5]);
                           var3.writeShort(c.cq[var4][var5]);
                           var3.writeShort(c.bT[var4][var5]);
                           var3.writeShort(c.cd[var4][var5]);
                           var3.writeByte(c.an[var4][var5]);
                           var3.writeLong(c.aW[var4][var5]);
                           var3.writeByte(c.Z[var4][var5]);
                           var3.writeByte(c.ap[var4][var5]);
                           var3.writeInt(c.U[var4][var5]);
                           var3.writeInt(c.aX[var4][var5]);
                           var3.writeShort(c.cw[var4][var5]);
                           var3.writeShort(c.c[var4][var5]);
                           var3.writeShort(c.aG[var4][var5]);
                           var3.writeLong(c.br[var4][var5]);
                           var3.writeByte(c.aS[var4][var5]);
                        }

                        ++var4;
                     }
                  }

                  var3.writeShort(c.q[var4]);
                  ++var4;
               }
            } finally {
               var3.close();
               var3 = null;
            }

            if (var1.getNumRecords() == 0) {
               var1.addRecord(var24, 0, var24.length);
            } else {
               var1.setRecord(1, var24, 0, var24.length);
            }

            var0 = null;
            System.gc();
         }
      } catch (Exception var22) {
         System.out.println("ERROR in writeRS() : " + var22.getMessage());
      } finally {
         try {
            var1.closeRecordStore();
         } catch (Throwable var20) {
         }

         var1 = null;
      }

   }

   public static final void p() {
      as = false;
      i = false;
      f = false;
      W = false;

      int var0;
      for(var0 = 0; var0 < 7; ++var0) {
         e[var0] = false;
      }

      aq = 0;
      P = " ";
      ah = " ";
      Y = false;
      aC = 0L;
      H = 0;
      B = 0;
      c.N = -1;
      J = 0;
      v = 0;
      ay = 0L;
      c.bH = 0;
      f var10000 = c.C;
      f.ba = 0;
      f var10001 = c.C;
      c.C.aE = 0;
      var10000 = c.C;
      var10000 = c.C;
      f.bH = 0;
      c.C.cp = 2;
      c.bc = 0;
      c.ad = 0;
      c.aV = 0;
      c.T = 0;
      c.am = 0;
      c.D = false;
      c.aK = -1;
      c.by = 0;
      c.t = 0;
      var0 = 0;

      while(true) {
         var10001 = c.C;
         if (var0 >= 3) {
            c.m();
            c.r();
            var10000 = c.C;
            f.bv = -1;
            var10000 = c.C;
            f.bD = -1;
            var10000 = c.C;
            f.C();
            return;
         }

         c.q[var0] = 0;
         ++var0;
      }
   }

   public static final void q() {
      Object var0 = null;
      RecordStore var1 = null;

      try {
         var1 = RecordStore.openRecordStore("PPSettings", true);
         if (var1 != null) {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DataOutputStream var3 = new DataOutputStream(var2);

            byte[] var9;
            try {
               var3.writeByte(ad);
               var3.writeBoolean(j);
               var3.flush();
               var9 = var2.toByteArray();
            } finally {
               var3.close();
               var3 = null;
            }

            if (var1.getNumRecords() == 0) {
               var1.addRecord(var9, 0, var9.length);
            } else {
               var1.setRecord(1, var9, 0, var9.length);
            }

            var0 = null;
            System.gc();
         }

         var1.closeRecordStore();
         var1 = null;
      } catch (Exception var8) {
      }

      var1 = null;
      var0 = null;
      System.gc();
   }

   public static final boolean j() {
      RecordStore var0 = null;
      boolean var1 = false;

      try {
         var0 = RecordStore.openRecordStore("PPPet", false);
         if (var0 != null) {
            byte[] var2 = var0.getRecord(1);
            DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var2));

            try {
               as = var3.readBoolean();

               int var4;
               for(var4 = 0; var4 < c.bn.length; ++var4) {
                  c.bn[var4] = var3.readShort();
               }

               if (!as || p) {
                  as = false;
                  p = false;
               }

               i = var3.readBoolean();
               f = var3.readBoolean();
               W = var3.readBoolean();

               for(var4 = 0; var4 < 7; ++var4) {
                  e[var4] = var3.readBoolean();
               }

               aq = var3.readInt();
               char[] var19 = new char[10];
               P = "";
               boolean var5 = true;

               int var6;
               char var7;
               for(var6 = 0; var6 < 10; ++var6) {
                  var7 = var3.readChar();
                  if (var7 != 0 && var5) {
                     P = P + var7;
                  } else {
                     var5 = false;
                  }
               }

               ah = "";
               var5 = true;

               for(var6 = 0; var6 < 10; ++var6) {
                  var7 = var3.readChar();
                  if (var7 != 0 && var5) {
                     ah = ah + var7;
                  } else {
                     var5 = false;
                  }
               }

               Y = var3.readBoolean();
               aC = var3.readLong();
               H = var3.readInt();
               B = var3.readInt();
               c.N = var3.readInt();
               J = var3.readInt();
               v = var3.readInt();
               ay = var3.readLong();
               n = false;
               c.bH = var3.readInt();
               c.bH = 0;
               f var10000 = c.C;
               f.ba = var3.readInt();
               c.C.cp = var3.readInt();
               var10000 = c.C;
               f.bH = var3.readInt();
               var10000 = c.C;
               f var10001 = c.C;
               if (f.bH >= 3) {
                  var10000 = c.C;
                  var10000 = c.C;
                  f.bH = 0;
               }

               var10001 = c.C;
               if (c.C.cp >= 3) {
                  var10001 = c.C;
                  c.C.cp = f.bH;
               }

               var10000 = c.C;
               var10001 = c.C;
               if (f.bH >= 3) {
                  var10000 = c.C;
                  var10000 = c.C;
                  f.bH = 0;
               }

               var10001 = c.C;
               if (c.C.cp >= 3) {
                  var10001 = c.C;
                  c.C.cp = f.bH;
               }

               c.bc = var3.readInt();
               c.ad = var3.readInt();
               c.aV = var3.readInt();
               c.T = var3.readInt();
               c.am = var3.readInt();
               c.D = var3.readBoolean();
               c.aK = var3.readInt();
               c.by = var3.readByte();
               c.bF = var3.readByte();
               c.t = var3.readByte();
               var6 = 0;

               label291:
               while(true) {
                  var10001 = c.C;
                  if (var6 >= 3) {
                     int var20;
                     for(var6 = 0; var6 < c.ce; ++var6) {
                        for(var20 = 0; var20 < c.bM[var6]; ++var20) {
                           for(int var8 = 0; var8 < 5; ++var8) {
                              c.ax[var6][var20 * 5 + var8] = var3.readShort();
                           }
                        }
                     }

                     var6 = 0;

                     while(true) {
                        var10001 = c.C;
                        if (var6 >= 3) {
                           var10000 = c.C;
                           f.bv = var3.readInt();
                           var10000 = c.C;
                           f.bD = var3.readInt();
                           var10000 = c.C;
                           f.ca = var3.readInt();
                           var10000 = c.C;
                           f.ci = var3.readInt();
                           var10000 = c.C;
                           f.cv = var3.readInt();
                           var10000 = c.C;
                           f.x = var3.readInt();
                           var10000 = c.C;
                           f.cI = var3.readInt();
                           var10000 = c.C;
                           f.h = var3.readInt();
                           var10000 = c.C;
                           f.R = var3.readInt();
                           var10000 = c.C;
                           f.L = var3.readInt();
                           var10000 = c.C;
                           f.E = var3.readInt();
                           var10000 = c.C;
                           f.D = var3.readInt();
                           var10000 = c.C;
                           f.c = var3.readInt();
                           var10000 = c.C;
                           f.K = var3.readInt();
                           var10000 = c.C;
                           f.bL = var3.readInt();
                           var10000 = c.C;
                           f.aQ = var3.readInt();
                           var10000 = c.C;
                           f.bs = var3.readInt();
                           var10000 = c.C;
                           f.av = var3.readInt();
                           var10000 = c.C;
                           f.A = var3.readInt();
                           var10000 = c.C;
                           f.ax = var3.readInt();
                           var10000 = c.C;
                           f.y = var3.readInt();
                           var10000 = c.C;
                           f.n = var3.readInt();
                           var10000 = c.C;
                           f.N = var3.readInt();
                           var10000 = c.C;
                           f.s = var3.readInt();
                           var10000 = c.C;
                           f.aM = var3.readInt();
                           var10000 = c.C;
                           f.cr = var3.readInt();
                           var10000 = c.C;
                           f.bc = var3.readLong();
                           var10000 = c.C;
                           f.bo = var3.readInt();
                           var10000 = c.C;
                           f.af = var3.readInt();
                           var10000 = c.C;
                           f.cs = var3.readInt();
                           var10000 = c.C;
                           f.p = var3.readInt();
                           var10000 = c.C;
                           f.k = var3.readInt();
                           var10000 = c.C;
                           f.e = var3.readInt();
                           var10000 = c.C;
                           f.ap = var3.readInt();
                           var10000 = c.C;
                           f.aa = var3.readInt();
                           long var22 = var3.readLong();
                           var10000 = c.C;
                           f.aX = 0L;
                           var10000 = c.C;
                           f.cE = var22;
                           var10000 = c.C;
                           f.Q = var22;
                           var10000 = c.C;
                           f.aN = System.currentTimeMillis();
                           var10000 = c.C;
                           if (f.aN < var22) {
                              var10000 = c.C;
                              var10001 = c.C;
                              f.aX = var22 - f.aN;
                              var10000 = c.C;
                              f.aN = var22;
                           }

                           var10000 = c.C;
                           long var23 = (long)f.bo;
                           var10001 = c.C;
                           f.bo = (int)(var23 + (f.aN - var22) / 1000L);
                           var10000 = c.C;
                           f.F();
                           var10000 = c.C;
                           f.E();
                           c.B();
                           var10000 = c.C;
                           f.H();
                           c.g = true;
                           break label291;
                        }

                        c.ca[var6] = var3.readByte();
                        c.ak[var6] = var3.readByte();

                        for(var20 = 0; var20 < 20; ++var20) {
                           c.bW[var6][var20] = var3.readByte();
                           c.ch[var6][var20] = var3.readByte();
                           c.bh[var6][var20] = var3.readByte();
                           c.bv[var6][var20] = var3.readShort();
                           short var21 = var3.readShort();
                           short var9 = var3.readShort();
                           short var10 = var3.readShort();
                           c.cq[var6][var20] = var3.readShort();
                           c.bT[var6][var20] = var3.readShort();
                           c.cd[var6][var20] = var3.readShort();
                           c.an[var6][var20] = var3.readByte();
                           c.aW[var6][var20] = var3.readLong();
                           c.Z[var6][var20] = var3.readByte();
                           c.ap[var6][var20] = var3.readByte();
                           c.U[var6][var20] = var3.readInt();
                           c.aX[var6][var20] = var3.readInt();
                           c.cw[var6][var20] = var3.readShort();
                           c.c[var6][var20] = var3.readShort();
                           c.aG[var6][var20] = var3.readShort();
                           c.br[var6][var20] = var3.readLong();
                           c.aS[var6][var20] = var3.readByte();
                           c.c(var20, var6, var21, var9, var10);
                        }

                        ++var6;
                     }
                  }

                  c.q[var6] = var3.readShort();
                  ++var6;
               }
            } catch (Throwable var15) {
            } finally {
               var3.close();
               Object var18 = null;
            }

            var0.closeRecordStore();
            var0 = null;
            System.gc();
            var1 = as;
         }
      } catch (Exception var17) {
      }

      n = as;
      return var1;
   }

   public static final boolean s() {
      RecordStore var0 = null;
      boolean var1 = false;

      try {
         var0 = RecordStore.openRecordStore("PPSettings", false);
         if (var0 != null) {
            byte[] var2 = var0.getRecord(1);
            DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var2));

            try {
               byte var4 = var3.readByte();
               if (!an) {
                  ad = var4;
               }

               j = var3.readBoolean();
            } finally {
               var3.close();
               Object var10 = null;
            }

            var0.closeRecordStore();
            var0 = null;
            System.gc();
            var1 = true;
         }
      } catch (Exception var9) {
      }

      return var1;
   }

   public static final void f() {
      aK = new String[7];
      aK[0] = P;
      aK[1] = ah;
      if (!Y) {
         aK[2] = Z[29];
         aK[3] = Z[33];
         aK[4] = Z[31];
      } else {
         aK[2] = Z[30];
         aK[3] = Z[34];
         aK[4] = Z[32];
      }

   }

   public static final void j(int var0) {
      if (ar != var0) {
         String var1 = null;
         switch(var0) {
         case 0:
         default:
            var1 = aE;
            break;
         case 1:
            var1 = "/EN.txt";
            break;
         case 2:
            var1 = "/FR.txt";
            break;
         case 3:
            var1 = "/IT.txt";
            break;
         case 4:
            var1 = "/DE.txt";
            break;
         case 5:
            var1 = "/ES.txt";
         }

         Z = a.d(var1);
         ar = var0;
      }
   }

   public static final int a(String var0, int var1) {
      int var2 = var0.length();
      int var3 = var2;

      while(var2-- > 0) {
         char var5 = var0.charAt(var2);
         if (var5 == '\t') {
            var3 += 12;
            var3 -= var3 % 12;
         } else if (var5 == '\n') {
            var3 += al;
         }

         int var4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".indexOf(var5);
         if (var4 == -1) {
            var3 += r[var1][0];
         } else {
            var3 += r[var1][var4];
         }
      }

      return var3;
   }

   public static final int a(Graphics var0, char var1, int var2, int var3, int var4) {
      int var5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".indexOf(var1);
      if (var5 == -1) {
         return r[var2][0];
      } else {
         var0.setClip(var3, var4, r[var2][var5], aI[var2]);
         a(var0, (Image)E[var2], var3 - aF[var2][var5], var4 - am[var2][var5], 20);
         return r[var2][var5];
      }
   }

   public static final void a(Graphics var0, String var1, int var2, int var3, int var4) {
      if (x) {
         int var5 = var0.getClipX();
         int var6 = var0.getClipY();
         int var7 = var0.getClipWidth();
         int var8 = var0.getClipHeight();
         int var9 = 0;

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            char var10 = var1.charAt(var11);
            if (var10 == '\t') {
               var9 += 12;
               var9 -= var9 % 12;
            } else {
               var9 += a(var0, var10, var2, var3 + var9, var4) + 1;
            }
         }

         var0.setClip(var5, var6, var7, var8);
      }
   }

   private static final void n() {
      E = new Image[2];
      aF = new short[2][];
      am = new short[2][];
      r = new byte[2][];
      t = new byte[2];
      aI = new int[2];
      E[0] = a.b("/smallFont.png");
      E[1] = a.b("/bigFont.png");
      DataInputStream var0 = null;

      try {
         var0 = new DataInputStream((new String("")).getClass().getResourceAsStream("/smallFont.dat"));
         byte var1;
         int var2;
         int var5;
         if (var0 != null) {
            var1 = var0.readByte();
            var5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".length();
            aF[0] = new short[var5];
            am[0] = new short[var5];
            r[0] = new byte[var5];
            aI[0] = var0.readByte();
            t[0] = 0;

            for(var2 = 0; var2 < var5; ++var2) {
               aF[0][var2] = var0.readShort();
               am[0][var2] = var0.readShort();
               r[0][var2] = var0.readByte();
               if (r[0][var2] > t[0]) {
                  t[0] = r[0][var2];
               }
            }
         }

         var0 = new DataInputStream((new String("")).getClass().getResourceAsStream("/bigFont.dat"));
         if (var0 != null) {
            var1 = var0.readByte();
            var5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".length();
            aF[1] = new short[var5];
            am[1] = new short[var5];
            r[1] = new byte[var5];
            aI[1] = var0.readByte();
            t[1] = 0;

            for(var2 = 0; var2 < var5; ++var2) {
               aF[1][var2] = var0.readShort();
               am[1][var2] = var0.readShort();
               r[1][var2] = var0.readByte();
               if (r[1][var2] > t[1]) {
                  t[1] = r[1][var2];
               }
            }
         }

         x = true;
      } catch (Exception var4) {
      }

      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Exception var3) {
      }

   }

   private static void x() {
      int var2 = af;
      if (T != var2) {
         int var3;
         for(var3 = 0; var3 < 11; ++var3) {
            boolean var4 = true;
            int var0 = h[var3].length - 1;

            for(int var1 = 1; var0 >= 0; ++var1) {
               if (l[var2 - var1 & 7] != h[var3][var0]) {
                  var4 = false;
                  break;
               }

               --var0;
            }

            if (var4) {
               ap[var3] = !ap[var3];
            }
         }

         T = var2;
         if (aH != 0 && e.g == 0 && c.bH == 0 && c.cr != 4) {
            switch(aL) {
            case 0:
               e.c(70);
               aL = 1;
               break;
            case 1:
               e.c(71);
               aL = 2;
               break;
            case 2:
               aH = 0;
            }
         }

         if (ap[7]) {
            ap[7] = false;
            aG = 0L;
            aH = 1;
            aL = 0;
         }

         if (ap[5] && e.g == 0 && c.bH == 0) {
            c.I();
            ap[5] = false;
         }

         if (ap[8] && e.g == 0 && c.bH == 0) {
            var3 = 60;

            for(int var5 = 0; var5 < 7; ++var5) {
               if (!e[var5]) {
                  var3 += var5;
                  break;
               }
            }

            if (var3 - 60 < 7) {
               e.c(var3);
            }

            ap[8] = false;
         }

         f var10000;
         if (ap[9]) {
            ap[9] = false;
            var10000 = c.C;
            ++f.ba;
            var10000 = c.C;
            f var10001 = c.C;
            f.ba %= f.cq;
            var10000 = c.C;
            aq = f.ba;
            var10000 = c.C;
            var10001 = c.C;
            Y = f.bp[f.ba];
            e.aI = true;
         }

         if (ap[10]) {
            c(1);
            ap[10] = false;
         }

         if (ap[6]) {
            ap[6] = false;
            v += 10;
         }

         if (ap[0]) {
            var10000 = c.C;
            var10000 = c.C;
            f.aL = !f.aL;
            ap[0] = false;
         }

         if (ap[2]) {
            if (a) {
               c.b(5);
            }

            ap[2] = false;
         }

         if (ap[3] && c) {
            var10000 = c.C;
            ++f.bx;
            var10000 = c.C;
            f.bx %= 9;
            ap[3] = false;
         }

         if (ap[4]) {
            var10000 = c.C;
            f.bx = 0;
            ap[4] = false;
         }

      }
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == X) {
         az[6] = 2;
      }

      if (var1 == z) {
         az[7] = 2;
      }

   }

   public static void g(int var0) {
      az[var0] = 0;
   }

   public static final boolean e(int var0) {
      boolean var1 = az[var0] != 0;
      az[var0] = 0;
      return var1;
   }

   public static final boolean b(int var0) {
      return az[var0] != 0;
   }

   private static void o() {
      for(int var0 = 0; var0 < az.length; ++var0) {
         if (az[var0] == 2) {
            az[var0] = 0;
         }
      }

   }

   public static void h() {
      for(int var0 = 0; var0 < L.length; ++var0) {
         L[var0] = 0;
      }

      N = 0;
      o = false;
   }

   public static void e() {
      for(int var0 = 0; var0 < az.length; ++var0) {
         az[var0] = 0;
      }

   }

   private static final byte[] h(int var0) {
      byte[] var2 = new byte[2];
      int var3 = 0;
      var2[0] = 0;
      var2[1] = 0;

      for(int var1 = 0; var1 < av; var1 += 2) {
         if (var0 == aa[var1]) {
            var2[var3++] = aa[var1 + 1];
            if (var3 == 2) {
               break;
            }
         }
      }

      return var2;
   }

   private static final void k() {
      String[] var0 = a.d("/keys.properties");
      av = var0.length << 1;
      aa = new byte[av];
      boolean[] var10000 = new boolean[av];
      int var1 = 0;

      for(int var5 = 0; var5 < var0.length; ++var5) {
         if (var0[var5].length() > 0) {
            int var2 = var0[var5].indexOf(61);
            String var4 = var0[var5].substring(0, var2).trim();
            String var3 = var0[var5].substring(var2 + 1).trim();
            aa[var1++] = (byte)Math.abs(Byte.parseByte(var4));
            aa[var1++] = Byte.parseByte(var3);
            if (aD) {
               switch(aa[var1 - 1]) {
               case 6:
                  aa[var1 - 1] = 7;
                  break;
               case 7:
                  aa[var1 - 1] = 6;
               }
            }
         }
      }

      var0 = null;
      System.gc();
   }

   public void keyReleased(int var1) {
      if (az != null && az.length != 0) {
         if (s != 19 && aJ) {
            byte[] var2 = h(Math.abs(var1));
            byte[] var10000 = az;
            var10000[var2[0]] = (byte)(var10000[var2[0]] & 2);
            var10000 = az;
            var10000[var2[1]] = (byte)(var10000[var2[1]] & 2);
         }
      }
   }

   public void keyPressed(int var1) {
      if (az != null && az.length != 0) {
         if (s != 19 && aJ) {
            if (ao && !c.a) {
               if (!o) {
                  L[N] = var1;
                  ++N;
                  if (N >= 5) {
                     o = true;
                  }
               }
            } else {
               l[af++] = var1;
               af &= 7;
               byte[] var2 = h(Math.abs(var1));
               az[var2[0]] = 3;
               az[var2[1]] = 3;
            }

         }
      }
   }

   public void paint(Graphics var1) {
      try {
         byte var2;
         int var3;
         switch(s) {
         case 0:
         case 19:
         case 22:
         case 25:
         default:
            break;
         case 1:
            a(var1, 16777215);
            if (O != null) {
               a(var1, (Image)O, al - O.getWidth() >> 1, au - O.getHeight() >> 1, 20);
            }
            break;
         case 2:
         case 3:
         case 18:
            aJ = true;
            if (s != 2 && s != 3 && U < 0) {
               break;
            }

            var1.setClip(0, 0, al, au);
            if (O != null) {
               int var11 = al - O.getWidth() >> 1;
               var3 = au - O.getHeight() >> 1;
               a(var1, (Image)O, var11, var3, 20);
            }

            var3 = au - 12;
            if (s == 18 && !aw) {
               a(var1, 1, var3, al - 2, 12, (8 - U) * 100 / 8, 9196089, 16770964, 15703114);
            }

            var3 -= aI[1] + 2;
            byte var5;
            int var7;
            String var13;
            if (s == 2) {
               var13 = Z[78];
               var5 = 15;
               byte var6 = 16;
               var7 = au - aI[1];
               byte var8 = 2;
               if (aD) {
                  byte var9 = var6;
                  var6 = var5;
                  var5 = var9;
               }

               a(var1, (String)Z[var5], 1, var8, var7);
               int var18 = al - (2 + a((String)Z[var6], 1));
               a(var1, (String)Z[var6], 1, var18, var7);
            } else if (s == 3) {
               var13 = Z[79];
            } else if (aw) {
               var13 = Z[2];
               var5 = 14;
               int var16 = au - aI[1];
               var7 = 2;
               if (aD) {
                  var7 = al - (2 + a((String)Z[var5], 1));
               }

               a(var1, (String)Z[var5], 1, var7, var16);
            } else {
               var13 = Z[80];
            }

            a(var1, (String)var13, 1, al - a((String)var13, 1) >> 1, var3);
            if (aw) {
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 12:
         case 14:
         case 15:
         case 17:
         case 23:
         case 24:
         case 26:
            if (e.aI) {
               e.e(var1);
            }
            break;
         case 9:
            S.b(var1);
            e.e(var1);
            break;
         case 10:
         case 11:
         case 13:
         case 16:
         case 27:
            if (e.aI) {
               S.b(var1);
               e.e(var1);
            }
            break;
         case 20:
         case 21:
            a(var1, 7967429);
            b(var1, e.aG[2], al - b(e.aG[2], 0) >> 1, au - a(e.aG[2], 0) >> 1, 0);
            if (aw) {
               a(var1, (String)Z[2], 1, al - a((String)Z[2], 1) >> 1, au + a(e.aG[2], 0) >> 1);
               var2 = 14;
               var3 = au - aI[1];
               int var4 = 2;
               if (aD) {
                  var4 = al - (2 + a((String)Z[var2], 1));
               }

               a(var1, (String)Z[var2], 1, var4, var3);
            } else {
               a(var1, (String)Z[80], 1, al - a((String)Z[80], 1) >> 1, au + a(e.aG[2], 0) >> 1);
               switch(c.C.cp) {
               case 0:
                  a(var1, (String)Z[74], 1, al - a((String)Z[74], 1) >> 1, (au + a(e.aG[2], 0) >> 1) + aI[1]);
                  break;
               case 1:
                  a(var1, (String)Z[73], 1, al - a((String)Z[73], 1) >> 1, (au + a(e.aG[2], 0) >> 1) + aI[1]);
                  break;
               case 2:
                  a(var1, (String)Z[72], 1, al - a((String)Z[72], 1) >> 1, (au + a(e.aG[2], 0) >> 1) + aI[1]);
               }

               a(var1, 1, au - 12, al - 2, 12, c.u * 100 / c.I, 16777215, 16777215, 16777215);
            }
         }

         if (ap[1] && a) {
            var1.setClip(0, 0, al, au);
            var1.setColor(0);
            var1.setFont(Font.getFont(64, 0, 8));
            var2 = 0;
            StringBuffer var10001 = (new StringBuffer()).append("Hunger ");
            f var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.L)).toString(), 0, 1 + var2, 15 + var2);
            var10001 = (new StringBuffer()).append("Thirst ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.E)).toString(), 0, 1 + var2, 30 + var2);
            var10001 = (new StringBuffer()).append("Energy ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.K)).toString(), 0, 1 + var2, 45 + var2);
            var10001 = (new StringBuffer()).append("Fun ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.D)).toString(), 0, 1 + var2, 60 + var2);
            var10001 = (new StringBuffer()).append("Comfort ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.c)).toString(), 0, 1 + var2, 75 + var2);
            var10001 = (new StringBuffer()).append("Mood ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.aG)).toString(), 0, 1 + var2, 90 + var2);
            var10001 = (new StringBuffer()).append("Obedience: ");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.s)).toString(), 0, 1 + var2, 105 + var2);
            var10001 = (new StringBuffer()).append("Needs:- ");
            var10002 = c.C;
            a(var1, (String)var10001.append(f.aW).toString(), 0, 1 + var2, 120 + var2);
            var10001 = (new StringBuffer()).append("poo:");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.cs)).toString(), 0, 80 + var2, 15 + var2);
            var10001 = (new StringBuffer()).append("wee:");
            var10002 = c.C;
            a(var1, (String)var10001.append(Integer.toString(f.p)).toString(), 0, 80 + var2, 30 + var2);
            Calendar var12 = Calendar.getInstance();
            f var10003 = c.C;
            var12.setTime(new Date(f.aN));
            String[] var15 = new String[]{" *1", " *2", " *4", " *30", " :1min/sec", " :6hr/min", " :12hr/min", " :1day/min", " :1week/min"};
            String var14 = var12.get(1) + "/" + var12.get(2) + "/" + var12.get(5);
            StringBuffer var10000 = (new StringBuffer()).append(a(var12)).append(":").append(var12.get(12));
            var10002 = c.C;
            String var17 = var10000.append(var15[f.bx]).toString();
            a(var1, (String)var14, 0, 90 + var2, 60 + var2);
            a(var1, (String)var17, 0, 90 + var2, 75 + var2);
            if (c.cr == 5) {
               a(var1, (String)"1=food 2=drink 3=pat 4=wash 5=fun", 0, 1 + var2, 140 + var2);
            }
         }
      } catch (Throwable var10) {
      }

   }

   private final void i() {
      x();
      f var10000;
      c var4;
      switch(s) {
      case 0:
      case 19:
      case 22:
      case 25:
      default:
         break;
      case 1:
         if (Z != null && System.currentTimeMillis() > I) {
            if (aj && !an) {
               e.b(4);
            } else if (!C) {
               U = 8;
               i(18);
            } else {
               i(2);
            }
         } else if (Z == null) {
            k();
            az = new byte[aa.length / 2];
            n();
            j(ad);
            f();
         }
         break;
      case 2:
         if (e(6)) {
            j = true;
            b.a();
            e.b(18);
            U = 8;
         } else if (e(7) || I < System.currentTimeMillis()) {
            j = false;
            e.b(18);
            U = 8;
         }
         break;
      case 3:
         if (e(8)) {
            e.b(18);
            U = 8;
         }
         break;
      case 4:
         e.a();
         e.s();
         break;
      case 5:
         c.C.g();
         e.a();
         e.s();
         break;
      case 6:
      case 7:
      case 8:
      case 17:
         e.a();
         break;
      case 9:
         e.a();
         if (as) {
            c.w();
            e.s();
         }
         break;
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 23:
      case 24:
      case 26:
      case 27:
         e.a();
         break;
      case 18:
         if (aw) {
            if (e(6)) {
               aw = false;
            }
         } else {
            if (M && U == 8) {
               U = 1;
            }

            long var3 = System.currentTimeMillis();
            switch(U) {
            case 0:
               c.g = false;
               O = null;
               i = false;
               f = false;
               W = false;
               e.aM = 0;
               c.b(0);
               if (!j()) {
                  p();
                  l();
               }

               f();
               var10000 = c.C;
               b = f.aN;
               if (as) {
                  c.d(c.C.cp, c.C.cp);
                  e.b(21);
                  if (!i) {
                     e.Q = 1;
                  }
               } else {
                  e.z = "          ";
                  e.b(7);
                  var10000 = c.C;
                  f.p();
               }
               break;
            case 1:
               var4 = S;
               c.e();
               break;
            case 2:
               var4 = S;
               c.o();
               break;
            case 3:
               var4 = S;
               if (!c.E()) {
                  return;
               }
               break;
            case 4:
               a.b();
               break;
            case 5:
               var4 = S;
               c.C();
               break;
            case 6:
               S = new c();
               break;
            case 7:
               e.k();
            case 8:
            }

            --U;
         }
         break;
      case 20:
         var4 = S;
         if (!c.a) {
            var4 = S;
            var4 = S;
            c var10001 = S;
            c.d(c.C.cp, c.C.cp);
         }

         e.b(21);
         break;
      case 21:
         if (aw) {
            if (e(6)) {
               aw = false;
            }
         } else if (!c.a) {
            int var1 = c.e(38, -1);
            if (var1 != -1) {
               c.q(var1, c.aU);
            }

            b.b();
            var10000 = c.C;
            f.cK = false;
            e.b(9);
            if (!i) {
               f();
               e.c(e.Q);
            }
         } else {
            c.h();
         }
      }

   }

   public void run() {
      try {
         if (!ai) {
            this.c();
            this.r();
            ai = true;
         }

         while(!at) {
            this.w = System.currentTimeMillis();
            q = 19;
            this.g();
            ao = true;
            if (c.a) {
               h();
               ao = false;
            }

            this.i();
            ao = false;
            o();
            this.repaint();
            this.serviceRepaints();
            if (!this.isShown() && s == 9) {
               q = 10;
            }

            if (q != 19) {
               d(q);
            }

            ++D;
            if (System.currentTimeMillis() - k >= 1000L) {
               m = D;
               D = 0;
               k = System.currentTimeMillis();
            }

            if (!at) {
               this.ak = 100 - (int)(System.currentTimeMillis() - this.w);
               if (this.ak < 1) {
                  this.ak = 1;
               }

               if (this.ak > 0) {
                  try {
                     Thread.sleep((long)this.ak);
                  } catch (Exception var2) {
                  }
               }
            }
         }

         this.y();
      } catch (Throwable var3) {
      }

   }

   public final void g() {
      for(int var1 = 0; var1 < N; ++var1) {
         this.keyPressed(L[var1]);
      }

      N = 0;
   }

   public static void d(int var0) {
      if (var0 == 20) {
         c.u = 0;
         aw = false;
      }

      if (var0 == 10) {
         f var10000 = c.C;
         f.ar = false;
      }

      s = var0;
      e.a(var0);
      q = 19;
   }

   public final void m() {
      ac = true;
      if (this.aA == null) {
         k = System.currentTimeMillis();
         at = false;
         ac = false;
         if (y) {
            long var1 = k - K;
            f var10000 = c.C;
            f.aC += var1;
            y = false;
         }

         if (q != 19) {
            d(q);
         }

         this.aA = new Thread(this);
         this.aA.start();
      } else {
         b.b();
         b.c();
      }

      if (ai) {
         e.aI = true;
      }

   }

   public static final void a() {
      switch(s) {
      case 1:
      case 4:
         j = false;
         break;
      case 9:
         q = 10;
         break;
      case 18:
      case 21:
         aw = true;
      }

   }

   private final void y() {
      if (this.aA != null) {
         K = System.currentTimeMillis();
         y = true;
         f var10000 = c.C;
         f.ar = false;
         this.aA = null;
         b.b();
         b.c();
         e();
         a();
      }

      if (ac) {
         this.m();
      }

   }

   public void showNotify() {
      this.m();
   }

   public void hideNotify() {
      at = true;
   }

   private final void r() {
      al = this.getWidth();
      au = this.getHeight();
      w();
      aJ = false;
      aj = false;

      for(int var1 = 0; var1 < c.bn.length; ++var1) {
         c.bn[var1] = 0;
      }

      if (!s()) {
         aj = true;
         if (!an && ad == 0) {
            ad = 1;
         }

         q();
      }

      System.gc();
      O = a.b("/splash.png");
      I = System.currentTimeMillis() + 2000L;
      s = 1;
      q = 19;
   }

   public static final void v() {
      MyDogMIDlet.b.aA = null;
      ay = System.currentTimeMillis();
      if (n) {
         i = true;
         q();
         l();
      }

   }

   public d(MyDogMIDlet var1) {
      this();
      System.gc();
      n = false;
      Q = var1;
      q = 19;
      MyDogMIDlet.a.setCurrent(this);
      System.gc();
   }
}
