import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c {
   public static f C = null;
   public static boolean g;
   public static boolean bw = false;
   public static final int cb;
   public static final int bG;
   public static final int bs;
   public static final int[] cC;
   public static Image[] bz;
   public static byte[][] bb;
   public static byte[][] ab;
   public static short[] ba;
   public static final int ce;
   public static short[][] ax;
   public static short[] q;
   public static String j;
   public static final byte[] b;
   public static final String[] bj;
   public static short[] bn;
   public static final int aM;
   public static final int az;
   public static int e;
   public static int k;
   public static Image[] F;
   public static short[][] w;
   public static byte[][] ch;
   public static byte[][] bW;
   public static byte[][] bh;
   public static short[][] bv;
   public static short[][] bL;
   public static short[][] O;
   public static short[][] aJ;
   public static short[][] cq;
   public static short[][] bT;
   public static short[][] cd;
   public static short[][] bg;
   public static short[][] ag;
   public static byte[][] an;
   public static long[][] aW;
   public static int[][] U;
   public static int[][] aX;
   public static short[][] cw;
   public static short[][] c;
   public static short[][] aG;
   public static long[][] br;
   public static byte[][] aS;
   public static byte[] ca;
   public static byte[] ak;
   public static byte[][] Z;
   public static byte[][] ap;
   public static int P;
   public static int bU;
   public static final int r;
   public static int n;
   public static int z;
   public static int cj;
   public static int h;
   public static int cm;
   public static int cv;
   public static int S;
   public static int ar;
   public static int s;
   public static int y;
   public static int bm;
   public static int bC;
   public static int M;
   public static boolean G;
   public static int aa;
   public static int al;
   public static int bJ;
   public static String J;
   public static int cB;
   public static short[] bB;
   public static short[] be;
   public static short[] bR;
   public static short[] bk;
   public static short[] aT;
   public static int bE;
   public static int aU;
   public static boolean aP;
   public static boolean ah;
   public static int bH;
   public static int cr;
   public static int cD;
   public static int aB;
   public static boolean ai;
   public static final byte[][] W;
   public static int bc;
   public static int ad;
   public static boolean D;
   public static Image i;
   public static int[] Q;
   public static byte[] L;
   public static byte[][] bX;
   public static int ci;
   public static int[] bM;
   public static Image ct;
   public static byte[] d;
   public static int l;
   public static int K;
   public static String ae;
   public static String B;
   public static String A;
   public static boolean v;
   public static int p;
   public static int ay;
   public static boolean a;
   public static int m;
   public static int I;
   public static int u;
   public static int bY;
   public static int bZ;
   public static int bP;
   public static int cg;
   public static int E;
   public static int av;
   public static int aO;
   public static int aw;
   public static int N;
   public static boolean aI;
   public static int cp;
   public static int bS;
   public static int cc;
   public static byte[] bf;
   public static short[][] af;
   public static int am;
   public static int aV;
   public static int T;
   public static final int aq;
   public static int bx;
   public static int bu;
   public static int aZ;
   public static int aD;
   public static final short[] cn;
   public static final short[] cs;
   public static final short[] bD;
   public static final short[] bp;
   public static final short[][] V;
   public static final int Y;
   public static int at;
   public static int R;
   public static long bO;
   public static long aN;
   public static boolean aF;
   public static boolean bV;
   public static int cA;
   public static String[] co;
   public static int cl;
   public static int f;
   public static int ck;
   public static boolean bN;
   public static boolean ac;
   public static Image x;
   public static int ao;
   public static final short[] o;
   public static final short[] X;
   public static final int[][] aj;
   public static short[] bI;
   public static int H;
   public static int cz;
   public static int bA;
   public static int bd;
   public static int[] bQ;
   public static final int[][][] bi;
   public static boolean au;
   public static int aE;
   public static int aA;
   public static int bt;
   public static int aY;
   public static int bl;
   public static int aK;
   public static int cu;
   public static int aC;
   public static int aH;
   public static int bq;
   public static int[] aQ;
   public static int as;
   public static final int[] aR;
   public static int cy;
   public static int aL;
   public static byte bF;
   public static byte by;
   public static byte t;
   public static int[] cx;
   public static int[] bK;
   public static int[][] cf;
   public static final byte[][] bo;

   public c() {
      System.gc();
   }

   public static final void e() {
      C.b();
      v();
      O();
      r();
      m();
      aP = true;
   }

   public static final void C() {
      C = new f();
   }

   public static final boolean E() {
      return C.o();
   }

   public static final void o() {
      f var10000 = C;
      f.a("/ai.bin");
      d.M = true;
   }

   private static final void v() {
      int var0;
      for(var0 = 0; var0 < bs; ++var0) {
         bz[var0] = null;
         bb[var0] = null;
      }

      for(var0 = 0; var0 < Q.length; ++var0) {
         Q[var0] = -1;
      }

      f.bR = 0;
      f.cn = 0;
      f.cw = 38;
      f.G = 55;
      C.cp = 2;
      b(0);
   }

   public static final int q(int var0, int var1) {
      ++ak[var1];
      bW[var1][var0] = -1;
      byte var2 = ap[var1][var0];
      byte var3 = Z[var1][var0];
      if (var2 == -1) {
         ca[var1] = var3;
      } else {
         Z[var1][var2] = var3;
      }

      if (var3 != -1) {
         ap[var1][var3] = var2;
      } else {
         var3 = ca[var1];
      }

      if ((an[var1][var3] & 1) == 0) {
         var3 = (byte)r(var1, var3);
      }

      if (bE == var0 && C.aE == var1) {
         bE = var3;
      }

      return var3;
   }

   public static final int l(int var0, int var1) {
      byte var2 = ca[var1];
      int var3 = 0;
      if (var2 == -1) {
         return 0;
      } else {
         for(; var2 != -1; var2 = Z[var1][var2]) {
            if (bW[var1][var2] == var0) {
               ++var3;
            }
         }

         return var3;
      }
   }

   public static final void c(int var0, int var1, int var2, int var3, int var4) {
      bL[var1][var0] = (short)var2;
      O[var1][var0] = (short)var3;
      aJ[var1][var0] = (short)var4;
      short[] var10000 = bg[var1];
      f var10002 = C;
      var10000[var0] = f.e(var2, var3, var4);
      var10000 = ag[var1];
      var10002 = C;
      var10000[var0] = f.c(var2, var3, var4);
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, long var6) {
      byte var9 = ca[var4];
      boolean var10 = true;
      short var8;
      if ((var5 & 2) != 0) {
         var8 = w[var0][7];
      } else {
         var8 = w[var0][3];
      }

      short var13 = w[var0][18];
      byte var11;
      byte var12;
      byte var16;
      if (var9 == -1) {
         var16 = 0;
         var11 = -1;
         var12 = -1;
         ak[var4] = 20;
      } else {
         if (ak[var4] == 0) {
            return;
         }

         for(var16 = 0; bW[var4][var16] != -1; ++var16) {
         }

         if (var3 > aJ[var4][var9]) {
            var11 = -1;
            var12 = var9;
         } else {
            byte var14 = Z[var4][var9];

            while(var14 != -1) {
               var9 = var14;
               var14 = Z[var4][var14];
               if (var3 > aJ[var4][var9]) {
                  var14 = -1;
               }
            }

            var11 = ap[var4][var9];
            var12 = var9;
            if (var3 <= aJ[var4][var9]) {
               var11 = var9;
               var12 = -1;
            }
         }
      }

      bW[var4][var16] = (byte)var0;
      ch[var4][var16] = (byte)var13;
      bh[var4][var16] = 0;
      an[var4][var16] = (byte)var5;
      bv[var4][var16] = (short)var8;
      aW[var4][var16] = var6;
      br[var4][var16] = 0L;
      aS[var4][var16] = 0;
      bL[var4][var16] = (short)var1;
      O[var4][var16] = (short)var2;
      aJ[var4][var16] = (short)var3;
      bT[var4][var16] = (short)(var1 + w[var0][12]);
      cd[var4][var16] = (short)(var3 + w[var0][13]);
      short[] var10000 = bg[var4];
      f var10002 = C;
      var10000[var16] = f.e(var1, var2, var3);
      var10000 = ag[var4];
      var10002 = C;
      var10000[var16] = f.c(var1, var2, var3);
      cq[var4][var16] = (short)(a.a(w[var0][13], -w[var0][12]) & 255);
      ap[var4][var16] = var11;
      Z[var4][var16] = var12;
      if (var12 != -1) {
         ap[var4][var12] = var16;
      }

      if (var11 == -1) {
         ca[var4] = var16;
      } else {
         Z[var4][var11] = var16;
      }

      --ak[var4];
      if (d != null && var0 != -1) {
         short var17 = w[var0][7];
         if (var17 == -1) {
            var17 = w[var0][3];
         }

         if (var17 != -1) {
            f var10001 = C;
            int var15 = var17 >>> 8;
            if (var15 >= 4 && var15 < 240 && d[var15 - 4] == 2) {
               d.a(Q[var15 - 4], bX[L[var15 - 4]]);
               d[var15 - 4] = 4;
            }
         }
      }

      switch(var0) {
      case 5:
      case 6:
      case 7:
      case 21:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
         U[var4][var16] = 0;
         aX[var4][var16] = 0;
         c[var4][var16] = (short)var1;
         aG[var4][var16] = (short)var3;
         cw[var4][var16] = 16384;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 18:
      case 19:
      case 20:
      case 23:
      case 29:
      case 30:
      case 31:
      case 32:
      case 34:
      default:
         break;
      case 17:
      case 22:
      case 33:
      case 35:
         U[var4][var16] = 0;
         aX[var4][var16] = 0;
         c[var4][var16] = (short)var1;
         aG[var4][var16] = (short)var3;
         a(var16, var4, 32);
      }

   }

   public static final void d(int var0, int var1, int var2, int var3) {
      f var10001 = C;
      if (var3 < 3) {
         byte var4 = ca[var3];
         boolean var5 = false;
         if (var4 != -1) {
            for(; var4 != -1; var4 = Z[var3][var4]) {
               if (bh[var3][var4] > 0) {
                  --bh[var3][var4];
               } else {
                  switch(ch[var3][var4]) {
                  case 29:
                  case 31:
                  case 38:
                  case 50:
                     if (a(var4, var3, var0, var2, 20)) {
                        bh[var3][var4] = 10;
                     }
                  case 30:
                  case 32:
                  case 33:
                  case 34:
                  case 35:
                  case 36:
                  case 37:
                  case 39:
                  case 40:
                  case 45:
                  case 46:
                  case 47:
                  case 48:
                  default:
                     break;
                  case 41:
                  case 42:
                  case 43:
                  case 44:
                  case 49:
                     if (b(var4, var3, var0, var2, 20)) {
                        bh[var3][var4] = 10;
                     }
                  }
               }
            }

         }
      }
   }

   public static final boolean e(int var0) {
      f var10001 = C;
      var0 %= 3;

      for(byte var1 = ca[var0]; var1 != -1; var1 = Z[var0][var1]) {
         if (ch[var0][var1] >= 27 && (an[var0][var1] & 2) != 0) {
            return true;
         }
      }

      return false;
   }

   public static final int a(int var0) {
      for(byte var1 = ca[var0]; var1 != -1; var1 = Z[var0][var1]) {
         if (ch[var0][var1] >= 27 && ch[var0][var1] < 51) {
            return var1;
         }
      }

      return -1;
   }

   public static final int e(int var0, int var1) {
      if (var1 == -1) {
         f var10001 = C;
         int var3 = e(var0, 0);
         if (var3 == -1) {
            var10001 = C;
            var3 = e(var0, 1);
            if (var3 == -1) {
               var10001 = C;
               var3 = e(var0, 2);
            }
         }

         return var3;
      } else {
         aU = var1;
         if (ak[var1] != 20) {
            for(byte var2 = ca[var1]; var2 != -1; var2 = Z[var1][var2]) {
               if (bW[var1][var2] == var0) {
                  return var2;
               }
            }
         }

         return -1;
      }
   }

   public static final void H() {
      F = null;

      int var0;
      for(var0 = 0; var0 < 40; ++var0) {
         w[var0] = null;
      }

      var0 = 0;

      while(true) {
         f var10001 = C;
         if (var0 >= 3) {
            return;
         }

         bW[var0] = null;
         ch[var0] = null;
         bh[var0] = null;
         bv[var0] = null;
         aW[var0] = null;
         br[var0] = null;
         aS[var0] = null;
         an[var0] = null;
         bL[var0] = null;
         O[var0] = null;
         aJ[var0] = null;
         cq[var0] = null;
         c[var0] = null;
         aG[var0] = null;
         U[var0] = null;
         aX[var0] = null;
         cw[var0] = null;
         bT[var0] = null;
         cd[var0] = null;
         bg[var0] = null;
         ag[var0] = null;
         Z[var0] = null;
         ap[var0] = null;
         ++var0;
      }
   }

   public static final void r() {
      H();

      int var0;
      for(var0 = 0; var0 < 40; ++var0) {
         w[var0] = new short[19];
      }

      F = new Image[0];
      var0 = 0;

      while(true) {
         f var10001 = C;
         int var1;
         if (var0 >= 3) {
            for(var0 = 0; var0 < 40; ++var0) {
               w[var0][9] = 0;
               w[var0][6] = 0;
               w[var0][12] = 0;
               w[var0][13] = 0;
               w[var0][14] = 0;
               w[var0][15] = 0;
               w[var0][16] = 0;
               w[var0][17] = 0;
               w[var0][3] = -1;
               w[var0][7] = -1;
               w[var0][8] = -1;
               w[var0][4] = -1;
               w[var0][10] = 1;
               w[var0][5] = 1;
               w[var0][11] = -1;
               w[var0][18] = -1;
            }

            byte var5 = 1;
            w[var5][0] = 70;
            w[var5][1] = 70;
            w[var5][2] = -1;
            var5 = 15;
            w[var5][0] = 70;
            w[var5][1] = 70;
            w[var5][2] = -1;
            var5 = 14;
            w[var5][0] = 70;
            w[var5][1] = 70;
            w[var5][2] = -1;
            var5 = 2;
            w[var5][0] = 97;
            w[var5][1] = 97;
            w[var5][2] = -1;
            w[var5][7] = 2048;
            w[var5][8] = 6;
            w[var5][9] = 100;
            w[var5][10] = 0;
            w[var5][14] = 10;
            w[var5][15] = 0;
            var5 = 3;
            w[var5][0] = 86;
            w[var5][1] = 86;
            w[var5][2] = 88;
            w[var5][3] = 1280;
            w[var5][7] = 1282;
            w[var5][16] = -18;
            w[var5][17] = -6;
            w[var5][12] = 25;
            w[var5][13] = -8;
            var5 = 4;
            w[var5][0] = 87;
            w[var5][1] = 87;
            w[var5][2] = 88;
            w[var5][3] = 1281;
            w[var5][7] = 1283;
            w[var5][16] = -18;
            w[var5][17] = -10;
            w[var5][12] = 25;
            w[var5][13] = -8;

            int var2;
            for(var1 = 0; var1 < d.V.length; ++var1) {
               short var7 = d.V[var1][0];

               short var3;
               short var4;
               for(var2 = 1; var2 < d.V[var1].length; w[var7][var3] = var4) {
                  var3 = d.V[var1][var2++];
                  var4 = d.V[var1][var2++];
               }
            }

            for(var1 = 0; var1 < 40; ++var1) {
               if (w[var1][11] == -1) {
                  var2 = w[var1][3];
                  if (var2 == -1) {
                     var2 = w[var1][7];
                     if (var2 == -1) {
                        var2 = 61460;
                     }
                  }

                  w[var1][11] = (short)var2;
               }
            }

            long var6 = System.currentTimeMillis();
            f var8 = C;
            var8 = C;
            f.m = 3;
            var8 = C;
            var8 = C;
            f.m = 18;
            f var10004 = C;
            a(4, 34, 0, 130, 0, 4, var6);
            var10004 = C;
            a(3, 55, 0, 86, 0, 4, var6);
            var10004 = C;
            a(1, 10, 120, 256, 0, 1, var6);
            var10004 = C;
            a(2, 140, 254, 220, 0, 5, var6);
            var10004 = C;
            a(11, 0, 64, 200, 2, 1, var6);
            var10004 = C;
            a(14, 120, 100, 256, 2, 1, var6);
            var10004 = C;
            a(8, 0, 380, 160, 1, 5, var6);
            var10004 = C;
            a(15, 24, 60, 256, 1, 1, var6);
            var10004 = C;
            a(9, 104, 44, 300, 1, 5, var6);
            k();
            return;
         }

         bW[var0] = new byte[20];
         ch[var0] = new byte[20];
         bh[var0] = new byte[20];
         bv[var0] = new short[20];
         aW[var0] = new long[20];
         br[var0] = new long[20];
         aS[var0] = new byte[20];
         an[var0] = new byte[20];
         bL[var0] = new short[20];
         O[var0] = new short[20];
         aJ[var0] = new short[20];
         cq[var0] = new short[20];
         c[var0] = new short[20];
         aG[var0] = new short[20];
         U[var0] = new int[20];
         aX[var0] = new int[20];
         cw[var0] = new short[20];
         bT[var0] = new short[20];
         cd[var0] = new short[20];
         bg[var0] = new short[20];
         ag[var0] = new short[20];
         Z[var0] = new byte[20];
         ap[var0] = new byte[20];

         for(var1 = 0; var1 < 20; ++var1) {
            bW[var0][var1] = -1;
            Z[var0][var1] = -1;
            ap[var0][var1] = -1;
         }

         ak[var0] = 20;
         ca[var0] = -1;
         ++var0;
      }
   }

   public static final int j(int var0, int var1) {
      int var2 = var0;
      byte var3 = bW[var1][var0];
      short var4;
      if (d != null && var1 == C.aE && var3 != -1) {
         var4 = w[var3][7];
         if (var4 == -1) {
            var4 = w[var3][3];
         }

         if (var4 != -1) {
            f var10001 = C;
            int var5 = var4 >>> 8;
            if (var5 >= 4 && var5 < 240 && d[var5 - 4] == 4) {
               d.f(Q[var5 - 4]);
               d[var5 - 4] = 2;
            }
         }
      }

      switch(var3) {
      default:
         var4 = w[var3][11];
         short var8 = w[var3][0];
         byte var6 = 7;
         short var7 = q[var1];
         a(var1, var4, var8, var6, var3, var7);
         var2 = q(var0, var1);
      case 8:
         f var10000 = C;
         if (f.bv == var0) {
            var10000 = C;
            if (f.bD == var1) {
               var10000 = C;
               f.bv = -1;
               var10000 = C;
               f.bD = -1;
            }
         }

         return var2;
      }
   }

   public static final void k(int var0) {
      int var1 = a(var0);
      if (var1 != -1) {
         j(var1, var0);
      }

   }

   public static final void n(int var0, int var1) {
      if (var0 != -1) {
         f var10001 = C;
         if (var1 < 3) {
            switch(ch[var1][var0]) {
            case 29:
            case 31:
            case 38:
            case 50:
               i(var0, var1);
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 45:
            case 46:
            case 47:
            case 48:
            default:
               break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 49:
               a(var0, var1);
            }

            return;
         }
      }

   }

   public static final void a(int var0, int var1, int var2) {
      f var10004;
      switch(ch[var1][var0]) {
      case 29:
         var10004 = C;
         b(var0, var1, 10, var2 + (f.k(64) - 32));
      case 30:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 39:
      case 40:
      case 45:
      case 46:
      case 47:
      case 48:
      default:
         break;
      case 31:
         var10004 = C;
         b(var0, var1, 8, var2 + (f.k(64) - 32));
         break;
      case 38:
         b(var0, var1, 24, r);
         break;
      case 41:
      case 42:
      case 43:
      case 44:
      case 49:
         f var10002 = C;
         int var3 = f.k(8) + 8;
         var10004 = C;
         a(var0, var1, var3, var2 + (f.k(64) - 32));
         break;
      case 50:
         b(var0, var1, 32, r);
      }

   }

   public static final void a(int var0, int var1) {
      U[var1][var0] = 0;
      aX[var1][var0] = 0;
   }

   public static final void i(int var0, int var1) {
      if (var0 != -1) {
         U[var1][var0] = 0;
         aX[var1][var0] = 0;
      }

   }

   public static final void b(int var0, int var1, int var2, int var3) {
      if (var0 != -1) {
         byte[] var10000 = an[var1];
         var10000[var0] &= -65;
         P = var3;
         switch(ch[var1][var0]) {
         case 29:
         case 31:
            U[var1][var0] = var2;
            f var10001 = C;
            bU = (byte)(1 + f.k(6));
            break;
         case 38:
         case 50:
         default:
            cw[var1][var0] = 2048;
            U[var1][var0] = 0;
            aX[var1][var0] = 32768;
         }
      }

   }

   public static final void a(int var0, int var1, int var2, int var3) {
      U[var1][var0] = var2 * a.d(var3);
      aX[var1][var0] = var2 * a.a(var3);
   }

   public static final void o(int var0, int var1) {
      if ((an[var0][var1] & 2) != 0) {
         short[] var10000 = bL[var0];
         short var10002 = var10000[var1];
         int var10003 = U[var0][var1];
         f var10004 = C;
         var10000[var1] = (short)(var10002 + (var10003 >> 16));
         var10000 = aJ[var0];
         var10002 = var10000[var1];
         var10003 = aX[var0][var1];
         var10004 = C;
         var10000[var1] = (short)(var10002 + (var10003 >> 16));
         if (bL[var0][var1] < 30) {
            bL[var0][var1] = 30;
            U[var0][var1] = -U[var0][var1];
         }

         if (bL[var0][var1] > 192) {
            bL[var0][var1] = 192;
            U[var0][var1] = -U[var0][var1];
         }

         if (aJ[var0][var1] < 80) {
            aJ[var0][var1] = 80;
            aX[var0][var1] = -aX[var0][var1];
         }

         if (aJ[var0][var1] > 200) {
            aJ[var0][var1] = 200;
            aX[var0][var1] = -aX[var0][var1];
         }

         int[] var2;
         if (U[var0][var1] < 0) {
            var2 = U[var0];
            var2[var1] += cw[var0][var1];
            if (U[var0][var1] > 0) {
               U[var0][var1] = 0;
            }
         }

         if (U[var0][var1] > 0) {
            var2 = U[var0];
            var2[var1] -= cw[var0][var1];
            if (U[var0][var1] < 0) {
               U[var0][var1] = 0;
            }
         }

         if (aX[var0][var1] < 0) {
            var2 = aX[var0];
            var2[var1] += cw[var0][var1];
            if (aX[var0][var1] > 0) {
               aX[var0][var1] = 0;
            }
         }

         if (aX[var0][var1] > 0) {
            var2 = aX[var0];
            var2[var1] -= cw[var0][var1];
            if (aX[var0][var1] < 0) {
               aX[var0][var1] = 0;
            }
         }

         var10000 = bg[var0];
         f var3 = C;
         var10000[var1] = f.e(bL[var0][var1], O[var0][var1], aJ[var0][var1]);
         var10000 = ag[var0];
         var3 = C;
         var10000[var1] = f.c(bL[var0][var1], O[var0][var1], aJ[var0][var1]);
      }

   }

   public static final boolean b(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var2 - bL[var1][var0];
      int var6 = var3 - aJ[var1][var0];
      int var7 = var5 * var5 + var6 * var6;
      if (var7 < var4 * var4 + 400) {
         int var8 = a.a(var5, var6);
         a(var0, var1, 16, var8);
         return true;
      } else {
         return false;
      }
   }

   public static final void h(int var0, int var1) {
      if ((an[var0][var1] & 2) != 0 && (an[var0][var1] & 64) == 0) {
         short[] var10000;
         short var10002;
         int var10003;
         f var10004;
         if ((an[var0][var1] & 128) != 0) {
            var10000 = bL[var0];
            var10002 = var10000[var1];
            var10003 = U[var0][var1] * a.d(P);
            var10004 = C;
            var10000[var1] = (short)(var10002 - (var10003 >> 16));
            var10000 = aJ[var0];
            var10002 = var10000[var1];
            var10003 = U[var0][var1] * a.a(P);
            var10004 = C;
            var10000[var1] = (short)(var10002 - (var10003 >> 16));
         } else {
            var10000 = bL[var0];
            var10002 = var10000[var1];
            var10003 = U[var0][var1] * a.d(P);
            var10004 = C;
            var10000[var1] = (short)(var10002 + (var10003 >> 16));
            var10000 = aJ[var0];
            var10002 = var10000[var1];
            var10003 = U[var0][var1] * a.a(P);
            var10004 = C;
            var10000[var1] = (short)(var10002 + (var10003 >> 16));
         }

         boolean var3 = false;
         if (bL[var0][var1] < 30) {
            bL[var0][var1] = 30;
            var3 = true;
         }

         if (bL[var0][var1] > 192) {
            bL[var0][var1] = 192;
            var3 = true;
         }

         if (aJ[var0][var1] < 80) {
            aJ[var0][var1] = 80;
            var3 = true;
         }

         if (aJ[var0][var1] > 200) {
            aJ[var0][var1] = 200;
            var3 = true;
         }

         byte[] var4;
         int[] var5;
         label55:
         switch(ch[var0][var1]) {
         case 29:
         case 31:
            if (var3) {
               P += 32;
               P &= 255;
            }

            if (bU > 0) {
               --bU;
            } else {
               f var10001 = C;
               int var2 = P + f.k(21) - 11;
               var2 &= 255;
               switch(ch[var0][var1]) {
               case 29:
                  b(var1, var0, 10, var2);
                  break label55;
               case 31:
               default:
                  b(var1, var0, 8, var2);
               }
            }
            break;
         case 38:
         default:
            if (var3) {
               if ((an[var0][var1] & 128) != 0) {
                  var4 = an[var0];
                  var4[var1] = (byte)(var4[var1] & -129);
               } else {
                  var4 = an[var0];
                  var4[var1] = (byte)(var4[var1] | 128);
               }

               b(var1, var0, 24, r);
            }

            if (U[var0][var1] < 24) {
               var5 = aX[var0];
               var5[var1] += cw[var0][var1];
               U[var0][var1] = aX[var0][var1] >> 14;
            }
            break;
         case 50:
            if (var3) {
               if ((an[var0][var1] & 128) != 0) {
                  var4 = an[var0];
                  var4[var1] = (byte)(var4[var1] & -129);
               } else {
                  var4 = an[var0];
                  var4[var1] = (byte)(var4[var1] | 128);
               }

               b(var1, var0, 32, r);
            }

            if (U[var0][var1] < 32) {
               var5 = aX[var0];
               var5[var1] += cw[var0][var1];
               U[var0][var1] = aX[var0][var1] >> 14;
            }
         }

         var10000 = bg[var0];
         f var6 = C;
         var10000[var1] = f.e(bL[var0][var1], O[var0][var1], aJ[var0][var1]);
         var10000 = ag[var0];
         var6 = C;
         var10000[var1] = f.c(bL[var0][var1], O[var0][var1], aJ[var0][var1]);
      }

   }

   public static final boolean a(int var0, int var1, int var2, int var3, int var4) {
      if ((an[var1][var0] & 64) == 0) {
         int var5 = var2 - bL[var1][var0];
         int var6 = var3 - aJ[var1][var0];
         int var7 = var5 * var5 + var6 * var6;
         if (var7 < var4 * var4 + 400) {
            byte[] var10000;
            int var8;
            switch(ch[var1][var0]) {
            case 29:
               var8 = a.a(var5, var6);
               b(var0, var1, 10, var8);
               break;
            case 31:
               var8 = a.a(var5, var6);
               b(var0, var1, 8, var8);
               break;
            case 50:
               if ((an[var1][var0] & 128) != 0) {
                  var10000 = an[var1];
                  var10000[var0] = (byte)(var10000[var0] & -129);
               } else {
                  var10000 = an[var1];
                  var10000[var0] = (byte)(var10000[var0] | 128);
               }

               b(var0, var1, 32, r);
            case 38:
            default:
               if ((an[var1][var0] & 128) != 0) {
                  var10000 = an[var1];
                  var10000[var0] = (byte)(var10000[var0] & -129);
               } else {
                  var10000 = an[var1];
                  var10000[var0] = (byte)(var10000[var0] | 128);
               }

               b(var0, var1, 24, r);
            }

            return true;
         }
      }

      return false;
   }

   private static final void O() {
      i = null;
      System.gc();
      i = a.b("/bubble.png");
   }

   public static final void f() {
      ct = null;

      int var0;
      for(var0 = 0; var0 < 33; ++var0) {
         bX[var0] = null;
      }

      for(var0 = 0; var0 < bs; ++var0) {
         bb[var0] = null;
         ab[var0 * 2] = null;
         ab[var0 * 2 + 1] = null;
         ba[var0] = 0;
      }

      System.gc();
   }

   public static final void K() {
      int var0;
      for(var0 = 0; var0 < bs; ++var0) {
         bz[var0] = null;
      }

      for(var0 = 0; var0 < Q.length; ++var0) {
         if (Q[var0] != -1) {
            d.a(Q[var0]);
            Q[var0] = -1;
         }
      }

      System.gc();
   }

   public static final void j(int var0) {
      bH = var0;
      e.d(bH);
   }

   public static final void c(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 5; ++var4) {
         ax[var2][var3 + var4] = ax[var0][var1 + var4];
      }

   }

   public static final int c(int var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < bM[var0]; ++var2) {
         if (ax[var0][var2 * 5 + 0] != -1) {
            ++var1;
         }
      }

      return var1;
   }

   public static final int g(int var0, int var1) {
      for(int var2 = 0; var2 < bM[var0]; ++var2) {
         if (ax[var0][var2 * 5 + 2] == 7 && ax[var0][var2 * 5 + 3] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      for(var6 = 0; var6 < bM[var0] && ax[var0][var6 * 5 + 0] != -1; ++var6) {
      }

      if (var6 < 6) {
         var6 *= 5;
         ax[var0][var6 + 0] = (short)var1;
         ax[var0][var6 + 1] = (short)var2;
         ax[var0][var6 + 2] = (short)var3;
         ax[var0][var6 + 3] = (short)var4;
         ax[var0][var6 + 4] = (short)var5;
      }
   }

   public static final boolean b(int var0, int var1) {
      ax[var0][var1 * 5 + 4] = 0;
      ax[var0][var1 * 5 + 3] = 0;
      ax[var0][var1 * 5 + 1] = 192;
      if (ax[var0][var1 * 5 + 0] == -1) {
         return false;
      } else {
         ax[var0][var1 * 5 + 0] = -1;
         return true;
      }
   }

   public static final void N() {
      for(int var0 = 0; var0 < ce; ++var0) {
         ax[var0] = null;
      }

   }

   public static final void m() {
      N();

      for(int var0 = 0; var0 < ce; ++var0) {
         ax[var0] = new short[bM[var0] * 5];

         for(int var1 = 0; var1 < bM[var0] * 5; var1 += 5) {
            ax[var0][var1 + 0] = -1;
            ax[var0][var1 + 1] = 192;
            ax[var0][var1 + 2] = 0;
            ax[var0][var1 + 4] = 0;
         }
      }

      f var10000 = C;
      f var10004 = C;
      a(0, 7936, 116, 1, 3, 2);
      var10000 = C;
      var10004 = C;
      a(0, 6400, 117, 2, 22, 2);
      var10000 = C;
      a(2, 61460, 91, 7, 24, 5);
      var10000 = C;
      a(1, 3072, 139, 7, 7, 2);
   }

   public static final void a(int var0, boolean var1) {
      if (var0 != -1) {
         short var2 = w[var0][7];
         byte[] var10000;
         f var10001;
         int var3;
         if (var2 != -1) {
            var10001 = C;
            var3 = var2 >>> 8;
            if (var3 >= 4 && var3 < 240) {
               var10000 = d;
               var10000[var3 - 4] |= (byte)(var1 ? 1 : 2);
            }
         }

         var2 = w[var0][3];
         if (var2 != -1) {
            var10001 = C;
            var3 = var2 >>> 8;
            if (var3 >= 4 && var3 < 240) {
               var10000 = d;
               var10000[var3 - 4] |= (byte)(var1 ? 1 : 2);
            }
         }

         var2 = w[var0][11];
         if (var2 != -1) {
            var10001 = C;
            var3 = var2 >>> 8;
            if (var3 >= 4 && var3 < 240) {
               var10000 = d;
               var10000[var3 - 4] = (byte)(var10000[var3 - 4] | 1);
            }
         }
      }

   }

   public static final void d(int var0, int var1) {
      if (cr == 4) {
         b(1);
      }

      p = var0;
      ay = var1;
      d = null;
      d = new byte[bj.length];

      int var2;
      for(var2 = 0; var2 < bj.length; ++var2) {
         d[var2] = 0;
         L[var2] = 0;
      }

      byte[] var10000;
      f var10001;
      if (var1 != -1) {
         var10001 = C;
         short var4;
         if (var1 == 3) {
            for(var2 = 0; var2 < ce; ++var2) {
               for(int var3 = 0; var3 < bM[var2] * 5; var3 += 5) {
                  var4 = ax[var2][var3 + 0];
                  if (var4 != -1) {
                     var10001 = C;
                     int var5 = var4 >>> 8;
                     if (var5 >= 4 && var5 < 240) {
                        var10000 = d;
                        var10000[var5 - 4] = (byte)(var10000[var5 - 4] | 2);
                     }
                  }
               }
            }
         } else {
            for(var2 = 0; var2 < bM[var1] * 5; var2 += 5) {
               short var6 = ax[var1][var2 + 0];
               if (var6 != -1) {
                  var10001 = C;
                  int var8 = var6 >>> 8;
                  if (var8 >= 4 && var8 < 240) {
                     var10000 = d;
                     var10000[var8 - 4] = (byte)(var10000[var8 - 4] | 1);
                  }
               }

               if (ax[var1][var2 + 2] == 7) {
                  var4 = ax[var1][var2 + 3];
                  a(var4, false);
               }
            }

            if (ak[C.cp] != 20) {
               for(var2 = 0; var2 < 20; ++var2) {
                  byte var7 = bW[var1][var2];
                  a(var7, true);
               }
            }
         }
      }

      l = -1;
      ae = "";
      B = "";
      A = "";
      String var9 = "";
      v = false;
      K = 0;
      f var10;
      switch(var0) {
      case 0:
         ae = "/kitchen.png";
         K = 0;
         l = 0;
         var10 = C;
         f.H = 12290150;
         a(38, true);
         break;
      case 1:
         ae = "/lounge.png";
         K = 0;
         l = 1;
         var10 = C;
         f.H = 6444423;
         a(38, true);
         break;
      case 2:
         ae = "/garden.gfx";
         K = 0;
         B = "/night.plt";
         var10 = C;
         f.H = 8952149;
         var10 = C;
         f.J = 5135164;
         v = true;
         l = 2;
         a(13, true);
         a(12, true);
         a(38, true);
         break;
      case 3:
         ae = "/shop.png";
         K = 0;
         A = "/avatar_shopkeeper.png";
         l = 3;
         if (ao == 0) {
            var10001 = C;
            var2 = 9728 >> 8;
            var10000 = d;
            var10000[var2 - 4] = (byte)(var10000[var2 - 4] | 2);
         }

         if (ao == 3) {
            a(20, false);
         }
         break;
      case 4:
         ae = "/show.png";
         K = 0;
         A = "/avatar_judge.png";
         l = 4;
         var10 = C;
         f.H = 8104309;
         break;
      case 5:
         ae = "/map.png";
         K = 0;
         l = 5;
      }

      u = 0;
      m = 0;
      a = true;
      ci = 0;

      while(a) {
         b(false);
      }

      I = u;
      u = 0;
      m = 0;
      a = true;
      ci = 0;
   }

   public static final void h() {
      int var0 = u;

      try {
         b(true);
         (new StringBuffer()).append("load: ").append(Integer.toString(u)).append("/").append(Integer.toString(I)).toString();
      } catch (Throwable var2) {
         (new StringBuffer()).append("err: ").append(Integer.toString(u)).append("/").append(Integer.toString(I)).toString();
         if (m == 4) {
            u = I;
            a = false;
         } else {
            ++u;
            if (u >= I) {
               m = 4;
            }
         }
      }

   }

   public static final void b(boolean var0) {
      boolean var1 = true;
      int var2 = p;
      int var3 = ay;
      System.gc();
      f var10000;
      int var4;
      switch(m) {
      case 0:
         ++u;
         if (l != -1) {
            m = 1;
         } else {
            m = 4;
         }

         if (var0) {
            e.p();
            f();
            K();

            for(var4 = 0; var4 < aM; ++var4) {
               L[var4] = 0;
            }

            if (bH == 0 && e.g == 0) {
               var10000 = C;
               if (f.aN - d.b > 60000L) {
                  d.l();
               }
            }
         }
         break;
      case 1:
         ++u;
         if (v) {
            m = 2;
         } else {
            m = 3;
         }

         if (var0) {
            b.c();
            bb[l] = a.a(ae, K);
         }
         break;
      case 2:
         ++u;
         m = 3;
         if (var0) {
            if (ba[l] == 0) {
               ab[l * 2] = a.a(bb[l]);
               ab[l * 2 + 1] = a.c(B);
            }

            var4 = z() ? 256 : 0;
            if (var4 == 256) {
               var10000 = C;
               var10000 = C;
               f.H = f.J;
            }

            ba[l] = (short)a.a(bb[l], ab[l * 2], ab[l * 2 + 1], var4, ba[l]);
         }
         break;
      case 3:
         ++u;
         m = 50;
         if (var0) {
            bz[l] = a.c(bb[l]);
         }
         break;
      case 4:
         ++u;
         var1 = false;
         if (var0) {
            f var10001;
            if (var2 == var3) {
               var10001 = C;
               if (var2 != 3) {
                  C.aE = var2;
                  k();
               }
            }

            var10001 = C;
            if (var2 != 5) {
               var10000 = C;
               r = bz[var2].getWidth();
               var10000 = C;
               f.i = bz[var2].getHeight();
               var10000 = C;
               var10001 = C;
               f.au = (d.al - f.r) / 2;
               var10000 = C;
               var10001 = C;
               f.aF = (d.au - f.i) / 2;
            }
         }
         break;
      case 50:
         ++u;
         m = 100;
         if (var0 && A.length() > 0) {
            ct = a.b(A);
         }
         break;
      default:
         boolean var8 = true;

         while(var8) {
            int var5 = m - 100;
            if (var5 >= d.length || var5 < 0) {
               ++u;
               m = 4;
               var8 = false;
               break;
            }

            ++m;
            int var6 = b[var5] - 4;
            if (d[var6] != 0) {
               ++u;
               if (var0) {
                  byte[] var7 = a.a("/" + bj[var6] + ".png", (int)bn[var6]);
                  bn[var6] = (short)((var7[1] << 8 & '\uff00') + (var7[0] & 255));
                  if (d[var6] == 2 && ci < 33) {
                     Q[var6] = d.a((byte)(var6 + 4), var7, "/" + bj[var6] + ".dat", false);
                     L[var6] = (byte)ci;
                     bX[ci++] = var7;
                  } else {
                     d[var6] = 1;
                     Q[var6] = d.a((byte)(var6 + 4), var7, "/" + bj[var6] + ".dat");
                  }

                  Object var9 = null;
               }

               var8 = false;
            }
         }
      }

      a = var1;
   }

   public static final int s(int var0, int var1) {
      if (ak[var0] < 20) {
         do {
            var1 = ap[var0][var1];
            if (var1 == -1) {
               for(var1 = ca[var0]; Z[var0][var1] != -1; var1 = Z[var0][var1]) {
               }
            }
         } while((an[var0][var1] & 1) == 0);
      }

      return var1;
   }

   public static final int r(int var0, int var1) {
      if (ak[var0] < 20) {
         do {
            var1 = Z[var0][var1];
            if (var1 == -1) {
               var1 = ca[var0];
            }
         } while((an[var0][var1] & 1) == 0);
      }

      return var1;
   }

   public static final void k() {
      bE = ca[C.aE];
      if (bE != -1) {
         if ((an[C.aE][bE] & 1) == 0) {
            bE = r(C.aE, bE);
         }

         if (cr == 1) {
            e(bE, C.aE, 8, 1);
         }
      }

   }

   public static final void d(Graphics var0) {
      f var10000;
      if (e.g != 0) {
         if (e.g != 28 && e.g != 29) {
            return;
         }
      } else {
         var10000 = C;
         if (!f.cL) {
            return;
         }
      }

      f var10001;
      label37: {
         if (e.g == 0) {
            var10000 = C;
            var10001 = C;
            if (f.bw > f.aN) {
               break label37;
            }
         }

         if (e.g != 28 && e.g != 29) {
            return;
         }
      }

      int var1;
      int var2;
      label29: {
         if (e.g == 0) {
            var10000 = C;
            var10001 = C;
            if (f.bw > f.aN) {
               C.x();
               var1 = f.bR - f.cw;
               var2 = f.cn - f.G;
               break label29;
            }
         }

         Y = 23;
         var1 = (d.al >> 1) + -30;
         var2 = 180;
      }

      var0.setClip(var1, var2, i.getWidth(), i.getHeight());
      d.a(var0, (Image)i, var1, var2, 20);
      var1 += 31;
      var2 += 25;
      var10000 = C;
      int var3 = f.Y;
      if (var3 != -1) {
         var1 -= d.b(e.aG[1], var3) >> 1;
         var2 -= d.b(e.aG[1], var3) >> 1;
         d.b(var0, e.aG[1], var1, var2, var3);
      }

   }

   public static final void b(int var0) {
      switch(cr) {
      case 2:
         if (cD == 4 && var0 != cr) {
            f var10000 = C;
            f.N();
            cD = 0;
         }
         break;
      case 4:
         if (bH != 2 && e.g == 0) {
            e.am = 0;
         }
      }

      if (var0 == 2) {
         f var10001 = C;
         if (C.aE != f.bH) {
            d.d(20);
            var10001 = C;
            C.cp = f.bH;
         }
      } else if (var0 == 4 && e.g == 0) {
         e.am = 3;
      }

      cr = var0;
   }

   public static final void w() {
      c();
      C.g();
      if (bH == 1) {
         A();
      } else if (bH == 3) {
         F();
      } else if (bH == 2) {
         J();
      } else if (bH == 0) {
         boolean var0 = true;
         f var10000;
         f var10001;
         if (D && cr != 4 && d.e(18)) {
            int var1 = e(38, -1);
            if (var1 != -1 && aU != C.aE) {
               q(var1, aU);
            }

            if (var1 == -1) {
               var10001 = C;
               f var10003 = C;
               f var10006 = C;
               a(38, 128, 128, 80, C.aE, 10, f.aN);
               var10000 = C;
               f.M();
            }
         }

         switch(cr) {
         case 1:
            if (e.g == 0 && bE == -1) {
               k();
               if (bE != -1) {
                  e(bE, C.aE, 8, 1);
               }
            }

            if (d.e(5) || d.e(8)) {
               bE = c(bE, C.aE);
               var10000 = C;
               e.P = f.aN;
            }

            if (d.e(4)) {
               bE = s(C.aE, bE);
               var10000 = C;
               e.P = f.aN;
            }

            if (d.e(3)) {
               bE = r(C.aE, bE);
               var10000 = C;
               e.P = f.aN;
            }

            byte var9 = 1;
            if ((an[C.aE][bE] & 2) != 0) {
               var9 = 2;
            }

            e(bE, C.aE, -1, -1);
            e.b(w[bW[C.aE][bE]][var9], e.ax + d.b(e.aG[1], e.ar & 255), e.M + d.a(e.aG[1], 8));
            break;
         case 2:
            var10000 = C;
            var10001 = C;
            if (f.j != 24) {
               if (!d.b(5) && !d.b(8)) {
                  if (cD != 4) {
                     cD = 0;
                  }

                  ai = false;
               } else if (!ai) {
                  ai = true;
                  aB = 0;
                  switch(C.ad) {
                  case 1:
                     cD = 4;
                     break;
                  case 2:
                     cD = 1;
                     break;
                  case 13:
                     cD = 2;
                     break;
                  case 24:
                     cD = 3;
                  }

                  var10000 = C;
                  if (!f.o(cD)) {
                     cD = 0;
                  }
               }

               if (d.e(3)) {
                  ai = false;
                  if (cD == 0) {
                     switch(C.ad) {
                     case 1:
                        C.ad = 24;
                        break;
                     case 2:
                        C.ad = 1;
                        break;
                     case 13:
                        C.ad = 2;
                        break;
                     case 24:
                        C.ad = 13;
                     }
                  }
               }

               if (d.e(4)) {
                  ai = false;
                  if (cD == 0) {
                     switch(C.ad) {
                     case 1:
                        C.ad = 2;
                        break;
                     case 2:
                        C.ad = 13;
                        break;
                     case 13:
                        C.ad = 24;
                        break;
                     case 24:
                        C.ad = 1;
                     }
                  }
               }

               var10001 = C;
               if (C.aE == f.bH || e.aM != 0) {
                  short var6 = -1;
                  boolean var2 = false;
                  boolean var3 = false;
                  int var7;
                  int var8;
                  switch(C.ad) {
                  case 1:
                     var10000 = C;
                     var10001 = C;
                     if (f.j == 24) {
                        var6 = -1;
                     } else {
                        var6 = 158;
                        if (cD == 4) {
                           var6 = 159;
                           var10000 = C;
                           e.P = f.aN;
                        }

                        C.z(C.ad);
                     }

                     var7 = C.bM;
                     var8 = C.bI;
                     break;
                  case 2:
                     var6 = 75;
                     C.z(C.ad);
                     var7 = C.bM;
                     var8 = C.bI;
                     break;
                  case 13:
                     var6 = 76;
                     C.z(C.ad);
                     var7 = C.bM;
                     var8 = C.bI;
                     break;
                  case 24:
                     var6 = 77;
                     C.z(C.ad);
                     var7 = C.bM;
                     var8 = C.bI;
                  }

                  var7 = C.bM;
                  var8 = C.bI;
                  if (cD == 0) {
                     var7 -= d.b(e.aG[1], 9);
                     var8 -= d.a(e.aG[1], 9);
                     e.a((byte)9, (byte)1, var7, var8);
                  } else {
                     f var10002;
                     if (cD == 4) {
                        var10000 = C;
                        var10001 = C;
                        if (f.at != f.aU) {
                           var10000 = C;
                           var10001 = C;
                           var10002 = C;
                           f.at += f.aU > f.at ? 1 : -1;
                        }

                        var10000 = C;
                        var10001 = C;
                        if (f.aT != f.X) {
                           var10000 = C;
                           var10001 = C;
                           var10002 = C;
                           f.aT += f.X > f.aT ? 1 : -1;
                        }

                        var7 -= d.b(e.aG[1], 9);
                        var8 -= d.a(e.aG[1], 9);
                        e.a((byte)9, (byte)1, var7, var8);
                     } else {
                        var10001 = C;
                        var10002 = C;
                        aB += (int)(f.aN - f.cE) * az;
                        var10001 = C;
                        int var4 = aB >> 16;
                        if (3 * var4 >= W[cD - 1].length) {
                           aB = 0;
                           var4 = 0;
                        }

                        byte var5 = W[cD - 1][var4 * 3];
                        var7 += W[cD - 1][var4 * 3 + 1];
                        var8 += W[cD - 1][var4 * 3 + 2];
                        var7 -= d.b(e.aG[1], var5);
                        var8 -= d.a(e.aG[1], var5);
                        e.a((byte)var5, (byte)1, var7, var8);
                        var6 = -1;
                     }
                  }

                  e.b(var6, e.ax, e.M - d.aI[0] - 6);
               }
            }
            break;
         case 3:
            e.Y = false;
            e.b(-1, 0, 0);
            var10001 = C;
            if (C.aE != f.bH) {
               d.d(20);
               var10001 = C;
               C.cp = f.bH;
            }
            break;
         case 4:
            e.b(-1, 0, 0);
            a(false);
            var0 = false;
            break;
         case 5:
            var0 = false;
            e.a((byte)9, (byte)1, 4096, 4096);
            if (d.e(12)) {
               var10000 = C;
               var10000 = C;
               f.e(3);
            }

            if (d.e(13)) {
               var10000 = C;
               var10000 = C;
               f.a(18);
            }

            if (d.e(14)) {
               var10000 = C;
               var10000 = C;
               f.B(0);
            }

            if (d.e(3)) {
               var10000 = C;
               var10000 = C;
               f.q(52);
            }

            if (d.e(5) || d.e(8)) {
               var10000 = C;
               f.D += 4096;
               var10000 = C;
               var10000 = C;
               var10000 = C;
               var10001 = C;
               f.D = f.e(f.D, 32767);
            }
         }

         if (var0) {
            if (d.b(12) && e.g == 0) {
               d.g(12);
               C.cp = 2;
            }

            if (d.b(13) && (e.g == 0 || e.g == 4)) {
               d.g(13);
               C.cp = 0;
            }

            if (d.b(14) && (e.g == 0 || e.g == 16)) {
               d.g(14);
               C.cp = 1;
            }

            if (C.aE != C.cp) {
               d.d(20);
               if (cr == 2 && cD == 4) {
                  var10000 = C;
                  f.bH = C.cp;
               } else if (cr == 2 || cr == 3) {
                  var10001 = C;
                  if (C.cp != f.bH) {
                     cr = 1;
                     e.Y = true;
                  }
               }
            }
         }

         if (d.e(1)) {
         }

         if (d.e(2)) {
         }

      }
   }

   public static final void P() {
      cB = d.aI[1] + 2;
      bC = d.b(e.aG[1], 27) + 2;
      M = d.a(e.aG[1], 27) + 2;
      int var0 = (z + cj - 1) / cj;
      S = M * var0 + cB + d.aI[0];
      S += (var0 - 1) * d.aI[0];
      M += d.aI[0] + 4;
      int var1 = cj * bC;
      int var2 = d.a((String)d.Z[h], 1);
      s = (var2 - var1) / (cj + 1);
      if (s < 0) {
         s = 0;
      }

      if (var2 > var1) {
         var1 = var2;
      }

      ar = var1;
      y = d.al - ar >> 1;
      if (e.g != 11 && e.g != 18) {
         bm = d.au - S - (d.aI[1] + 5) >> 1;
      } else {
         bm = (d.au - S - (d.aI[1] + 5) >> 1) - 15;
      }

   }

   public static final void a(int var0, int var1, long var2) {
      short var5 = (short)bW[var1][var0];
      if (var5 != -1) {
         if ((an[var1][var0] & 2) != 0) {
            switch(w[var5][10]) {
            case 0:
               var2 /= (long)w[var5][9];
               var2 %= (long)w[var5][8];
               bv[var1][var0] = (short)((int)((long)w[var5][7] + var2));
               break;
            case 1:
            default:
               bv[var1][var0] = w[var5][7];
               break;
            case 2:
               var2 /= (long)w[var5][9];
               if (var2 >= (long)w[var5][8]) {
                  var2 = (long)(w[var5][8] - 1);
               }

               bv[var1][var0] = (short)((int)((long)w[var5][7] + var2));
               break;
            case 3:
               var2 /= (long)w[var5][9];
               var2 %= (long)w[var5][8];
               bv[var1][var0] = (short)((int)((long)w[var5][7] - var2));
               break;
            case 4:
               var2 /= (long)w[var5][9];
               if (var2 >= (long)w[var5][8]) {
                  var2 = (long)(w[var5][8] - 1);
               }

               bv[var1][var0] = (short)((int)((long)w[var5][7] - var2));
            }
         } else {
            switch(w[var5][5]) {
            case 0:
               var2 /= (long)w[var5][6];
               var2 %= (long)w[var5][4];
               bv[var1][var0] = (short)((int)((long)w[var5][3] + var2));
               break;
            case 1:
            default:
               bv[var1][var0] = w[var5][3];
               break;
            case 2:
               var2 /= (long)w[var5][6];
               if (var2 >= (long)w[var5][4]) {
                  var2 = (long)(w[var5][4] - 1);
               }

               bv[var1][var0] = (short)((int)((long)w[var5][3] + var2));
               break;
            case 3:
               var2 /= (long)w[var5][6];
               var2 %= (long)w[var5][4];
               bv[var1][var0] = (short)((int)((long)w[var5][3] - var2));
               break;
            case 4:
               var2 /= (long)w[var5][6];
               if (var2 >= (long)w[var5][4]) {
                  var2 = (long)(w[var5][4] - 1);
               }

               bv[var1][var0] = (short)((int)((long)w[var5][3] - var2));
            }
         }

      }
   }

   public static final void D() {
      int var0 = C.aE;

      for(byte var1 = ca[var0]; var1 != -1; var1 = Z[var0][var1]) {
         short var4 = (short)bW[var0][var1];
         f var10000 = C;
         long var2 = f.aN - aW[var0][var1];
         if (var2 < 0L) {
            var2 = 0L;
         }

         a(var1, var0, var2);
         switch(var4) {
         case 2:
            if ((an[var0][var1] & 2) != 0) {
               var10000 = C;
               if (f.aN - aW[var0][var1] > (long)cb) {
                  m(var0, var1);
                  f var10001 = C;
                  int var7 = e(4, 0);
                  if (var7 != -1) {
                     var10001 = C;
                     if ((an[0][var7] & 2) != 0) {
                     }

                     var10000 = C;
                     p(0, var7);
                     var10000 = C;
                     var10000 = C;
                     f.t = 18;
                  }
               }
            }
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         case 20:
         case 21:
         case 23:
         case 29:
         case 30:
         case 31:
         case 32:
         case 34:
         case 36:
         case 37:
         default:
            break;
         case 5:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
            o(var0, var1);
            break;
         case 17:
         case 22:
         case 33:
         case 35:
            h(var0, var1);
            break;
         case 38:
            var10000 = C;
            long var5 = f.aN - aW[var0][var1];
            if (var5 > (long)bG) {
               q(var1, var0);
            } else if ((var5 / 500L & 1L) == 0L) {
               p(var0, var1);
            } else {
               m(var0, var1);
            }
         }
      }

   }

   public static final void e(int var0, int var1, int var2, int var3) {
      byte var4 = bW[var1][var0];
      int var5 = w[var4][14] + bg[var1][var0];
      int var6 = w[var4][15] + ag[var1][var0];
      f var10001 = C;
      if (var5 < f.au) {
         f var10000 = C;
         var5 = f.au;
      }

      if (var2 != -1) {
         e.a((byte)8, (byte)1, var5, var6);
      } else {
         e.ax = var5;
         e.M = var6;
      }

   }

   public static final void a(boolean var0) {
      if (d.aH != 0) {
         G();
      }

      if (bH == 0 && e.g == 0) {
         e.am = 3;
         e.aZ = 1;
      }

      int var3 = n / cj;
      int var4 = var3 * cj;
      boolean var5 = false;
      if (e.aM != 0 && e.aM != 3) {
         var5 = true;
      }

      int var6;
      int var8;
      if (var5 || d.e(8) || d.e(5) || d.e(6)) {
         if (e.g != 0) {
            if (n != 0 && e.g != 44) {
               if (e.g == 12 || e.g == 18) {
                  return;
               }
            } else {
               e.c(e.g + 1);
               if (e.g == 13) {
                  d.I = System.currentTimeMillis() + 2000L;
               }
            }
         }

         short var7;
         if (n != -1 && !var5) {
            var6 = bR[n];
            var7 = bk[n];
         } else {
            var6 = cv;
            var7 = 0;
         }

         byte var9 = -1;
         f var10000;
         f var10001;
         switch(var6) {
         case 1:
            var10001 = C;
            ax[0][n * 5 + 0] = -1;
            var10001 = C;
            ax[0][n * 5 + 1] = 192;
            var10001 = C;
            ax[0][n * 5 + 2] = 0;
            ax[C.aE][n * 5 + 4] = 0;
            var10001 = C;
            var8 = e(3, 0);
            var10001 = C;
            if ((an[0][var8] & 2) != 0) {
            }

            var10000 = C;
            p(0, var8);
            var10000 = C;
            f.m = var7;
            b(1);
            var9 = 1;
            break;
         case 2:
            var10001 = C;
            ax[0][n * 5 + 0] = -1;
            var10001 = C;
            ax[0][n * 5 + 1] = 192;
            var10001 = C;
            ax[0][n * 5 + 2] = 0;
            ax[C.aE][n * 5 + 4] = 0;
            var10001 = C;
            var8 = e(4, 0);
            var10001 = C;
            if ((an[0][var8] & 2) != 0) {
            }

            var10000 = C;
            p(0, var8);
            var10000 = C;
            f.t = var7;
            b(1);
            var9 = 1;
            break;
         case 3:
            b(1);
            var9 = 1;
            break;
         case 4:
            b(1);
            var9 = 14;
            break;
         case 5:
            b(1);
            var9 = 15;
            break;
         case 6:
         case 8:
            bd = n;
            break;
         case 7:
            if (e.g == 0) {
               k(C.aE);
               short var10 = ax[C.aE][n * 5 + 3];
               var10001 = C;
               f var10003 = C;
               f var10006 = C;
               a(var10, 100, 0, 110, C.aE, 7, f.aN);
               q[C.aE] = ax[C.aE][n * 5 + 4];
               ax[C.aE][n * 5 + 0] = -1;
               ax[C.aE][n * 5 + 1] = 192;
               ax[C.aE][n * 5 + 2] = 0;
               ax[C.aE][n * 5 + 4] = 0;
            }

            b(1);
            var10001 = C;
            if (C.aE == 2) {
               var9 = 14;
            } else {
               var9 = 15;
            }
         }

         if (var9 != -1) {
            var8 = e(var9, -1);
            if (var8 != -1) {
               m(aU, var8);
            }
         }
      }

      if (d.e(3)) {
         if (n == -1) {
            if (G) {
               --cz;
               if (cz == 2) {
                  cz = 5;
               }

               if (cz == -1) {
                  cz = 2;
               }

               d(cz);
               n = -1;
            }
         } else {
            --n;
            if (n < var4) {
               n += cj;
               if (n >= z) {
                  n = z - 1;
               }
            }
         }
      }

      if (d.e(4)) {
         if (n == -1) {
            if (G) {
               ++cz;
               if (cz == 3) {
                  cz = 0;
               }

               if (cz == 6) {
                  cz = 3;
               }

               d(cz);
               n = -1;
            }
         } else {
            ++n;
            if (n >= z) {
               n = var4;
            }

            if (n >= var4 + cj) {
               n -= cj;
            }
         }
      }

      int var11;
      int var12;
      int var13;
      if (d.e(1)) {
         var6 = (z + cj - 1) / cj;
         var11 = n - var4;
         var8 = n / cj;
         var13 = cm;
         if (n == -1) {
            n = (cj >> 1) + (var6 - 1) * cj;
         } else {
            --var8;
            if (var8 < 0) {
               if (e.g != 0) {
                  cm = -1;
               }

               if (cm != -1) {
                  n = -1;
               } else {
                  var8 = var6 - 1;
                  var12 = var8 * cj + var11;
                  if (var12 >= z) {
                     --var8;
                     var12 = var8 * cj + var11;
                  }

                  n = var12;
               }

               if (e.g != 0) {
                  cm = var13;
               }
            } else {
               n -= cj;
            }
         }
      }

      if (d.e(2)) {
         var6 = (z + cj - 1) / cj;
         var11 = n - var4;
         var8 = n / cj;
         var13 = cm;
         if (e.g != 0) {
            cm = -1;
         }

         if (n == -1) {
            n = cj >> 1;
         } else {
            ++var8;
            var12 = var8 * cj + var11;
            if (var12 >= z) {
               var12 = var11;
               if (cm != -1) {
                  var12 = -1;
               }
            }

            n = var12;
         }

         if (e.g != 0) {
            cm = var13;
         }
      }

      int var1;
      int var2;
      if (n == -1) {
         var1 = y + (ar >> 1);
         var2 = bm + S;
      } else {
         var3 = n / cj;
         var4 = var3 * cj;
         var1 = (n - var4) * bC + y + s;
         var2 = var3 * M + bm + cB;
         if (var4 == 0) {
            if (n == 0) {
               var1 += bC >> 1;
            } else {
               var1 += (bC >> 1) + s;
            }
         } else if (n % var4 == 0) {
            var1 += bC >> 1;
         } else {
            var1 += (bC >> 1) + s;
         }

         var2 += M >> 1;
         var2 += 0;
      }

      e.a((byte)8, (byte)1, var1, var2);
      if (cm == -1) {
         aa = var1;
         al = var2 + d.aI[0];
         J = null;
         if (var0 && aT[n] != 0) {
            J = d.Z[be[n]] + " $" + Integer.toString(aT[n]);
         } else {
            J = d.Z[be[n]];
         }
      } else if (n == -1) {
         J = null;
      } else {
         aa = var1;
         al = var2 + d.aI[0] + 6;
         J = null;
         if (bR[n] != 0) {
            if (var0 && aT[n] != 0) {
               J = d.Z[be[n]] + " $" + Integer.toString(aT[n]);
            } else {
               J = d.Z[be[n]];
            }

            aa = y + (ar - d.a((String)J, 0) >> 1);
            al = bm + M + (d.aI[0] >> 1);
         }
      }

      G();
      if (d.aH != 0) {
         var6 = d.aL;
         if (var6 >= bi[bJ % 3].length) {
            d.aH = 0;
         } else {
            J = d.Z[bi[bJ % 3][var6][6]] + " $" + Integer.toString(bi[bJ % 3][var6][2]);
            aa = y + (ar - d.a((String)J, 0) >> 1);
            al = bm + M + (d.aI[0] >> 1);
         }
      }

   }

   public static final void a(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      b(4);
      cm = var0;
      cv = var1;
      n = 0;
      z = var2;
      cj = var3;
      G = var4;
      bB = null;
      be = null;
      bR = null;
      bk = null;
      aT = null;
      bB = new short[z];
      be = new short[z];
      bR = new short[z];
      bk = new short[z];
      if (var4) {
         aT = new short[z];
      }

      for(int var7 = 0; var7 < z; ++var7) {
         bB[var7] = ax[var5][var7 * 5 + 0];
         be[var7] = ax[var5][var7 * 5 + 1];
         bR[var7] = ax[var5][var7 * 5 + 2];
         bk[var7] = ax[var5][var7 * 5 + 3];
         if (G) {
            if (ax[var5][var7 * 5 + 4] != 0) {
               if (bR[var7] != 8) {
                  bR[var7] = 6;
               }
            } else {
               bR[var7] = 0;
            }

            aT[var7] = ax[var5][var7 * 5 + 4];
         }
      }

      h = var6;
      P();
      bJ = var5;
   }

   public static final void i() {
      f var10000 = C;
      byte var0 = 2;
      int var1 = e(11, var0);
      if (var1 != -1) {
         k(var0, var1);
      }

   }

   public static final void m(int var0, int var1) {
      byte[] var10000 = an[var0];
      var10000[var1] &= -3;
      a(var1, var0, 0L);
   }

   public static final void p(int var0, int var1) {
      byte[] var10000 = an[var0];
      var10000[var1] = (byte)(var10000[var1] | 2);
      a(var1, var0, 0L);
   }

   public static final void B() {
      f var10000 = C;
      byte var0 = 2;
      f var10001 = C;
      int var1 = e(13, 2);
      if (var1 != -1) {
         q(var1, var0);
      }

      var10001 = C;
      var1 = e(12, 2);
      if (var1 != -1) {
         q(var1, var0);
      }

   }

   public static final void k(int var0, int var1) {
      if ((an[var0][var1] & 2) != 0) {
         m(var0, var1);
         bL[var0][var1] = c[var0][var1];
         O[var0][var1] = cd[var0][var1];
         aJ[var0][var1] = aG[var0][var1];
      }

      short var2 = bL[var0][var1];
      short var3 = O[var0][var1];
      short var4 = aJ[var0][var1];
      short[] var10000 = bg[var0];
      f var10002 = C;
      var10000[var1] = f.e(var2, var3, var4);
      var10000 = ag[var0];
      var10002 = C;
      var10000[var1] = f.c(var2, var3, var4);
      B();
   }

   public static final void L() {
      f var10000 = C;
      byte var0 = 2;
      int var1 = e(11, var0);
      if (var1 != -1 && an[var0][var1 & 2] != 0) {
         short var2 = bL[var0][var1];
         short var3 = O[var0][var1];
         short var4 = aJ[var0][var1];
         int var5 = var2 + 60;
         int var6 = var3 + 124;
         f var10006 = C;
         a(12, var5, var6, var4, var0, 2, f.aN);
         var5 += 32;
         var6 += 100;
         var10006 = C;
         a(13, var5, var6, var4, var0, 2, f.aN);
      }

   }

   public static final int c(int var0, int var1) {
      byte var2 = bW[var1][var0];
      boolean var3 = (an[var1][var0] & 2) == 0;
      boolean var4 = true;
      if (e.g != 0) {
         if ((e.g != 10 || var2 != 1) && (e.g != 17 || var2 != 15)) {
            return var0;
         }

         e.c(e.g + 1);
         if (e.g == 11) {
            d.I = System.currentTimeMillis() + 2000L;
         }
      }

      short[] var10000;
      f var10002;
      f var10005;
      switch(var2) {
      case 0:
      case 10:
         var0 = q(var0, var1);
         var4 = false;
         break;
      case 1:
         if (var3) {
            var10005 = C;
            a(111, 3, 6, 3, false, 0, 110);
         }
         break;
      case 2:
         if (var3) {
            long[] var8 = aW[var1];
            var10002 = C;
            var8[var0] = f.aN;
         } else {
            var4 = false;
         }
      case 3:
      case 4:
      case 8:
      case 9:
         break;
      case 5:
      case 6:
      case 7:
      case 12:
      case 13:
      default:
         if (var2 != -1 && ch[var1][var0] >= 27) {
            var4 = false;
            if (!var3) {
               m(var1, var0);
               var0 = j(var0, var1);
            } else {
               p(var1, var0);
               var10000 = bL[var1];
               var10002 = C;
               var10000[var0] = 128;
               var10000 = aJ[var1];
               var10002 = C;
               var10000[var0] = 80;
            }
         }
         break;
      case 11:
         if (var3) {
            c[var1][var0] = bL[var1][var0];
            aG[var1][var0] = aJ[var1][var0];
            cd[var1][var0] = O[var1][var0];
            bL[var1][var0] = 30;
            O[var1][var0] = 0;
            aJ[var1][var0] = 0;
            short var5 = bL[var1][var0];
            short var6 = O[var1][var0];
            short var7 = aJ[var1][var0];
            var10000 = bg[var1];
            var10002 = C;
            var10000[var0] = f.e(var5, var6, var7);
            var10000 = ag[var1];
            var10002 = C;
            var10000[var0] = f.c(var5, var6, var7);
         } else {
            k(var1, var0);
            var4 = false;
         }
         break;
      case 14:
         if (var3) {
            var10005 = C;
            a(115, 4, 4, 2, false, 2, 114);
         }
         break;
      case 15:
         if (var3) {
            var10005 = C;
            a(113, 5, 4, 2, false, 1, 112);
         }
      }

      if (var4) {
         if (var3) {
            p(var1, var0);
         } else {
            m(var1, var0);
         }
      }

      return var0;
   }

   public static final int h(int var0) {
      if (var0 >= 240) {
         return 0;
      } else {
         switch(var0) {
         case 0:
            return 0;
         case 1:
            return e.aG[0];
         case 2:
            return e.aG[1];
         case 3:
            return e.aG[2];
         default:
            return Q[var0 - 4];
         }
      }
   }

   public final void a(Graphics var1) {
      int var2 = y - 0;
      int var3 = var2;
      int var4 = bm;
      int var5 = ar + 0;
      int var6 = S + 4;
      bY = var5 + d.b(e.aG[0], 16) - 1;
      bY /= d.b(e.aG[0], 16);
      bY *= d.b(e.aG[0], 16);
      bZ = bY - var5 >> 1;
      var1.setColor(15132386);
      var1.setClip(0, 0, d.al, d.au);
      var1.fillRect(var2 - bZ, var4, bY, var6);
      var1.setColor(14606046);
      int var7 = var4 + var6;

      for(int var8 = var4; var8 < var7; var8 += 10) {
         var1.drawLine(var2, var8, var2 - 2 * bZ + bY, var8);
      }

      int var9 = d.a(e.aG[0], 16);
      var5 += d.b(e.aG[0], 16) - 1;
      var5 /= d.b(e.aG[0], 16);
      var5 *= d.b(e.aG[0], 16);

      for(int var10 = 0; var10 < var5; var10 += d.b(e.aG[0], 16)) {
         d.a(var1, (int)e.aG[0], var3 + var10 - bZ, var4 - var9, 16);
         d.a(var1, (int)e.aG[0], var3 + var10 - bZ, var4 + S + 4, 17);
      }

   }

   public final void a(Graphics var1, boolean var2) {
      if (e.c) {
         P();
         e.c = false;
      }

      int var3 = y;
      int var4 = bm;
      int var5 = var3 + s;
      int var6 = bC + s;
      int var7 = M;
      int var8 = cj * var6;
      var1.setClip(0, 0, d.al, d.au);
      this.a(var1);
      int var9 = d.a((String)d.Z[h], 1);
      if (var9 > var8) {
         var8 = var9;
      }

      var8 += 2;
      d.a(var1, (String)d.Z[h], 1, y + (ar - var9 >> 1), var4);
      int var10 = d.a((String)d.Z[cm], 0);
      int var11 = y + (ar - var10 >> 1);
      int var12 = bm + S - d.aI[0] + 4;
      e.a(var1, 0, cm, var11, var12);
      int var13;
      int var14;
      if (n == -1 && G) {
         var13 = y + (ar - var10 >> 1) - (3 * d.b(e.aG[0], 0) >> 1);
         var14 = y + (ar + var10 >> 1) + (d.b(e.aG[0], 2) >> 1);
         d.b(var1, e.aG[0], var13, var12, 0);
         d.b(var1, e.aG[0], var14, var12, 2);
      }

      var4 += cB;
      var13 = 0;

      int var19;
      for(var14 = 0; var14 < z; ++var14) {
         d.b(var1, e.aG[1], var5, var4, 27);
         short var15 = bB[var14];
         if (var15 != -1) {
            label73: {
               if (var14 == n) {
                  f var10000 = C;
                  if (((int)f.aN & 256) != 256) {
                     break label73;
                  }
               }

               int var16 = var15 & 255;
               f var10001 = C;
               var19 = var15 >>> 8;
               if (var19 == 0) {
                  if (F[var16] != null) {
                     var1.setClip(var5, var4, F[var16].getWidth(), F[var16].getHeight());
                     d.a(var1, (Image)F[var16], var5, var4, 20);
                  }
               } else {
                  int var17;
                  if (var19 >= 240) {
                     var17 = var19 & 15;
                     var16 >>= 1;
                     var1.setClip(var5 + var16 + 3 - 4, var4 + var16 + 3 - 4, var16 * 2 + 12, var16 * 2 + 12);
                     var1.setColor(cC[var17]);
                     var1.fillArc(var5 + var16 + 3, var4 + var16 + 3, var16 * 2 + 4, var16 * 2 + 4, 0, 360);
                     var1.setColor(16777215);
                     var16 -= 3;
                     var1.drawArc(var5 + var16 + 6 + 3, var4 + var16 + 6 + 3, var16 * 2, var16 * 2, 20, 80);
                  } else {
                     var17 = d.a(e.aG[1], 27) - d.a(h(var19), var16) >> 1;
                     int var18 = d.b(e.aG[1], 27) - d.b(h(var19), var16) >> 1;
                     d.b(var1, h(var19), var5 + var18, var4 + var17, var16);
                  }
               }
            }
         }

         var5 += var6;
         ++var13;
         if (var13 == cj) {
            var5 = var3 + s;
            var4 += var7;
            var13 = 0;
         }
      }

      if (J != null) {
         var14 = d.a((String)J, 0) + 6;
         var19 = d.aI[0] + 6;
         var5 = aa;
         var4 = al + -4;
         if (var5 < 0) {
            var5 = 0;
         }

         if (var5 + var14 > d.al) {
            var5 = d.al - var14;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         if (var4 + var19 > d.au) {
            var4 = d.au - var19;
         }

         d.a(var1, (String)J, 0, var5, var4);
      }

   }

   public final void b(Graphics var1) {
      if (aP) {
         try {
            f var10000 = C;
            f var18;
            f var10003;
            f var10004;
            if (f.au != 0) {
               var1.setClip(0, 0, d.al, d.au);
               var10004 = C;
               var1.fillRect(0, 0, d.al, f.aF);
               var10003 = C;
               int var10002 = d.au - f.aF;
               var10004 = C;
               var1.fillRect(0, var10002, d.al, f.aF);
               var18 = C;
               var10003 = C;
               f var10006 = C;
               var1.fillRect(0, f.aF, f.au, d.au - 2 * f.aF);
               var18 = C;
               int var10001 = d.al - f.au;
               var18 = C;
               var10003 = C;
               var10006 = C;
               var1.fillRect(var10001, f.aF, f.au, d.au - 2 * f.aF);
            }

            if (bH == 1) {
               if (e.g != 23 && e.g != 22) {
                  this.c(var1);
               } else {
                  var1.translate(0, -40);
                  this.c(var1);
                  var1.translate(0, 40);
               }

               return;
            }

            if (bH == 2) {
               this.e(var1);
            }

            if (bH == 3) {
               this.f(var1);
            }

            if (bH != 0) {
               return;
            }

            f var16 = C;
            var18 = C;
            var10003 = C;
            var10004 = C;
            var1.setClip(f.au, f.aF, f.r, f.i);

            try {
               Image var17 = bz[C.aE];
               var18 = C;
               var10003 = C;
               var1.drawImage(var17, f.au, f.aF, 20);
            } catch (Throwable var12) {
               var16 = C;
               var18 = C;
               var10003 = C;
               var10004 = C;
               var1.fillRect(f.au, f.aF, f.r, f.i);
            }

            if (e.g == 0) {
               C.b(var1);
            }

            int var2 = C.aE;

            byte var3;
            short var4;
            byte var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            short var15;
            for(var3 = ca[var2]; var3 != -1; var3 = Z[var2][var3]) {
               var15 = aJ[var2][var3];
               var16 = C;
               if ((var15 > f.aT || (an[var2][var3] & 4) != 0) && (an[var2][var3] & 8) == 0) {
                  var4 = bv[var2][var3];
                  var5 = bW[var2][var3];
                  if ((an[var2][var3] & 16) != 0) {
                     var6 = w[var5][16] + e;
                     var7 = w[var5][17] + k;
                  } else {
                     var6 = w[var5][16] + bg[var2][var3];
                     var7 = w[var5][17] + ag[var2][var3];
                  }

                  if (var4 != -1) {
                     var8 = var4 & 255;
                     var9 = var4 >>> 8;
                     if (var9 == 0) {
                        if (F[var8] != null) {
                           var1.setClip(var6, var7, F[var8].getWidth(), F[var8].getHeight());
                           d.a(var1, (Image)F[var8], var6, var7, 20);
                        }
                     } else if (var9 >= 240) {
                        var10 = var9 & 15;
                        var10000 = C;
                        var8 = f.o(var8, aJ[var2][var3]);
                        var1.setClip(var6 - var8 - 4, var7 - var8 - 4, var8 * 2 + 12, var8 * 2 + 12);
                        var1.setColor(cC[var10]);
                        var1.fillArc(var6 - var8, var7 - var8, var8 * 2 + 4, var8 * 2 + 4, 0, 360);
                        var1.setColor(16777215);
                        var8 -= 3;
                        var1.drawArc(var6 - var8, var7 - var8, var8 * 2, var8 * 2, 20, 80);
                     } else {
                        d.b(var1, h(var9), var6, var7, var8);
                     }
                  }
               }
            }

            if (e.g == 0) {
               try {
                  C.a(var1);
               } catch (Throwable var11) {
               }
            }

            var2 = C.aE;

            for(var3 = ca[var2]; var3 != -1; var3 = Z[var2][var3]) {
               var15 = aJ[var2][var3];
               var16 = C;
               if ((var15 <= f.aT || (an[var2][var3] & 8) != 0) && (an[var2][var3] & 4) == 0) {
                  var4 = bv[var2][var3];
                  var5 = bW[var2][var3];
                  if ((an[var2][var3] & 16) != 0) {
                     var6 = w[var5][16] + e;
                     var7 = w[var5][17] + k;
                  } else {
                     var6 = w[var5][16] + bg[var2][var3];
                     var7 = w[var5][17] + ag[var2][var3];
                  }

                  if (var4 != -1) {
                     var8 = var4 & 255;
                     var9 = var4 >>> 8;
                     if (var9 == 0) {
                        if (F[var8] != null) {
                           var1.setClip(var6, var7, F[var8].getWidth(), F[var8].getHeight());
                           d.a(var1, (Image)F[var8], var6, var7, 20);
                        }
                     } else if (var9 >= 240) {
                        var10 = var9 & 15;
                        var10000 = C;
                        var8 = f.o(var8, aJ[var2][var3]);
                        var1.setClip(var6 - var8 - 4, var7 - var8 - 4, var8 * 2 + 12, var8 * 2 + 12);
                        var1.setColor(cC[var10]);
                        var1.fillArc(var6 - var8, var7 - var8, var8 * 2 + 4, var8 * 2 + 4, 0, 360);
                        var1.setColor(16777215);
                        var8 -= 3;
                        var1.drawArc(var6 - var8, var7 - var8, var8 * 2, var8 * 2, 20, 80);
                     } else {
                        d.b(var1, h(var9), var6, var7, var8);
                     }
                  }
               }
            }

            d(var1);
            if (cr == 4 && (e.g == 0 || e.g == 11 && System.currentTimeMillis() < d.I || e.g == 12 || e.g == 18)) {
               this.a(var1, false);
            }

            var10000 = C;
            if (f.aL) {
               j = "" + d.m + "fps";
               int var14 = d.al - d.a((String)j, 1) >> 1;
               d.a(var1, (String)j, 1, var14, d.au - d.aI[1]);
            }
         } catch (Throwable var13) {
         }

      }
   }

   public static final void f(int var0, int var1) {
      f var10001 = C;
      if (var0 > 29490) {
         d.J += 100 * var1;
      } else {
         var10001 = C;
         if (var0 > 22936) {
            d.J += 75 * var1;
         } else {
            var10001 = C;
            if (var0 > 16383) {
               d.J += 50 * var1;
            } else {
               var10001 = C;
               if (var0 > 9830) {
                  d.J += 25 * var1;
               }
            }
         }
      }

   }

   public static final boolean z() {
      Calendar var0 = Calendar.getInstance();
      f var10003 = C;
      var0.setTime(new Date(f.aN));
      int var1 = var0.get(2);
      int var2 = d.a(var0);
      if (var1 >= 3 && var1 <= 8) {
         if (var2 > 5 && var2 < 22) {
            return false;
         }
      } else if (var2 > 6 && var2 < 18) {
         return false;
      }

      return true;
   }

   public static final void c() {
      Calendar var0 = Calendar.getInstance();
      f var10003 = C;
      var0.setTime(new Date(f.aN));
      Calendar var1 = Calendar.getInstance();
      var10003 = C;
      var1.setTime(new Date(f.cE));
      switch(var0.get(7)) {
      case 1:
         aw = 6;
         break;
      case 2:
         aw = 0;
         break;
      case 3:
         aw = 1;
         break;
      case 4:
         aw = 2;
         break;
      case 5:
         aw = 3;
         break;
      case 6:
         aw = 4;
         break;
      case 7:
         aw = 5;
      }

      boolean var10000;
      if (var0.get(7) == 7) {
         var10000 = true;
      } else {
         var10000 = false;
      }

      if (var0.get(7) == 1) {
         var10000 = true;
      } else {
         var10000 = false;
      }

      int var2;
      int var3;
      f var9;
      f var10001;
      if (g) {
         g = false;
         am = var0.get(12);
         if (var0.get(1) != var1.get(1) || var0.get(2) != var1.get(2) || var0.get(5) != var1.get(5) || var0.get(10) != var1.get(10)) {
            var9 = C;
            var10001 = C;
            var2 = (int)((f.aN - f.cE) / 3600000L);
            var9 = C;
            var3 = (f.aG + aV) / 2;
            f(var3, var2);
            var9 = C;
            aV = f.aG;
         }

         var9 = C;
         av = d.a(f.aN);
      }

      var9 = C;
      aV = f.aG;
      if (var0.get(5) != var1.get(5) || var0.get(2) != var1.get(2) || var0.get(1) != var1.get(1)) {
         b();
         d.v += 10;
         var10001 = C;
         if (T >= 9830) {
            bc = 0;
         } else {
            ++bc;
            byte var6 = 3;
            if (ad == 0 || ad == 2) {
               var6 = 5;
            }

            if (bc >= var6) {
               I();
               bc = 0;
            }
         }

         if (N == 0) {
            d.H = 0;
         } else {
            var9 = C;
            var2 = d.a(f.cE);
            var9 = C;
            av = d.a(f.aN);
            if ((av - 1) / 7 != var2 / 7) {
               d.H = 0;
            }
         }

         var10001 = C;
         if (T > 22936) {
            d.c(N);
            if (d.H == 127) {
               d.d();
            }
         }
      }

      T = aV;
      if (var0.get(10) != var1.get(10)) {
         f(aV, 1);
      }

      var9 = C;
      av = d.a(f.aN);
      cc = av % 7;
      N = cc;
      var2 = var0.get(2);
      bP = var0.get(5);
      boolean var7 = true;
      cp = 9999;
      bS = 0;

      int var4;
      for(var4 = 0; var4 < af.length; ++var4) {
         if (af[var4][0] == var2 && af[var4][1] == bP) {
            aI = true;
            var3 = 0;
         } else if (af[var4][0] == var2) {
            var3 = af[var4][1] - bP;
            if (var3 < 0) {
               var3 += 365;
            }
         } else {
            var3 = bf[var2 - 0] - bP;
            int var5 = var2 + 1;
            if (var5 > 11) {
               var5 = 0;
            }

            while(var5 != af[var4][0]) {
               var3 += bf[var5 - 0];
               ++var5;
               if (var5 > 11) {
                  var5 = 0;
               }
            }

            var3 += af[var4][1];
         }

         if (var3 < cp) {
            cp = var3;
         }

         if (var3 < 7) {
            bS |= 1 << af[var4][2];
         }
      }

      if (var2 >= 3 && var2 <= 8) {
         E = 0;
      } else {
         E = 1;
      }

      var4 = d.a(var0);
      aO = var4;
      boolean var8 = true;
      if (E == 0) {
         if (var4 > 5 && var4 < 22) {
            var8 = false;
            if (cg == 1) {
               var9 = C;
               f.cl = false;
               var9 = C;
               f.bX = false;
               var9 = C;
               f.d();
               var9 = C;
               var9 = C;
               f.aR = f.k(40) - 20;
            }
         } else {
            var8 = true;
         }
      } else if (var4 > 6 && var4 < 18) {
         var8 = false;
         if (cg == 1) {
            var9 = C;
            f.cl = false;
            var9 = C;
            f.bX = false;
            var9 = C;
            f.d();
            var9 = C;
            var9 = C;
            f.aR = f.k(40) - 20;
         }
      } else {
         var8 = true;
      }

      if (bH == 0) {
         if (!d.e[0] && av > 172800000) {
            if (System.currentTimeMillis() - d.d > 60000L) {
               e.c(60);
            }
         } else if (!d.e[2] && f.ap > 259200) {
            if (System.currentTimeMillis() - d.d > 60000L) {
               e.c(62);
            }
         } else if (!d.e[3] && f.Q() > f.cr) {
            if (System.currentTimeMillis() - d.d > 60000L) {
               e.c(63);
            }
         } else if (!d.e[4] && av > 432000000) {
            if (System.currentTimeMillis() - d.d > 60000L) {
               e.c(64);
            }
         } else if (!d.e[5] && D) {
            if (System.currentTimeMillis() - d.d > 60000L) {
               e.c(65);
            }
         } else if (!d.e[6] && cr == 2) {
            e.c(66);
         }
      }

   }

   public static final void I() {
      ++ad;
      switch(ad) {
      case 0:
      default:
         break;
      case 1:
         e.c(80);
         break;
      case 2:
         e.c(83);
         break;
      case 3:
         e.c(81);
         break;
      case 4:
         e.c(84);
         break;
      case 5:
         e.c(82);
         break;
      case 6:
         e.c(85);
      }

   }

   public static final void s() {
      d.d(20);
      e.Y = true;
      f var10000 = C;
      var10000 = C;
      f.C(3);
      var10000 = C;
      var10000 = C;
      f.at = 128;
      var10000 = C;
      f.l = 0;
      var10000 = C;
      var10000 = C;
      f.aT = 80;
      x = null;
      bI = null;
      j(0);
      if (e.g == 23) {
         e.c(e.g + 1);
      }

   }

   public static final void x() {
      cA = 9999;
      f var10000 = C;
      int var0 = f.k(100);
      if (e.g != 0) {
         var0 = 100;
      }

      boolean var1 = true;
      if (var0 < 50) {
         boolean var2 = false;
         int var3;
         if (bP == 1) {
            var1 = true;
            var2 = true;
            var10000 = C;
            var3 = g(1, 20);
            if (var3 != -1) {
               var2 = false;
            }
         }

         if (!var2) {
            var3 = cg == 1 ? 0 : 1;
            int var4 = 0;

            int var5;
            for(var5 = 0; var5 < aj[var3].length; var5 += 2) {
               var4 += aj[var3][var5 + 1];
            }

            var10000 = C;
            var0 = f.k(var4);
            var4 = 0;
            var5 = 0;

            int var7;
            do {
               var7 = aj[var3][var5];
               var4 += aj[var3][var5 + 1];
               var5 += 2;
            } while(var4 < var0 && var5 < aj[var3].length);

            var2 = true;
            int var6;
            switch(var7) {
            case 0:
               var10000 = C;
               var6 = c(0);
               if (var6 >= 6) {
                  var2 = false;
               }
               break;
            case 1:
               var10000 = C;
               var6 = g(2, 24);
               if (var6 != -1) {
                  var2 = false;
               }
               break;
            case 2:
               var10000 = C;
               var6 = g(2, 25);
               if (var6 != -1) {
                  var2 = false;
               }
            }

            ao = var7;
            if (var2) {
               g(var7);
            }
         }
      }

   }

   public static final void g(int var0) {
      f var10001 = C;
      cA = 32 + f.k(192);
      co = null;
      String[] var1 = new String[]{d.aK[0], null, null, d.Z[X[var0]]};
      String var2 = a.a(d.Z[o[var0]], var1);
      co = a.a(var2, 0, d.al - Y - 4);
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 < co.length; ++var5) {
         var3 += d.aI[0] + 2;
         int var6 = d.a((String)co[var5], 0);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      f var10000 = C;
      var10001 = C;
      f = f.aF + (f.i - var3 >> 1);
      var10000 = C;
      var10001 = C;
      cl = f.au + (f.r - var4 >> 1);
      bN = false;
      y = cl;
      bm = f;
      ar = var4;
      S = var3;
   }

   public static final void j() {
      e.am = 3;
      e.aZ = 1;
      i();
      f var10000 = C;
      f.S();

      for(int var0 = 0; var0 < 3; ++var0) {
         int var1 = a(var0);
         if (var1 != -1) {
            j(var1, var0);
         }
      }

      e.Y = false;
      var10000 = C;
      d(5, -1);

      while(a) {
         h();
      }

      x = null;
      f var10001 = C;
      x = bz[5];
      bx = 0;
      bu = 0;
      if (e.g != 0) {
         bu = 2;
      }

      aF = false;
      var10000 = C;
      var10000 = C;
      f.C(101);
      d.e();
      bV = true;
      x();
   }

   public static final void g() {
      bI = null;
      int var0 = V[at][0] << 8;
      int var1 = V[at][1] << 8;
      int var2 = 2;
      int var4 = 0;
      int var5 = d.a(e.aG[0], 20);
      int var6 = 2 + var5;
      int var10000 = var6 << 8;
      f var10001 = C;
      var6 = var10000 / f.i;
      bI = new short[1024];
      int var3 = 0;
      int var7 = 0;

      for(int var8 = 0; var2 < V[at].length; var2 += 4) {
         short var9 = V[at][var2 + 2];
         int var10 = V[at][var2] << 8;
         int var11 = V[at][var2 + 1] << 8;
         short var12 = V[at][var2 + 3];
         int var13 = 0;

         while(var13 <= var9) {
            int var14 = (var10 - var0) * var13 / var9 + var0;
            int var15 = (var11 - var1) * var13 / var9 + var1;
            ++var13;
            var10000 = var14 >> 8;
            var10001 = C;
            var10000 = var10000 * f.r >> 8;
            var10001 = C;
            int var16 = var10000 + f.au - (var5 >> 1);
            var10000 = var15 >> 8;
            var10001 = C;
            var10000 = var10000 * f.i >> 8;
            var10001 = C;
            int var17 = var10000 + f.aF - (var5 >> 1);
            if (a.c(var16 - var7) + a.c(var17 - var8) > var5) {
               var7 = var16;
               var8 = var17;
               bI[var3++] = (short)var16;
               bI[var3++] = (short)var17;
               if (aF) {
                  switch(var12) {
                  case 0:
                     bI[var3++] = 22;
                     break;
                  case 1:
                     bI[var3++] = 23;
                     break;
                  case 2:
                     bI[var3++] = 20;
                     break;
                  case 3:
                     bI[var3++] = 21;
                  }
               } else {
                  switch(var12) {
                  case 0:
                     bI[var3++] = 20;
                     break;
                  case 1:
                     bI[var3++] = 21;
                     break;
                  case 2:
                     bI[var3++] = 22;
                     break;
                  case 3:
                     bI[var3++] = 23;
                  }
               }

               bI[var3++] = (short)(var4 + var13);
            }
         }

         var0 = var10;
         var1 = var11;
         var4 += var9;
      }

      bI[var3 + 3] = 9999;
   }

   public static final void A() {
      if (d.aH != 0) {
         q();
      } else {
         if (bV) {
            d.e();
            d.h();
         }

         e.Y = false;
         aM = 0;
         boolean var0 = true;
         boolean var1 = false;
         boolean var2 = false;
         int var12;
         int var13;
         int var15;
         f var10000;
         f var10001;
         switch(bx) {
         case 0:
            if (e.g == 0) {
               e.am = 3;
               e.aZ = 1;
            }

            if (d.e(4)) {
               ++bu;
               bu &= 3;
            }

            if (d.e(3)) {
               --bu;
               bu &= 3;
            }

            if (d.e(1) || d.e(2)) {
               bu ^= 2;
            }

            if ((e.g == 0 || e.g == 23 && bu == 1) && (d.e(5) || d.e(8) || d.e(6))) {
               e.am = -1;
               e.aZ = 1;
               var10001 = C;
               aN = (long)(8 * 1000);
               switch(bu) {
               case 0:
                  s();
                  return;
               case 1:
                  var10001 = C;
                  at = 2 + f.k(2);
                  break;
               case 2:
                  at = 0;
                  var10001 = C;
                  aN = (long)(15 * 1000);
                  var10000 = C;
                  var10001 = C;
                  d(3, 3);
                  break;
               case 3:
                  at = 1;
                  var10000 = C;
                  d(4, -1);
               }

               bx = 1;
               bO = 0L;
               g();
            }

            short var16 = cn[bu];
            var10001 = C;
            var15 = var16 * f.r >> 8;
            var10001 = C;
            var12 = var15 + f.au;
            var16 = cs[bu];
            var10001 = C;
            var15 = var16 * f.i >> 8;
            var10001 = C;
            var13 = var15 + f.aF;
            aZ = var12;
            aD = var13;
            short var11 = bp[bu];
            if (e.g == 0) {
               e.b(var11, aZ, bD[bu]);
            } else {
               e.b(var11, aZ, bD[2]);
            }
            break;
         case 1:
            if (ac) {
               e.am = 262;
               e.aZ = 1;
               if (d.e(5) || d.e(8) || d.e(6)) {
                  e.am = -1;
                  ac = false;
                  bN = false;
                  cA = 9999;
               }
            } else {
               e.am = -1;
               e.aZ = 1;
               if (bw) {
                  bw = false;
               } else {
                  var10001 = C;
                  bO += f.aB;
               }

               if (bO > (long)aq && a) {
                  h();
               }
            }

            int var3 = (int)(bO * 256L / aN);
            if (!bN && var3 >= cA) {
               bN = true;
               ac = true;
               if (ao != -1) {
                  switch(ao) {
                  case 0:
                     var10000 = C;
                     f var10004 = C;
                     a(0, 9728, 120, 1, 9, 4);
                     break;
                  case 1:
                     var10000 = C;
                     a(2, 61460, 91, 7, 24, 5);
                     break;
                  case 2:
                     var10000 = C;
                     a(2, 62228, 94, 7, 25, 50);
                  case 3:
                     var10000 = C;
                     a(1, 4352, 151, 7, 20, 7);
                     break;
                  case 4:
                     var10000 = C;
                     f.D();
                     break;
                  case 5:
                     var10000 = C;
                     f.m();
                  case 6:
                     var10000 = C;
                     f.Z();
                     break;
                  case 7:
                     d.v += 5;
                     break;
                  case 8:
                     d.v += 10;
                     break;
                  case 9:
                     d.v += 50;
                  }
               }
            }

            if (var3 > 255) {
               var3 = 255;
               boolean var14;
               switch(bu) {
               case 1:
                  var10000 = C;
                  f.G();
                  if (e.g == 0) {
                     bx = 0;
                     bu = 0;
                     aF = false;
                     var14 = false;
                     R = 0;
                     x();
                     return;
                  }

                  s();
                  break;
               case 2:
                  if (aF) {
                     bx = 0;
                     bu = 0;
                     aF = false;
                     var14 = false;
                     R = 0;
                     x();
                     return;
                  }

                  if (!a) {
                     j(2);
                     x = null;
                     bI = null;
                     l();
                     return;
                  }

                  if (!ac) {
                     h();
                  }
                  break;
               case 3:
                  if (aF) {
                     bx = 0;
                     bu = 0;
                     aF = false;
                     var14 = false;
                     R = 0;
                     x();
                     return;
                  }

                  if (!a) {
                     x = null;
                     bI = null;
                     j(3);
                     p();
                     return;
                  }

                  if (!ac) {
                     h();
                  }
               }
            }

            if (aF) {
               var3 = 255 - var3;
            }

            int var4 = 0;
            if (bI != null) {
               while(bI[var4 + 3] < var3) {
                  var4 += 4;
               }

               var4 -= 8;
               if (var4 < 0) {
                  var4 = 0;
               }

               R = var4;
            }

            var4 = 2;
            int var5 = 0;
            int var6 = V[at][0];

            int var7;
            for(var7 = V[at][1]; var4 < V[at].length && var5 + V[at][var4 + 2] < var3; var4 += 4) {
               var5 += V[at][var4 + 2];
               var6 = V[at][var4];
               var7 = V[at][var4 + 1];
            }

            int var8 = var3 - var5;
            if (var8 != 0) {
               int var9 = V[at][var4] - var6;
               int var10 = V[at][var4 + 1] - var7;
               var6 += var9 * var8 / V[at][var4 + 2];
               var7 += var10 * var8 / V[at][var4 + 2];
            }

            var10001 = C;
            var15 = var6 * f.r >> 8;
            var10001 = C;
            var12 = var15 + f.au;
            var10001 = C;
            var15 = var7 * f.i >> 8;
            var10001 = C;
            var13 = var15 + f.aF;
            aZ = var12;
            aD = var13;
            e.b(-1, 0, 0);
         }

      }
   }

   public final void c(Graphics var1) {
      bV = false;
      int var2;
      int var3;
      if (x != null) {
         f var10001 = C;
         f var10002 = C;
         f var10003 = C;
         f var10004 = C;
         var1.setClip(f.au, f.aF, f.r, f.i + 40);
         var1.setColor(16777215);
         var10001 = C;
         var10002 = C;
         var10003 = C;
         var10004 = C;
         var1.fillRect(f.au, f.aF, f.r, f.i + 40);
         f var10000 = C;
         var10001 = C;
         var2 = f.au + (f.r - x.getWidth() >> 1);
         var10000 = C;
         var10001 = C;
         var3 = f.aF + (f.i - x.getHeight() >> 1);
         d.a(var1, (Image)x, var2, var3, 20);
      }

      switch(bx) {
      case 0:
         d.b(var1, e.aG[1], aZ, aD, 8);
         if (e.V != -1) {
            e.a(var1, 0, e.V, e.aK, e.aw);
         }
         break;
      case 1:
         short var5 = 255;
         var3 = R;
         int var4 = 0;
         if (bI != null) {
            while(bI[var3 + 3] < var5 && var4 < 2) {
               d.b(var1, e.aG[0], bI[var3], bI[var3 + 1], bI[var3 + 2]);
               ++var4;
               var3 += 4;
            }
         }
      }

      if (co != null && bN) {
         this.a(var1);

         for(var2 = 0; var2 < co.length; ++var2) {
            d.a(var1, (String)co[var2], 0, cl, f + var2 * (d.aI[0] + 2));
         }
      }

   }

   public static final void d(int var0) {
      byte var1 = 0;

      int var10000;
      f var10001;
      short var2;
      int var3;
      int var6;
      try {
         for(var6 = 0; var6 < z; ++var6) {
            var2 = bB[var6];
            if (var2 != -1) {
               var10001 = C;
               var3 = var2 >>> 8;
               if (var3 >= 4 && var3 < 240 && d[var3 - 4] == 4) {
                  d.f(Q[var3 - 4]);
                  d[var3 - 4] = 2;
               }
            }
         }
      } catch (Throwable var5) {
         var10000 = 500 + var1;
      }

      f var10005;
      f var10006;
      switch(var0) {
      case 0:
         var10005 = C;
         a(191, -1, 6, 3, true, 0, 175);
         break;
      case 1:
         var10005 = C;
         a(191, -1, 4, 2, true, 1, 176);
         break;
      case 2:
         var10005 = C;
         a(191, -1, 4, 2, true, 2, 177);
         break;
      case 3:
         var10005 = C;
         var10006 = C;
         a(190, -1, 6, 3, true, 3 + 0, 172);
         break;
      case 4:
         var10005 = C;
         var10006 = C;
         a(190, -1, 4, 2, true, 3 + 1, 173);
         break;
      case 5:
         var10005 = C;
         var10006 = C;
         a(190, -1, 4, 2, true, 3 + 2, 174);
      }

      var1 = 0;

      try {
         for(var6 = 0; var6 < z; ++var6) {
            var2 = bB[var6];
            if (var2 != -1) {
               var10001 = C;
               var3 = var2 >>> 8;
               if (var3 >= 4 && var3 < 240 && d[var3 - 4] == 2) {
                  d.a(Q[var3 - 4], bX[L[var3 - 4]]);
                  d[var3 - 4] = 4;
               }
            }
         }
      } catch (Throwable var4) {
         var10000 = 1000 + var1;
      }

   }

   public static final void f(int var0) {
      byte var1;
      int var2;
      int var5;
      int var6;
      int var7;
      f var9;
      f var10001;
      var1 = -1;
      var2 = -1;
      bQ = null;
      ck = 0;
      d.f();
      String[] var4 = new String[7];
      e.aP = d.au - d.aI[1] - 30;
      String var3;
      StringBuffer var10000;
      f var10003;
      label142:
      switch(var0) {
      case 0:
         var3 = d.Z[186] + "\n" + d.Z[187] + "\n" + d.Z[188] + "\n" + d.Z[189];
         var3 = a.a(var3, d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[3];
         bQ[0] = 187;
         bQ[1] = 188;
         bQ[2] = 189;
         break;
      case 1:
         var4[3] = d.Z[ax[cz][bd * 5 + 1]];
         var4[4] = Integer.toString(ax[cz][bd * 5 + 4]);
         var3 = d.Z[179] + "\n" + d.Z[187] + "\n" + d.Z[188] + "\n" + d.Z[189];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[3];
         bQ[0] = 187;
         bQ[1] = 188;
         bQ[2] = 189;
         break;
      case 2:
         ck = 1;
         var4[3] = d.Z[ax[cz][bd * 5 + 1]];
         var4[4] = Integer.toString(ax[cz][bd * 5 + 4]);
         var3 = d.Z[178] + "\n" + d.Z[15] + "\n" + d.Z[16];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[2];
         bQ[0] = 15;
         bQ[1] = 16;
         break;
      case 3:
         ck = 1;
         var4[3] = d.Z[ax[cz][bd * 5 + 1]];
         var4[4] = Integer.toString(ax[cz][bd * 5 + 4]);
         var3 = d.Z[193] + "\n" + d.Z[15] + "\n" + d.Z[16];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[2];
         bQ[0] = 15;
         bQ[1] = 16;
         break;
      case 4:
         var3 = d.Z[180] + "\n" + d.Z[187] + "\n" + d.Z[188] + "\n" + d.Z[189];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[3];
         bQ[0] = 187;
         bQ[1] = 188;
         bQ[2] = 189;
         break;
      case 5:
         var3 = d.Z[181] + "\n" + d.Z[187] + "\n" + d.Z[188] + "\n" + d.Z[189];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[3];
         bQ[0] = 187;
         bQ[1] = 188;
         bQ[2] = 189;
         break;
      case 6:
         var3 = d.Z[182] + "\n" + d.Z[187] + "\n" + d.Z[188] + "\n" + d.Z[189];
         var3 = a.a(var3, var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[3];
         bQ[0] = 187;
         bQ[1] = 188;
         bQ[2] = 189;
         break;
      case 7:
         var3 = a.a(d.Z[184], d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 8:
         var3 = a.a(d.Z[185], d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 9:
         var4[0] = d.Z[199 + cu];
         ck = 1;
         if (aC == 0) {
            var4[1] = d.Z[214];
         } else {
            var4[1] = d.Z[213];
         }

         var4[2] = d.Z[215 + aH];
         var3 = a.a(d.Z[207], var4);
         bQ = new int[0];
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         break;
      case 10:
         ck = 1;
         var4[0] = d.Z[199 + cu];
         if (aY == 0) {
            var4[1] = d.Z[214];
         } else {
            var4[1] = d.Z[213];
         }

         var4[2] = d.Z[215 + bl];
         var4[3] = Integer.toString(bq);
         var3 = a.a(d.Z[208], var4);
         co = a.a(var3, 0, d.al - 20);
         bQ = new int[2];
         bQ[0] = 15;
         bQ[1] = 16;
         break;
      case 11:
         var3 = a.a(d.Z[210], d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 12:
         var3 = a.a(d.Z[211], d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 13:
         var3 = a.a(d.Z[209], d.aK);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 14:
         var4[0] = d.Z[199 + cu];
         if (aC == 0) {
            var4[1] = d.Z[214];
         } else {
            var4[1] = d.Z[213];
         }

         var4[2] = d.Z[215 + aH];
         var3 = a.a(d.Z[212], var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
         break;
      case 15:
         ck = 1;
         if (aY == 0) {
            var3 = d.Z[214];
         } else {
            var3 = d.Z[213];
         }

         var3 = var3 + "\n" + d.Z[254] + "\n";
         var6 = 0;

         while(true) {
            var10001 = C;
            if (var6 >= 4) {
               var10000 = (new StringBuffer()).append(var3);
               var10001 = C;
               var3 = var10000.append(Integer.toString(4 + 1)).append(".\t").append(d.P).append(" / ").append(d.ah).append("\n").toString();
               co = a.a(var3, 0, d.al - 10);
               bQ = new int[0];
               break label142;
            }

            var10000 = (new StringBuffer()).append(var3).append(Integer.toString(var6 + 1)).append(".\t");
            var10003 = C;
            var10000 = var10000.append(d.Z[219 + f.bS[var6]]).append(" / ");
            var10003 = C;
            var3 = var10000.append(d.Z[239 + f.F[var6]]).append("\n").toString();
            ++var6;
         }
      case 16:
         ck = 1;
         var1 = 20;
         var2 = d.al - 10;
         var3 = d.Z[255] + "\n";
         var6 = aE - 0;
         var10001 = C;
         if (var6 < 4) {
            var10000 = (new StringBuffer()).append(var3).append(Integer.toString(var6 + 1)).append(".\t");
            var10003 = C;
            var10000 = var10000.append(d.Z[219 + f.bS[var6]]).append(" / ");
            var10003 = C;
            var3 = var10000.append(d.Z[239 + f.F[var6]]).toString();
            var9 = C;
            var7 = f.co[var6];
         } else {
            var10000 = (new StringBuffer()).append(var3);
            var10001 = C;
            var3 = var10000.append(Integer.toString(4 + 1)).append(".\t").append(d.P).append(" / ").append(d.ah).toString();
            var7 = aA;
         }

         var3 = var3 + "\n\n\n" + d.Z[257] + " " + Integer.toString(var7);
         co = a.a(var3, 0, var2);
         bQ = new int[0];
         break;
      case 17:
         ck = 1;
         if (aY == 0) {
            var3 = d.Z[214];
         } else {
            var3 = d.Z[213];
         }

         var3 = var3 + "\n" + d.Z[256] + "\n";
         var6 = 0;

         while(true) {
            var10001 = C;
            if (var6 > 4) {
               co = a.a(var3, 0, d.al - 10);
               bQ = new int[0];
               break label142;
            }

            var7 = aR[var6];
            var10001 = C;
            if (var7 < 4) {
               var10000 = (new StringBuffer()).append(var3).append(Integer.toString(var6 + 1)).append(".\t");
               var10003 = C;
               var10000 = var10000.append(d.Z[219 + f.bS[var7]]).append(" / ");
               var10003 = C;
               var3 = var10000.append(d.Z[239 + f.F[var7]]).append("\n").toString();
            } else {
               var3 = var3 + Integer.toString(var6 + 1) + ".\t" + d.P + " / " + d.ah + "\n";
            }

            ++var6;
         }
      case 18:
         var4[0] = d.P;
         var4[3] = "";
         switch(aL) {
         case 0:
            var4[3] = d.Z[259];
            break;
         case 1:
            var4[3] = d.Z[260];
            break;
         case 2:
            var4[3] = d.Z[261];
         }

         var4[4] = Integer.toString(aQ[aL]);
         var3 = a.a(d.Z[258], var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11)) + 0;
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         return;
      case 19:
         ck = 1;
         var4[0] = d.Z[199 + cu];
         if (aY == 0) {
            var4[1] = d.Z[214];
         } else {
            var4[1] = d.Z[213];
         }

         var4[2] = d.Z[215 + bl];
         if (by != -1) {
            var4[3] = d.Z[by + 219];
         } else {
            var4[3] = d.P;
         }

         if (t != -1) {
            var4[4] = d.Z[194 + bF] + " " + d.Z[t + 239];
         } else {
            var4[4] = d.ah;
         }

         if (aC == 0) {
            var4[5] = d.Z[214];
         } else {
            var4[5] = d.Z[213];
         }

         var4[6] = d.Z[215 + aH];
         var3 = a.a(d.Z[206], var4);
         var5 = d.al - (5 + ct.getWidth() + 4 + d.b(e.aG[0], 15) + d.b(e.aG[0], 11));
         e.aA = a.a(var3, 0, var5);
         e.aU = e.aA.length * (d.aI[0] + 2) + d.a(e.aG[0], 9) + d.a(e.aG[0], 13);
         bQ = new int[0];
      }

      e.X = e.aU > e.aP;
      if (e.X) {
         e.aU = e.aP;
      }

      e.N = 0;
      e.az = true;
      var5 = 0;
      var6 = 0;
      if (co != null) {
         for(int var8 = 0; var8 < co.length; ++var8) {
            var5 += d.aI[0] + 2;
            var7 = d.a((String)co[var8], 0);
            if (var7 > var6) {
               var6 = var7;
            }
         }
      }

      var5 += bQ.length * (d.aI[0] + 2);
      if (var1 == -1) {
         var9 = C;
         var10001 = C;
         f = f.aF + (f.i - var5 >> 1);
      } else {
         f = var1;
      }

      if (var2 != -1) {
         var6 = var2;
      }

      var9 = C;
      var10001 = C;
      cl = f.au + (f.r - var6 >> 1);
      bN = false;
      y = cl;
      bm = f;
      ar = var6;
      S = var5;
      bA = 0;
   }

   public static final int[] i(int var0) {
      Calendar var1 = Calendar.getInstance();
      Calendar var2 = Calendar.getInstance();
      int[] var3 = new int[30];
      int var4 = 0;
      f var10003 = C;
      var2.setTime(new Date(f.aN));

      int var6;
      int var7;
      for(int var5 = 0; var5 < bi[var0].length; ++var5) {
         var6 = bi[var0][var5][0];
         f var10001 = C;
         if (var6 > f.k(256)) {
            var7 = bi[var0][var5][1];
            boolean var8 = false;
            switch(var7) {
            case 0:
               var8 = true;
               break;
            case 1:
               if (aw == 4 || aw == 5) {
                  var8 = true;
               }
               break;
            case 2:
               var1.setTime(new Date(d.aC));
               if (var2.get(2) == var1.get(2) && var2.get(5) == var1.get(5)) {
                  var8 = true;
               }
               break;
            case 3:
               if (var2.get(2) == 5 || var2.get(2) == 6 || var2.get(2) == 7) {
                  var8 = true;
               }
               break;
            case 4:
               if (var2.get(2) == 10 || var2.get(2) == 11 || var2.get(2) == 0) {
                  var8 = true;
               }
               break;
            case 5:
               if (var2.get(2) == 11) {
                  var8 = true;
               }
               break;
            case 6:
               if (aI) {
                  var8 = true;
               }
               break;
            case 7:
               var8 = true;
               break;
            case 8:
               if (av > 30) {
                  var8 = true;
               }
               break;
            case 9:
               if (av > 90) {
                  var8 = true;
               }
            case 10:
            default:
               break;
            case 11:
               if (av > 60) {
                  var8 = true;
               }
               break;
            case 12:
               if (var2.get(2) == 3 || var2.get(2) == 4 || var2.get(2) == 5) {
                  var8 = true;
               }
            }

            if (var8) {
               var3[var4++] = var5;
            }
         }
      }

      int[] var10 = new int[var4];

      for(var6 = 0; var6 < var4; ++var6) {
         var10[var6] = var3[var6];
      }

      Object var9 = null;

      for(var6 = 0; var6 < var4; ++var6) {
         f var10000 = C;
         var7 = f.k(var4);
         int var11 = var10[var7];
         var10[var7] = var10[var6];
         var10[var6] = var11;
      }

      return var10;
   }

   public static final void b() {
      int[] var1 = new int[6];

      int var5;
      int var6;
      int var7;
      f var13;
      f var10001;
      f var10002;
      for(var5 = 0; var5 < 3; ++var5) {
         var6 = 0;

         while(true) {
            var10002 = C;
            if (var6 >= bM[3 + var5] - 1) {
               break;
            }

            var7 = var6 + 1;

            while(true) {
               var10002 = C;
               if (var7 >= bM[3 + var5]) {
                  ++var6;
                  break;
               }

               var10001 = C;
               short var10000 = ax[3 + var5][var6 * 5 + 3];
               var10002 = C;
               if (var10000 == ax[3 + var5][var7 * 5 + 3]) {
                  var13 = C;
                  b(3 + var5, var7);
               }

               ++var7;
            }
         }
      }

      var5 = 0;

      while(true) {
         var10002 = C;
         if (var5 >= bM[3]) {
            var5 = 0;

            while(true) {
               var10002 = C;
               if (var5 >= bM[3]) {
                  Object var0 = null;
                  var13 = C;
                  int[] var10 = i(0);
                  var13 = C;
                  int var2 = c(3);
                  var13 = C;
                  int var3 = f.k(var2);
                  var5 = 0;

                  boolean var11;
                  while(var2 > 0 && var3 > 0) {
                     var13 = C;
                     var11 = b(3, var1[var5++]);
                     if (var11) {
                        --var3;
                        --var2;
                     }
                  }

                  int var4 = 6 - var2;
                  var5 = 0;
                  var11 = true;
                  if (var4 > 0) {
                     var7 = 0;

                     while(true) {
                        var10002 = C;
                        if (var7 >= bM[3]) {
                           if (var11) {
                              var13 = C;
                              a(3, bi[0][0][3], bi[0][0][6], bi[0][0][4], bi[0][0][5], bi[0][0][2]);
                              --var4;
                           }
                           break;
                        }

                        var10001 = C;
                        if (ax[3][var7 * 5 + 2] == 1) {
                           var10001 = C;
                           if (ax[3][var7 * 5 + 3] == bi[0][0][5]) {
                              var11 = false;
                           }
                        }

                        ++var7;
                     }
                  }

                  while(var4 > 0 && var5 < var10.length) {
                     var13 = C;
                     a(3, bi[0][var10[var5]][3], bi[0][var10[var5]][6], bi[0][var10[var5]][4], bi[0][var10[var5]][5], bi[0][var10[var5]][2]);
                     --var4;
                     ++var5;
                  }

                  var7 = 0;

                  while(true) {
                     var10002 = C;
                     if (var7 >= bM[3 + 1]) {
                        var7 = 0;

                        while(true) {
                           var10002 = C;
                           int var8;
                           int var9;
                           if (var7 >= bM[3 + 1]) {
                              var0 = null;
                              var13 = C;
                              var10 = i(1);
                              var13 = C;
                              var2 = c(3 + 1);
                              var13 = C;
                              var3 = f.k(var2);
                              if (E == 0 && var2 - var3 > 3) {
                                 var3 += var2 - var3;
                              }

                              var5 = 0;

                              boolean var12;
                              while(var2 > 0 && var3 > 0) {
                                 var13 = C;
                                 var12 = b(3 + 1, var1[var5++]);
                                 if (var12) {
                                    --var3;
                                    --var2;
                                 }
                              }

                              var4 = 4 - var2;
                              if (E == 0) {
                                 var4 = 3 - var2;
                              }

                              for(var5 = 0; var4 > 0 && var5 < var10.length; ++var5) {
                                 var13 = C;
                                 a(3 + 1, bi[1][var10[var5]][3], bi[1][var10[var5]][6], bi[1][var10[var5]][4], bi[1][var10[var5]][5], bi[1][var10[var5]][2]);
                                 --var4;
                              }

                              var7 = 0;

                              while(true) {
                                 var10002 = C;
                                 if (var7 >= bM[3 + 2]) {
                                    var7 = 0;

                                    while(true) {
                                       var10002 = C;
                                       if (var7 >= bM[3 + 2]) {
                                          var0 = null;
                                          var13 = C;
                                          var10 = i(2);
                                          var13 = C;
                                          var2 = c(3 + 2);
                                          var13 = C;
                                          var3 = f.k(var2);
                                          var5 = 0;
                                          if (E != 0 && var2 - var3 > 3) {
                                             var3 += var2 - var3;
                                          }

                                          while(var2 > 0 && var3 > 0) {
                                             var13 = C;
                                             var12 = b(3 + 2, var1[var5++]);
                                             if (var12) {
                                                --var3;
                                                --var2;
                                             }
                                          }

                                          var4 = 4 - var2;
                                          if (E != 0) {
                                             var4 = 3 - var2;
                                          }

                                          for(var5 = 0; var4 > 0 && var5 < var10.length; ++var5) {
                                             var13 = C;
                                             a(3 + 2, bi[2][var10[var5]][3], bi[2][var10[var5]][6], bi[2][var10[var5]][4], bi[2][var10[var5]][5], bi[2][var10[var5]][2]);
                                             --var4;
                                          }

                                          return;
                                       }

                                       var13 = C;
                                       var10001 = C;
                                       var8 = f.k(bM[3 + 2]);
                                       var9 = var1[var8];
                                       var1[var8] = var1[var7];
                                       var1[var7] = var9;
                                       ++var7;
                                    }
                                 }

                                 var1[var7] = var7++;
                              }
                           }

                           var13 = C;
                           var10001 = C;
                           var8 = f.k(bM[3 + 1]);
                           var9 = var1[var8];
                           var1[var8] = var1[var7];
                           var1[var7] = var9;
                           ++var7;
                        }
                     }

                     var1[var7] = var7++;
                  }
               }

               var13 = C;
               var10001 = C;
               var6 = f.k(bM[3]);
               var7 = var1[var6];
               var1[var6] = var1[var5];
               var1[var5] = var7;
               ++var5;
            }
         }

         var1[var5] = var5++;
      }
   }

   public static final void G() {
      f var10001 = C;
      d.aG += f.aB;
      f var10002 = C;
      if (d.aG > (long)(5 * 1000) || d.e(6)) {
         d.aG = 0L;
         ++d.aL;
      }

   }

   public static final void q() {
      G();
      if (d.aL < 10) {
         ao = d.aL;
         g(d.aL);
         R = 0;
         bO = 0L;
         f var10001 = C;
         aN = (long)(8 * 1000);
         cA = 0;
         bx = 1;
         at = 0;
         bI = null;
         bV = true;
         bN = true;
         ac = true;
      } else {
         bN = false;
         d.aH = 0;
         bx = 0;
      }

   }

   public static final void u() {
      G();
      switch(d.aL) {
      case 0:
         f(7);
         H = 3;
         break;
      case 1:
         f(8);
         H = 3;
         break;
      case 2:
         cz = 3;
         bd = 0;
         f(2);
         H = 2;
         break;
      case 3:
         f(4);
         H = 0;
         break;
      case 4:
         f(5);
         H = 0;
         break;
      case 5:
         f(6);
         H = 0;
         break;
      case 6:
         f(1);
         H = 0;
         break;
      case 7:
         cz = 0;
         bd = 0;
         f(3);
         H = 2;
         break;
      case 8:
         d.aL = 0;
         d.aH = 0;
         l();
      }

   }

   public static final void t() {
      G();
      f var10000;
      switch(d.aL) {
      case 0:
         aE = 5;
         by = -1;
         t = -1;
         aY = 0;
         bl = 0;
         f(19);
         break;
      case 1:
         aE = 5;
         by = -1;
         t = -1;
         aY = 1;
         bl = 0;
         f(19);
         break;
      case 2:
         aE = 5;
         by = -1;
         t = -1;
         aY = 0;
         bl = 1;
         f(19);
         break;
      case 3:
         aE = 5;
         by = -1;
         t = -1;
         aY = 1;
         bl = 1;
         f(19);
         break;
      case 4:
         aE = 5;
         by = -1;
         t = -1;
         aY = 0;
         bl = 2;
         f(19);
         break;
      case 5:
         aE = 5;
         by = -1;
         t = -1;
         aY = 1;
         bl = 2;
         f(19);
         break;
      case 6:
         aE = 5;
         by = -1;
         t = -1;
         aY = 0;
         bl = 3;
         f(19);
         break;
      case 7:
         aE = 5;
         by = -1;
         t = -1;
         aY = 1;
         bl = 3;
         f(19);
         break;
      case 8:
         aE = 5;
         f(9);
         break;
      case 9:
         aE = 7;
         f(11);
         break;
      case 10:
         aE = 7;
         f(12);
         break;
      case 11:
         aE = 6;
         f(10);
         break;
      case 12:
         aE = 7;
         f(13);
         break;
      case 13:
         f(15);
         aE = 8;
         break;
      case 14:
         aE = 5;
         f(14);
         break;
      case 15:
         var10000 = C;
         var10000 = C;
         f.C(100);
         aL = 0;
         f(18);
         break;
      case 16:
         var10000 = C;
         var10000 = C;
         f.C(100);
         aL = 1;
         f(18);
         break;
      case 17:
         var10000 = C;
         var10000 = C;
         f.C(100);
         aL = 2;
         f(18);
         break;
      case 18:
         d.aL = 0;
         d.aH = 0;
         p();
      }

   }

   public static final void l() {
      H = 0;
      cz = 0;
      bA = 0;
      bd = -1;
      if (aO >= 7 && aO != 23) {
         if (aI) {
            f(8);
            H = 3;
         } else {
            f(0);
            H = 0;
            if (!d.f) {
               y();
               e.c(40);
            }
         }
      } else {
         f(7);
         H = 3;
      }

   }

   public static final void d() {
      bd = -1;
      bH = 1;
      b(1);
      j();
      bx = 1;
      bO = 0L;
      aN = 8000L;
      at = 0;
      bu = 2;
      aF = true;
      cA = 9999;
      e.am = -1;
      e.aZ = 1;
      g();
   }

   public static final void y() {
      bd = -1;
      H = 1;
      cz = 3;
      d(cz);
   }

   public static final void a() {
      bd = -1;
      H = 1;
      cz = 0;
      d(cz);
   }

   public static final void M() {
      if (d.e(1)) {
         --bA;
         if (bA < 0) {
            bA = bQ.length - 1;
         }
      }

      if (d.e(2)) {
         ++bA;
         if (bA == bQ.length) {
            bA = 0;
         }
      }

   }

   public static final void J() {
      if (d.aH != 0 && H != 1) {
         u();
      } else if (e.g == 0 || e.g == 44) {
         int var1;
         int var3;
         switch(H) {
         case 0:
            e.Y = false;
            if (e.g == 0) {
               e.am = 3;
               e.aZ = -1;
            }

            M();
            if (d.e(5) || d.e(8) || d.e(6)) {
               switch(bA) {
               case 0:
                  y();
                  return;
               case 1:
                  a();
                  return;
               case 2:
                  d();
               }
            }
            break;
         case 1:
            if (e.g == 0) {
               e.am = 3;
               e.aZ = 25;
            }

            e.Y = true;
            a(true);
            if (d.e(7)) {
               f(0);
               H = 0;
            } else if (bd != -1 && e.g == 0) {
               if (cz >= 3) {
                  if (d.v >= ax[cz][bd * 5 + 4]) {
                     if (ax[cz][bd * 5 + 2] == 8) {
                        f(2);
                        H = 2;
                     } else {
                        var3 = cz - 3;
                        int var2 = 0;

                        for(var1 = 0; var2 < bM[var3] && ax[var3][var1 + 0] != -1; ++var2) {
                           var1 += 5;
                        }

                        if (var2 >= bM[var3]) {
                           f(4 + var3);
                           H = 0;
                        } else {
                           f(2);
                           H = 2;
                        }
                     }
                  } else {
                     f(1);
                     H = 0;
                  }
               } else {
                  f(3);
                  H = 2;
               }
            }
            break;
         case 2:
            e.Y = false;
            e.am = 3;
            e.aZ = -1;
            M();
            if (d.e(6) || d.e(5) || d.e(8) || d.e(6)) {
               switch(bA) {
               case 0:
                  if (cz < 3) {
                     d.v += ax[cz][bd * 5 + 4];
                     ax[cz][bd * 5 + 4] = 0;
                     ax[cz][bd * 5 + 0] = -1;
                     ax[cz][bd * 5 + 1] = 192;
                     ax[cz][bd * 5 + 2] = 0;
                  } else {
                     d.v -= ax[cz][bd * 5 + 4];
                     if (ax[cz][bd * 5 + 2] == 8) {
                        short var0 = ax[cz][bd * 5 + 3];
                        switch(var0) {
                        case 0:
                           D = true;
                        }
                     } else {
                        var3 = cz - 3;

                        for(var1 = 0; ax[var3][var1 + 0] != -1; var1 += 5) {
                        }

                        c(cz, bd * 5, var3, var1);
                        short[] var10000 = ax[var3];
                        var10000[var1 + 4] = (short)(var10000[var1 + 4] >> 1);
                     }

                     ax[cz][bd * 5 + 4] = 0;
                     ax[cz][bd * 5 + 0] = -1;
                     ax[cz][bd * 5 + 1] = 192;
                     ax[cz][bd * 5 + 2] = 0;
                  }

                  H = 1;
                  d(cz);
                  n = bd;
                  bd = -1;
                  break;
               case 1:
                  H = 1;
                  d(cz);
                  n = bd;
                  bd = -1;
               }
            }
            break;
         case 3:
            e.Y = false;
            e.am = 11;
            e.aZ = -1;
            if (d.e(6)) {
               d();
            }

            if (d.e(5) || d.e(8)) {
               d();
            }
         }

      }
   }

   public final void e(Graphics var1) {
      ah = true;
      f var10001 = C;
      f var10002 = C;
      f var10003 = C;
      f var10004 = C;
      var1.setClip(f.au, f.aF, f.r, f.i);

      try {
         var10002 = C;
         Image var9 = bz[3];
         var10002 = C;
         var10003 = C;
         var1.drawImage(var9, f.au, f.aF, 20);
      } catch (Throwable var7) {
         var10001 = C;
         var10002 = C;
         var10003 = C;
         var10004 = C;
         var1.fillRect(f.au, f.aF, f.r, f.i);
      }

      if (e.g == 0 || e.g == 44) {
         switch(H) {
         case 0:
         case 2:
         case 3:
            int var2 = 5;
            int var3 = d.a(e.aG[1], 1);
            int var4 = 0;
            var1.setClip(0, 0, d.al, d.au);

            try {
               var1.drawImage(ct, var2, var3, 20);
               var2 += ct.getWidth() + 2;
               var2 += 0;
               var4 = ct.getHeight();
            } catch (Throwable var6) {
            }

            int var5 = 0;
            if (e.aU < var4) {
               var5 = var4 - e.aU;
               var3 += var5;
            }

            e.a(var1, var2, var3, d.al - 2 - var2, e.aU, bQ.length - bA, true);
            var3 -= var5;
            var3 += 46;
            byte var8 = 39;
            d.b(var1, e.aG[0], var8, var3, 19);
            break;
         case 1:
            this.a(var1, true);
         }

         g(var1);
         ah = false;
      }
   }

   public static final void g(Graphics var0) {
      String var1 = d.Z[53] + " $" + Integer.toString(d.v);
      int var2 = d.a((String)var1, 0);
      f var10000 = C;
      f var10001 = C;
      int var3 = f.au + f.r - var2 - 0;
      var10000 = C;
      int var4 = f.aF + 5;
      var10001 = C;
      f var10002 = C;
      f var10003 = C;
      f var10004 = C;
      var0.setClip(f.au, f.aF, f.r, f.i);
      var0.setColor(16777215);
      var0.fillRect(var3, var4, var2 + 0, d.aI[0] + 2);
      d.a(var0, (String)var1, 0, var3, var4);
   }

   public static final void p() {
      byte[] var0 = new byte[]{0, 0, 0, 4, 1, 6, 3};
      e.Y = false;
      f var10000 = C;
      f.cK = true;
      int var1 = (av - aw) % 7;
      if (var1 < 0) {
         var1 += 7;
      }

      byte var10 = var0[var1];
      byte var2 = bo[(av / 7 + var10) % 7][aw];
      int var3 = 0;

      byte var4;
      for(var4 = 0; var4 == 0 || cp - var3 == 0; var4 = bo[((av + var3) / 7 + var10) % 7][(aw + var3) % 7]) {
         ++var3;
      }

      if (var2 != 0) {
         bl = var2 - 1 >> 1;
         aY = (var2 & 1) == 1 ? 0 : 1;
         bq = cf[var2 - 1][0];
         aQ[0] = cf[var2 - 1][1];
         aQ[1] = cf[var2 - 1][2];
         aQ[2] = cf[var2 - 1][3];
      }

      cu = (aw + var3) % 7;
      aH = var4 - 1 >> 1;
      aC = (var4 & 1) == 1 ? 0 : 1;
      if (aK == av) {
         aE = 5;
         f(19);
      } else if (aO >= 6 && aO != 23 && cp != 0 && var2 != 0) {
         if (av < cx[bl]) {
            aE = 7;
            f(11);
         } else if (av > bK[bl] && bK[bl] != 0) {
            aE = 7;
            f(12);
         } else {
            aE = 6;
            f(10);
            if (!d.W) {
               e.c(50);
            }
         }
      } else {
         if (aO < 6 && var2 != 0 && cp != 0) {
            aH = bl;
            aC = aY;
            cu = aw;
         }

         aE = 5;
         f(9);
      }

      e.Y = false;
      var10000 = C;
      var10000 = C;
      f.bH = 4;
      var10000 = C;
      f.cA = -1;
      var10000 = C;
      f.cj = false;
      var10000 = C;
      f.at = -d.al;
      var10000 = C;
      f.l = 0;
      var10000 = C;
      int var12 = 224 * d.au;
      f var10001 = C;
      f.aT = var12 >> 8;
      var10000 = C;
      var10000 = C;
      int var11 = 128 * d.au;
      f var10002 = C;
      var12 = 106496 * (var11 / 208);
      var10001 = C;
      f.bF = var12 >> 8;
      var10000 = C;
      var10000 = C;
      f.s(9);
      var10000 = C;
      var10000 = C;
      var10001 = C;
      var10002 = C;
      f var10003 = C;
      f.b(f.at, f.aT, 60, f.bH);
      var10000 = C;
      var10000 = C;
      f.C(100);
      var10001 = C;
      var10002 = C;
      var10003 = C;
      f var10004 = C;
      f var10005 = C;
      f var10006 = C;
      C.a(f.at, f.l, f.aT, f.U, f.u, f.bF);
      au = false;
      if (aY == 0) {
         var10000 = C;
         aA = f.i();
      } else {
         var10000 = C;
         aA = f.T();
      }

      var10000 = C;
      bt = f.n(aA);
      var10000 = C;
      f.L();
      var10000 = C;
      f.r(aA);
      int var5 = 0;

      while(true) {
         var10001 = C;
         if (var5 > 4) {
            var5 = 0;

            while(true) {
               var10001 = C;
               if (var5 >= 4) {
                  return;
               }

               int var6 = aR[var5];
               var10001 = C;
               if (var6 == 4) {
                  var6 = aA;
               } else {
                  var10000 = C;
                  var6 = f.co[var6];
               }

               int var7 = var5;

               while(true) {
                  var10001 = C;
                  if (var7 > 4) {
                     ++var5;
                     break;
                  }

                  int var8 = aR[var7];
                  var10001 = C;
                  if (var8 == 4) {
                     var8 = aA;
                  } else {
                     var10000 = C;
                     var8 = f.co[var8];
                  }

                  if (var8 > var6) {
                     int var9 = aR[var5];
                     aR[var5] = aR[var7];
                     aR[var7] = var9;
                     var6 = var8;
                  }

                  ++var7;
               }
            }
         }

         aR[var5] = var5++;
      }
   }

   public static final void F() {
      e.Y = false;
      e.aZ = -1;
      if (d.aH != 0) {
         t();
      } else {
         f var0;
         int var10000;
         f var10001;
         f var10002;
         f var10003;
         switch(aE) {
         case 0:
            e.am = -1;
            var0 = C;
            as = f.at * 5 / d.al;
            if (au) {
               aE = 1;
               var0 = C;
               var10000 = f.bS[1];
               var10001 = C;
               cy = var10000 % f.cq;
               var0 = C;
               f.at = -d.al;
               var0 = C;
               var10000 = 2 * d.al;
               var10001 = C;
               var10002 = C;
               var10003 = C;
               f.b(var10000, f.aT, 60, f.bH);
               var0 = C;
               var0 = C;
               f.C(100);
               au = false;
               as = 0;
               f(16);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
            break;
         case 1:
            e.am = -1;
            var0 = C;
            as = f.at * 5 / d.al;
            if (au) {
               aE = 2;
               var0 = C;
               var10000 = f.bS[2];
               var10001 = C;
               cy = var10000 % f.cq;
               var0 = C;
               f.at = -d.al;
               var0 = C;
               var10000 = 2 * d.al;
               var10001 = C;
               var10002 = C;
               var10003 = C;
               f.b(var10000, f.aT, 60, f.bH);
               var0 = C;
               var0 = C;
               f.C(100);
               au = false;
               as = 0;
               f(16);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
            break;
         case 2:
            e.am = -1;
            var0 = C;
            as = f.at * 5 / d.al;
            if (au) {
               aE = 3;
               var0 = C;
               var10000 = f.bS[3];
               var10001 = C;
               cy = var10000 % f.cq;
               var0 = C;
               f.at = -d.al;
               var0 = C;
               var10000 = 2 * d.al;
               var10001 = C;
               var10002 = C;
               var10003 = C;
               f.b(var10000, f.aT, 60, f.bH);
               var0 = C;
               var0 = C;
               f.C(100);
               au = true;
               as = 0;
               f(16);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
            break;
         case 3:
            e.am = -1;
            var0 = C;
            as = f.at * 5 / d.al;
            if (au) {
               aE = 4;
               var0 = C;
               cy = f.ba;
               var0 = C;
               f.at = -d.al;
               var0 = C;
               var10000 = 2 * d.al;
               var10001 = C;
               var10002 = C;
               var10003 = C;
               f.b(var10000, f.aT, 60, f.bH);
               var0 = C;
               var0 = C;
               f.C(100);
               au = false;
               as = 0;
               f(16);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
            break;
         case 4:
            e.am = -1;
            var0 = C;
            as = f.at * 5 / d.al;
            if (au) {
               aE = 9;
               f(17);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
            break;
         case 5:
            e.am = 262;
            if (d.e(5) || d.e(8) || d.e(6)) {
               n();
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }

            if (d.e(1) && e.X) {
               e.m();
            }

            if (d.e(2) && e.X) {
               e.b();
            }
            break;
         case 6:
            if (e.g == 0) {
               e.am = 3;
            }

            M();
            if (d.e(5) || d.e(8) || d.e(6)) {
               if (bA == 0) {
                  if (d.v < bq) {
                     aE = 7;
                     f(13);
                  } else {
                     aK = av;
                     d.v -= bq;
                     f(15);
                     aE = 8;
                  }
               } else {
                  aE = 5;
                  f(14);
               }
            }
            break;
         case 7:
            e.am = 262;
            if (d.e(5) || d.e(8) || d.e(6)) {
               f(14);
               aE = 5;
            }
            break;
         case 8:
            e.am = 262;
            if (d.e(6) || d.e(5) || d.e(8)) {
               var0 = C;
               var10000 = 2 * d.al;
               var10001 = C;
               var10002 = C;
               var10003 = C;
               f.b(var10000, f.aT, 60, f.bH);
               var0 = C;
               var0 = C;
               f.C(100);
               aE = 0;
               as = 0;
               var0 = C;
               var10000 = f.bS[0];
               var10001 = C;
               cy = var10000 % f.cq;
               f(16);
            }
            break;
         case 10:
            e.am = 262;
            if (d.e(6) || d.e(5) || d.e(8)) {
               e.aA = null;
               aE = 5;
               f(14);
            }

            e.aZ = 1;
            if (d.e(7)) {
               e.b(10);
            }
         case 9:
            e.am = 262;
            if (d.e(6) || d.e(5) || d.e(8)) {
               aL = -1;
               var10000 = aR[0];
               var10001 = C;
               if (var10000 == 4) {
                  aL = 0;
               }

               var10000 = aR[1];
               var10001 = C;
               if (var10000 == 4) {
                  aL = 1;
               }

               var10000 = aR[2];
               var10001 = C;
               if (var10000 == 4) {
                  aL = 2;
               }

               if (aL != 0) {
                  var0 = C;
                  var10000 = f.bS[aR[0]];
                  var10001 = C;
                  var10000 += f.F[aR[0]];
                  var10001 = C;
                  bF = (byte)(var10000 % 5);
                  var0 = C;
                  by = (byte)f.bS[aR[0]];
                  var0 = C;
                  t = (byte)f.F[aR[0]];
               } else {
                  bF = 0;
                  by = -1;
                  t = -1;
               }

               if (aL == -1) {
                  f(14);
                  aE = 5;
               } else {
                  d.v += aQ[aL];
                  var0 = C;
                  f.at = d.al / 2;
                  var0 = C;
                  var0 = C;
                  var10001 = C;
                  var10002 = C;
                  var10003 = C;
                  f.b(f.at, f.aT, 60, f.bH);
                  var0 = C;
                  var0 = C;
                  f.C(100);
                  f(18);
                  var0 = C;
                  var0 = C;
                  f.s(14);
                  aE = 10;
               }
            }
         }

      }
   }

   public static final void n() {
      bH = 1;
      f var10000 = C;
      f.cK = false;
      var10000 = C;
      f.cj = true;
      j();
      bx = 1;
      bO = 0L;
      bw = true;
      aN = 8000L;
      at = 1;
      bu = 3;
      aF = true;
      cA = 9999;
      g();
      e.am = -1;
      e.aZ = 1;
      f var10001 = C;
      C.cp = 0;
      var10000 = C;
      var10000 = C;
      f.bH = 0;
   }

   public final void f(Graphics var1) {
      boolean var2 = false;
      ah = true;
      f var10001 = C;
      f var10002 = C;
      f var10003 = C;
      f var10004 = C;
      var1.setClip(f.au, f.aF, f.r, f.i);

      try {
         var10002 = C;
         Image var17 = bz[4];
         var10002 = C;
         var10003 = C;
         var1.drawImage(var17, f.au, f.aF, 20);
      } catch (Throwable var13) {
         var10001 = C;
         var10002 = C;
         var10003 = C;
         var10004 = C;
         var1.fillRect(f.au, f.aF, f.r, f.i);
      }

      C.a(var1);
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      switch(aE) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
         if (co != null) {
            boolean var15 = false;
            boolean var16 = false;
            this.a(var1);
            var5 = co.length - 1;
            if (as >= 4) {
               ++var5;
            }

            var6 = f;

            for(var7 = 0; var7 < ck; ++var7) {
               d.a(var1, (String)co[var7], 1, cl, var6);
               var6 += d.aI[1] + 2;
            }

            for(var7 = ck; var7 < var5; ++var7) {
               d.a(var1, (String)co[var7], 0, cl, var6);
               var6 += d.aI[0] + 2;
            }

            var7 = aE - 0;
            var10001 = C;
            if (var7 < 4) {
               f var10000 = C;
               var8 = f.cx[var7];
            } else {
               var8 = bt;
            }

            var9 = var8 >> 12 & 15;
            int var10 = co.length - 2;
            int var11 = y + ar / 9;
            if (as > 0) {
               d.a(var1, (String)Integer.toString(var9), 0, var11, f + var10 * (d.aI[0] + 2));
               if (as > 1) {
                  var9 = var8 >> 8 & 15;
                  var11 = y + 3 * ar / 9;
                  d.a(var1, (String)Integer.toString(var9), 0, var11, f + var10 * (d.aI[0] + 2));
                  if (as > 2) {
                     var9 = var8 >> 4 & 15;
                     var11 = y + 5 * ar / 9;
                     d.a(var1, (String)Integer.toString(var9), 0, var11, f + var10 * (d.aI[0] + 2));
                     if (as > 3) {
                        var9 = var8 & 15;
                        var11 = y + 7 * ar / 9;
                        d.a(var1, (String)Integer.toString(var9), 0, var11, f + var10 * (d.aI[0] + 2));
                     }
                  }
               }
            }
         }
         break;
      case 5:
         var2 = true;
      case 7:
      case 10:
         int var3 = 5;
         int var4 = d.a(e.aG[1], 1) >> 1;
         var5 = 0;
         var1.setClip(0, 0, d.al, d.au);

         try {
            var1.drawImage(ct, var3, var4, 20);
            var3 += ct.getWidth() + 2;
            var5 = ct.getHeight();
         } catch (Throwable var12) {
         }

         var6 = 0;
         var7 = var4 + e.aU;
         if (e.aU < var5) {
            var6 = var5 - e.aU;
            var4 += var6;
         } else if (var7 > d.au && var2) {
            var6 = (var7 - d.au) * -1;
            var4 += var6;
         }

         e.a(var1, var3, var4, d.al - 2 + -2 - var3, e.aU, -1, true);
         var4 -= var6;
         var4 += 46;
         byte var14 = 39;
         d.b(var1, e.aG[0], var14 + 0, var4, 19);
         var2 = false;
         break;
      case 6:
      case 8:
      case 9:
         if (e.g == 0 && co != null) {
            this.a(var1);
            var8 = f;

            for(var9 = 0; var9 < co.length; ++var9) {
               d.a(var1, (String)co[var9], 0, cl + 2, var8);
               var8 += d.aI[0] + 2;
            }

            for(var9 = 0; var9 < bQ.length; ++var9) {
               if (var9 == bA) {
                  var10001 = C;
                  var10002 = C;
                  var10003 = C;
                  var10004 = C;
                  var1.setClip(f.au, f.aF, f.r, f.i);
                  var1.setColor(16744703);
                  var1.fillRect(cl, var8 - 1, ar, d.aI[0] + 2);
               }

               d.a(var1, (String)d.Z[bQ[var9]], 0, cl + 2, var8);
               var8 += d.aI[0] + 2;
            }
         }

         if (aE == 6) {
            g(var1);
         }
      }

      ah = false;
   }

   static {
      f var10001 = C;
      cb = 4 * 1000;
      var10001 = C;
      bG = 4 * 1000;
      f var10000 = C;
      bs = 3 + 3;
      cC = new int[]{16711680, 255, 16304752, 0, 65280};
      bz = new Image[bs];
      bb = new byte[bs][];
      ab = new byte[bs * 2][];
      ba = new short[bs];
      var10000 = C;
      ce = 3 + 3;
      ax = new short[ce][];
      var10000 = C;
      q = new short[3];
      j = "";
      b = new byte[]{42, 43, 11, 9, 10, 4, 5, 6, 7, 8, 12, 14, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 44, 45, 46, 47, 48, 49, 50, 51};
      bj = new String[]{"rope", "kitchenObjects", "bone", "shoe", "tap_anim", "hose", "hosejet", "hosespl", "slipper", "ring", "tugtoy", "newspaper", "bone", "squeaker", "bone", "bone", "icecream", "cake", "cola", "doggychew", "energyboost", "milk", "orangejuice", "punch", "roastchicken", "steak", "baconstrips", "beefchunks", "christmaspudding", "dogfoodpacket", "doggytreats", "hogsbreath", "lemonade", "milkshake", "pizza", "rabbitchunks", "sausage", "tunachunks", "tv", "fire", "top", "robot", "mouse", "toycar", "dogwhistle", "dogbrush", "dogcomb", "bbqribs"};
      bn = new short[bj.length];
      aM = bj.length;
      var10001 = C;
      int var0 = 10 << 16;
      var10001 = C;
      az = var0 / 1000;
      w = new short[40][];
      var10000 = C;
      ch = new byte[3][];
      var10000 = C;
      bW = new byte[3][];
      var10000 = C;
      bh = new byte[3][];
      var10000 = C;
      bv = new short[3][];
      var10000 = C;
      bL = new short[3][];
      var10000 = C;
      O = new short[3][];
      var10000 = C;
      aJ = new short[3][];
      var10000 = C;
      cq = new short[3][];
      var10000 = C;
      bT = new short[3][];
      var10000 = C;
      cd = new short[3][];
      var10000 = C;
      bg = new short[3][];
      var10000 = C;
      ag = new short[3][];
      var10000 = C;
      an = new byte[3][];
      var10000 = C;
      aW = new long[3][];
      var10000 = C;
      U = new int[3][];
      var10000 = C;
      aX = new int[3][];
      var10000 = C;
      cw = new short[3][];
      var10000 = C;
      c = new short[3][];
      var10000 = C;
      aG = new short[3][];
      var10000 = C;
      br = new long[3][];
      var10000 = C;
      aS = new byte[3][];
      var10000 = C;
      ca = new byte[3];
      var10000 = C;
      ak = new byte[3];
      var10000 = C;
      Z = new byte[3][];
      var10000 = C;
      ap = new byte[3][];
      r = a.b(230);
      bE = -1;
      aU = -1;
      aP = false;
      ah = false;
      bH = 0;
      cr = 0;
      cD = 0;
      aB = 0;
      ai = false;
      W = new byte[][]{{13, 0, 0, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1, 13, 0, 2, 13, 0, 1}, {12, 0, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0, 12, -2, 0, 12, -1, 0}, {14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0, 14, 0, 0, 15, 0, 0}};
      boolean var1 = false;
      var1 = true;
      bc = 0;
      ad = 0;
      D = false;
      Q = new int[aM];
      L = new byte[aM];
      bX = new byte[33][];
      bM = new int[]{6, 4, 4, 6, 4, 4};
      p = -1;
      ay = -2;
      a = false;
      var1 = false;
      var1 = true;
      cg = 0;
      E = 0;
      av = 0;
      aI = false;
      cc = 0;
      var1 = false;
      bf = new byte[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      af = new short[][]{{0, 1, 0}, {4, 31, 1}, {6, 4, 2}, {8, 6, 3}, {10, 25, 4}, {11, 25, 5}, {11, 31, 6}};
      aV = 0;
      T = 0;
      var10001 = C;
      aq = 3 * 1000;
      cn = new short[]{55, 170, 55, 202};
      cs = new short[]{180, 170, 75, 75};
      bD = new short[]{244, 244, 47, 47};
      bp = new short[]{160, 161, 163, 162};
      V = new short[][]{{93, 180, 93, 80, 256, 0}, {93, 180, 93, 152, 40, 0, 165, 152, 130, 1, 165, 99, 86, 0}, {93, 180, 93, 99, 60, 0, 165, 99, 50, 1, 165, 152, 50, 2, 93, 152, 50, 3, 93, 180, 46, 2}, {93, 180, 93, 152, 31, 0, 165, 152, 55, 1, 165, 99, 55, 0, 93, 99, 55, 3, 93, 180, 60, 2}};
      Y = d.al / 5;
      bV = false;
      o = new short[]{165, 165, 165, 165, 167, 166, 168, 164, 164, 164};
      X = new short[]{334, 335, 336, 337, 0, 0, 0, 169, 170, 171};
      aj = new int[][]{{0, 35, 2, 5, 1, 10, 4, 30, 5, 30, 6, 20, 7, 20, 8, 10, 9, 5}, {0, 25, 1, 10, 4, 30, 6, 20, 7, 20, 8, 10, 9, 5}};
      bI = null;
      int[][][] var2 = new int[3][][];
      int[][] var10003 = new int[22][];
      int[] var10006 = new int[]{256, 0, 3, 8448, 1, 0, 0};
      f var10009 = C;
      var10006[5] = 3;
      var10006[6] = 116;
      var10003[0] = var10006;
      var10006 = new int[]{256, 0, 4, 9984, 1, 0, 0};
      var10009 = C;
      var10006[5] = 4;
      var10006[6] = 123;
      var10003[1] = var10006;
      var10006 = new int[]{179, 0, 5, 10496, 1, 0, 0};
      var10009 = C;
      var10006[5] = 5;
      var10006[6] = 124;
      var10003[2] = var10006;
      var10006 = new int[]{128, 0, 5, 7936, 1, 0, 0};
      var10009 = C;
      var10006[5] = 6;
      var10006[6] = 125;
      var10003[3] = var10006;
      var10006 = new int[]{179, 0, 8, 7680, 1, 0, 0};
      var10009 = C;
      var10006[5] = 7;
      var10006[6] = 126;
      var10003[4] = var10006;
      var10006 = new int[]{256, 0, 10, 8704, 1, 0, 0};
      var10009 = C;
      var10006[5] = 8;
      var10006[6] = 127;
      var10003[5] = var10006;
      var10006 = new int[]{77, 0, 8, 9728, 1, 0, 0};
      var10009 = C;
      var10006[5] = 9;
      var10006[6] = 120;
      var10003[6] = var10006;
      var10006 = new int[]{77, 0, 15, 13056, 1, 0, 0};
      var10009 = C;
      var10006[5] = 10;
      var10006[6] = 128;
      var10003[7] = var10006;
      var10006 = new int[]{128, 0, 14, 5888, 1, 0, 0};
      var10009 = C;
      var10006[5] = 11;
      var10006[6] = 129;
      var10003[8] = var10006;
      var10006 = new int[]{77, 0, 8, 10240, 1, 0, 0};
      var10009 = C;
      var10006[5] = 12;
      var10006[6] = 119;
      var10003[9] = var10006;
      var10006 = new int[]{128, 1, 20, 7424, 1, 0, 0};
      var10009 = C;
      var10006[5] = 13;
      var10006[6] = 118;
      var10003[10] = var10006;
      var10006 = new int[]{230, 2, 12, 5376, 1, 0, 0};
      var10009 = C;
      var10006[5] = 14;
      var10006[6] = 121;
      var10003[11] = var10006;
      var10006 = new int[]{128, 3, 10, 5120, 1, 0, 0};
      var10009 = C;
      var10006[5] = 15;
      var10006[6] = 130;
      var10003[12] = var10006;
      var10006 = new int[]{205, 4, 10, 7168, 1, 0, 0};
      var10009 = C;
      var10006[5] = 16;
      var10006[6] = 131;
      var10003[13] = var10006;
      var10006 = new int[]{179, 5, 12, 8192, 1, 0, 0};
      var10009 = C;
      var10006[5] = 17;
      var10006[6] = 132;
      var10003[14] = var10006;
      var10006 = new int[]{179, 0, 5, 6656, 2, 0, 0};
      var10009 = C;
      var10006[5] = 19;
      var10006[6] = 133;
      var10003[15] = var10006;
      var10006 = new int[]{128, 0, 8, 5632, 2, 0, 0};
      var10009 = C;
      var10006[5] = 20;
      var10006[6] = 134;
      var10003[16] = var10006;
      var10006 = new int[]{179, 0, 6, 9216, 2, 0, 0};
      var10009 = C;
      var10006[5] = 21;
      var10006[6] = 122;
      var10003[17] = var10006;
      var10006 = new int[]{256, 0, 3, 6400, 2, 0, 0};
      var10009 = C;
      var10006[5] = 22;
      var10006[6] = 117;
      var10003[18] = var10006;
      var10006 = new int[]{128, 3, 12, 9472, 2, 0, 0};
      var10009 = C;
      var10006[5] = 24;
      var10006[6] = 135;
      var10003[19] = var10006;
      var10006 = new int[]{256, 6, 16, 6912, 2, 0, 0};
      var10009 = C;
      var10006[5] = 25;
      var10006[6] = 136;
      var10003[20] = var10006;
      var10006 = new int[]{230, 7, 20, 6144, 2, 0, 0};
      var10009 = C;
      var10006[5] = 26;
      var10006[6] = 137;
      var10003[21] = var10006;
      var2[0] = var10003;
      var2[1] = new int[][]{{256, 0, 5, 3072, 7, 7, 139}, {179, 0, 10, 1792, 7, 16, 140}, {128, 0, 50, 11776, 7, 17, 147}, {179, 0, 35, 12800, 7, 18, 148}, {179, 0, 35, 12544, 7, 30, 144}, {256, 0, 15, 4352, 7, 20, 151}, {77, 0, 100, 12032, 7, 22, 155}, {102, 0, 150, 11520, 7, 33, 156}, {77, 0, 60, 11264, 7, 35, 149}, {205, 0, 15, 3840, 7, 36, 152}, {230, 0, 20, 12288, 8, 0, 150}};
      var2[2] = new int[][]{{256, 0, 5, 4096, 7, 6, 141}, {179, 0, 8, 1024, 7, 23, 142}, {256, 0, 10, 61460, 7, 24, 91}, {179, 0, 25, 61716, 7, 27, 93}, {128, 0, 50, 61972, 7, 26, 92}, {77, 0, 15, 62484, 7, 28, 95}, {179, 0, 12, 3584, 7, 29, 143}, {179, 10, 30, 3328, 7, 31, 145}};
      bi = var2;
      aK = -1;
      aQ = new int[3];
      var10000 = C;
      aR = new int[4 + 1];
      bF = 0;
      by = 0;
      t = 0;
      cx = new int[]{0, 31, 61, 121};
      bK = new int[]{30, 60, 120, 0};
      cf = new int[][]{{2, 10, 8, 5}, {2, 10, 8, 5}, {5, 25, 15, 10}, {5, 25, 15, 10}, {10, 50, 35, 20}, {10, 50, 35, 20}, {25, 100, 75, 50}, {25, 100, 75, 50}};
      bo = new byte[][]{{1, 2, 3, 4, 5, 0, 0}, {6, 7, 8, 1, 2, 0, 0}, {3, 4, 5, 6, 7, 0, 0}, {8, 1, 2, 3, 4, 0, 0}, {5, 6, 7, 8, 1, 0, 0}, {2, 3, 4, 5, 6, 0, 0}, {7, 8, 1, 2, 3, 0, 0}, {4, 5, 6, 7, 8, 0, 0}};
   }
}
