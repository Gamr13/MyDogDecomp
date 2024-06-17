import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e {
   public static int g = 0;
   public static int Q = 0;
   public static Image ap;
   public static boolean L;
   public static final int D;
   public static final int a;
   public static int I;
   public static boolean x;
   public static int aU;
   public static int be;
   public static int aP;
   public static boolean X;
   public static int N;
   public static boolean az;
   public static final int[] aG;
   public static int aM;
   public static int bb;
   public static int aQ;
   public static int[] B;
   public static int[] h;
   public static int d;
   public static int aW;
   public static boolean u;
   public static int t;
   public static int f;
   public static int y;
   public static int aH;
   public static int aL;
   public static int bc;
   public static int o;
   public static int aa;
   public static int ak;
   public static int H;
   public static int E;
   public static int am;
   public static int aZ;
   public static int ar;
   public static int aT;
   public static int ax;
   public static int M;
   public static boolean Y;
   public static int ai;
   public static long P;
   public static int V;
   public static int aK;
   public static int aw;
   public static int an;
   public static int aB;
   public static int au;
   public static boolean aI;
   public static int r;
   public static long m;
   public static boolean i;
   public static int aO;
   public static boolean aJ;
   public static boolean aS;
   public static boolean ad;
   public static boolean aX;
   public static int aj;
   public static int G;
   public static int T;
   public static int F;
   public static int v;
   public static int A;
   public static int b;
   public static int aY;
   public static int[] j;
   public static int[] n;
   public static int R;
   public static int k;
   public static String[] J;
   public static String[] W;
   public static String[] aA;
   public static String[] w;
   public static int aV;
   public static int aD;
   public static int aq;
   public static char[] aN;
   public static int as;
   public static int ah;
   public static int ab;
   public static int ae;
   public static String ag;
   public static int av;
   public static int ao;
   public static int q;
   public static String z;
   public static Image C;
   public static Image s;
   public static Image e;
   public static Image l;
   public static Image O;
   public static Image S;
   public static long U;
   public static boolean c;
   public static int af;
   public static int aR;
   public static int bd;
   public static int ba;
   public static int Z;
   public static int ac;
   public static int al;
   public static int K;
   public static String[] aF;
   public static int at;
   public static int ay;
   public static int aC;
   public static final int[] p;
   public static boolean aE;

   public static final void k() {
      byte[] var0 = a.a("/large.png", (int)0);
      aG[2] = d.a((byte)2, (byte[])var0, (String)"/large.dat");
      Object var2 = null;
      var0 = a.a("/medium.png", (int)0);
      aG[1] = d.a((byte)1, (byte[])var0, (String)"/medium.dat");
      var2 = null;
      var0 = a.a("/small.png", (int)0);
      aG[0] = d.a((byte)0, (byte[])var0, (String)"/small.dat");
      var2 = null;
      B = new int[4];
      h = new int[4];
      d = 2;
      aW = d.al - 2 - d.b(aG[0], 2);
      aQ = d.a(aG[1], 1) + 2;
      l();
      n();
      d();
      I = D - (d.b(aG[0], 15) + d.b(aG[0], 11));

      for(int var1 = 0; var1 < 7; ++var1) {
         d.e[var1] = false;
      }

   }

   public static final void p() {
      O = null;
      S = null;
      l = null;
      e = null;
   }

   private static final void l() {
      O = a.b("/smallStar.png");
      S = a.b("/smallStarEmpty.png");
      l = a.b("/bigStar.png");
      e = a.b("/certStamp.png");
   }

   public static final void e(Graphics var0) {
      var0.setClip(0, 0, d.al, d.au);
      int var1;
      int var2;
      switch(d.s) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 25:
      case 26:
      default:
         break;
      case 4:
      case 10:
      case 11:
      case 13:
         d(var0);
         break;
      case 5:
         f(var0);
         break;
      case 6:
      case 7:
         c(var0);
         break;
      case 8:
      case 17:
         g(var0);
         break;
      case 9:
         byte var4;
         if (aM != 0) {
            if (aM != 3) {
               var2 = d.a(aG[1], 1) - d.a(aG[0], 0) >> 1;
               var4 = 0;
               if (ad) {
                  ad = false;
                  var4 = 1;
               }

               d.b(var0, aG[0], d, 1 + var2, var4);
               var4 = 2;
               if (aX) {
                  aX = false;
                  var4 = 3;
               }

               d.b(var0, aG[0], aW, 1 + var2, var4);
            }

            var4 = 1;
            if (bb == 0) {
               var4 = 0;
            }

            d.b(var0, aG[1], B[0], h[0], var4);
            var4 = 2;
            if (bb == 1) {
               var4 = 3;
            }

            d.b(var0, aG[1], B[1], h[1], var4);
            var4 = 4;
            if (bb == 2) {
               var4 = 5;
            }

            d.b(var0, aG[1], B[2], h[2], var4);
            var4 = 6;
            if (bb == 3) {
               var4 = 7;
            }

            d.b(var0, aG[1], B[3], h[3], var4);
         } else if (c.bH == 0 && c.cr != 4) {
            byte var7 = -1;
            byte var5 = -1;
            switch(c.cr) {
            case 0:
            case 5:
               var7 = -1;
               break;
            case 1:
            case 4:
               var7 = 0;
               var5 = 1;
               break;
            case 2:
               var7 = 3;
               var5 = 1;
               break;
            case 3:
               var7 = 7;
               var5 = 1;
            }

            if (var7 != -1) {
               d.b(var0, aG[var5], d.al - (d.b(aG[var5], var7) + 1), 1, var7);
            }
         }

         if ((aM == 0 || aM == 3) && Y) {
            d.b(var0, aG[aT], ax, M, ar);
            f var10000 = c.C;
            if (f.aN - P < 2000L && V != -1) {
               a(var0, 0, V, aK, aw);
            }

            if (an != -1) {
               a(var0, 0, an, aB, au);
            }
         }

         if (g != 0) {
            switch(g) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 19:
            case 20:
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
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
               if ((g == 11 || g == 13 || g == 22) && System.currentTimeMillis() < d.I) {
                  return;
               }

               if (g == 28 || g == 29) {
                  c.d(var0);
               }

               var4 = 0;
               byte var6 = 30;
               var0.setClip(0, 0, d.al, d.au);
               var0.drawImage(ap, var4, var6, 20);
               var1 = var4 + (3 * (ap.getWidth() >> 2) - 2);
               var6 = 75;
               d.b(var0, aG[0], var1, var6, 19);
               var1 = 0 + ap.getWidth();
               var6 = 30;
               a(var0, var1, var6, d.al - 2 - var1, aU, -1, true);
               break;
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 15:
            case 17:
            case 18:
            case 21:
            case 23:
            case 44:
            case 70:
            case 71:
               if (g == 23 && c.at >= 2) {
                  return;
               }

               var2 = d.au - 5 - aU;
               if (g == 6 || g == 70 || g == 71) {
                  var2 -= d.aI[1];
               }

               boolean var3 = true;
               a(var0, a, var2, I, aU, -1, var3);
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 49:
            case 59:
            case 67:
            case 68:
            case 69:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            }
         }

         b(var0);
         break;
      case 12:
      case 14:
      case 15:
      case 23:
      case 24:
         h(var0);
         break;
      case 16:
      case 27:
         var1 = bc;
         var2 = aa;
         i(var0);
         a(var0, var1, var2, E, be, -1, false);
         aI = false;
         b(var0);
      }

   }

   public static final void b(Graphics var0) {
      if (am != -1) {
         a(var0, true);
      }

      if (aZ != -1) {
         a(var0, false);
      }

   }

   private static void a(Graphics var0, boolean var1) {
      int var2 = d.au - d.aI[1];
      int var3 = 2;
      int var4;
      if (var1) {
         var4 = am;
      } else {
         var4 = aZ;
      }

      if (d.aD) {
         var1 = !var1;
      }

      if (!var1) {
         var3 = d.al - (2 + d.a((String)d.Z[var4], 1));
      }

      d.a(var0, (String)d.Z[var4], 1, var3, var2);
   }

   private static void a(int var0, int var1, int var2) {
      int var3 = var0;
      if (var0 == 71) {
         var3 = -1;
      }

      if (var3 != -1) {
         int var4 = d.a((String)d.Z[var3], 0) + 3 + 3;
         int var5 = d.aI[0] + 3 + 3;
         if (var1 < 0) {
            var1 = 0;
         }

         if (var1 + var4 > d.al) {
            var1 = d.al - var4;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         int var6 = d.au - d.aI[1];
         if (var2 + var5 > var6) {
            var2 = var6 - var5;
         }
      }

      an = -1;
      V = var3;
      aK = var1;
      aw = var2;
   }

   public static final void b(int var0, int var1, int var2) {
      a(var0, var1, var2);
      if (var0 != ai) {
         f var10000 = c.C;
         P = f.aN;
         ai = var0;
      }

   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = d.a(d.Z[var2], var1);
      int var6 = d.aI[var1];
      if (var3 < 2) {
         var3 = 2;
      }

      if (var3 + var5 > d.al - 2) {
         var3 = d.al - (var5 + 2);
      }

      if (var4 < 2) {
         var4 = 2;
      }

      if (var4 + var6 > d.au - 2) {
         var4 = d.au - (var6 + 2);
      }

      d.a(var0, d.Z[var2], var1, var3, var4);
   }

   public static final void s() {
      int[] var10000;
      switch(aM) {
      case 1:
      default:
         break;
      case 2:
         var10000 = h;
         var10000[0] += 6;
         var10000 = h;
         var10000[1] += 6;
         var10000 = h;
         var10000[2] += 6;
         var10000 = h;
         var10000[3] += 6;
         if (h[0] >= 2) {
            h[0] = 2;
            h[1] = 2;
            h[2] = 2;
            h[3] = 2;
            aM = 1;
            if (g == 0) {
               am = 3;
            }
         }
         break;
      case 3:
         for(int var0 = 0; var0 < 4; ++var0) {
            if ((c.cr != var0 + 1 || var0 == 2) && (var0 != 3 || c.cr != 3)) {
               h[var0] = -aQ;
            } else {
               var10000 = B;
               var10000[var0] += 10;
               if (B[var0] > d.al - d.b(aG[1], 1)) {
                  aM = 0;
                  if (g == 0) {
                     am = 0;
                  }
               }
            }
         }
      }

   }

   public static final void a() {
      int var0 = -1;
      f var3;
      switch(d.s) {
      case 0:
      case 2:
      case 3:
      case 18:
      case 19:
      case 20:
      case 21:
         break;
      case 1:
         d.g(1);
         d.g(2);
         d.g(5);
         break;
      case 4:
      case 22:
      case 25:
      default:
         if (d.s == 4) {
            if (d.e(1)) {
               i();
            }

            if (d.e(2)) {
               g();
            }

            if (d.e(6) || d.e(5) || d.e(8)) {
               aI = true;
               if (j != null) {
                  var0 = j[aV];
               }

               switch(var0) {
               case 20:
                  d.ad = 1;
                  break;
               case 21:
                  d.ad = 2;
                  break;
               case 22:
                  d.ad = 3;
                  break;
               case 23:
                  d.ad = 4;
                  break;
               case 24:
                  d.ad = 5;
               }

               d.j(d.ad);
               d.q();
               if (!d.C) {
                  d.U = 8;
                  d.i(18);
               } else {
                  d.i(2);
               }
            }
         }
         break;
      case 5:
         f var10001;
         if (d.e(3)) {
            if (aE) {
            }

            aI = true;
            ad = true;
            var3 = c.C;
            --f.ba;
            var3 = c.C;
            if (f.ba < 0) {
               var3 = c.C;
               var10001 = c.C;
               f.ba += f.cq;
            }

            var3 = c.C;
            f.bd = true;
            var3 = c.C;
            var10001 = c.C;
            f.U = 32 + (f.k(14) - 7);
            var3 = c.C;
            var10001 = c.C;
            d.Y = f.bp[f.ba];
         }

         if (d.e(4)) {
            if (aE) {
            }

            aI = true;
            aX = true;
            var3 = c.C;
            ++f.ba;
            var3 = c.C;
            var10001 = c.C;
            if (f.ba >= f.cq) {
               var3 = c.C;
               var10001 = c.C;
               f.ba -= f.cq;
            }

            var3 = c.C;
            f.bd = true;
            var3 = c.C;
            var10001 = c.C;
            f.U = 32 + (f.k(14) - 7);
            var3 = c.C;
            var10001 = c.C;
            d.Y = f.bp[f.ba];
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            var3 = c.C;
            d.aq = f.ba;
            z = "          ";
            c.b();
            b(6);
            ap = null;
         }

         if (d.e(7)) {
            z = d.ah + "          ";
            z = z.substring(0, 10);
            b(7);
         }
         break;
      case 6:
      case 7:
         aI = true;
         if (d.e(3)) {
            --ae;
            if (ae < 0) {
               ae = 7;
            }

            for(ah = 8 * ab + ae; ah >= ag.length(); ah = 8 * ab + ae) {
               --ae;
            }
         }

         if (d.e(4)) {
            ++ae;
            if (ae >= 8) {
               ae = 0;
            }

            ah = 8 * ab + ae;
            if (ah >= ag.length()) {
               ae = 0;
            }

            ah = 8 * ab + ae;
         }

         if (d.e(1)) {
            --ab;
            if (ab < 0) {
               ab = 3;
            }

            for(ah = 8 * ab + ae; ah >= ag.length(); ah = 8 * ab + ae) {
               --ab;
            }
         }

         if (d.e(2)) {
            ++ab;
            if (ab >= 4) {
               ab = 0;
            }

            ah = 8 * ab + ae;
            if (ah >= ag.length()) {
               ab = 0;
            }

            ah = 8 * ab + ae;
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            label702:
            switch(ag.charAt(ah)) {
            case '^':
               if (as > 0) {
                  --as;
                  aN[as] = ' ';
               }
               break;
            case '{':
               if (ag == "0123456789_^~{}") {
                  ag = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_^~}¬";
                  ae = 7;
                  ab = 3;
                  ah = 8 * ab + ae;

                  while(true) {
                     if (ah < ag.length()) {
                        break label702;
                     }

                     --ae;
                     if (ae < 0) {
                        ae = 7;
                        --ab;
                     }

                     ah = 8 * ab + ae;
                  }
               } else {
                  ag = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_^~}¬";
                  break;
               }
            case '}':
               if (ag == "0123456789_^~{}") {
                  ag = "abcdefghijklmnopqrstuvwxyz_^~{¬";
                  ae = 7;
                  ab = 3;
                  ah = 8 * ab + ae;

                  while(true) {
                     if (ah < ag.length()) {
                        break label702;
                     }

                     --ae;
                     if (ae < 0) {
                        ae = 7;
                        --ab;
                     }

                     ah = 8 * ab + ae;
                  }
               } else {
                  ag = "abcdefghijklmnopqrstuvwxyz_^~{¬";
                  break;
               }
            case '~':
               String var1 = (new String(aN)).substring(0, as);
               if (var1.trim().length() > 0) {
                  if (d.s == 6) {
                     d.P = var1;
                     d.f();
                     C = null;
                     s = null;
                     var3 = c.C;
                     f.aN = d.t();
                     var3 = c.C;
                     var3 = c.C;
                     f.cE = f.aN;
                     var3 = c.C;
                     var3 = c.C;
                     f.Q = f.aN;
                     var3 = c.C;
                     f.aX = 0L;
                     c.av = 0;
                     c.ad = 0;
                     c.bc = 0;
                     c.aV = 0;
                     c.T = 0;
                     c.g = true;
                     d.v = 20;
                     d.as = true;
                     System.gc();
                     b(8);
                     aI = true;
                  } else if (d.s == 7) {
                     d.ah = var1;
                     d.f();
                     b(5);
                  }
               } else {
                  m = System.currentTimeMillis() + 3000L;
                  as = 0;
               }
               break;
            case '¬':
               ag = "0123456789_^~{}";
               ae = 7;
               ab = 3;
               ah = 8 * ab + ae;

               while(true) {
                  if (ah < ag.length()) {
                     break label702;
                  }

                  --ae;
                  if (ae < 0) {
                     ae = 7;
                     --ab;
                  }

                  ah = 8 * ab + ae;
               }
            default:
               if (as < aN.length) {
                  aN[as++] = ag.charAt(ah);
               }
            }

            ah = 8 * ab + ae;
         }

         if (d.e(7) && d.s == 6) {
            b(5);
         }
         break;
      case 8:
         if (d.e(6) || d.e(5) || d.e(8)) {
            if (aC > 6) {
               d.n = true;
               c.bH = 0;
               c.d(c.C.cp, c.C.cp);
               b(21);
               if (!d.i) {
                  Q = 1;
               }
            } else {
               a(true);
            }
         }
         break;
      case 9:
         if (g == 0) {
            if (d.b(3) && aM == 1) {
               d.g(3);
               o();
            }

            if (d.b(4) && aM == 1) {
               d.g(4);
               r();
            }

            if (d.b(6)) {
               switch(c.bH) {
               case 1:
               case 2:
               case 3:
                  break;
               default:
                  if (c.cr != 4) {
                     d.g(6);
                     if (aM == 1) {
                        h();
                     } else if (aM == 0) {
                        c();
                     }
                  }
               }
            }

            if (d.b(7)) {
               switch(c.bH) {
               case 1:
                  if (c.cr != 4) {
                     d.g(7);
                     b(10);
                  }
               case 2:
               case 3:
                  break;
               default:
                  d.g(7);
                  b(10);
               }
            }

            if (d.b(5) || d.b(8)) {
               switch(c.bH) {
               case 1:
               case 2:
               case 3:
                  return;
               default:
                  if (aM == 1) {
                     h();
                     d.g(5);
                     d.g(8);
                  }
               }
            }
         } else {
            d.g(9);
            d.g(10);
            d.g(11);
            d.g(12);
            d.g(15);
            d.g(16);
            d.g(17);
            d.g(18);
            switch(g) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 19:
            case 20:
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
               d.g(3);
               d.g(4);
               d.g(5);
               d.g(8);
               d.g(13);
               d.g(14);
               break;
            case 3:
               d.g(3);
               d.g(4);
               d.g(5);
               d.g(8);
               d.g(14);
               break;
            case 6:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
               d.g(3);
               d.g(4);
               d.g(5);
               d.g(7);
               d.g(8);
               d.g(13);
               d.g(14);
               break;
            case 8:
            case 10:
            case 17:
            case 21:
               d.g(6);
               d.g(7);
               d.g(13);
               d.g(14);
               break;
            case 12:
            case 18:
            case 23:
            case 44:
               d.g(6);
               d.g(7);
               d.g(13);
               d.g(14);
               break;
            case 15:
               d.g(3);
               d.g(4);
               d.g(5);
               d.g(6);
               d.g(7);
               d.g(8);
               d.g(13);
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 49:
            case 59:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            }

            if ((g == 11 || g == 13 || g == 22) && System.currentTimeMillis() < d.I) {
               d.g(6);
               return;
            }

            switch(g) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 19:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
               if (d.e(6)) {
                  c(g + 1);
                  if (g != 7 && g != 20 && g != 26) {
                     if (g == 28) {
                        aM = 0;
                     }
                  } else {
                     c();
                  }

                  if (g == 7) {
                     bb = 2;
                  }

                  if (g == 26) {
                     bb = 1;
                  } else if (g == 27) {
                     bb = 3;
                  }
               }

               if (d.e(7) && g != 6) {
                  c(32);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 3:
               if (d.b(13)) {
                  c(g + 1);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 8:
            case 21:
               if (d.e(3) && aM == 1) {
                  o();
               }

               if (d.e(4) && aM == 1) {
                  r();
               }

               if (d.e(5) || d.e(8)) {
                  h();
                  if (aM == 3) {
                     c(g + 1);
                     if (g == 22) {
                        d.I = System.currentTimeMillis() + 2000L;
                     }
                  }
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 10:
            case 17:
               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 12:
            case 18:
            case 23:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 49:
            case 59:
            case 67:
            case 68:
            case 69:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            default:
               return;
            case 15:
               if (d.b(14)) {
                  c(g + 1);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 32:
               if (U < System.currentTimeMillis()) {
                  b.a(0);
                  long var10000 = System.currentTimeMillis();
                  f var10002 = c.C;
                  U = var10000 + (long)(500 + f.k(2000));
               }

               if (d.e(6)) {
                  c(0);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
               if (d.e(6)) {
                  if (g == 48) {
                     d.f = true;
                     c.l();
                     c(0);
                  } else {
                     c(g + 1);
                  }
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
               if (d.e(6)) {
                  if (g == 58) {
                     d.W = true;
                     c(0);
                  } else {
                     c(g + 1);
                  }
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
               if (d.e(6)) {
                  if (g == 60) {
                     d.e[g - 60] = true;
                     c(g + 1);
                  } else {
                     d.e[g - 60] = true;
                     c(0);
                     d(c.bH);
                  }
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 70:
            case 71:
               if (d.e(6)) {
                  c(0);
                  b(17);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 80:
            case 81:
            case 82:
            case 84:
               if (d.e(6)) {
                  c(0);
                  d(c.bH);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 83:
               if (d.e(6)) {
                  f.ab();
                  c(0);
                  d(c.bH);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }

               return;
            case 85:
               if (d.e(6)) {
                  c(0);
                  d.u();
                  d.i(3);
               }

               if (d.e(1) && X) {
                  m();
               }

               if (d.e(2) && X) {
                  b();
               }
            }
         }
         break;
      case 10:
         if (d.e(3)) {
            aI = true;
            if (j != null) {
               var0 = j[aV];
            }

            switch(var0) {
            case 8:
               d.j = !d.j;
               b.a(0);
               break;
            case 19:
               --d.ad;
               if (d.ad < 1) {
                  d.ad = 5;
               }
            }
         }

         if (d.e(4)) {
            aI = true;
            if (j != null) {
               var0 = j[aV];
            }

            switch(var0) {
            case 8:
               d.j = !d.j;
               b.a(0);
               break;
            case 19:
               ++d.ad;
               if (d.ad > 5) {
                  d.ad = 1;
               }
            }
         }

         if (d.e(1)) {
            i();
         }

         if (d.e(2)) {
            g();
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            if (j != null) {
               var0 = j[aV];
            }

            switch(var0) {
            case 6:
               b(17);
               return;
            case 8:
               aI = true;
               d.j = !d.j;
               b.a(0);
               return;
            case 10:
               b(16);
               b.a(7);
               return;
            case 11:
               b(11);
               return;
            case 14:
               aI = true;
               d.j(d.ad);
               b(9);
               am = d.ax;
               aZ = d.aB;
               d.ax = -4;
               d.aB = -4;
               return;
            case 26:
               b(13);
               return;
            case 68:
               b(27);
               return;
            default:
               if (var0 == 19) {
                  aI = true;
                  c = true;
                  d.j(d.ad);
               }
            }
         }
         break;
      case 11:
         if (d.e(1)) {
            i();
         }

         if (d.e(2)) {
            g();
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            if (j != null) {
               var0 = j[aV];
            }

            switch(var0) {
            case 15:
               try {
                  d.i = true;
                  c.f();
                  c.K();
                  d.l();
                  d.Q.destroyApp(true);
               } catch (Throwable var2) {
               }

               return;
            case 16:
               b(10);
               return;
            case 68:
               d.a(d.g, (String)null);
            }
         }
         break;
      case 12:
      case 14:
      case 15:
      case 23:
      case 24:
         if (d.e(3)) {
            aI = true;
            --k;
            if (k < 0) {
               k = 0;
            }
         }

         if (d.e(4)) {
            aI = true;
            ++k;
            if (k >= R) {
               k = R - 1;
            }
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            aI = true;
            ++k;
            if (k >= R) {
               k = R - 1;
            }
         }

         am = 262;
         if (k >= R - 1) {
            am = -1;
         }

         if (d.e(7)) {
            b(13);
         }
         break;
      case 13:
         if (d.e(1)) {
            i();
         }

         if (d.e(2)) {
            g();
         }

         if (d.e(6) || d.e(5) || d.e(8)) {
            if (j != null) {
               var0 = j[aV];
            }

            switch(var0) {
            case 9:
               b(12);
               break;
            case 27:
               b(14);
               break;
            case 28:
               b(15);
               break;
            case 37:
               b(23);
               break;
            case 39:
               b(24);
            }
         }

         if (d.e(7)) {
            b(10);
         }
         break;
      case 16:
         if (d.e(6)) {
            d.u();
            d.i(3);
         } else if (d.e(7) && d.s == 16) {
            b(10);
         }

         if (d.e(1) && X) {
            m();
            aI = true;
         }

         if (d.e(2) && X) {
            b();
            aI = true;
         }
         break;
      case 17:
         if (d.e(6) || d.e(5) || d.e(8)) {
            a(true);
         }

         if (d.e(7)) {
            b(10);
         }
         break;
      case 26:
         if (d.e(6)) {
            b(0);
         }
         break;
      case 27:
         if (d.e(6)) {
            d.a(d.g, (String)null);
            b(10);
         }

         if (d.e(7)) {
            b(10);
         }

         if (d.e(1) && X) {
            m();
            aI = true;
         }

         if (d.e(2) && X) {
            b();
            aI = true;
         }
      }

   }

   public static final void b() {
      if (az) {
         ++N;
      }

   }

   public static final void m() {
      --N;
      if (N < 0) {
         N = 0;
      }

   }

   private static final void i() {
      aI = true;
      aJ = true;
      --aV;
      if (aV < 0) {
         aV = aq - 1;
         aD = aq - aY;
         if (aD < 0) {
            aD = 0;
         }

         int var0 = aD + aY;
         if (var0 > aq) {
            var0 = aq;
         }

         for(int var1 = aD; var1 < var0; ++var1) {
            if (n[var1] > 1) {
               ++aD;
            }
         }
      } else if (aV < aD) {
         --aD;
      }

   }

   private static final void g() {
      aI = true;
      aS = true;
      ++aV;
      if (aV >= aq) {
         aV = 0;
         aD = 0;
      } else {
         int var0 = 0;
         int var1 = 0;

         for(int var2 = aD; var2 < aq && var1 + n[var2] <= aY; ++var2) {
            var1 += n[var2];
            ++var0;
         }

         if (aV >= aD + var0) {
            ++aD;
         }
      }

   }

   private static void o() {
      --bb;
      if (bb < 0) {
         bb = 3;
      }

      ad = true;
   }

   private static void r() {
      ++bb;
      if (bb == 4) {
         bb = 0;
      }

      aX = true;
   }

   private static void h() {
      if ((g != 8 || bb == 0) && (g != 21 || bb == 2)) {
         byte var0 = 0;
         Y = true;
         switch(bb) {
         case 0:
            var0 = 1;
            if (var0 != c.cr || c.bE == -1) {
               c.k();
            }

            if (c.bE != -1) {
               c.e(c.bE, c.C.aE, 8, 1);
            }

            Y = true;
            break;
         case 1:
            var0 = 2;
            ar = 9;
            aT = 1;
            break;
         case 2:
            c.bH = 1;
            c.j();
            break;
         case 3:
            var0 = 3;
            Y = false;
         }

         c.b(var0);
         e();
      }
   }

   private static void c() {
      aM = 2;
      int var0 = d + d.b(aG[0], 0) + 2;
      int var1 = aW - 2;
      int var2 = (var1 - var0) / 4;
      B[0] = var0;
      B[1] = B[0] + var2;
      B[2] = B[1] + var2;
      B[3] = B[2] + var2;
      h[0] = -d.a(aG[1], 1);
      h[1] = h[0];
      h[2] = h[0];
      h[3] = h[0];
   }

   private static void e() {
      aM = 3;
   }

   public static final void a(byte var0, byte var1, int var2, int var3) {
      ar = var0;
      aT = var1;
      ax = var2;
      M = var3;
   }

   private static final void f() {
      r = -1;
      J = null;
      j = null;
      aV = 0;
      aD = 0;
      w = null;
      System.gc();
   }

   private static final void j() {
      if (W != null) {
         for(int var0 = 0; var0 < W.length; ++var0) {
            W[var0] = null;
         }

         W = null;
         System.gc();
      }
   }

   public static final void d(int var0) {
      switch(var0) {
      case 1:
         break;
      case 2:
      case 3:
         if (g == 0) {
            am = -1;
            aZ = 1;
         }
         break;
      default:
         if (g == 0) {
            am = 0;
            aZ = 1;
         }

         if (aM == 1 && g != 7 && g != 8 && g != 20 && g != 21 && g != 26 && g != 27) {
            am = 3;
         }
      }

   }

   public static final void b(int var0) {
      d.q = var0;
      f var10000;
      switch(d.s) {
      case 5:
         var10000 = c.C;
         f.ac();
      default:
         switch(var0) {
         case 5:
            var10000 = c.C;
            f.p();
            aE = true;
            break;
         case 8:
         case 17:
            if (O == null) {
               l();
            }

            at = 15;
            if (var0 == 8) {
               at = 7;
            }

            aF = new String[at];
            aF[0] = d.Z[44] + "   " + d.P;
            String[] var11 = aF;
            StringBuffer var10002 = (new StringBuffer()).append(d.Z[45]).append("   ");
            f var10005 = c.C;
            var11[1] = var10002.append(d.Z[98 + f.ba]).toString();
            String var1;
            if (!d.Y) {
               var1 = d.Z[35];
            } else {
               var1 = d.Z[36];
            }

            aF[2] = d.Z[46] + "   " + var1;
            Calendar var2 = Calendar.getInstance();
            var2.setTime(new Date(d.aC));
            int var4 = var2.get(1) % 100;
            String var3;
            if (var4 == 0) {
               var3 = "00";
            } else if (var4 < 10) {
               var3 = "0" + var4;
            } else {
               var3 = "" + var4;
            }

            var1 = "" + var2.get(5) + "-" + d.Z[338 + var2.get(2)] + "-" + var3;
            aF[3] = d.Z[47] + "   " + var1;
            int var5 = 215;
            if (c.av > 30) {
               ++var5;
            }

            if (c.av > 60) {
               ++var5;
            }

            if (c.av > 120) {
               ++var5;
            }

            var1 = "" + c.av + " " + d.Z[49];
            aF[4] = d.Z[48] + "   " + var1;
            aF[5] = d.Z[50] + "   " + d.Z[var5];
            aF[6] = d.Z[51] + "   " + d.ah;
            if (var0 != 8) {
               aF[7] = d.Z[52] + "   " + d.J;
               aF[8] = d.Z[53] + "   " + "$" + d.v;
               aF[9] = d.Z[328] + "   ";
               aF[10] = d.Z[329] + "   ";
               aF[11] = d.Z[330] + "   ";
               aF[12] = d.Z[331] + "   ";
               aF[13] = "";
               aF[14] = "";
            }

            int var6 = d.aI[0];
            int var7 = d.aI[1];
            byte var8 = 2;
            boolean var9 = true;
            K = 0;
            int var10 = ba - var7 - var8 - 0;
            K = 9;
            ay = 0;
         }

      }
   }

   public static final void a(int var0) {
      if (d.q == 10 && d.ax == -4 && d.aB == -4) {
         d.ax = am;
         d.aB = aZ;
      }

      f();
      if (g == 0) {
         j();
         am = 3;
         aZ = -1;
      }

      j = new int[20];
      int var1 = 0;
      aI = true;
      f var10000;
      String var2;
      switch(d.q) {
      case 5:
         ap = a.b("/avatar_vet.png");
         I = d.al - (0 + ap.getWidth()) - (d.b(aG[0], 15) + d.b(aG[0], 11));
         L = false;
         int var9 = d.al - (5 + ap.getWidth() + 4 + 10);
         var2 = a.a(d.Z[41], d.aK);
         aA = a.a(var2, 0, var9);
         aU = aA.length * (d.aI[0] + 2) + d.a(aG[0], 9) + d.a(aG[0], 13);
         if (aU < 45) {
            aU = 45;
         }

         var10000 = c.C;
         f.ba = 0;
         var10000 = c.C;
         f var12 = c.C;
         d.Y = f.bp[f.ba];
         am = 3;
         aZ = 25;
         break;
      case 6:
         r = 42;
         aN = z.toCharArray();
         as = a.a(z).length();
         ag = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_^~}¬";
         ab = 0;
         ae = 0;
         ah = 0;
         am = 3;
         aZ = 25;
         break;
      case 7:
         r = 43;
         aN = z.toCharArray();
         as = a.a(z).length();
         ag = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_^~}¬";
         ab = 0;
         ae = 0;
         ah = 0;
         am = 3;
         break;
      case 8:
         am = 262;
         aZ = -1;
         break;
      case 9:
         j = null;
         d(c.bH);
         break;
      case 10:
         al = 0;
         j[var1++] = 14;
         j[var1++] = 6;
         j[var1++] = 26;
         if (d.C) {
            j[var1++] = 8;
         }

         if (!d.an) {
            j[var1++] = 19;
         }

         j[var1++] = 10;
         j[var1++] = 11;
         if (d.g != null) {
            j[var1++] = 68;
         }

         am = 3;
         aZ = -1;
         break;
      case 11:
         J = a.a(d.Z[13], 0, E);
         j[var1++] = 16;
         j[var1++] = 15;
         am = 3;
         aZ = -1;
         break;
      case 12:
         r = 9;
         j = null;
         W = a.a(d.Q.getAppProperty("MIDlet-Name") + "\n\n" + d.Z[60] + " " + d.aM + "\n\n" + d.Z[61] + " " + d.Q.getAppProperty("MIDlet-Vendor") + "\n\n" + d.Z[62] + "\n" + d.Z[63] + "\n\n" + d.Z[64] + " " + d.Z[65] + "\n\n" + d.Z[66] + "\n" + d.Z[67], 0, E);
         am = 262;
         aZ = 25;
         break;
      case 13:
         r = 26;
         j[var1++] = 27;
         j[var1++] = 28;
         j[var1++] = 37;
         j[var1++] = 39;
         j[var1++] = 9;
         am = 3;
         aZ = 25;
         break;
      case 14:
         r = 27;
         j = null;
         var2 = a.a(d.Z[58], d.aK);
         W = a.a(var2, 0, E);
         am = 262;
         aZ = 25;
         break;
      case 15:
         r = 28;
         j = null;
         byte var6 = 0;
         byte var7 = 1;
         if (d.aD) {
            var6 = 1;
            var7 = 0;
         }

         String[] var8 = new String[2];
         var8[var6] = d.Z[332];
         var8[var7] = d.Z[333];
         var2 = a.a(d.Z[59], var8);
         W = a.a(var2, 0, E);
         am = 262;
         aZ = 25;
         break;
      case 16:
         var10000 = c.C;
         long var3 = (long)d.a(f.aN);
         byte var5;
         if (var3 >= 30L) {
            var5 = 57;
         } else if (var3 >= 7L) {
            var5 = 56;
         } else if (var3 >= 3L) {
            var5 = 55;
         } else {
            var5 = 54;
         }

         var2 = a.a(d.Z[var5], d.aK);
         w = a.a(var2, 0, E - 2 * d.b(aG[0], 10));
         aP = ak - aa;
         be = be = w.length * (d.aI[0] + 2) + d.a(aG[0], 9) + d.a(aG[0], 13);
         X = be > aP;
         if (X) {
            be = aP;
         }

         N = 0;
         az = true;
         am = 15;
         aZ = 16;
         break;
      case 17:
         k = 0;
         R = 2;
         al = 0;
         am = 262;
         aZ = 25;
         break;
      case 18:
         d.aw = false;
         am = -1;
         aZ = -1;
         break;
      case 19:
      case 20:
      case 22:
      case 25:
      default:
         if (d.q == 4) {
            j[var1++] = 20;
            j[var1++] = 21;
            j[var1++] = 22;
            j[var1++] = 23;
            j[var1++] = 24;
            am = 4;
         }
         break;
      case 21:
         d.aw = false;
         if (c.cr == 0 && g == 0) {
            c.b(1);
         }

         j = null;
         am = 0;
         aZ = 1;
         break;
      case 23:
         r = 37;
         j = null;
         W = a.a(d.Z[38], 0, E);
         am = 262;
         aZ = 25;
         break;
      case 24:
         r = 39;
         j = null;
         W = a.a(d.Z[40], 0, E);
         am = 262;
         aZ = 25;
         break;
      case 26:
         J = a.a(d.Z[12], 0, E);
         am = 4;
         aZ = -1;
         break;
      case 27:
         var2 = d.Z[350];
         w = a.a(var2, 0, E - 2 * d.b(aG[0], 10));
         aP = ak - aa;
         be = be = w.length * (d.aI[0] + 2) + d.a(aG[0], 9) + d.a(aG[0], 13);
         X = be > aP;
         if (X) {
            be = aP;
         }

         N = 0;
         az = true;
         am = 15;
         aZ = 16;
      }

      if (j != null) {
         int[] var10 = j;
         j = new int[var1];
         System.arraycopy(var10, 0, j, 0, var1);
         Object var11 = null;
         System.gc();
         aq = j.length;
      }

      q();
   }

   private static final void q() {
      aj = aa;
      G = aj;
      if (r != -1) {
         String[] var0 = a.a(d.Z[r], 1, E);
         G += (d.aI[1] + 2) * var0.length;
         var0 = null;
         G += d.aI[1] >> 1;
      }

      switch(d.q) {
      case 4:
         k();
      case 10:
      case 11:
      case 13:
      case 101:
      case 102:
      case 110:
      case 118:
         T = G;
         if (J != null) {
            T += (d.aI[0] + 2) * J.length;
         }

         F = T + d.a(aG[0], 4);
         v = ak - d.a(aG[0], 6);
         b = v - F;
         aY = b / (d.aI[1] + 2);
         if (aY == aq - 1) {
            F = T;
            v = ak;
            ++aY;
         }

         n = new int[aq * 2];
         int var4 = 0;
         String var1 = null;

         for(int var2 = 0; var2 < aq; ++var2) {
            if (j[var2] != -1) {
               var1 = d.Z[j[var2]];
               if (j[var2] == 8) {
                  if (d.C) {
                     var1 = var1 + ": < ";
                     if (d.j) {
                        var1 = var1 + d.Z[17];
                     } else {
                        var1 = var1 + d.Z[18];
                     }

                     var1 = var1 + " >";
                  }
               } else if (j[var2] == 19) {
                  var1 = var1 + " : < " + d.Z[19 + d.ad] + " >";
               }
            }

            if (d.a((String)var1, 1) <= E) {
               n[var2] = 1;
            } else {
               String[] var3 = a.a(var1, 1, E);
               n[var2] = var3.length;
            }

            var4 += n[var2];
         }

         i = var4 > aY;
         aO = bc + (o - bc - d.b(aG[0], 4) >> 1);
      case 5:
      case 8:
      case 9:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
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
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 108:
      case 109:
      case 111:
      case 114:
      case 117:
      case 120:
      case 121:
      default:
         break;
      case 6:
      case 7:
      case 103:
         A = ak - (d.aI[0] << 1);
         av = t * y / 9;
         ao = aL + av;
         q = G;
         break;
      case 12:
      case 14:
      case 15:
      case 23:
      case 24:
      case 100:
      case 104:
      case 105:
      case 106:
      case 107:
      case 112:
      case 113:
      case 115:
      case 116:
      case 119:
      case 122:
         A = ak;
         b = A - F;
         aY = b / (d.aI[0] + 2);
         R = W.length / aY;
         if (W.length % aY != 0) {
            ++R;
         }

         k = 0;
      }

   }

   private static final void d(Graphics var0) {
      if (aI) {
         if (d.s == 4) {
            d.aJ = true;
            d.a(var0, 7967429);
         }

         byte var1 = 0;
         if (d.s == 4) {
            var1 = 10;
         }

         i(var0);
         b(var0);
         if (r != -1) {
            a(var0);
         }

         int var2;
         if (J != null) {
            for(var2 = 0; var2 < J.length; ++var2) {
               d.a(var0, (String)J[var2], 0, bc, G + var2 * (d.aI[0] + 2));
            }
         }

         if (i) {
            var2 = 4;
            if (aJ) {
               aJ = false;
               ++var2;
            }

            d.b(var0, aG[0], aO, T, var2);
            var2 = 6;
            if (aS) {
               aS = false;
               ++var2;
            }

            d.b(var0, aG[0], aO, v, var2);
         }

         String var9 = "";
         int var3 = 0;
         int var4 = aD;

         for(int var5 = F + var1; var3 < aY && var4 < aq; var3 += n[var4++]) {
            if (j[var4] != -1) {
               var9 = d.Z[j[var4]];
               if (j[var4] == 8) {
                  if (d.C) {
                     var9 = var9 + " : < ";
                     if (d.j) {
                        var9 = var9 + d.Z[17];
                     } else {
                        var9 = var9 + d.Z[18];
                     }

                     var9 = var9 + " >";
                  }
               } else if (j[var4] == 19) {
                  var9 = var9 + " : < " + d.Z[19 + d.ad] + " >";
               }
            }

            boolean var6 = false;
            if (var4 == aV) {
               var6 = true;
            }

            var0.setClip(0, 0, d.al, d.au);
            var0.setColor(16744703);
            if (n[var4] == 1) {
               if (var6) {
                  var0.fillRect(bc, var5, o - bc, d.aI[1]);
               }

               d.a(var0, (String)var9, 1, bc + 2, var5);
               var5 += d.aI[1] + 2;
            } else {
               String[] var7 = a.a(var9, 1, E);
               if (var6) {
                  var0.fillRect(bc, var5 - 1, o - bc, var7.length * d.aI[1] + 2);
               }

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  d.a(var0, (String)var7[var8], 1, bc + 2, var5);
                  var5 += d.aI[1] + 2;
               }
            }
         }

         aI = false;
      }
   }

   private static final void h(Graphics var0) {
      if (aI) {
         d.a(var0, 7967429);
         i(var0);
         b(var0);
         if (r != -1) {
            a(var0);
         }

         int var1 = G;

         for(int var2 = aY * k; var2 < aY * (k + 1) && var2 < W.length; ++var2) {
            d.a(var0, (String)W[var2], 0, bc + 2, var1);
            var1 += d.aI[0] + 2;
         }

         if (R > 1 && d.s < 100) {
            StringBuffer var4 = new StringBuffer();
            if (k > 0) {
               var4.append("< ");
            }

            var4.append(k + 1 + "/" + R);
            if (k < R - 1) {
               var4.append(" >");
            }

            int var3 = d.au - d.aI[1];
            d.a(var0, (String)var4.toString(), 1, d.al - d.a((String)var4.toString(), 1) >> 1, var3);
         }

         aI = false;
      }
   }

   private static final void c(Graphics var0) {
      if (aI) {
         d.a(var0, 7967429);
         i(var0);
         boolean var1 = true;
         if (r != -1) {
            if (System.currentTimeMillis() < m && System.currentTimeMillis() % 1000L < 500L) {
               var1 = false;
            }

            if (var1) {
               a(var0);
            }
         }

         int var2 = q + 0;

         for(int var3 = 0; var3 < ag.length(); var2 += d.aI[1] + 1) {
            int var4 = 0;

            for(int var5 = ao; var4 < 8 && var3 < ag.length(); ++var4) {
               char var6 = ag.charAt(var3);
               if (var3 == ah) {
                  d.b(var0, aG[0], var5 - (d.b(aG[0], 18) >> 1), var2 - (d.a(aG[0], 18) >> 1), 18);
               }

               d.a(var0, (char)var6, 1, var5 - (d.a((String)("" + var6), 1) >> 1), var2 - (d.aI[1] >> 1));
               var5 += av;
               ++var3;
            }
         }

         var1 = true;
         if (System.currentTimeMillis() % 1000L < 500L) {
            var1 = false;
         }

         char[] var7 = new char[aN.length];

         int var8;
         for(var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] = '_';
         }

         var8 = d.al - (d.t[1] + 1) * var7.length >> 1;
         int var9 = A + 0;
         int var10 = var8 + (d.t[1] - d.r[1]["ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".indexOf(95)] >> 1);

         int var11;
         for(var11 = 0; var11 < var7.length; ++var11) {
            if (var11 == as) {
               if (var1) {
                  d.a(var0, (char)var7[var11], 1, var10, var9 + 3);
               }
            } else {
               d.a(var0, (char)var7[var11], 1, var10, var9 + 3);
            }

            var10 += d.t[1] + 1;
         }

         for(var11 = 0; var11 < aN.length; ++var11) {
            var10 = var8 + (d.t[1] + 1) * var11 + (d.t[1] - d.r[1]["ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÂÊÎÔÛÁÉÍÓÚÀÈÌÒÙÄËÏÖÜÇÑßâêîôûáéíóúàèìòùäëïöüçñ0123456789 ',()-\\?@.:\"+_!©%/#$&;¡£®¿«»°<>^~¬{}".indexOf(aN[var11])] >> 1);
            d.a(var0, (char)aN[var11], 1, var10, var9);
         }

         b(var0);
      }
   }

   private static final void f(Graphics var0) {
      if (C == null) {
         C = a.b("/choose_puppy.png");
         s = a.b("/choose_puppy_overlay.png");
      }

      int var1 = d.al - C.getWidth() >> 1;
      int var2 = d.al - s.getWidth() >> 1;
      int var3 = d.au - (d.aI[0] + C.getHeight() + 5);
      d.a(var0, (Image)C, var1, var3, 20);
      var0.setColor(7967429);
      var0.fillRect(0, 0, d.al, var3);
      var3 += C.getHeight();
      var0.setColor(16168324);
      var0.fillRect(0, var3, d.al, d.au - var3);
      if (d.u) {
         c.C.a(var0);
      }

      var3 -= C.getHeight();
      d.a(var0, (Image)s, var2, var3 + 208, 20);
      if (aE) {
      }

      int var4 = 0;
      if (ad) {
         ad = false;
         ++var4;
      }

      d.b(var0, aG[0], 2, var3 + 208, var4);
      var4 = 2;
      if (aX) {
         aX = false;
         ++var4;
      }

      d.b(var0, aG[0], d.al - (2 + d.b(aG[0], 2)), var3 + 208, var4);
      byte var11 = 35;
      if (d.Y) {
         var11 = 36;
      }

      var1 = d.al - d.a((String)d.Z[var11], 0) >> 1;
      var3 += C.getHeight() - (d.aI[0] >> 1);
      if (aE) {
      }

      d.a(var0, (String)d.Z[var11], 0, var1, var3);
      if (aE) {
         try {
            byte var9 = 0;
            byte var10 = 30;
            var0.setClip(0, 0, d.al, d.au);
            var0.drawImage(ap, var9, var10, 20);
            var1 = var9 + (3 * (ap.getWidth() >> 2) - 2);
            var10 = 75;
            d.b(var0, aG[0], var1, var10, 19);
            var1 = 0 + ap.getWidth();
            int var5 = 30 + aU;
            int var6 = var10 + d.a(aG[0], 19);
            int var7 = var6 - var5;
            if (var7 > 0) {
               var3 = 30 + var7 * 2;
            } else {
               var3 = 30;
            }

            a(var0, var1, var3, d.al - 2 - var1, aU, -1, true);
         } catch (Throwable var8) {
         }
      }

      b(var0);
   }

   private static final void d() {
      af = d.al * 90 / 100 - (d.b(aG[0], 31) + d.b(aG[0], 27));
      aR = d.al - af >> 1;
      bd = 2 + d.a(aG[0], 25);
      ba = d.au - d.aI[1] - (d.b(aG[0], 25) + d.b(aG[0], 29));
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = var2;
      int var8 = var1 + var3 - 6;
      var0.setColor(16777185);
      var0.setClip(0, 0, d.al, d.au);
      var0.fillRect(var1 - 6, var2 - 6, var3 + 12, var4 + 12);
      var0.setColor(15645576);
      var0.drawRect(var1 - 3, var2 - 3, var3 + 6, var4 + 6);
      var0.setColor(16772812);
      var0.drawRect(var1 - 3 - 1, var2 - 3 - 1, var3 + 6 + 2, var4 + 6 + 2);
      Z = var1;
      ac = var2;
      if (var5) {
         String[] var9 = a.a(d.Z[7], 1, var3);
         var0.setColor(0);
         boolean var10000;
         if (false & var9.length > 1) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         for(int var10 = 0; var10 < var9.length; ++var10) {
            int var11 = d.a((String)var9[var10], 1);
            d.a(var0, (String)var9[var10], 1, var1 + (var3 - var11 >> 1), var7);
            var7 += d.aI[1];
         }

         int var6 = var8 - e.getWidth();
         if (al == 0) {
            d.a(var0, (Image)e, var6, var7, 20);
         }

         ac = var7 + 2;
      }

   }

   private static final void g(Graphics var0) {
      if (aI) {
         d.a(var0, 7967429);
         a(var0, aR, bd, af, ba, true);
         int var1 = Z;
         int var2 = ac;
         int var3 = var1 + 2;
         int var4 = ac - 0;
         var0.setColor(16711680);
         switch(d.s) {
         case 8:
         case 17:
            int var5 = 0;
            int var6 = ay;
            boolean var7 = true;

            for(int var8 = 0; var5 < K && var6 < at && var7; ++var8) {
               String[] var9 = a.a(aF[var6], 0, af);
               if (var9.length - 1 + var5 >= K) {
                  var7 = false;
               } else {
                  int var10;
                  int var11;
                  int var12;
                  if (var6 == 9 || var6 == 10 || var6 == 11 || var6 == 12) {
                     var10 = var3 + d.a((String)var9[var9.length - 1], 0);
                     var11 = d.b(aG[0], 20);
                     var12 = 5 * var11 + 8;
                     if (var10 + var12 > aR + af && var9.length - 1 + var5 + 1 > K) {
                        var7 = false;
                     }
                  }

                  if (var7) {
                     for(var10 = 0; var10 < var9.length; ++var10) {
                        d.a(var0, (String)var9[var10], 0, var3, var4);
                        if (var10 == var9.length - 1) {
                           int var15;
                           int var16;
                           if (var6 != 9 && var6 != 10 && var6 != 11 && var6 != 12) {
                              if (var7 && var6 == 13 || var6 == 14) {
                                 if (var6 == 13 && var5 + 2 > K) {
                                    var7 = false;
                                 } else {
                                    var11 = var3;
                                    var12 = var4;
                                    byte var17 = 0;
                                    byte var18 = 4;
                                    if (var6 == 14) {
                                       var17 = 4;
                                       var18 = 7;
                                       var11 = var3 + 11;
                                       var12 = var4 + 5;
                                    }

                                    for(var15 = var17; var15 < var18; ++var15) {
                                       if ((d.H & 1 << var15) != 0) {
                                          var0.drawImage(O, var11, var12, 20);
                                       } else {
                                          var0.drawImage(S, var11, var12, 20);
                                       }

                                       var11 += 23;
                                    }

                                    if (var6 == 13) {
                                       var11 += 4;
                                       var0.drawImage(l, var11, var4, 20);
                                       var15 = var11 + (l.getWidth() - d.a((String)("" + d.B), 0) >> 1);
                                       var16 = var4 + (l.getHeight() - d.aI[0] >> 1);
                                       d.a(var0, (String)("" + d.B), 0, var15, var16);
                                    }
                                 }
                              }
                           } else {
                              var11 = var3 + d.a((String)var9[var9.length - 1], 0) + 10;
                              var12 = d.b(aG[0], 20);
                              int var13 = 5 * var12 + 8;
                              if (var11 + var13 > aR + af) {
                                 ++var5;
                                 var11 = var3 + 20;
                                 var4 += 2 + d.aI[0];
                              }

                              int var14 = 0;
                              switch(var6) {
                              case 9:
                                 var14 = f.c;
                                 break;
                              case 10:
                                 var14 = f.aG;
                                 break;
                              case 11:
                                 var14 = f.aP;
                                 break;
                              case 12:
                                 var14 = f.D;
                              }

                              var15 = var14 * 6 / 32767;
                              if (var15 > 5) {
                                 var15 = 5;
                              }

                              var11 = aR + af - var13;

                              for(var16 = 0; var16 < var15; ++var16) {
                                 d.b(var0, aG[0], var11, var4, 20);
                                 var11 += var12 + 2;
                              }

                              var0.setClip(0, 0, d.al, d.au);
                           }
                        }

                        ++var5;
                        var4 += 2 + d.aI[0];
                     }

                     if (var7) {
                        ++var6;
                     }
                  }
               }
            }

            aC = var6;
         default:
            b(var0);
            aI = false;
         }
      }
   }

   private static final void n() {
      if (!u) {
         t = d.b(aG[0], 16);
         f = d.a(aG[0], 16);
         y = d.al / t;
         aH = d.au - (d.aI[1] + f);
         aL = d.al - t * y >> 1;
         bc = aL + 2;
         o = aL + t * y - 2;
         aa = 5 + f + 2;
         ak = aH - 2;
         H = aa + 2;
         u = true;
         E = o - bc - 4;
      }

   }

   private static final void i(Graphics var0) {
      byte var1 = 5;
      int var2 = aL;
      var0.setColor(15132386);
      var0.setClip(0, 0, d.al, d.au);
      var0.fillRect(var2, var1 + d.a(aG[0], 16), y * t, aH - (var1 + d.a(aG[0], 16)));
      ++var2;

      for(int var3 = 0; var3 < y; ++var3) {
         d.b(var0, aG[0], var2, var1, 16);
         d.b(var0, aG[0], var2, aH, 17);
         var2 += t;
      }

      int var4 = H;
      var0.setClip(0, 0, d.al, d.au);
      var0.setColor(14606046);

      while(var4 < ak) {
         var0.drawLine(bc, var4, o - 1, var4);
         var4 += 10;
      }

   }

   private static final void a(Graphics var0) {
      String[] var1 = a.a(d.Z[r], 1, E);
      int var3 = aj;
      var0.setColor(0);

      for(int var5 = 0; var5 < var1.length; ++var5) {
         int var4 = d.a((String)var1[var5], 1);
         int var2 = bc + (o - bc - var4 >> 1);
         d.a(var0, (String)var1[var5], 1, var2, var3);
         var3 += d.aI[1];
         var0.setClip(0, 0, d.al, d.au);
         var0.drawLine(var2, var3, var2 + var4, var3);
         var3 += 2;
      }

   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      byte var8 = 2;
      byte var9 = 0;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      byte var13 = 0;
      int var25;
      int var26;
      int var27;
      if (!x) {
         if (c.ah) {
            var9 = 1;
         }

         var25 = var3 + var8;
         var26 = var1;
         var27 = var2;
         if (0 < d.b(aG[0], 9)) {
            var13 = 0;
         }
      } else {
         var25 = var3 + 14;
         var26 = var1 - 7 + -3;
         var27 = var2 + 0;
         if (0 < d.b(aG[0], 9)) {
            var13 = 0;
         }
      }

      int var15 = var27;
      int var16 = var26 + var25 - d.b(aG[0], 10);
      int var17 = var27 + var4 - d.a(aG[0], 14);
      int var14;
      if (var6) {
         var14 = var26 + d.b(aG[0], 8);

         for(var17 = var27 + var4 - d.a(aG[0], 13); var14 < var16; var14 += d.b(aG[0], 9) - var13) {
            d.b(var0, aG[0], var14, var15, 9);
            d.b(var0, aG[0], var14, var17, 13);
         }

         var17 = var27 + var4 - d.a(aG[0], 14);
         d.b(var0, aG[0], var26, var15, 8);
         d.b(var0, aG[0], var26, var17, 14);
         d.b(var0, aG[0], var16 + var9, var15, 10);
         d.b(var0, aG[0], var16 + var9, var17, 12);
         var14 = var26;
         var16 = var26 + var25 - d.b(aG[0], 11);
         var15 += d.a(aG[0], 8);

         for(var17 = var27 + var4 - d.a(aG[0], 14); var15 < var17; var15 += d.a(aG[0], 15)) {
            d.b(var0, aG[0], var14, var15, 15);
            d.b(var0, aG[0], var16 + var9, var15, 11);
         }
      }

      var16 = var26 + var25 - d.b(aG[0], 10);
      var17 = var27 + var4 - d.a(aG[0], 14);
      int var18 = var25 - (d.b(aG[0], 15) + d.b(aG[0], 11));
      var14 = var26 + d.b(aG[0], 15) - var8;
      var15 = var27 + d.a(aG[0], 9);
      if (var6) {
         int var19 = var4 - (d.a(aG[0], 9) + d.a(aG[0], 13));
         var0.setColor(16777215);
         var0.setClip(0, 0, d.al, d.au);
         var0.fillRect(var14 - 1, var15, var18 + 1 + var9 + var8, var19);
      }

      int var20;
      String[] var28;
      if (d.s != 16 && d.s != 27) {
         var28 = aA;
         var20 = aU;
      } else {
         var28 = w;
         var20 = be;
      }

      int var22 = var28.length - var5;
      int var23 = var15 + var20 - (d.aI[0] + 2) - 0;
      boolean var24 = false;

      int var29;
      for(var29 = N; var29 < var28.length && var15 < var23; ++var29) {
         int var21 = var14;
         if (var29 == var22) {
            var0.setClip(0, 0, d.al, d.au);
            var0.setColor(16744703);
            var0.fillRect(var14, var15, var18, d.aI[0]);
         }

         if (x) {
            if (d.s == 16 && d.s != 27) {
               var21 = var14 + bc;
            } else {
               var21 = var14 + (var18 - d.a((String)var28[var29], 0) >> 1);
            }
         }

         d.a(var0, (String)var28[var29], 0, var21, var15);
         if (x) {
         }

         var15 += d.aI[0] + 2;
      }

      az = var29 < var28.length;
      if (N > 0) {
         var0.setClip(var16, var27, d.b(aG[0], 10), d.a(aG[0], 10));
         var0.setColor(0);
         var0.drawLine(var16 + 2, var27 + 7, var16 + 2, var27 + 7);
         var0.drawLine(var16 + 1, var27 + 8, var16 + 3, var27 + 8);
         var0.drawLine(var16, var27 + 9, var16 + 4, var27 + 9);
      }

      if (az) {
         var0.setClip(var16, var17, d.b(aG[0], 12), d.a(aG[0], 12));
         var0.setColor(0);
         var0.drawLine(var16, var17 + 5, var16 + 4, var17 + 5);
         var0.drawLine(var16 + 1, var17 + 6, var16 + 3, var17 + 6);
         var0.drawLine(var16 + 2, var17 + 7, var16 + 2, var17 + 7);
      }

   }

   public static final void c(int var0) {
      int var2 = g;
      g = var0;
      Q = var0;
      x = false;
      int var3 = -1;
      Y = false;
      switch(g) {
      case 0:
         d.i = true;
         Y = true;
         ap = null;
         f var10000;
         if (var2 != 0) {
            if (c.cr == 4) {
               c.b(0);
            }

            var10000 = c.C;
            f.H();
         }

         System.gc();
         if (var2 != 48 && var2 != 58 && var2 != 0 && var2 != 70 && var2 != 71) {
            if ((var2 < 80 || var2 > 85) && (var2 < 60 || var2 > 66)) {
               if (var2 <= 32) {
                  c.j(0);
                  if (var2 == 32) {
                     Y = true;
                     var10000 = c.C;
                     var10000 = c.C;
                     f.C(3);
                     var10000 = c.C;
                     var10000 = c.C;
                     f.at = 128;
                     var10000 = c.C;
                     f.l = 0;
                     var10000 = c.C;
                     var10000 = c.C;
                     f.aT = 80;
                     c.x = null;
                     c.bI = null;
                  }
               }

               d.d(20);
               f var10001 = c.C;
               c.C.cp = f.bH;
            }
         } else {
            b(9);
         }
         break;
      case 1:
      case 2:
      case 4:
      case 5:
      case 7:
      case 9:
      case 11:
      case 13:
      case 14:
      case 16:
      case 19:
      case 20:
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
         am = 262;
         aZ = 263;
         if (g != 1) {
            if (g == 32) {
               aZ = -1;
            }
         } else {
            c.cr = 0;
            if (ap == null || L) {
               ap = null;
               L = false;
               System.gc();
               ap = a.b("/avatar_vet.png");
            }

            am = 15;
            aZ = 16;
         }

         var3 = 264 + (g - 1);
         aP = d.au - d.aI[1] - 30;
         break;
      case 3:
      case 6:
      case 8:
      case 10:
      case 12:
      case 15:
      case 17:
      case 18:
      case 21:
      case 23:
         am = -1;
         if (g == 6) {
            am = 0;
         }

         aZ = -1;
         x = true;
         var3 = 264 + (g - 1);
         if (g != 10 && g != 12 && g != 17 && g != 18) {
            if (g == 23) {
               c.at = 0;
            }
         } else {
            Y = true;
         }

         aP = d.au;
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 49:
      case 59:
      case 67:
      case 68:
      case 69:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      default:
         break;
      case 40:
      case 41:
      case 42:
      case 43:
      case 45:
      case 46:
      case 47:
      case 48:
         am = 262;
         aZ = -1;
         if (g == 40 && ap == null) {
            ap = c.ct;
            L = false;
         }

         var3 = 296 + (g - 40);
         aP = d.au - d.aI[1] - 30;
         break;
      case 44:
         am = -1;
         aZ = -1;
         x = true;
         var3 = 296 + (g - 40);
         aP = d.au;
         break;
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
         am = 262;
         aZ = -1;
         if (g == 50 && ap == null) {
            L = false;
            ap = c.ct;
         }

         var3 = 305 + (g - 50);
         aP = d.au - d.aI[1] - 30;
         break;
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
         am = 4;
         aZ = -1;
         if (g == 60) {
            am = 262;
         }

         if (ap == null || L) {
            ap = null;
            L = false;
            ap = a.b("/avatar_vet.png");
         }

         var3 = 314 + (g - 60);
         aP = d.au - d.aI[1];
         break;
      case 70:
      case 71:
         if (d.s != 17) {
            am = 4;
            aZ = -1;
         }

         x = true;
         var3 = 321;
         if (g == 71) {
            var3 = 322;
         }

         aP = d.au - d.aI[1] - 30;
         if (ap == null) {
            ap = a.b("/avatar_vet.png");
         }
         break;
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
         if (ap == null || !L) {
            ap = null;
            L = true;
            ap = a.b("/avatar_vet_angry.png");
         }

         am = 4;
         aZ = -1;
         x = false;
         var3 = 323;
         if (g == 82) {
            var3 = 326;
         } else if (g == 83) {
            var3 = 324;
         } else if (g == 84) {
            var3 = 325;
         } else if (g == 85) {
            var3 = 327;
         }

         aP = d.au - d.aI[1] - 30;
      }

      if (g != 0) {
         r = -1;
         j = null;
         String var1 = a.a(d.Z[var3], d.aK);
         if (x) {
            I = d.al - (d.b(aG[0], 15) + d.b(aG[0], 11));
         } else {
            I = d.al - (0 + ap.getWidth()) - (d.b(aG[0], 15) + d.b(aG[0], 11));
         }

         aA = a.a(var1, 0, I);
         aU = aA.length * (d.aI[0] + 2) + d.a(aG[0], 9) + d.a(aG[0], 13);
         X = aU > aP;
         if (X) {
            aU = aP;
         }

         N = 0;
         az = true;
         if (aU < 45) {
            aU = 45;
         }
      }

   }

   public static void a(boolean var0) {
      if (var0) {
         if (aC != 15) {
            p[al] = ay;
            ++al;
            ay = aC;
         } else {
            al = 0;
            ay = 0;
         }

         aI = true;
      } else if (al > 0) {
         --al;
         ay = p[al];
         aI = true;
      }

   }

   static {
      D = d.al * 90 / 100;
      a = d.al - D >> 1;
      x = false;
      X = false;
      N = 0;
      az = true;
      aG = new int[3];
      aM = 0;
      bb = 0;
      u = false;
      am = 0;
      aZ = 1;
      ar = 8;
      aT = 1;
      ax = d.al >> 1;
      M = d.au >> 1;
      Y = true;
      ai = -1;
      P = -1L;
      V = -1;
      aK = -1;
      aw = -1;
      an = -1;
      aB = -1;
      au = -1;
      aI = false;
      m = 0L;
      i = false;
      aJ = false;
      aS = false;
      ad = false;
      aX = false;
      aV = 0;
      aD = 0;
      C = null;
      s = null;
      U = 0L;
      c = false;
      boolean var10000 = false;
      p = new int[15];
      aE = true;
   }
}
