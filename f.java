import java.io.DataInputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class f {
   public static final Random bq = new Random();
   public static int au = 0;
   public static int aF = 0;
   public static int r;
   public static int i;
   public static byte[] O;
   public static int[] a;
   public static int f;
   public static int t;
   public static int m;
   public static int aH;
   public static short[] cB;
   public static short[] ct;
   public static int aJ;
   public static int az;
   public static int aD;
   public static int[] ai;
   public static int[] W;
   public static int[] aj;
   public static int bv;
   public static int bD;
   public static int[] bA;
   public static int by;
   public static long bn;
   public int bu = 0;
   public int bM;
   public int bI;
   public int[] ac;
   public int[][] ae;
   public static int cq;
   public static int ba;
   public int[][] cc;
   public static byte[] cy;
   public static short[] bY;
   public static short[] bU;
   public int[] cF;
   public int cf;
   public int q;
   public int bf;
   public int aA = 0;
   public int aE = 0;
   public int cp = 0;
   public int bJ;
   public static int bH;
   public static int cA;
   public static boolean cL;
   public static boolean cK;
   public static long cE;
   public static long aX;
   public static long aN;
   public static long aC;
   public static long al;
   public static long aB;
   public static boolean ar;
   public static long Q;
   public static int bo;
   public static int an;
   public static int I;
   public static int M;
   public static int C;
   public static int z;
   public static int U;
   public static int S;
   public static int aq;
   public static int ch;
   public static int cH;
   public static int cu;
   public static int w;
   public static int j;
   public static int d;
   public static long g;
   public static int P;
   public static int ao;
   public static int Z;
   public static int B;
   public static int cb;
   public static int ck;
   public static boolean cJ;
   public static int bO;
   public static int aU;
   public static int X;
   public static int aw;
   public static int at;
   public static int l;
   public static int aT;
   public static int ay;
   public static int aI;
   public static int bQ;
   public static int cm;
   public static int cC;
   public static int bK;
   public static int H;
   public static int J;
   public static boolean cj;
   public static int u;
   public static int bP;
   public static int bW;
   public static int bz;
   public static int bB;
   public static int ce;
   public static boolean o;
   public static int bF;
   public static int bR;
   public static int cn;
   public static int cw;
   public static int G;
   public static int Y;
   public static int V;
   public static long bw;
   public int aS = 0;
   public int aO = 0;
   public int bj;
   public int bm;
   public static DataInputStream T;
   public static boolean aL;
   public int ad;
   public static int af;
   public static int cr;
   public static int bb;
   public static int cd;
   public static int cz;
   public static short[] bZ;
   public static short[] bV;
   public static short[] cG;
   public static int cg;
   public static int am;
   public static int br;
   public static int ak;
   public static int ab;
   public static int bE;
   public static int aV;
   public static int aZ;
   public static int bi;
   public static int ah;
   public static int as;
   public static int ag;
   public static int bC;
   public static int aY;
   public static int v;
   public static int av;
   public static int ax;
   public static int aQ;
   public static int n;
   public static int N;
   public static int bL;
   public static int A;
   public static int y;
   public static long bN;
   public static int bs;
   public static boolean cl;
   public static boolean bX;
   public static int ca;
   public static int ci;
   public static int cI;
   public static int cv;
   public static int x;
   public static int k;
   public static int e;
   public static int h;
   public static int R;
   public static int ap;
   public static int aa;
   public static int aK;
   public static int L;
   public static int E;
   public static int K;
   public static int D;
   public static int cs;
   public static int p;
   public static int c;
   public static int s;
   public static int aG;
   public static int aR;
   public static int aP;
   public static int aM;
   public static long bh;
   public static int bl;
   public static int aW;
   public static int cD;
   public static long bc;
   public static long be;
   public static boolean bt;
   public static boolean bd;
   public static final boolean[] bp;
   public static int bx;
   public static int b;
   public static int bT;
   public static short[][] bg;
   public static final int[][] bk;
   public static final byte[][] bG;
   public static int[] bS;
   public static int[] co;
   public static int[] cx;
   public static int[] F;

   public f() {
      boolean var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      var10001 = false;
      this.ad = 2;
      System.gc();
   }

   public final void b() {
      C();
      this.bm = d.al >> 1;
      int var10001 = d.au >> 1;
      var10001 = this.bm;
      var10001 = d.au - 30;
   }

   public final void g() {
      R();
      c.D();
      if (cL || cK) {
         this.a(ay, aI, aT, U - 17, u, bF);
      }

   }

   public final void z(int var1) {
      int var2 = this.ae[this.bu + 3][var1];
      int var3 = this.ae[this.bu + 4][var1];
      int var4 = this.ae[this.bu + 7][var1] * bF >> 16;
      this.bM = var2;
      this.bI = var3 - var4;
   }

   public final void a(int var1, int var2, int var3) {
      c.bg[var2][var3] = (short)this.ae[this.bu + 3][var1];
      c.ag[var2][var3] = (short)this.ae[this.bu + 4][var1];
   }

   public final void x() {
      int var1 = this.ae[this.bu + 3][2];
      int var2 = this.ae[this.bu + 4][2];
      int var3 = this.ae[this.bu + 7][2] * bF >> 16;
      bR = var1 + -10;
      cn = var2 - var3 + -15;
   }

   public final boolean o() {
      try {
         this.ac = null;
         this.ae = (int[][])null;
         cy = null;
         bY = null;
         bU = null;
         this.cF = null;
         System.gc();
         T = new DataInputStream((new String("")).getClass().getResourceAsStream("/testdog.bin"));
         this.bj = T.readByte();
         this.bJ = T.readByte();
         byte var12 = T.readByte();
         cq = T.readByte();
         this.aS = T.readByte() & 255;
         int var13 = T.readByte() & 255;
         int var14 = T.readByte() & 255;
         this.aO = T.readByte() & 255;
         this.cF = new int[var14];
         this.ac = new int[var12];

         int var1;
         int var15;
         for(var1 = 0; var1 < var12; ++var1) {
            var15 = T.readUnsignedShort();
            this.ac[var1] = (var15 >>> 8) + ((var15 & 255) << 8);
         }

         if (d.at) {
            return false;
         } else {
            this.cc = new int[cq][];

            int var2;
            int var16;
            int var18;
            for(var1 = 0; var1 < cq; ++var1) {
               this.cc[var1] = new int[8];

               for(var2 = 0; var2 < 8; ++var2) {
                  var15 = T.readByte() & 255;
                  var16 = T.readByte() & 255;
                  int var17 = T.readByte() & 255;
                  var18 = T.readByte() & 255;
                  this.cc[var1][var2] = (var15 << 16) + (var16 << 8) + var17;
               }
            }

            if (d.at) {
               return false;
            } else {
               int[] var11 = new int[this.aS * 6];
               var1 = 0;

               for(var2 = 0; var1 < this.aS; var2 += 6) {
                  var11[var2 + 0] = T.readByte() & 255;
                  var15 = T.readByte() & 255;
                  var11[var2 + 1] = var15;
                  var11[var2 + 2] = T.readByte() & 255;
                  var11[var2 + 3] = T.readByte() & 255;
                  var11[var2 + 4] = T.readByte() & 255;
                  var11[var2 + 5] = T.readByte();
                  ++var1;
               }

               if (d.at) {
                  return false;
               } else {
                  this.ae = new int[var13 * 10][];

                  int var3;
                  for(var3 = 0; var3 < var13 * 10; var3 += 10) {
                     for(var15 = 0; var15 < 10; ++var15) {
                        this.ae[var3 + var15] = new int[this.aO];
                     }

                     for(var1 = 0; var1 < this.aO; ++var1) {
                        byte var8 = T.readByte();
                        byte var9 = T.readByte();
                        byte var10 = T.readByte();
                        byte var4 = T.readByte();
                        byte var5 = T.readByte();
                        byte var6 = T.readByte();
                        byte var7 = T.readByte();
                        this.ae[var3 + 0][var1] = var5;
                        this.ae[var3 + 1][var1] = var6;
                        this.ae[var3 + 2][var1] = var7;
                        this.ae[var3 + 3][var1] = 0;
                        this.ae[var3 + 4][var1] = 0;
                        this.ae[var3 + 5][var1] = 0;
                        this.ae[var3 + 6][var1] = var8;
                        if (var9 < 0) {
                           var16 = 1;
                           this.ae[var3 + 7][var1] = var10;
                           var15 = 0;
                        } else {
                           if (var10 == 0) {
                              var10 = (byte)var11[var9 * 6 + 2];
                           }

                           var16 = var11[var9 * 6 + 1];
                           var15 = var11[var9 * 6 + 5];
                        }

                        this.ae[var3 + 8][var1] = var16 & '\uffff';
                        this.ae[var3 + 7][var1] = var10;
                        this.ae[var3 + 9][var1] = var15;
                     }
                  }

                  Object var20 = null;
                  System.gc();
                  if (d.at) {
                     return false;
                  } else {
                     bU = new short[this.aO];

                     for(var3 = 0; var3 < this.aO; ++var3) {
                        bU[var3] = 0;
                     }

                     var15 = 0;
                     byte[][] var21 = new byte[var14][];
                     bY = new short[var14];

                     for(var3 = 0; var3 < var14; ++var3) {
                        short var22 = T.readShort();
                        T.readByte();
                        this.cF[var3] = T.readByte();
                        var21[var3] = new byte[var22];
                        bY[var3] = (short)var15;
                        var15 += var22;

                        for(var18 = 0; var18 < var22; ++var18) {
                           var21[var3][var18] = T.readByte();
                        }
                     }

                     cy = new byte[var15];

                     for(var3 = 0; var3 < var14; ++var3) {
                        for(var1 = 0; var1 < var21[var3].length; ++var1) {
                           cy[bY[var3] + var1] = var21[var3][var1];
                        }

                        var21[var3] = null;
                     }

                     var21 = (byte[][])null;
                     T.close();
                     T = null;
                     System.gc();
                     return true;
                  }
               }
            }
         }
      } catch (Exception var19) {
         T = null;
         return false;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      bQ = var1;
      cm = var1;
      cC = var3;
      bK = var3;
      int var18 = a.d(var4);
      int var19 = a.a(var4);
      int var20 = a.d(-var4);
      this.t();
      this.d(var5, 0);
      int var9 = this.cf;
      int var11 = this.bf;
      int var12 = var9 * var19 - var11 * var18 >> 16;
      var11 = -(var9 * var20 - var11 * var19) >> 16;
      int var15 = var1 - var12;
      int var16 = var2 - this.q;
      int var17 = var3 - var11;
      this.ae[this.bu + 3][0] = var15;
      this.ae[this.bu + 4][0] = var16;
      this.ae[this.bu + 5][0] = var17;
      if (var15 < bQ) {
         bQ = var15;
      }

      if (var15 > cm) {
         cm = var15;
      }

      if (var17 < cC) {
         cC = var17;
      }

      if (var17 > bK) {
         bK = var17;
      }

      int var7;
      for(var7 = 1; var7 < this.aO; ++var7) {
         int var14 = this.ae[this.bu + 6][var7];
         var15 = this.ae[this.bu + 3][var14];
         var16 = this.ae[this.bu + 4][var14];
         var17 = this.ae[this.bu + 5][var14];
         this.d(var5, var7);
         var9 = this.cf * var6 >> 16;
         int var10 = this.q * var6 >> 16;
         var11 = this.bf * var6 >> 16;
         var12 = var9 * var19 - var11 * var18 >> 16;
         var11 = -(var9 * var20 - var11 * var19) >> 16;
         var15 -= var12;
         var16 -= var10;
         var17 -= var11;
         this.ae[this.bu + 3][var7] = var15;
         this.ae[this.bu + 4][var7] = var16;
         this.ae[this.bu + 5][var7] = var17;
         if (var15 < bQ) {
            bQ = var15;
         }

         if (var15 > cm) {
            cm = var15;
         }

         if (var17 < cC) {
            cC = var17;
         }

         if (var17 > bK) {
            bK = var17;
         }
      }

      c.e = this.ae[this.bu + 3][4];
      c.k = this.ae[this.bu + 4][3];
      boolean var13 = true;

      for(int var8 = 0; var13; ++var8) {
         var7 = 1;

         for(var13 = false; var7 < this.bJ - var8; ++var7) {
            if (this.ae[this.bu + 5][this.ac[var7 - 1] & 255] < this.ae[this.bu + 5][this.ac[var7] & 255]) {
               var13 = true;
               int var21 = this.ac[var7 - 1];
               this.ac[var7 - 1] = this.ac[var7];
               this.ac[var7] = var21;
            }
         }
      }

   }

   public final void d(int var1, int var2) {
      int var7 = 0;
      int var8 = 0;
      int var9 = var1 >> 16;
      boolean var10 = true;
      short var12 = bU[var2];
      byte var11 = cy[var12];
      int var3;
      int var4;
      int var5;
      if (var11 == 0) {
         var3 = 0;
         var4 = 0;
         var5 = 0;
      } else {
         int var21 = var12 + 1;

         int var6;
         for(var6 = 0; var6 < var11; ++var6) {
            var7 = var8;
            if (cy[var21 + var6 * 4] == -1) {
               break;
            }

            var8 = var6;
            if ((cy[var21 + var6 * 4] & 255) > var9) {
               break;
            }
         }

         if (var6 == var11) {
            var7 = var11 - 1;
            var8 = var7;
         }

         if (var7 == var8) {
            var3 = cy[var21 + var7 * 4 + 1] << 7;
            var4 = cy[var21 + var7 * 4 + 2] << 7;
            var5 = cy[var21 + var7 * 4 + 3] << 7;
         } else {
            int var13 = cy[var21 + var7 * 4] & 255;
            int var20 = (cy[var21 + var8 * 4] & 255) - var13;
            if (var20 == 0) {
               var3 = (cy[var21 + var7 * 4 + 1] << 7) + 128;
               var4 = (cy[var21 + var7 * 4 + 2] << 7) + 128;
               var5 = (cy[var21 + var7 * 4 + 3] << 7) + 128;
            } else {
               var20 = (var1 - (var13 << 16)) / var20;
               int var14 = cy[var21 + var7 * 4 + 1] << 7;
               int var15 = cy[var21 + var7 * 4 + 2] << 7;
               int var16 = cy[var21 + var7 * 4 + 3] << 7;
               int var17 = (cy[var21 + var8 * 4 + 1] << 7) - var14;
               int var18 = (cy[var21 + var8 * 4 + 2] << 7) - var15;
               int var19 = (cy[var21 + var8 * 4 + 3] << 7) - var16;
               var3 = var14 + (var17 * var20 + '耀' >> 16) + 128;
               var4 = var15 + (var18 * var20 + '耀' >> 16) + 128;
               var5 = var16 + (var19 * var20 + '耀' >> 16) + 128;
            }
         }
      }

      this.cf = this.ae[this.bu + 0][var2] - (var3 >> 8);
      this.q = this.ae[this.bu + 1][var2] - (var4 >> 8);
      this.bf = this.ae[this.bu + 2][var2] - (var5 >> 8);
   }

   public final void b(Graphics var1) {
      if (bH == this.aE) {
         var1.setClip(au, aF, r, i);
         int var2 = this.ae[this.bu + 7][2] * bF >> 16;
         int var3 = cm - bQ;
         int var4 = bK - cC;
         int var5 = var3 * 176 >> 8;
         int var6 = var4 * 144 >> 8;
         int var7 = bQ + (var3 - var5 >> 1);
         int var8 = aI - var6 + (var2 >> 1);
         var1.setColor(H);
         var1.fillArc(var7, var8, var5, var6, 0, 360);
      }
   }

   public final void a(Graphics var1) {
      int var6 = ba;
      if (c.bH == 3) {
         var6 = c.cy;
      }

      if (cL || cK) {
         var1.setClip(au, aF, r, i);
         int var2;
         int var3;
         int var4;
         int var5;
         int var7;
         if (this.bj != -1) {
            var1.setColor(this.cc[var6][0]);
            if (bF < 65536) {
               var7 = this.bj * bF >> 16;
               if (var7 < 1) {
                  var7 = 1;
               }
            } else {
               var7 = this.bj;
            }

            for(var2 = 0; var2 < this.bJ; ++var2) {
               int var8 = this.ac[var2] >>> 8;
               int var9;
               if (var8 != 0) {
                  var4 = this.ac[var8++];

                  for(var3 = 0; var3 < var4; ++var3) {
                     var5 = this.ac[var8++];
                     var9 = this.ae[this.bu + 7][var5] * bF >> 16;
                     var9 += var7;
                     ++var9;
                     var1.fillArc(this.ae[this.bu + 3][var5] - var9, this.ae[this.bu + 4][var5] - var9, var9 * 2, var9 * 2, 0, 360);
                  }
               } else {
                  var5 = this.ac[var2] & 255;
                  if (var5 != 0) {
                     var9 = this.ae[this.bu + 7][var5] * bF >> 16;
                     var9 += var7;
                     ++var9;
                     var1.fillArc(this.ae[this.bu + 3][var5] - var9, this.ae[this.bu + 4][var5] - var9, var9 * 2, var9 * 2, 0, 360);
                  }
               }
            }
         }

         for(var2 = 0; var2 < this.bJ; ++var2) {
            var7 = this.ac[var2] >>> 8;
            if (var7 == 0) {
               var5 = this.ac[var2] & 255;
               if (var5 != 0) {
                  if (this.ae[this.bu + 9][var5] != 0) {
                     this.b(var1, var5, bF, var6);
                  }

                  this.a(var1, var5, bF, var6);
               }
            } else {
               var4 = this.ac[var7++];

               for(var3 = 0; var3 < var4; ++var3) {
                  var5 = this.ac[var7 + var3];
                  if (this.ae[this.bu + 9][var5] != 0) {
                     this.b(var1, var5, bF, var6);
                  }
               }

               for(var3 = 0; var3 < var4; ++var3) {
                  var5 = this.ac[var7++];
                  this.a(var1, var5, bF, var6);
               }
            }
         }

      }
   }

   public static final short e(int var0, int var1, int var2) {
      int var3 = (-3640 + 52 * var0 + ((5880 - 27 * var0) * var2 >> 8)) / 40 * r / 176;
      return (short)(var3 + au);
   }

   public static final short c(int var0, int var1, int var2) {
      int var3 = ((6600 + 18 * var0 - ((2360 + 15 * var0) * var2 >> 8)) / 40 - var1 * 112 / (var2 + 256)) * i / 208;
      return (short)(var3 + aF);
   }

   public static final int o(int var0, int var1) {
      return var0 * 112 / ((var1 >> 2) + 256) * i / 208;
   }

   public final void a(int var1, boolean var2) {
      int[] var10000;
      if (var2) {
         var10000 = this.ae[this.bu + 8];
         var10000[var1] |= 16777216;
      } else {
         var10000 = this.ae[this.bu + 8];
         var10000[var1] &= -16777217;
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      int var5 = this.ae[this.bu + 7][var2];
      int var7 = this.ae[this.bu + 8][var2];
      int var6;
      if ((var7 & 16777216) != 0) {
         var6 = this.cc[var4][(var7 & 240) >> 4];
      } else {
         var6 = this.cc[var4][var7 & 15];
      }

      int var8 = var5 * var3 >> 16;
      ++var8;
      var1.setColor(var6);
      var1.fillArc(this.ae[this.bu + 3][var2] - var8, this.ae[this.bu + 4][var2] - var8, var8 * 2, var8 * 2, 0, 360);
   }

   public final void b(Graphics var1, int var2, int var3, int var4) {
      int var5 = this.ae[this.bu + 7][var2];
      int var7 = this.ae[this.bu + 8][var2];
      int var6 = this.ae[this.bu + 9][var2];
      int var8 = var5 * var3 >> 16;
      ++var8;
      if (var6 != 0) {
         var1.setColor(this.cc[var4][0]);
         var1.fillArc(this.ae[this.bu + 3][var2] - var8, this.ae[this.bu + 4][var2] - var8 + var6, var8 * 2, var8 * 2, 0, 360);
      }

   }

   public static final void C() {
      bZ[0] = 0;
      bV[0] = cG[31];
      bZ[1] = 0;
      bV[1] = cG[32];
      bZ[2] = 0;
      bV[2] = cG[33];
      bZ[51] = 0;
      bV[51] = cG[38];
      bZ[53] = 0;
      bV[53] = cG[39];
      bZ[52] = cG[36];
      bV[52] = cG[37];
      bZ[54] = cG[40];
      bV[54] = cG[41];
      aU = 128;
      X = 80;
      f var10000 = c.C;
      ca = l(cG[1], cG[6]);
      var10000 = c.C;
      ci = l(cG[2], cG[7]);
      var10000 = c.C;
      cI = l(cG[5], cG[10]);
      var10000 = c.C;
      cv = l(cG[3], cG[8]);
      var10000 = c.C;
      x = l(cG[4], cG[9]);
      var10000 = c.C;
      h = l(cG[11], cG[12]);
      R = 86400 / cG[0];
      ca <<= 16;
      ci <<= 16;
      cI <<= 16;
      cv <<= 16;
      x <<= 16;
      h <<= 16;
      ca /= R / 2;
      ci /= R / 2;
      cI /= R / 2;
      cv /= R / 2;
      x /= R / 2;
      h /= R / 2;
      k = 3342336;
      e = 4980736;
      k /= 300 / cG[0];
      e /= 180 / cG[0];
      k /= R;
      e /= R;
      cg = 0;
      am = 0;
      var10000 = c.C;
      cr = k(4) + 3;
      cd = 0;
      cz = -1;
      d();
      var10000 = c.C;
      aR = k(40) - 20;
      var10000 = c.C;
      ax = k(3) + 0;
      y = -1;
      var10000 = c.C;
      av = k(8) + 19;

      for(A = av; av == A; A = k(9) + 18) {
         var10000 = c.C;
      }

      var10000 = c.C;
      aQ = k(15) + 3;

      for(bs = aQ; aQ == bs; bs = k(15) + 3) {
         var10000 = c.C;
      }

      var10000 = c.C;
      n = k(24) + 27;

      for(N = n; n == N; N = k(24) + 27) {
         var10000 = c.C;
      }

      at = aU;
      aT = X;
      U = 32;
      ap = 0;

      for(int var0 = 0; var0 < 3; ++var0) {
         bA[0] = 0;
      }

      l();
      aK = bo;
      bw = aN;
      Y = -1;
      V = -1;
      cE = aN;
      cJ = false;
      cj = true;
      I();
   }

   public static final void l() {
      al = System.currentTimeMillis();
      if (ar) {
         aB = al - aC;
      } else {
         aB = 0L;
         ar = true;
      }

      if (aB < 0L) {
         aB = 0L;
      }

      aC = al;
      cE = aN;
      aN = System.currentTimeMillis() + aX;
   }

   public static final void R() {
      int[] var0 = new int[]{0, 2, 4, 30, 60, 360, 720, 1440, 10080};
      l();
      if (bx > 0 && e.g == 0 && c.bH == 0) {
         aX += aB * (long)(var0[bx] - 1);
         aN += aB * (long)(var0[bx] - 1);
      }

      if (aN / 1000L != Q / 1000L) {
         bo = (int)((long)bo + (aN / 1000L - Q / 1000L));
         Q = aN;
      }

      if (bv != -1 && (c.an[bD][bv] & 2) == 0) {
         bv = -1;
      }

      if (e.g == 0) {
         A();
         U();
         K();
         c.d(at, l, aT, bH);
      }

      int var10000 = ay;
      var10000 = aI;
      if (cj) {
         ay = e(at, l, aT);
         aI = c(at, l, aT);
         bF = o(106496, aT);
      } else {
         ay = at;
         aI = aT;
      }

      cL = c.C.aE == bH;
      if (cJ) {
         c.I();
         cJ = false;
      }

   }

   public static final void K() {
      f var10000;
      switch(bO) {
      case 0:
         O();
         break;
      case 1:
         P();
         break;
      case 2:
         f();
         break;
      case 3:
         ad();
         break;
      case 5:
         q();
         break;
      case 6:
         k();
         break;
      case 7:
         B();
         break;
      case 8:
         w();
         break;
      case 9:
         W();
         break;
      case 10:
         V();
         break;
      case 11:
         v();
         break;
      case 99:
         if (s() || bd) {
            var10000 = c.C;
            switch(k(4)) {
            case 1:
               s(12);
               break;
            case 2:
               s(17);
               break;
            case 3:
               f(13, 1);
               break;
            default:
               s(4);
            }

            bd = false;
         }
         break;
      case 100:
         if (ar) {
            c.au = a(true);
            if (s() && c.aE == 10) {
               var10000 = c.C;
               switch(k(4)) {
               case 1:
                  f(15, 1);
                  break;
               case 2:
               case 3:
                  f(13, 1);
                  break;
               default:
                  s(14);
               }
            }
         }
         break;
      case 101:
         s();
         break;
      default:
         y(0);
      }

   }

   public static final void A() {
      long var1 = ((long)bo - bc) / (long)cG[0];
      ck = 0;
      if (var1 > 0L) {
         ck = (int)var1;
         bc = (long)bo;
         if (bO == 7) {
            L = (int)((long)L - ((long)ca * var1 >> 18));
            E = (int)((long)E - ((long)ci * var1 >> 18));
            D = (int)((long)D - ((long)cv * var1 >> 18));
         } else if (c.cg == 1) {
            L = (int)((long)L - ((long)ca * var1 >> 17));
            E = (int)((long)E - ((long)ci * var1 >> 17));
            K = (int)((long)K - ((long)cI * var1 >> 16));
            D = (int)((long)D - ((long)cv * var1 >> 17));
         } else {
            L = (int)((long)L - ((long)ca * var1 >> 16));
            E = (int)((long)E - ((long)ci * var1 >> 16));
            K = (int)((long)K - ((long)cI * var1 >> 16));
            D = (int)((long)D - ((long)cv * var1 >> 16));
         }

         bL = (int)((long)bL - ((long)x * var1 >> 16));
         Y();
         int var3 = 9830 + (L + E) / 2;
         K = e(K, var3);
         int var0 = aG - cG[28];
         if (var0 < 0) {
            var0 = var0 * cG[29] >> 8;
         } else {
            var0 = var0 * cG[30] >> 8;
         }

         s = (int)((long)s + ((long)var0 * var1 >> 16));
         s = k(s, 0);
         s = e(s, aM);
         if (cg > 0) {
            cs = (int)((long)cs + (long)k * var1);
         }

         if (am > 0) {
            p = (int)((long)p + (long)e * var1);
         }
      }

   }

   public static final void E() {
      at = 240;
      aT = 50;
      S = aU;
      aq = X;
      a(S, aq, bH, 11, 2);
   }

   public static final void F() {
      long var1 = ((long)bo - bc) / (long)cG[0];
      long var3 = (long)bo - bc;
      int var5 = (int)(var3 / 3600L);
      int var6 = var5 / 24;
      ck = 0;
      if (var1 > 0L) {
         ck = (int)var1;
         bc = (long)bo;
         L = (int)((long)L - ((long)ca * var1 >> 17));
         E = (int)((long)E - ((long)ci * var1 >> 17));
         D = (int)((long)D - ((long)cv * var1 >> 17));
         K = (int)((long)K + ((long)h * var1 >> 16));
         bL = (int)((long)bL - ((long)x * var1 >> 16));
         Y();
         int var8 = 9830 + (L + E) / 2;
         K = e(K, var8);
         int var0 = aG - cG[28];
         if (var0 < 0) {
            var0 = var0 * cG[29] >> 8;
         } else {
            var0 = var0 * cG[30] >> 8;
         }

         s = (int)((long)s + ((long)var0 * var1 >> 16));
         s = k(s, 0);
         s = e(s, aM);
         if (cg > 0) {
            cs = (int)((long)cs + (long)k * var1);
         }

         if (am > 0) {
            p = (int)((long)p + (long)e * var1);
         }
      }

      if (var6 >= 5) {
         var5 = 120;
         cJ = true;
      }

      if (var5 > 12) {
         for(int var7 = 0; var7 < var5 / 12; ++var7) {
            x(10);
            x(0);
         }

         cs = 0;
         cg = 0;
         p = 0;
         am = 0;
      }

      U();
      if (var3 > 600L) {
         if (ah > af) {
            j(14);
         }

         if (as > af) {
            j(15);
         }
      }

   }

   public static void x(int var0) {
      int var2 = s >> 8;
      f var10001 = c.C;
      var2 += k(127);
      f var10000;
      int var4;
      int var5;
      int var6;
      int var7;
      if (var2 > 127 && c.l(0, 2) < 5) {
         if (var0 != 10) {
            var10000 = c.C;
            var6 = k(40);
            var10000 = c.C;
            var7 = k(256);
            var4 = 128 + (var6 * a.d(var7) >> 16);
            var5 = 128 + (var6 * a.a(var7) >> 16);
            c.a(var0, var4, 0, var5, 2, 7, aN);
         }
      } else {
         int var8 = bH;

         for(int var3 = 0; var3 < 3; ++var3) {
            if (var8 >= 3) {
               var8 -= 3;
            }

            int var1 = c.l(0, var8);
            var1 += c.l(10, var8);
            if (var1 < 5) {
               if (var8 == 2 && var0 == 10) {
                  return;
               }

               var10000 = c.C;
               var6 = k(40);
               var10000 = c.C;
               var7 = k(256);
               var4 = 128 + (var6 * a.d(var7) >> 16);
               var5 = 128 + (var6 * a.a(var7) >> 16);
               c.a(var0, var4, 0, var5, var8, 7, aN);
               return;
            }

            ++var8;
         }

      }
   }

   public static final void U() {
      c = bL;
      int var4 = c.l(0, 0);
      var4 += c.l(0, 1);
      var4 += c.l(0, 2);
      int var5 = c.l(10, 0);
      var5 += c.l(10, 1);
      c -= var4 * cG[42];
      c -= var5 * cG[43];
      k(c, 0);
      aG = (L + E + K + D + c) / 5;
      aP = (L + E + K) / 3;
      aG += aG * aR / 100;
      if (cd == cr) {
         aG -= 6553;
      }

      if (cd > cr) {
         aG -= 22936;
      }

      int var3 = Q();
      if (var3 > cr * 4) {
         if (var3 > cr * 8) {
            aG -= 19660;
         } else {
            aG -= 9830;
         }
      }

      if (cl) {
         aG -= 9830;
      }

      if (bX) {
         aG -= 9830;
      }

      aG = e(aG, 32767);
      aG = k(aG, 0);
      br = (32767 - L) * cG[13] >> 8;
      ak = (32767 - E) * cG[14] >> 8;
      ab = (32767 - K) * cG[17] >> 8;
      bE = (32767 - c) * cG[16] >> 8;
      aV = (32767 - D) * cG[15] >> 8;
      aZ = cs;
      bi = p;
      int var0 = c.cg == 1 ? 64 : 256;
      int var1 = c.e(3, 0);
      var0 += (c.an[0][var1] & 2) != 0 ? 128 : -96;
      var0 += bH == 0 ? 64 : 0;
      var0 -= aG >> 9;
      var0 += ab >> 11;
      ah = br * var0 >> 8;
      var0 = c.cg == 1 ? 64 : 256;
      var1 = c.e(4, 0);
      var0 += (c.an[0][var1] & 2) != 0 ? 128 : -96;
      var0 += bH == 0 ? 64 : 0;
      var0 -= aG >> 10;
      var0 += bE >> 11;
      as = ak * var0 >> 8;
      var0 = c.cg == 1 ? 512 : 160;
      var1 = c.e(9, 1);
      var0 += (c.an[1][var1] & 2) != 0 ? 96 : -96;
      if (bH == 1) {
         var1 = c.e(8, 1);
         var0 += (c.an[1][var1] & 2) != 0 ? -384 : 64;
      }

      var0 += aG >> 10;
      var0 += bE >> 11;
      var0 += 32767 - aG >> 9;
      var0 += bO == 7 ? 160 : 0;
      ag = ab * var0 >> 8;
      var0 = c.cg == 1 ? 0 : 256;
      boolean var2 = c.e(bH);
      var0 += var2 ? 128 : -128;
      var2 = c.e(bH + 1);
      var0 += var2 ? 96 : 0;
      var2 = c.e(bH + 2);
      var0 += var2 ? 96 : 0;
      var0 += aG >> 8;
      var0 -= 32767 - aG >> 11;
      bC = aV * var0 >> 8;
      var0 = c.cg == 1 ? 0 : 128;
      var0 += bH == 2 ? 64 : -64;
      var0 -= aG >> 10;
      var0 -= 32767 - aG >> 11;
      var0 = k(var0, 0);
      int var10000 = bE * var0 >> 8;
      var0 = c.cg == 1 ? 128 : 512;
      var0 += bH == 2 ? 80 : 0;
      var0 -= s >> 9;
      var0 -= 32767 - aG >> 11;
      aY = aZ * var0 >> 8;
      var0 = c.cg == 1 ? 128 : 512;
      var0 += bH == 2 ? 80 : 0;
      var0 -= s >> 9;
      var0 += 32767 - aG >> 11;
      v = bi * var0 >> 8;
      af = 8191 + aG >> 2;
      y();
      a((byte)1, ah);
      a((byte)2, as);
      a((byte)3, bC);
      a((byte)5, ag);
      a((byte)7, v);
      a((byte)6, aY);
      aW = e();
   }

   public static final void y() {
      f = 0;
   }

   public static final void a(byte var0, int var1) {
      if (var1 >= af && f < 8) {
         O[f] = var0;
         a[f] = var1;
         ++f;
      }

   }

   public static final int e() {
      for(int var2 = 1; var2 <= f - 1; ++var2) {
         for(int var3 = 0; var3 < f - var2; ++var3) {
            if (a[var3] < a[var3 + 1]) {
               byte var0 = O[var3];
               int var1 = a[var3];
               O[var3] = O[var3 + 1];
               a[var3] = a[var3 + 1];
               O[var3 + 1] = var0;
               a[var3 + 1] = var1;
            }
         }
      }

      if (f > 0) {
         return O[0];
      } else {
         return 0;
      }
   }

   public static final void e(int var0) {
      L += bZ[var0];
      if (!m(var0)) {
         D += bV[var0];
      }

      if (aW == 1) {
         int var10001 = bV[var0] * cG[18];
         f var10002 = c.C;
         D += var10001 >> 8;
      }

      if (var0 == aQ) {
         D += bV[var0] * cG[23] >> 8;
      }

      K += bZ[var0] >> 2;
      ++cg;
      Y();
      i(var0);
      A(var0);
   }

   public static final void a(int var0) {
      E += bZ[var0];
      if (!m(var0)) {
         D += bV[var0];
      }

      if (aW == 2) {
         int var10001 = bV[var0] * cG[19];
         f var10002 = c.C;
         D += var10001 >> 8;
      }

      if (var0 == av) {
         D += bV[var0] * cG[24] >> 8;
      }

      K += bZ[var0] >> 3;
      ++am;
      Y();
      i(var0);
      A(var0);
   }

   public static final void B(int var0) {
      if (!m(var0)) {
         D += bV[var0];
      }

      if (var0 == ax) {
         D += bV[var0] * cG[35] >> 8;
      }

      Y();
      i(var0);
      A(var0);
   }

   public static final void i(int var0, int var1) {
      if (var0 != -1) {
         byte var2 = c.ch[var1][var0];
         if (c.aS[var1][var0] < 255) {
            ++c.aS[var1][var0];
         }

         L -= bZ[var2] >> 3;
         if (!m(var2)) {
            D += bV[var2];
         }

         if (aW == 3) {
            D += bV[var2] * cG[20] >> 8;
         }

         if (var2 == n) {
            D += bV[var2] * cG[25] >> 8;
         }

         K -= bZ[var2] >> 3;
         Y();
         i(var2);
         A(var2);
      }

   }

   public static final void h(int var0) {
      L -= bZ[var0] >> 2;
      if (aW == 3) {
         D += bV[var0] * cG[20] >> 8;
      }

      if (var0 == n) {
         D += bV[var0] * cG[25] >> 8;
      }

      K -= bZ[var0] >> 3;
      Y();
      A(var0);
   }

   public static final void q(int var0) {
      if (bL < 26213) {
         D += bV[var0];
      } else {
         D -= bV[var0] << 1;
      }

      bL = 32767;
      ap = bo;
      k(D, 0);
      e(D, 32767);
      i(var0);
      A(var0);
   }

   public static final void Y() {
      L = k(L, 0);
      L = e(L, 32767);
      E = k(E, 0);
      E = e(E, 32767);
      D = k(D, 0);
      D = e(D, 32767);
      K = k(K, 0);
      K = e(K, 32767);
      c = k(c, 0);
      c = e(c, 32767);
      bL = k(bL, 0);
      bL = e(bL, 32767);
   }

   public static int k(int var0, int var1) {
      return var0 < var1 ? var1 : var0;
   }

   public static int e(int var0, int var1) {
      return var0 > var1 ? var1 : var0;
   }

   public static final void i(int var0) {
      int var1 = -1;
      if (cz == var0) {
         ++cd;
      } else {
         cd = 0;
         cz = var0;
      }

      int var2;
      for(var2 = 0; var2 < 5; ++var2) {
         if (ct[var2] == var0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         for(var2 = 4; var2 > 0; --var2) {
            cB[var2] = cB[var2 - 1];
            ct[var2] = ct[var2 - 1];
         }

         cB[0] = 0;
         ct[0] = (short)var0;
      } else {
         short var3 = cB[var1];

         short var4;
         for(var4 = ct[var1]; var1 > 0; --var1) {
            cB[var1] = cB[var1 - 1];
            ct[var1] = ct[var1 - 1];
         }

         cB[0] = (short)var3;
         ct[0] = (short)var4;
         ++cB[0];
      }

   }

   public static final int Q() {
      int var0 = 0;

      short var1;
      for(var1 = 0; var0 < 5; ++var0) {
         if (ct[var0] != -1 && cB[var0] > var1) {
            var1 = cB[var0];
         }
      }

      return var1;
   }

   public static final boolean m(int var0) {
      if (cz == var0 && cd >= cr) {
         return true;
      } else {
         for(int var1 = 0; var1 < 5; ++var1) {
            if (ct[var1] == var0 && cB[var1] >= cr * 4) {
               return true;
            }
         }

         return false;
      }
   }

   public static final void d() {
      for(int var0 = 0; var0 < 5; ++var0) {
         cB[var0] = 0;
         ct[var0] = -1;
      }

   }

   public static final void a(String var0) {
      try {
         T = new DataInputStream((new String("")).getClass().getResourceAsStream(var0));

         int var1;
         for(var1 = 0; var1 < 45; ++var1) {
            cG[var1] = T.readShort();
         }

         bZ = new short[55];
         bV = new short[55];

         for(var1 = 3; var1 < 51; ++var1) {
            bZ[var1] = T.readShort();
            bV[var1] = T.readShort();
         }

         T.close();
         T = null;
      } catch (Exception var2) {
         T = null;
      }

   }

   public static final void a(int var0, int var1) {
      int var10000 = j;
      j = var0;
      d = var1;
      long var2 = aN;
   }

   public static final void C(int var0) {
      if (bO != var0) {
         int var10000 = bO;
         bO = var0;
         g = aN;
      }

   }

   public static final boolean aa() {
      S = aU;
      aq = X;
      ch = 1;
      return true;
   }

   public static final boolean X() {
      int var0 = c.e(11, 2);
      if (var0 != -1 && (c.an[2][var0] & 2) != 0) {
         S = aU;
         aq = X;
         ch = 2;
         return true;
      } else {
         return false;
      }
   }

   public static final boolean v(int var0) {
      int var2 = c.l(0, bH);
      var2 += c.l(10, bH);
      switch(bH) {
      case 0:
      case 1:
      default:
         int var1 = s >> 8;
         f var10001 = c.C;
         var1 += k(127);
         if (var1 > 127 && c.l(0, 2) < 5) {
            c(80);
            ch = 2;
            return true;
         }
         break;
      case 2:
         if (var2 < 5) {
            c(80);
            ch = 2;
            return true;
         }
      }

      int var4 = bH;
      if (var2 < 5) {
         c(80);
         return true;
      } else {
         for(int var3 = 0; var3 < 2; ++var3) {
            ++var4;
            if (var4 >= 3) {
               var4 -= 3;
            }

            var2 = c.l(0, var4);
            var2 += c.l(10, var4);
            if (var2 < 5) {
               c(80);
               ch = var4;
               return true;
            }
         }

         return false;
      }
   }

   public static final boolean z() {
      return (ao & 768) != 0;
   }

   public static final boolean c() {
      if ((ao & 768) != 0) {
         switch(j) {
         case 2:
         case 3:
         case 12:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 23:
         case 30:
         case 31:
         case 33:
         case 34:
         case 35:
         case 37:
            long var0 = (aN - bn) / 1000L;
            if (var0 >= 0L && var0 <= 30L) {
               if ((ao & 512) != 0) {
                  if (bo - bA[2] < 120) {
                     bX = true;
                  }

                  for(int var2 = 2; var2 > 0; --var2) {
                     bA[var2] = bA[var2 - 1];
                  }

                  bA[0] = bo;
                  ch = by;
                  ao |= 64;
               } else {
                  ch = bH;
               }

               ao &= -769;
               S = aU;
               aq = X;
               return true;
            }

            ao &= -833;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 13:
         case 20:
         case 21:
         case 22:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 32:
         case 36:
         }
      }

      return false;
   }

   public static final boolean t(int var0) {
      int var1;
      if (var0 == 1) {
         var1 = c.e(3, 0);
      } else {
         var1 = c.e(4, 0);
      }

      if (var1 != -1 && (c.an[0][var1] & 2) != 0) {
         S = c.bT[0][var1];
         aq = c.cd[0][var1];
         ch = 0;
         return true;
      } else {
         S = 100;
         aq = 100;
         ch = 0;
         return false;
      }
   }

   public static final int j() {
      n();
      if (b != -1 && (c.an[bT][b] & 2) != 0) {
         switch(c.bW[bT][b]) {
         case 8:
            S = 100;
            aq = 100;
            ch = bT;
            break;
         case 34:
            S = 100;
            aq = 200;
            ch = bT;
            break;
         default:
            S = c.bL[bT][b];
            aq = c.aJ[bT][b];
            ch = bT;
         }

         bv = b;
         bD = bT;
         return c.bW[bD][bv];
      } else {
         return 0;
      }
   }

   public static final void n() {
      int var1 = -1;
      int var2 = -1;
      int var3 = 10;
      int var4 = 0;
      int var5 = bH;

      int var0;
      for(int var6 = 0; var6 < 3; ++var6) {
         var0 = c.a(var5);
         var4 = 0;
         if (var0 != -1 && (c.an[var5][var0] & 2) != 0) {
            var4 = aW == 3 ? 288 : 128;
            if (bH == var5) {
               var4 += 128;
            }

            var4 -= c.aS[var5][var0] >> 2;
         }

         if (var4 > var3) {
            var3 = var4;
            var1 = var0;
            var2 = var5;
         }

         ++var5;
         var5 %= 3;
      }

      var0 = c.e(8, 1);
      if (var0 != -1) {
         if ((c.an[1][var0] & 2) != 0) {
            var4 = aW == 3 ? 128 : 0;
            if (bH == 1) {
               var4 += 128;
            }

            var4 -= c.aS[1][var0] >> 2;
         }

         if (var4 > var3) {
            var1 = var0;
            var2 = 1;
         }
      }

      if (var1 == -1) {
         var0 = c.e(34, 2);
         if (var0 != -1 && bH == 2) {
            var1 = var0;
            var2 = 2;
         }
      }

      b = var1;
      bT = var2;
   }

   public static final void l(int var0) {
      int var1;
      int var2;
      switch(var0) {
      case 20:
         cs = 0;
         --cg;
         var1 = at - (36 * a.d(U) >> 16);
         var2 = aT + (36 * a.a(U) >> 16);
         var1 = k(var1, 80);
         var1 = e(var1, 192);
         var2 = k(var2, 64);
         var2 = e(var2, 200);
         c.a(0, var1, 0, var2, bH, 7, aN);
         break;
      case 21:
         p = 0;
         --am;
         if (bH != 2) {
            var1 = at - (36 * a.d(U) >> 16);
            var2 = aT + (36 * a.a(U) >> 16);
            var1 = k(var1, 80);
            var1 = e(var1, 192);
            var2 = k(var2, 64);
            var2 = e(var2, 200);
            c.a(10, var1, 0, var2, bH, 7, aN);
         }
      }

      aW = 0;
      be = aN;
      if (bH == 2) {
         ao |= 2;
      } else {
         ao |= 1;
      }

   }

   public static final void j(int var0) {
      byte[] var10000;
      int var1;
      if (var0 == 14) {
         var1 = c.e(3, 0);
         if (var1 != -1 && (c.an[0][var1] & 2) != 0) {
            var10000 = c.an[0];
            var10000[var1] &= -3;
            e(m);
         }
      } else {
         var1 = c.e(4, 0);
         if (var1 != -1 && (c.an[0][var1] & 2) != 0) {
            var10000 = c.an[0];
            var10000[var1] &= -3;
            a(t);
         }
      }

   }

   public static final int J() {
      if (c()) {
         if (j == 2 && bH == ch) {
            ao &= -65;
            if (f(S, aq, 10)) {
               return 2;
            }
         }

         cu = 2;
         cH = 11;
         cH = 10;
         return 4;
      } else {
         ao &= -65;
         if (X()) {
            cu = 22;
            if (bL < 26213) {
               cH = 11;
            } else {
               cH = 10;
            }

            return 4;
         } else {
            int var0;
            int var1;
            for(int var2 = 0; var2 < f; ++var2) {
               switch(O[var2]) {
               case 1:
               case 2:
                  if (t(O[var2])) {
                     if (O[var2] == 1) {
                        cu = 14;
                     } else {
                        cu = 15;
                     }

                     cH = 11;
                     return 4;
                  }

                  if (var2 == 0 && a[var2] > 26624) {
                     if (ch != bH) {
                        cu = 2;
                        cH = 11;
                        return 4;
                     }

                     if (f(S, S, 10)) {
                        return 2;
                     }

                     cu = 2;
                     cH = 10;
                     return 4;
                  }
                  break;
               case 3:
                  if ((var0 = j()) != 0) {
                     var1 = p(var0);
                     if (var1 != -1) {
                        return var1;
                     }
                  }
               case 4:
               default:
                  break;
               case 5:
                  if (aa()) {
                     cu = 8;
                     cH = 10;
                     return 4;
                  }
                  break;
               case 6:
               case 7:
                  if (v(O[var2])) {
                     if (O[var2] == 6) {
                        cu = 20;
                     } else {
                        cu = 21;
                     }

                     if (ch != bH) {
                        cH = 11;
                     } else {
                        cH = 10;
                     }

                     return 4;
                  }
               }
            }

            var0 = j();
            if (var0 != 0) {
               var1 = p(var0);
               if (var1 != -1) {
                  return var1;
               }
            }

            if (bO == 3) {
               return a();
            } else {
               return 1;
            }
         }
      }
   }

   public static final int p(int var0) {
      switch(var0) {
      case 5:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
         cu = 16;
         cH = 12;
         return 12;
      case 6:
      case 7:
      case 16:
      case 20:
      case 21:
      case 32:
      case 36:
         if (j != 19) {
            cu = 19;
            cH = 13;
            return 13;
         }

         return 19;
      case 8:
      case 34:
      case 37:
         if (j != 35) {
            cu = 35;
            cH = 11;
            return 11;
         }

         return 35;
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 19:
      default:
         return -1;
      case 17:
      case 22:
      case 33:
      case 35:
         cu = 37;
         cH = 12;
         return 37;
      case 18:
      case 30:
         if (j != 33) {
            cu = 33;
            cH = 11;
            return 11;
         }

         return 33;
      case 23:
      case 29:
      case 31:
         if (j != 23) {
            cu = 23;
            cH = 13;
            return 13;
         } else {
            return 23;
         }
      }
   }

   public static final int a() {
      long var0 = (aN - g) / 1000L;
      int var10000 = (32767 - aG >> 8) + 10;
      f var10001 = c.C;
      int var2 = var10000 + k(1 + (aG >> 9));
      if (var0 > (long)var2) {
         return 4;
      } else if (P < 0) {
         switch(j) {
         case 2:
            w = 4;
            var10001 = c.C;
            P = 5 + k(6);
            return 2;
         case 3:
         default:
            w = 1;
            var10001 = c.C;
            P = 5 + k(6);
            return 3;
         case 31:
            w = 21;
            var10001 = c.C;
            P = 1 + k(3);
            return 31;
         }
      } else {
         if (P > 0) {
            --P;
         } else {
            P = -1;
            r();
            switch(j) {
            case 2:
            case 3:
            default:
               if (bH == 2) {
                  a(112, 100, 7, 30);
               }

               a(112, 60, 39, 31);
               a(64, 40, 21, 31);
               a(16, 40, 2, 3);
               a(48, 40, 17, 2);
               a(80, 40, 16, 2);
               a(96, 40, 18, 2);
               a(112, 40, 13, 3);
               a(80, 40, 42, 3);
               a(96, 40, 41, 3);
               break;
            case 31:
               a(112, 60, 39, 31);
               a(112, 60, 19, 31);
               a(16, 40, 2, 3);
               a(48, 40, 17, 2);
               a(80, 40, 16, 2);
               a(96, 40, 18, 2);
               a(112, 40, 13, 3);
               a(80, 40, 42, 3);
               a(96, 40, 41, 3);
            }

            if (u() != -1) {
               w = az;
               return aD;
            }
         }

         return 1;
      }
   }

   public static final int y(int var0) {
      h();
      f var10000 = c.C;
      int var1 = k(10);
      int var2 = bH;
      if (c.cg == 1) {
         var2 = 1;
      }

      f var10001;
      if (bt) {
         var10001 = c.C;
         var2 += k(2);
         if (var2 >= 3) {
            var2 -= 3;
         }

         bt = false;
      }

      if (var0 == 1) {
         switch(j) {
         case 2:
         case 3:
         case 8:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 33:
         case 35:
         case 37:
            var0 = J();
            break;
         case 4:
         case 6:
         case 10:
         case 11:
         case 12:
         case 13:
         case 36:
            if (cu != 0) {
               var0 = cH;
            } else if (var1 < 3) {
               var0 = 11;
            } else {
               var0 = 10;
            }
         case 5:
         case 7:
         case 9:
         case 24:
         case 25:
         case 32:
         case 34:
         default:
            break;
         case 14:
         case 15:
            var0 = 3;
         }
      }

      if (var0 == 11) {
         int var3 = aG >> 1;
         var10001 = c.C;
         var1 = var3 + k(6553);
         if (var1 < 9830) {
            var0 = 10;
         }
      }

      switch(var0) {
      case 1:
      case 5:
      case 7:
      case 9:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 32:
      case 34:
      default:
         return 0;
      case 2:
      case 3:
      case 31:
         return b(var0, 1, w);
      case 4:
      case 6:
         return u(var0);
      case 8:
         return g(var0);
      case 10:
      case 11:
      case 12:
      case 13:
      case 36:
         if (cu != 0) {
            a(S, aq, ch, var0, cu);
            cu = 0;
            return var0;
         } else {
            if (var2 == bH) {
               c(0);
               return a(S, aq, var2, var0, 3);
            }

            return a(aU, X, var2, var0, 3);
         }
      case 14:
      case 15:
         return h(var0, 4);
      case 16:
      case 17:
      case 18:
      case 37:
         return n(var0, 1);
      case 19:
         return n(19, 4);
      case 20:
      case 21:
         return b(var0, 4);
      case 22:
         return g(var0, 4);
      case 23:
      case 33:
      case 35:
         return n(var0, 4);
      case 30:
         return w(3);
      }
   }

   public static final int g(int var0, int var1) {
      S();
      int var2 = c.e(11, 2);
      if (var2 != -1 && (c.an[2][var2] & 2) != 0) {
         switch(var0) {
         case 22:
            if (bL < 26213) {
               f(23, 1);
            } else {
               s(2);
            }
         default:
            a(var0, var1);
            c.L();
            C(8);
            return var0;
         }
      } else {
         return b(2, 1, 4);
      }
   }

   public static final boolean w() {
      if (s()) {
         if (B == 2) {
            f(3, 1);
            return false;
         }

         if (B != 23 && B != 3) {
            y(d);
            return true;
         }

         b(j);
         s(24);
      }

      return false;
   }

   public static final void b(int var0) {
      switch(var0) {
      case 22:
         q(52);
         c += cG[36];
         c = c > 32767 ? 32767 : c;
         int var10000 = cD;
         c.i();
      default:
         aW = 0;
      }
   }

   public static final int u(int var0) {
      s(0);
      a((int)var0, 1);
      C(0);
      return var0;
   }

   public static final boolean O() {
      if (s()) {
         y(d);
         return true;
      } else {
         return false;
      }
   }

   public static final int a(int var0, int var1, int var2, int var3, int var4) {
      byte var5 = 30;
      switch(var3) {
      case 10:
         s(8);
         var5 = 30;
         break;
      case 11:
      case 12:
      case 13:
         s(9);
         var5 = 60;
         break;
      case 36:
         s(49);
         var5 = -30;
      }

      b(var0, var1, var5, var2);
      a(var3, var4);
      C(1);
      return var3;
   }

   public static final boolean P() {
      short var0 = 0;
      short var1 = 0;
      s();
      if (j == 12 && cA == -1) {
         if (bv != -1) {
            var0 = c.bL[bD][bv];
            var1 = c.aJ[bD][bv];
            c(var0, var1);
         }

         if (f(var0, var1, 10)) {
            y(d);
            return true;
         }
      }

      if (j == 13 && cA == -1) {
         if (bv != -1) {
            byte var2 = c.bW[bD][bv];
            short var3 = c.w[var2][12];
            short var4 = c.w[var2][13];
            int var5 = c.bL[bD][bv] + var3;
            int var6 = c.aJ[bD][bv] + var4;
            c(var5, var6);
            if (f(var5, var6, 10)) {
               y(d);
               return true;
            } else {
               if (a(true)) {
                  ao &= -65;
               }

               return false;
            }
         } else {
            y(1);
            return true;
         }
      } else if (a(true)) {
         y(d);
         return true;
      } else {
         return false;
      }
   }

   public static final int h(int var0, int var1) {
      int var2;
      byte var3;
      short var4;
      short var5;
      switch(var0) {
      case 14:
         var2 = c.e(3, 0);
         if (var2 != -1) {
            var3 = c.bW[0][var2];
            var4 = c.w[var3][12];
            var5 = c.w[var3][13];
            at = c.bL[0][var2] + var4;
            l = c.O[0][var2];
            aT = c.aJ[0][var2] + var5;
            U = c.cq[0][var2];
         }

         s(50);
         break;
      case 15:
         var2 = c.e(4, 0);
         if (var2 != -1) {
            var3 = c.bW[0][var2];
            var4 = c.w[var3][12];
            var5 = c.w[var3][13];
            at = c.bL[0][var2] + var4;
            l = c.O[0][var2];
            aT = c.aJ[0][var2] + var5;
            U = c.cq[0][var2];
         }

         s(50);
      }

      a(var0, var1);
      C(2);
      return var0;
   }

   public static final boolean f() {
      if (s()) {
         switch(B) {
         case 10:
         case 11:
            j(j);
            s(51);
            break;
         case 50:
            if (j == 15) {
               f(11, 4);
            } else {
               f(10, 5);
            }
            break;
         case 51:
         default:
            S = at + 32;
            aq = aT;
            a(S, aq, bH, 36, 3);
            return true;
         }
      }

      return false;
   }

   public static final int b(int var0, int var1, int var2) {
      S();
      label34:
      switch(var0) {
      case 2:
      case 3:
         f var10001;
         switch(var2) {
         case 1:
            if (aG >> 12 > 3) {
               s(1);
            } else if (B == 2) {
               s(2);
            } else {
               s(3);
            }
            break label34;
         case 2:
         case 3:
         case 12:
         case 16:
         case 17:
         case 41:
         case 42:
            s(var2);
            break label34;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 18:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         default:
            if (U > 128) {
               aw = 240;
            } else {
               aw = 32;
            }

            if (aG >> 12 > 3) {
               s(4);
            } else {
               s(5);
            }
            break label34;
         case 13:
            var10001 = c.C;
            f(var2, k(4));
            break label34;
         case 14:
            var10001 = c.C;
            f(var2, k(2) + 2);
            break label34;
         case 15:
            var10001 = c.C;
            f(var2, k(4));
            break label34;
         case 19:
            s(19);
            break label34;
         }
      case 4:
      default:
         s(1);
         a((int)var0, 1);
         C(0);
         return var0;
      case 31:
         switch(var2) {
         case 19:
            f(39, 2);
            break;
         case 21:
         default:
            f(21, 20);
         }
      }

      a(var0, var1);
      C(3);
      return var0;
   }

   public static final boolean ad() {
      U = j(aw, U);
      if (z()) {
         y(1);
         return true;
      } else if (s()) {
         y(d);
         return true;
      } else {
         return false;
      }
   }

   public static final int w(int var0) {
      byte var1 = 60;
      s(9);
      bh = (long)bo;
      bl = 0;
      b(aU, X, var1, bH);
      a((int)30, var0);
      C(9);
      return 30;
   }

   public static final boolean W() {
      boolean var2 = s();
      if (z()) {
         y(1);
         return true;
      } else {
         bl = (int)((long)bl + (long)a.b(100) * (aN - cE) / 1000L);
         bl &= 255;
         int var0 = 128 + (40 * a.d(bl) >> 16);
         int var1 = 128 + (40 * a.a(bl) >> 16);
         c(var0, var1);
         a(false);
         if (var2 && (long)bo - bh > 20L) {
            h(54);
            y(2);
            return true;
         } else {
            return false;
         }
      }
   }

   public static final int b(int var0, int var1) {
      S();
      switch(var0) {
      case 20:
         s(43);
         break;
      case 21:
         if (!d.Y) {
            s(45);
         } else {
            s(47);
         }
      }

      a(var0, var1);
      C(6);
      return var0;
   }

   public static final boolean k() {
      if (s()) {
         switch(B) {
         case 43:
            l(j);
            s(44);
            return false;
         case 44:
         case 46:
         default:
            y(d);
            return true;
         case 45:
            l(j);
            s(46);
            return false;
         case 47:
            l(j);
            s(48);
            return false;
         }
      } else {
         return false;
      }
   }

   public static final int n(int var0, int var1) {
      if (bv != -1 && c.br[bD][bv] == 0L) {
         c.br[bD][bv] = aN;
      }

      switch(var0) {
      case 16:
         c.n(bv, bD);
         s(25);
         break;
      case 17:
         s(12);
         break;
      case 18:
         s(20);
         break;
      case 19:
         m(bv, bD);
         s(20);
      case 20:
      case 21:
      case 22:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 34:
      case 36:
      default:
         break;
      case 23:
         m(bv, bD);
         s(34);
         break;
      case 33:
         m(bv, bD);
         s(35);
         break;
      case 35:
         aw = 177;
         s(4);
         break;
      case 37:
         s(13);
         cu = 37;
         var1 = 12;
      }

      a(var0, var1);
      C(5);
      return var0;
   }

   public static final boolean q() {
      if (z()) {
         i(bv, bD);
         y(1);
         return true;
      } else {
         byte[] var10000;
         int var10001;
         switch(j) {
         case 19:
         default:
            break;
         case 23:
            if (bv != -1) {
               var10000 = c.an[bD];
               var10001 = bv;
               var10000[var10001] = (byte)(var10000[var10001] | 16);
            }
         case 35:
            U = j(aw, U);
            break;
         case 33:
            if (bv != -1) {
               var10000 = c.an[bD];
               var10001 = bv;
               var10000[var10001] &= -5;
               var10000 = c.an[bD];
               var10001 = bv;
               var10000[var10001] = (byte)(var10000[var10001] | 8);
               c.C.a(13, bD, bv);
               int var2 = (int)(aN >> 6) & 15;
               short[] var3;
               switch(c.bW[bD][bv]) {
               case 18:
               default:
                  var3 = c.bg[bD];
                  var10001 = bv;
                  var3[var10001] = (short)(var3[var10001] + (15 - var2));
                  break;
               case 30:
                  var3 = c.bg[bD];
                  var10001 = bv;
                  var3[var10001] = (short)(var3[var10001] + (var2 >> 1));
                  var3 = c.ag[bD];
                  var10001 = bv;
                  var3[var10001] = (short)(var3[var10001] + var2);
               }
            }
         }

         if (!s() && bv != -1) {
            return false;
         } else {
            long var0;
            if (bv != -1) {
               var0 = (aN - c.br[bD][bv]) / 1000L;
            } else {
               var0 = 100L;
            }

            switch(j) {
            case 16:
            case 17:
            case 18:
            case 37:
               if (var0 >= 0L && var0 <= 20L) {
                  c.a(bv, bD, U);
                  cu = 16;
                  y(12);
                  return true;
               }

               i(bv, bD);
               y(2);
               return true;
            case 19:
               if (var0 >= 0L && var0 <= 20L) {
                  f(26, 3);
                  return false;
               }

               i(bv, bD);
               S();
               y(4);
               return true;
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 36:
            default:
               y(d);
               return true;
            case 23:
               if (var0 >= 0L && var0 <= 20L) {
                  f(34, 3);
                  return false;
               }

               i(bv, bD);
               if (bv != -1) {
                  var10000 = c.an[bD];
                  var10001 = bv;
                  var10000[var10001] &= -17;
               }

               y(4);
               return true;
            case 33:
               if (var0 >= 0L && var0 <= 20L) {
                  s(35);
                  return false;
               }

               i(bv, bD);
               if (bv != -1) {
                  var10000 = c.an[bD];
                  var10001 = bv;
                  var10000[var10001] &= -9;
                  var10000 = c.an[bD];
                  var10001 = bv;
                  var10000[var10001] = (byte)(var10000[var10001] | 4);
               }

               y(4);
               return true;
            case 35:
               if (var0 >= 0L && var0 <= 20L) {
                  f var4 = c.C;
                  switch(k(6)) {
                  case 1:
                     f(15, 2);
                     break;
                  case 2:
                     f(14, 2);
                     if (c.bW[bD][bv] == 34) {
                        var10000 = c.an[bD];
                        var10001 = bv;
                        var10000[var10001] &= -3;
                     }
                     break;
                  case 3:
                     s(17);
                     break;
                  case 4:
                     f(13, 1);
                     break;
                  default:
                     s(4);
                  }

                  return false;
               } else {
                  i(bv, bD);
                  y(4);
                  return true;
               }
            }
         }
      }
   }

   public static final int g(int var0) {
      S();
      s(27);
      bN = (long)bo;
      aw = 128;
      a((int)var0, 8);
      C(7);
      return var0;
   }

   public static final boolean B() {
      if (c.cg == 1) {
         K += h * ck >> 15;
      } else {
         K += h * ck >> 12;
      }

      K = e(K, 32767);
      U = j(aw, U);
      switch(B) {
      case 27:
      case 28:
         if ((ao & 512) != 0) {
            cu = 1;
            s(29);
            return true;
         }
      }

      if (s()) {
         switch(B) {
         case 27:
            f(28, 5);
            c.C.a(5, true);
            c.C.a(6, true);
            break;
         case 28:
            if ((long)bo - bN > 30L) {
               int var0 = J();
               if (cu != 8 && var0 != 1) {
                  s(29);
                  break;
               }
            }

            f(28, 5);
            break;
         case 29:
         default:
            K += 3276;
            K = e(K, 32767);
            y(4);
            c.C.a(5, false);
            c.C.a(6, false);
            return true;
         }
      }

      return false;
   }

   public static final void c(int var0) {
      boolean var2 = true;
      byte var3;
      if (bH == 0) {
         var3 = 7;
      } else {
         var3 = 10;
      }

      while(var2) {
         f var10000 = c.C;
         int var1 = k(var3);
         S = bg[var1][0];
         aq = bg[var1][1];
         if (!f(S, aq, 32)) {
            var2 = false;
         }

         if (aq < var0) {
            var2 = true;
         }
      }

   }

   public static final void d(int var0) {
      S();
      if (bO == 7) {
         c.C.a(5, false);
         c.C.a(6, false);
      }

      if ((ao & 3) != 0) {
         long var1 = aN - be;
         if (var1 < 30000L) {
            if ((ao & 1) != 0) {
               s -= 16383;
               aM -= 16383;
               s = k(s, 0);
               aM = k(aM, 0);
            }

            if ((ao & 2) != 0) {
               s += 6553;
               aM += 6553;
               s = e(s, 32767);
               aM = e(aM, 32767);
            }

            ao &= -20;
         }
      }

      bb = cr;
      switch(var0) {
      case 27:
         if (m(0)) {
            bb = 0;
            s(3);
         } else {
            s(15);
         }
         break;
      case 28:
         if (m(1)) {
            bb = 0;
            s(3);
         } else {
            s(15);
         }
         break;
      case 29:
         if (m(2)) {
            bb = 0;
            s(3);
         } else {
            s(23);
         }
      }

      a((int)var0, 2);
      C(11);
   }

   public static final boolean v() {
      if (s()) {
         if (!c.ai || bb <= 0) {
            switch(j) {
            case 27:
               B(0);
               break;
            case 28:
               B(1);
               break;
            case 29:
               B(2);
            }

            y(2);
            return true;
         }

         switch(j) {
         case 27:
            --bb;
            s(15);
            break;
         case 28:
            bb -= 2;
            s(16);
            break;
         case 29:
            switch(B) {
            case 21:
               s(37);
               break;
            case 37:
               s(39);
               break;
            case 39:
               --bb;
               s(39);
               break;
            default:
               f(21, 5);
            }
         }
      }

      return false;
   }

   public static final boolean o(int var0) {
      boolean var1 = true;
      if (at <= 192 && bH == c.C.aE) {
         if (var0 != -1) {
            c.B();
            switch(var0) {
            case 1:
               d(27);
               break;
            case 2:
               d(28);
               break;
            case 3:
               d(29);
               break;
            case 4:
               if (bO == 10) {
                  N();
                  var1 = false;
               } else {
                  ae();
               }
            }
         }

         return var1;
      } else {
         return false;
      }
   }

   public static final void ae() {
      if ((ao & 3) != 0) {
         long var0 = aN - be;
         if (var0 < 30000L) {
            ao |= 16;
         }
      }

      a((int)24, 25);
      s(30);
      c.C.a(5, false);
      c.C.a(6, false);
      C(10);
   }

   public static final void N() {
      if (j != 24) {
         if ((ao & 16) != 0) {
            if ((ao & 1) != 0) {
               if (bH == 2) {
                  s += 6553;
                  aM += 6553;
               } else {
                  s -= 16383;
                  aM -= 16383;
               }
            }

            if ((ao & 2) != 0) {
               s -= 13106;
               aM -= 13106;
            }

            s = k(s, 0);
            aM = k(aM, 0);
            s = e(s, 32767);
            aM = e(aM, 32767);
         }

         ao &= -20;
      }

      s(33);
      a((int)26, 4);
   }

   public static final boolean V() {
      bH = c.C.aE;
      boolean var0 = s();
      if (var0) {
         switch(j) {
         case 24:
            s(31);
            j = 25;
            break;
         case 25:
            if (B == 31) {
               s(32);
            } else {
               s(31);
            }
            break;
         case 26:
            b(2, 1, 4);
         }
      }

      return var0;
   }

   public static final void M() {
      if ((ao & 64) == 0) {
         by = c.C.aE;
         bn = aN;
         ao |= 512;
      }

   }

   public static final void b(int var0, int var1, int var2, int var3) {
      an = var2;
      if (var3 != bH) {
         if (c.C.aE != bH) {
            at = 240;
            aT = 50;
            d(var0, l, var1);
            bH = var3;
            cA = -1;
         } else {
            C = var0;
            z = var1;
            cA = var3;
            d(240, l, 50);
         }
      } else {
         cA = -1;
         d(var0, l, var1);
      }

   }

   public static final void c(int var0, int var1) {
      if (cA == -1) {
         int var10000 = at;
         var10000 = l;
         var10000 = aT;
         I = var0;
         var10000 = l;
         M = var1;
      } else {
         C = var0;
         z = var1;
      }

   }

   public static final boolean f(int var0, int var1, int var2) {
      int var3 = at - var0;
      int var4 = aT - var1;
      return var3 * var3 + var4 * var4 < var2 * var2;
   }

   public static final boolean a(boolean var0) {
      long var3 = aB;
      int var5 = (int)((long)an * var3 / 1000L);
      if (f(I, M, var5) && var0) {
         U = aw;
         if (cA == -1) {
            at = I;
            aT = M;
            return true;
         }

         at = 240;
         aT = 50;
         d(C, 0, z);
         bH = cA;
         cA = -1;
      } else {
         switch(c.C.aA) {
         case 2:
         case 4:
            int var1 = I - at;
            int var2 = M - aT;
            if (var5 < 0) {
               aw = a.a(var2, -var1) & 255;
            } else {
               aw = a.a(-var2, var1) & 255;
            }

            U = j(aw, U);
            at += var5 * a.d(U) >> 16;
            aT -= var5 * a.a(U) >> 16;
         }
      }

      return false;
   }

   public static final void S() {
      if (bv != -1) {
         c.br[bD][bv] = 0L;
         if (c.bW[bD][bv] != 8) {
            byte[] var10000 = c.an[bD];
            int var10001 = bv;
            var10000[var10001] &= -3;
         }

         c.j(bv, bD);
      }

   }

   public static final void m(int var0, int var1) {
      if (var0 != -1) {
         U = c.cq[var1][var0];
         aw = U;
         at = c.bT[var1][var0];
         l = c.O[var1][var0];
         aT = c.cd[var1][var0];
      }

   }

   public static final int j(int var0, int var1) {
      if (a.c(var1 - var0) > 128) {
         if (var1 > var0) {
            var0 += 256;
         } else {
            var1 += 256;
         }
      }

      int var2 = var1 - var0;
      int var3 = var2 >> 1;
      if (a.c(var3) <= 1) {
         var1 = var0;
      } else if (a.c(var3) < 21) {
         var1 -= var3;
      } else if (var3 < 0) {
         var1 += 21;
      } else {
         var1 -= 21;
      }

      var1 &= 255;
      return var1;
   }

   public static final void f(int var0, int var1) {
      Z = -1;
      int var2 = f(B);
      int var3 = f(var0);
      byte var4 = bG[var2][var3];
      if (var4 != -1) {
         Z = var0;
         cb = var1;
         var1 = 0;
         var0 = var4;
      }

      a(bk[var0][0], var1, bk[var0][1], bk[var0][2], bk[var0][3], bk[var0][4], bk[var0][5]);
      B = var0;
   }

   public static final int f(int var0) {
      switch(var0) {
      case 4:
      case 5:
      case 6:
      case 17:
      case 18:
         return 1;
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
      case 22:
      case 23:
      case 24:
      case 25:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      default:
         return 0;
      case 19:
      case 39:
         return 4;
      case 20:
      case 21:
      case 26:
      case 38:
         return 2;
      case 36:
      case 37:
      case 40:
         return 3;
      }
   }

   public static final void s(int var0) {
      f(var0, 0);
   }

   public static final boolean s() {
      int var0 = 1966 / Math.abs(bP);
      int var1 = (int)aB * var0;
      if (bP < 0) {
         u -= var1;
         if (o && u <= bB) {
            if (e.g == 0 && cL && d.s == 9) {
               b.a(ce);
            }

            o = false;
         }

         if (u < bW) {
            if (bz == 0) {
               u = bW;
            } else {
               while(u < bW) {
                  u += bz;
                  if (u < bW) {
                     u = bW;
                  }
               }
            }

            --aH;
            if (aH < 0) {
               if (Z != -1) {
                  f(Z, cb);
                  return false;
               }

               return true;
            }

            if (bB > 0) {
               o = true;
            }
         }
      } else {
         u += var1;
         if (o && u >= bB) {
            if (e.g == 0 && cL && d.s == 9) {
               b.a(ce);
            }

            o = false;
         }

         if (u > bW) {
            if (bz == 0) {
               u = bW;
            } else {
               while(u > bW) {
                  u -= bz;
                  if (u > bW) {
                     u = bW;
                  }
               }
            }

            --aH;
            if (aH < 0) {
               if (Z != -1) {
                  f(Z, cb);
                  return false;
               }

               return true;
            }

            if (bB > 0) {
               o = true;
            }
         }
      }

      return false;
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      c.C.aA = var0;
      aH = var1;
      bP = var4;
      int var10000;
      if (var4 < 0) {
         if (var2 < 0) {
            var2 = c.C.cF[var0];
         }

         if (var3 < 0) {
            var3 = 0;
         }

         u = var2 << 16;
         var10000 = var2 << 16;
         bW = var3 << 16;
         bz = var2 - var3 << 16;
         if (var4 == -99) {
            bz = 0;
         }
      } else {
         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0) {
            var3 = c.C.cF[var0];
         }

         u = var2 << 16;
         var10000 = var2 << 16;
         bW = var3 << 16;
         bz = var3 - var2 << 16;
         if (var4 == 99) {
            bz = 0;
         }
      }

      if (var6 >= 0) {
         if (var6 == 0) {
            if (e.g == 0 && cL && d.s == 9) {
               b.a(var5);
            }

            bB = -1;
            ce = 0;
            o = false;
         } else {
            bB = var6;
            ce = var5;
            o = true;
            if (e.g == 0 && cL && d.s == 9) {
               b.b(var5);
            }
         }
      } else {
         bB = -1;
         ce = 0;
      }

   }

   public static final void h() {
      if (bo > aK) {
         f var10002 = c.C;
         aK = bo + 60 + k(60);
         int var0 = 0;

         byte var1;
         for(var1 = -1; var0 < f && (var1 == -1 || var1 == V); ++var0) {
            switch(O[var0]) {
            case 1:
               var1 = 20;
               break;
            case 2:
               var1 = 24;
               break;
            case 3:
               var1 = 36;
               break;
            case 4:
               var1 = 35;
               break;
            case 5:
               var1 = 23;
            }
         }

         if (var1 == -1 || var1 == V) {
            int var2 = c.l(0, 0);
            var2 += c.l(0, 1);
            var2 += c.l(0, 2);
            var2 += c.l(10, 0);
            var2 += c.l(10, 1);
            if (var2 > 5) {
               var1 = 22;
            }
         }

         if (var1 == -1 || var1 == V) {
            if (aG > 26213) {
               var1 = 16;
            } else if (aG > 19660) {
               var1 = 30;
            } else if (aG > 13106) {
               var1 = 18;
            } else if (aG > 6553) {
               var1 = 29;
            } else {
               var1 = 17;
            }
         }

         Y = var1;
         V = var1;
         bw = aN + 3000L;
      }

   }

   public static final void A(int var0) {
      byte var1 = 19;
      if (var0 == aQ || var0 == av || var0 == ax || var0 == n) {
         var1 = 31;
      }

      if (var0 == bs || var0 == A || var0 == N) {
         var1 = 32;
      }

      if (m(var0)) {
         int var2 = Q();
         if (var2 > cr * 2) {
            var1 = 34;
            bt = true;
         } else {
            var1 = 33;
         }
      }

      if (var1 != -1) {
         f var10002 = c.C;
         aK = bo + 60 + k(60);
         Y = var1;
         bw = aN + 3000L;
      }

   }

   public static final void d(int var0, int var1, int var2) {
      int var10000 = at;
      var10000 = l;
      var10000 = aT;
      I = var0;
      M = var2;
      C(1);
   }

   public static final void I() {
      aW = 0;
      bo = 0;
      bc = (long)bo;
      L = 22936;
      E = 19660;
      K = 26213;
      D = 19660;
      c = 32767;
      bL = 19660;
      s = 6553;
      aM = 6553;
      aG = 32767;
      aP = 32767;
      aW = 0;
      af = 16383;
      cs = 3276;
      p = 3276;
      l();
      cD = 0;
      bH = 0;
      an = 60;
      cA = -1;
      at = 240;
      l = 0;
      aT = 50;
      u = 0;
      o = false;
      bB = 0;
      U = 32;
      j = 11;
      d = 1;
      cu = 0;
   }

   public static final void ab() {
      aW = 0;
      L = 22936;
      E = 19660;
      K = 26213;
      D = 19660;
      c = 32767;
      bL = 19660;
      s = 6553;
      aM = 6553;
      aG = 32767;
      aP = 32767;
      aW = 0;
      af = 16383;
      cs = 3276;
      p = 3276;
      y();
   }

   public static final void p() {
      cK = true;
      C(99);
      cj = false;
      at = 132 * d.al >> 8;
      l = 0;
      aT = 194 * d.au >> 8;
      bF = 106496 * (128 * d.au / 208) >> 8;
      f var10000 = c.C;
      bd = false;
      s(4);
   }

   public static final void ac() {
      C(3);
      a((int)3, 1);
      cK = true;
      cj = true;
      s(1);
      I();
   }

   public static int k(int var0) {
      if (var0 == 0) {
         return 0;
      } else {
         int var1 = bq.nextInt() % var0;
         var1 = var1 > 0 ? var1 : -var1;
         return var1;
      }
   }

   public static int l(int var0, int var1) {
      int var2 = k(var1 - var0);
      return var2 + var0;
   }

   public static final void G() {
      aa = bo;
      bH = 0;
      if (aW == 3) {
         D += bV[36] * cG[20] >> 8;
      }

      K -= bZ[36] >> 3;
      L -= bZ[36] >> 5;
      Y();
   }

   public static final void D() {
      bL -= 9830;
      k(bL, 0);
   }

   public static final void m() {
      cl = true;
   }

   public static final void Z() {
      D += 6553;
      e(D, 32767);
   }

   public static final void r() {
      aJ = 0;
   }

   public static final void a(int var0, int var1, int var2, int var3) {
      if (aJ < 12) {
         int var4 = var1 - a.c(var0 - (aG >> 8));
         if (var4 <= 0) {
            return;
         }

         var4 = var4 * 100 / var1;
         ai[aJ] = var4;
         W[aJ] = var2;
         aj[aJ] = var3;
         ++aJ;
      }

   }

   public static final int u() {
      int var0 = 0;

      int var1;
      for(var1 = 0; var0 < aJ; ++var0) {
         var1 += ai[var0];
      }

      if (var1 > 0) {
         f var10000 = c.C;
         int var2 = k(var1);
         var0 = 0;

         for(var1 = 0; var0 < aJ; ++var0) {
            var1 += ai[var0];
            if (var2 < var1) {
               az = W[var0];
               aD = aj[var0];
               return var0;
            }
         }
      }

      return -1;
   }

   public static final void L() {
      int[] var0 = new int[20];
      byte var2 = 20;

      int var1;
      for(var1 = 0; var1 < var2; var0[var1] = var1++) {
      }

      int var3;
      int var4;
      for(var1 = 0; var1 < var2; ++var1) {
         var3 = k(var2);
         var4 = var0[var3];
         var0[var3] = var0[var1];
         var0[var1] = var4;
      }

      for(var1 = 0; var1 < 4; ++var1) {
         bS[var1] = var0[var1];
      }

      var2 = 5;

      for(var1 = 0; var1 < var2; var0[var1] = var1++) {
      }

      var2 = 15;

      for(var1 = 0; var1 < var2; var0[var1] = var1++) {
      }

      for(var1 = 0; var1 < var2; ++var1) {
         var3 = k(var2);
         var4 = var0[var3];
         var0[var3] = var0[var1];
         var0[var1] = var4;
      }

      for(var1 = 0; var1 < 4; ++var1) {
         F[var1] = var0[var1];
      }

   }

   public static final void r(int var0) {
      int var2 = 0;

      label37:
      for(int var1 = 0; var1 < 4; ++var1) {
         boolean var3 = true;

         while(true) {
            do {
               if (!var3) {
                  co[var1] = var2;
                  cx[var1] = n(co[var1]);
                  continue label37;
               }

               f var10000 = c.C;
               var2 = k(35) + 6;
            } while(var2 == var0);

            var3 = false;

            for(int var4 = 0; var4 < var1; ++var4) {
               if (var2 == co[var4]) {
                  var3 = true;
               }
            }
         }
      }

   }

   public static final int i() {
      int var0 = (aP << 1) + c + (c >> 1) + (aG >> 1) >> 12;
      var0 = (var0 << 2) + var0 >> 2;
      if (var0 < 0) {
         var0 = 30;
      }

      return var0;
   }

   public static final int T() {
      int var0 = aP + (aP >> 1) + D + aG + (aG >> 1) >> 12;
      var0 = (var0 << 2) + var0 >> 2;
      if (var0 < 0) {
         var0 = 30;
      }

      return var0;
   }

   public static final int n(int var0) {
      int[] var1 = new int[4];

      int var4;
      for(var4 = 4; var4 > 1; --var4) {
         int var2 = var0 / var4;
         f var10001 = c.C;
         int var3 = var2 + (k(6) - 3);
         var3 = k(var3, 0);
         var3 = e(var3, 10);
         var3 = e(var3, var0);
         var1[var4 - 1] = var3;
         var0 -= var3;
      }

      var1[0] = var0;
      boolean var6 = true;

      while(var6) {
         var6 = false;

         for(var4 = 0; var4 < 4; ++var4) {
            if (var1[var4] > 10) {
               var6 = true;

               for(int var5 = 0; var5 < 4; ++var5) {
                  if (var1[var5] < 10) {
                     int var10002 = var1[var4]--;
                     var10002 = var1[var5]++;
                     break;
                  }
               }
            }
         }
      }

      return var1[0] << 12 | var1[1] << 8 | var1[2] << 4 | var1[3];
   }

   public static final void H() {
      int var0 = c.e(14, 2);
      if (var0 != -1) {
         c.m(2, var0);
      }

      var0 = c.e(15, 1);
      if (var0 != -1) {
         c.m(1, var0);
      }

      var0 = c.e(1, 0);
      if (var0 != -1) {
         c.m(0, var0);
      }

   }

   public final void t() {
      int var2 = bY[this.aA];

      for(int var3 = 0; var3 < this.aO; ++var3) {
         bU[var3] = (short)var2;
         byte var1 = cy[var2];
         var2 += 4 * var1 + 1;
      }

   }

   static {
      r = d.al;
      i = d.au;
      O = new byte[8];
      a = new int[8];
      cB = new short[5];
      ct = new short[5];
      ai = new int[12];
      W = new int[12];
      aj = new int[12];
      bA = new int[3];
      cK = false;
      aX = 0L;
      aL = false;
      cG = new short[45];
      int[] var10000 = new int[]{0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240};
      bt = false;
      bd = false;
      bp = new boolean[]{false, true, false, false, true, true, false};
      bx = 0;
      bg = new short[][]{{96, 128}, {96, 180}, {128, 64}, {128, 128}, {128, 180}, {160, 128}, {160, 180}, {96, 64}, {64, 128}, {64, 180}};
      bk = new int[][]{{5, 34, 40, 1, 0, -1}, {15, -1, -1, 1, 0, -1}, {14, -1, -1, 2, 7, 0}, {14, 24, -1, 2, 0, -1}, {0, -1, -1, 2, 0, -1}, {0, -1, -1, 2, 0, -1}, {3, -1, -1, 1, 0, -1}, {3, -1, -1, -1, 0, -1}, {4, -1, -1, 1, 0, -1}, {2, -1, -1, 1, 0, -1}, {1, 8, 15, 2, 2, 8}, {1, 8, 15, 2, 1, 8}, {5, -1, -1, 1, 0, -1}, {13, -1, -1, 1, 0, 5}, {11, -1, -1, 1, 0, 5}, {15, -1, -1, 1, 0, -1}, {16, -1, -1, 2, 0, -1}, {21, -1, -1, 1, 7, 0}, {17, -1, -1, 1, 7, 0}, {22, -1, -1, 1, 0, -1}, {6, -1, 9, 1, 0, -1}, {6, 9, 9, 1, 0, -1}, {6, 9, -1, 1, 0, -1}, {24, -1, -1, 2, 0, -1}, {23, -1, -1, 1, 0, -1}, {7, -1, -1, 1, 0, 3}, {18, -1, -1, 2, 5, 0}, {8, -1, -1, 1, 0, -1}, {8, 50, 60, 1, 0, -1}, {8, -1, -1, -1, 0, -1}, {12, -1, 15, 1, 0, -1}, {12, 10, 15, 1, 0, -1}, {12, 10, 15, -1, 0, -1}, {12, 15, -1, -1, 0, -1}, {19, -1, -1, 2, 5, 4}, {24, -1, -1, 2, 0, -1}, {20, -1, -1, 1, 0, -1}, {20, 15, -1, 1, 0, -1}, {20, 15, -1, -1, 0, -1}, {22, 15, -1, 1, 0, -1}, {22, 15, -1, -1, 0, -1}, {1, -1, -1, 3, 0, -1}, {25, -1, -1, 2, 0, -1}, {10, -1, 30, 2, 0, -1}, {10, 30, -1, 2, 0, -1}, {9, -1, 18, 2, 4, 4}, {9, 18, -1, 2, 0, -1}, {10, -1, 20, 2, 4, 4}, {10, 20, 34, 2, 0, -1}, {4, -1, -1, -1, 0, -1}, {1, -1, 8, 2, 0, -1}, {1, 15, -1, 2, 0, -1}};
      bG = new byte[][]{{-1, 6, 20, 20, 20}, {7, -1, 7, 7, 7}, {22, 22, -1, 36, 36}, {38, 38, 38, -1, 19}, {40, 40, 40, 40, -1}};
      var10000 = new int[]{2, 0, 1};
      var10000 = new int[]{1, 2, 0};
      var10000 = new int[]{74, 73, 72};
      bS = new int[4];
      co = new int[4];
      cx = new int[4];
      F = new int[4];
   }
}
