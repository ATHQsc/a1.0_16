/*      */ import java.nio.IntBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import org.lwjgl.opengl.ARBOcclusionQuery;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class e
/*      */   implements ic
/*      */ {
/*   29 */   public List a = new ArrayList();
/*      */   
/*      */   private cj k;
/*      */   
/*      */   private er l;
/*   34 */   private List m = new ArrayList(); private bj[] n;
/*      */   private bj[] o;
/*      */   private int p;
/*      */   private int q;
/*      */   private int r;
/*      */   private int s;
/*      */   private Minecraft t;
/*      */   private ay u;
/*      */   private IntBuffer v;
/*      */   private boolean w = false;
/*   44 */   private int x = 0;
/*      */ 
/*      */   
/*      */   private int y;
/*      */ 
/*      */   
/*      */   private int z;
/*      */ 
/*      */   
/*      */   private int A;
/*      */ 
/*      */   
/*      */   private int B;
/*      */ 
/*      */   
/*      */   private int C;
/*      */ 
/*      */   
/*      */   private int D;
/*      */ 
/*      */   
/*      */   private int E;
/*      */   
/*      */   private int F;
/*      */   
/*      */   private int G;
/*      */   
/*      */   private int H;
/*      */   
/*      */   private int I;
/*      */   
/*      */   private int J;
/*      */   
/*      */   private int K;
/*      */   
/*      */   private int L;
/*      */   
/*      */   int[] b;
/*      */   
/*      */   IntBuffer c;
/*      */   
/*      */   private int M;
/*      */   
/*      */   private int N;
/*      */   
/*      */   private int O;
/*      */   
/*      */   private int P;
/*      */   
/*      */   private int Q;
/*      */   
/*      */   private List R;
/*      */   
/*      */   private kl[] S;
/*      */   
/*      */   int d;
/*      */   
/*      */   int e;
/*      */   
/*      */   double f;
/*      */   
/*      */   double g;
/*      */   
/*      */   double h;
/*      */   
/*      */   public float i;
/*      */   
/*      */   int j;
/*      */ 
/*      */   
/*      */   private void f() {
/*  115 */     Random random = new Random(10842L);
/*  116 */     he he = he.a;
/*  117 */     he.b();
/*  118 */     for (byte b = 0; b < 'ל'; b++) {
/*  119 */       double d1 = (random.nextFloat() * 2.0F - 1.0F);
/*  120 */       double d2 = (random.nextFloat() * 2.0F - 1.0F);
/*  121 */       double d3 = (random.nextFloat() * 2.0F - 1.0F);
/*  122 */       double d4 = (0.25F + random.nextFloat() * 0.25F);
/*  123 */       double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*  124 */       if (d5 < 1.0D && d5 > 0.01D) {
/*  125 */         d5 = 1.0D / Math.sqrt(d5);
/*  126 */         d1 *= d5;
/*  127 */         d2 *= d5;
/*  128 */         d3 *= d5;
/*  129 */         double d6 = d1 * 100.0D;
/*  130 */         double d7 = d2 * 100.0D;
/*  131 */         double d8 = d3 * 100.0D;
/*      */         
/*  133 */         double d9 = Math.atan2(d1, d3);
/*  134 */         double d10 = Math.sin(d9);
/*  135 */         double d11 = Math.cos(d9);
/*      */         
/*  137 */         double d12 = Math.atan2(Math.sqrt(d1 * d1 + d3 * d3), d2);
/*  138 */         double d13 = Math.sin(d12);
/*  139 */         double d14 = Math.cos(d12);
/*      */         
/*  141 */         double d15 = random.nextDouble() * Math.PI * 2.0D;
/*  142 */         double d16 = Math.sin(d15);
/*  143 */         double d17 = Math.cos(d15);
/*      */         
/*  145 */         for (byte b1 = 0; b1 < 4; b1++) {
/*  146 */           double d18 = 0.0D;
/*  147 */           double d19 = ((b1 & 0x2) - 1) * d4;
/*  148 */           double d20 = ((b1 + 1 & 0x2) - 1) * d4;
/*      */           
/*  150 */           double d21 = d18;
/*  151 */           double d22 = d19 * d17 - d20 * d16;
/*  152 */           double d23 = d20 * d17 + d19 * d16;
/*      */           
/*  154 */           double d24 = d23;
/*  155 */           double d25 = d22 * d13 + d21 * d14;
/*  156 */           double d26 = d21 * d13 - d22 * d14;
/*      */           
/*  158 */           double d27 = d26 * d10 - d24 * d11;
/*  159 */           double d28 = d25;
/*  160 */           double d29 = d24 * d10 + d26 * d11;
/*      */           
/*  162 */           he.a(d6 + d27, d7 + d28, d8 + d29);
/*      */         } 
/*      */       } 
/*      */     } 
/*  166 */     he.a();
/*      */   }
/*      */   
/*      */   public void a(cj paramcj) {
/*  170 */     if (this.k != null) {
/*  171 */       this.k.b(this);
/*      */     }
/*      */     
/*  174 */     this.f = -9999.0D;
/*  175 */     this.g = -9999.0D;
/*  176 */     this.h = -9999.0D;
/*      */     
/*  178 */     km.a.a(paramcj);
/*  179 */     this.k = paramcj;
/*  180 */     this.u = new ay(paramcj);
/*  181 */     if (paramcj != null) {
/*  182 */       paramcj.a(this);
/*  183 */       a();
/*      */     } 
/*      */   }
/*      */   
/*  187 */   public e(Minecraft paramMinecraft, er paramer) { this.H = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  253 */     this.I = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  334 */     this.b = new int[50000];
/*  335 */     this.c = da.c(64);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  530 */     this.R = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  587 */     this.S = new kl[] { new kl(), new kl(), new kl(), new kl() };
/*      */     
/*  589 */     this.d = 0;
/*  590 */     this.e = da.a(1);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  920 */     this.f = -9999.0D;
/*  921 */     this.g = -9999.0D;
/*  922 */     this.h = -9999.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1157 */     this.j = 0; this.t = paramMinecraft; this.l = paramer; byte b1 = 64; this.s = da.a(b1 * b1 * b1 * 3); this.w = paramMinecraft.k().a(); if (this.w) { this.c.clear(); this.v = da.c(b1 * b1 * b1); this.v.clear(); this.v.position(0); this.v.limit(b1 * b1 * b1); ARBOcclusionQuery.glGenQueriesARB(this.v); }  this.y = da.a(3); GL11.glPushMatrix(); GL11.glNewList(this.y, 4864); f(); GL11.glEndList(); GL11.glPopMatrix(); he he = he.a; this.z = this.y + 1; GL11.glNewList(this.z, 4864); byte b2 = 64; int i = 256 / b2 + 2; float f = 16.0F; int j; for (j = -b2 * i; j <= b2 * i; j += b2) { int k; for (k = -b2 * i; k <= b2 * i; k += b2) { he.b(); he.a((j + 0), f, (k + 0)); he.a((j + b2), f, (k + 0)); he.a((j + b2), f, (k + b2)); he.a((j + 0), f, (k + b2)); he.a(); }  }  GL11.glEndList(); this.A = this.y + 2; GL11.glNewList(this.A, 4864); f = -16.0F; he.b(); for (j = -b2 * i; j <= b2 * i; j += b2) { int k; for (k = -b2 * i; k <= b2 * i; k += b2) { he.a((j + b2), f, (k + 0)); he.a((j + 0), f, (k + 0)); he.a((j + 0), f, (k + b2)); he.a((j + b2), f, (k + b2)); }  }  he.a(); GL11.glEndList(); } public void a() { ln.K.a(this.t.y.i); this.H = this.t.y.e; if (this.o != null) for (byte b = 0; b < this.o.length; b++) this.o[b].c();   int i = 64 << 3 - this.H; if (i > 400) i = 400;  this.p = i / 16 + 1; this.q = 8; this.r = i / 16 + 1; this.o = new bj[this.p * this.q * this.r]; this.n = new bj[this.p * this.q * this.r]; byte b1 = 0; byte b2 = 0; this.B = 0; this.C = 0; this.D = 0; this.E = this.p; this.F = this.q; this.G = this.r; byte b3; for (b3 = 0; b3 < this.m.size(); b3++) ((bj)this.m.get(b3)).u = false;  this.m.clear(); this.a.clear(); for (b3 = 0; b3 < this.p; b3++) { for (byte b = 0; b < this.q; b++) { for (byte b4 = 0; b4 < this.r; b4++) { this.o[(b4 * this.q + b) * this.p + b3] = new bj(this.k, this.a, b3 * 16, b * 16, b4 * 16, 16, this.s + b1); if (this.w) (this.o[(b4 * this.q + b) * this.p + b3]).z = this.v.get(b2);  (this.o[(b4 * this.q + b) * this.p + b3]).y = false; (this.o[(b4 * this.q + b) * this.p + b3]).x = true; (this.o[(b4 * this.q + b) * this.p + b3]).o = true; (this.o[(b4 * this.q + b) * this.p + b3]).w = b2++; this.o[(b4 * this.q + b) * this.p + b3].f(); this.n[(b4 * this.q + b) * this.p + b3] = this.o[(b4 * this.q + b) * this.p + b3]; this.m.add(this.o[(b4 * this.q + b) * this.p + b3]); b1 += 3; }  }  }  if (this.k != null) { be be = this.t.g; b(ei.b(be.ah), ei.b(be.ai), ei.b(be.aj)); Arrays.sort(this.n, new et(be)); }  this.I = 2; } public void a(ah paramah, nq paramnq, float paramFloat) { if (this.I > 0) { this.I--; return; }  fq.a.a(this.k, this.l, this.t.o, this.t.g, paramFloat); km.a.a(this.k, this.l, this.t.o, this.t.g, this.t.y, paramFloat); this.J = 0; this.K = 0; this.L = 0; be be = this.t.g; km.b = be.aF + (be.ah - be.aF) * paramFloat; km.c = be.aG + (be.ai - be.aG) * paramFloat; km.d = be.aH + (be.aj - be.aH) * paramFloat; fq.b = be.aF + (be.ah - be.aF) * paramFloat; fq.c = be.aG + (be.ai - be.aG) * paramFloat; fq.d = be.aH + (be.aj - be.aH) * paramFloat; List<jx> list = this.k.i(); this.J = list.size(); byte b; for (b = 0; b < list.size(); b++) { jx jx = list.get(b); if (jx.a(paramah) && paramnq.a(jx.ar) && (jx != this.t.g || this.t.y.w)) { this.K++; km.a.a(jx, paramFloat); }  }  for (b = 0; b < this.a.size(); b++) fq.a.a(this.a.get(b), paramFloat);  } public String b() { return "C: " + this.P + "/" + this.M + ". F: " + this.N + ", O: " + this.O + ", E: " + this.Q; } public String c() { return "E: " + this.K + "/" + this.J + ". B: " + this.L + ", I: " + (this.J - this.L - this.K); } private void b(int paramInt1, int paramInt2, int paramInt3) { paramInt1 -= 8; paramInt2 -= 8; paramInt3 -= 8; this.B = Integer.MAX_VALUE; this.C = Integer.MAX_VALUE; this.D = Integer.MAX_VALUE; this.E = Integer.MIN_VALUE; this.F = Integer.MIN_VALUE; this.G = Integer.MIN_VALUE; int i = this.p * 16; int j = i / 2; for (byte b = 0; b < this.p; b++) { int k = b * 16; int m = k + j - paramInt1; if (m < 0) m -= i - 1;  m /= i; k -= m * i; if (k < this.B) this.B = k;  if (k > this.E) this.E = k;  for (byte b1 = 0; b1 < this.r; b1++) { int n = b1 * 16; int i1 = n + j - paramInt3; if (i1 < 0) i1 -= i - 1;  i1 /= i; n -= i1 * i; if (n < this.D) this.D = n;  if (n > this.G) this.G = n;  for (byte b2 = 0; b2 < this.q; b2++) { int i2 = b2 * 16; if (i2 < this.C) this.C = i2;  if (i2 > this.F) this.F = i2;  bj bj1 = this.o[(b1 * this.q + b2) * this.p + b]; boolean bool = bj1.u; bj1.a(k, i2, n); if (!bool && bj1.u) this.m.add(bj1);  }  }  }  } public int a(dg paramdg, int paramInt, double paramDouble) { if (this.t.y.e != this.H) a();  if (paramInt == 0) { this.M = 0; this.N = 0; this.O = 0; this.P = 0; this.Q = 0; }  double d1 = paramdg.aF + (paramdg.ah - paramdg.aF) * paramDouble; double d2 = paramdg.aG + (paramdg.ai - paramdg.aG) * paramDouble; double d3 = paramdg.aH + (paramdg.aj - paramdg.aH) * paramDouble; double d4 = paramdg.ah - this.f; double d5 = paramdg.ai - this.g; double d6 = paramdg.aj - this.h; if (d4 * d4 + d5 * d5 + d6 * d6 > 16.0D) { this.f = paramdg.ah; this.g = paramdg.ai; this.h = paramdg.aj; b(ei.b(paramdg.ah), ei.b(paramdg.ai), ei.b(paramdg.aj)); Arrays.sort(this.n, new et(paramdg)); }  int i = 0; if (this.w && !this.t.y.g && paramInt == 0) { int j = 0; int k = 16; a(j, k); for (int m = j; m < k; m++) (this.n[m]).x = true;  i += a(j, k, paramInt, paramDouble); do { j = k; k *= 2; if (k > this.n.length) k = this.n.length;  GL11.glDisable(3553); GL11.glDisable(2896); GL11.glDisable(3008); GL11.glDisable(2912); GL11.glColorMask(false, false, false, false); GL11.glDepthMask(false); a(j, k); GL11.glPushMatrix(); float f1 = 0.0F; float f2 = 0.0F; float f3 = 0.0F; for (int n = j; n < k; n++) { if (this.n[n].e()) { (this.n[n]).o = false; } else { if (!(this.n[n]).o) (this.n[n]).x = true;  if ((this.n[n]).o && !(this.n[n]).y) { float f = ei.c(this.n[n].a(paramdg)); int i1 = (int)(1.0F + f / 128.0F); if (this.x % i1 == n % i1) { bj bj1 = this.n[n]; float f4 = (float)(bj1.i - d1); float f5 = (float)(bj1.j - d2); float f6 = (float)(bj1.k - d3); float f7 = f4 - f1; float f8 = f5 - f2; float f9 = f6 - f3; if (f7 != 0.0F || f8 != 0.0F || f9 != 0.0F) { GL11.glTranslatef(f7, f8, f9); f1 += f7; f2 += f8; f3 += f9; }  ARBOcclusionQuery.glBeginQueryARB(35092, (this.n[n]).z); this.n[n].d(); ARBOcclusionQuery.glEndQueryARB(35092); (this.n[n]).y = true; }  }  }  }  GL11.glPopMatrix(); GL11.glColorMask(true, true, true, true); GL11.glDepthMask(true); GL11.glEnable(3553); GL11.glEnable(3008); GL11.glEnable(2912); i += a(j, k, paramInt, paramDouble); } while (k < this.n.length); } else { i += a(0, this.n.length, paramInt, paramDouble); }  return i; } private void a(int paramInt1, int paramInt2) { for (int i = paramInt1; i < paramInt2; i++) { if ((this.n[i]).y) { this.c.clear(); ARBOcclusionQuery.glGetQueryObjectuARB((this.n[i]).z, 34919, this.c); if (this.c.get(0) != 0) { (this.n[i]).y = false; this.c.clear(); ARBOcclusionQuery.glGetQueryObjectuARB((this.n[i]).z, 34918, this.c); (this.n[i]).x = (this.c.get(0) != 0); }  }  }  } private int a(int paramInt1, int paramInt2, int paramInt3, double paramDouble) { this.R.clear(); byte b1 = 0; for (int i = paramInt1; i < paramInt2; i++) { if (paramInt3 == 0) { this.M++; if ((this.n[i]).p[paramInt3]) { this.Q++; } else if (!(this.n[i]).o) { this.N++; } else if (this.w && !(this.n[i]).x) { this.O++; } else { this.P++; }  }  if (!(this.n[i]).p[paramInt3] && (this.n[i]).o && (this.n[i]).x) { int j = this.n[i].a(paramInt3); if (j >= 0) { this.R.add(this.n[i]); b1++; }  }  }  be be = this.t.g; double d1 = be.aF + (be.ah - be.aF) * paramDouble; double d2 = be.aG + (be.ai - be.aG) * paramDouble; double d3 = be.aH + (be.aj - be.aH) * paramDouble; byte b2 = 0; byte b3; for (b3 = 0; b3 < this.S.length; b3++) this.S[b3].b();  for (b3 = 0; b3 < this.R.size(); b3++) { bj bj1 = this.R.get(b3); byte b = -1; for (byte b4 = 0; b4 < b2; b4++) { if (this.S[b4].a(bj1.i, bj1.j, bj1.k)) b = b4;  }  if (b < 0) { b = b2++; this.S[b].a(bj1.i, bj1.j, bj1.k, d1, d2, d3); }  this.S[b].a(bj1.a(paramInt3)); }  a(paramInt3, paramDouble); return b1; }
/*      */   public void a(int paramInt, double paramDouble) { for (byte b = 0; b < this.S.length; b++) this.S[b].a();  }
/*      */   public void d() { this.x++; }
/* 1160 */   public void a(nq paramnq, float paramFloat) { for (byte b = 0; b < this.o.length; b++) {
/* 1161 */       if (!this.o[b].e() && (
/* 1162 */         !(this.o[b]).o || (b + this.j & 0xF) == 0)) {
/* 1163 */         this.o[b].a(paramnq);
/*      */       }
/*      */     } 
/*      */     
/* 1167 */     this.j++; }
/*      */   public void a(float paramFloat) { GL11.glDisable(3553); ah ah = this.k.b(paramFloat); float f1 = (float)ah.a; float f2 = (float)ah.b; float f3 = (float)ah.c; if (this.t.y.g) { float f9 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F; float f10 = (f1 * 30.0F + f2 * 70.0F) / 100.0F; float f11 = (f1 * 30.0F + f3 * 70.0F) / 100.0F; f1 = f9; f2 = f10; f3 = f11; }  GL11.glColor3f(f1, f2, f3); he he = he.a; GL11.glDepthMask(false); GL11.glEnable(2912); GL11.glColor3f(f1, f2, f3); GL11.glCallList(this.z); GL11.glEnable(3553); GL11.glDisable(2912); GL11.glDisable(3008); GL11.glEnable(3042); GL11.glBlendFunc(1, 1); GL11.glPushMatrix(); float f4 = 0.0F; float f5 = 0.0F; float f6 = 0.0F; GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); GL11.glTranslatef(f4, f5, f6); GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F); GL11.glRotatef(this.k.c(paramFloat) * 360.0F, 1.0F, 0.0F, 0.0F); float f7 = 30.0F; GL11.glBindTexture(3553, this.l.a("/terrain/sun.png")); he.b(); he.a(-f7, 100.0D, -f7, 0.0D, 0.0D); he.a(f7, 100.0D, -f7, 1.0D, 0.0D); he.a(f7, 100.0D, f7, 1.0D, 1.0D); he.a(-f7, 100.0D, f7, 0.0D, 1.0D); he.a(); f7 = 20.0F; GL11.glBindTexture(3553, this.l.a("/terrain/moon.png")); he.b(); he.a(-f7, -100.0D, f7, 1.0D, 1.0D); he.a(f7, -100.0D, f7, 0.0D, 1.0D); he.a(f7, -100.0D, -f7, 0.0D, 0.0D); he.a(-f7, -100.0D, -f7, 1.0D, 0.0D); he.a(); GL11.glDisable(3553); float f8 = this.k.f(paramFloat); if (f8 > 0.0F) { GL11.glColor4f(f8, f8, f8, f8); GL11.glCallList(this.y); }  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); GL11.glDisable(3042); GL11.glEnable(3008); GL11.glEnable(2912); GL11.glPopMatrix(); GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F); GL11.glDisable(3553); GL11.glCallList(this.A); GL11.glEnable(3553); GL11.glDepthMask(true); }
/*      */   public void b(float paramFloat) { if (this.t.y.i) { c(paramFloat); return; }  GL11.glDisable(2884); float f1 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * paramFloat); byte b = 32; int i = 256 / b; he he = he.a; GL11.glBindTexture(3553, this.l.a("/clouds.png")); GL11.glEnable(3042); GL11.glBlendFunc(770, 771); ah ah = this.k.d(paramFloat); float f2 = (float)ah.a; float f3 = (float)ah.b; float f4 = (float)ah.c; if (this.t.y.g) { float f9 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F; float f10 = (f2 * 30.0F + f3 * 70.0F) / 100.0F; float f11 = (f2 * 30.0F + f4 * 70.0F) / 100.0F; f2 = f9; f3 = f10; f4 = f11; }  float f5 = 4.8828125E-4F; double d1 = this.t.g.ae + (this.t.g.ah - this.t.g.ae) * paramFloat + ((this.x + paramFloat) * 0.03F); double d2 = this.t.g.ag + (this.t.g.aj - this.t.g.ag) * paramFloat; int j = ei.b(d1 / 2048.0D); int k = ei.b(d2 / 2048.0D); d1 -= (j * 2048); d2 -= (k * 2048); float f6 = 120.0F - f1 + 0.33F; float f7 = (float)(d1 * f5); float f8 = (float)(d2 * f5); he.b(); he.a(f2, f3, f4, 0.8F); int m; for (m = -b * i; m < b * i; m += b) { int n; for (n = -b * i; n < b * i; n += b) { he.a((m + 0), f6, (n + b), ((m + 0) * f5 + f7), ((n + b) * f5 + f8)); he.a((m + b), f6, (n + b), ((m + b) * f5 + f7), ((n + b) * f5 + f8)); he.a((m + b), f6, (n + 0), ((m + b) * f5 + f7), ((n + 0) * f5 + f8)); he.a((m + 0), f6, (n + 0), ((m + 0) * f5 + f7), ((n + 0) * f5 + f8)); }  }  he.a(); GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); GL11.glDisable(3042); GL11.glEnable(2884); }
/*      */   public void c(float paramFloat) { GL11.glDisable(2884); float f1 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * paramFloat); he he = he.a; float f2 = 12.0F; float f3 = 4.0F; double d1 = (this.t.g.ae + (this.t.g.ah - this.t.g.ae) * paramFloat + ((this.x + paramFloat) * 0.03F)) / f2; double d2 = (this.t.g.ag + (this.t.g.aj - this.t.g.ag) * paramFloat) / f2 + 0.33000001311302185D; float f4 = 108.0F - f1 + 0.33F; int i = ei.b(d1 / 2048.0D); int j = ei.b(d2 / 2048.0D); d1 -= (i * 2048); d2 -= (j * 2048); GL11.glBindTexture(3553, this.l.a("/clouds.png")); GL11.glEnable(3042); GL11.glBlendFunc(770, 771); ah ah = this.k.d(paramFloat); float f5 = (float)ah.a; float f6 = (float)ah.b; float f7 = (float)ah.c; if (this.t.y.g) { float f14 = (f5 * 30.0F + f6 * 59.0F + f7 * 11.0F) / 100.0F; float f15 = (f5 * 30.0F + f6 * 70.0F) / 100.0F; float f16 = (f5 * 30.0F + f7 * 70.0F) / 100.0F; f5 = f14; f6 = f15; f7 = f16; }  float f8 = (float)(d1 * 0.0D); float f9 = (float)(d2 * 0.0D); float f10 = 0.00390625F; f8 = ei.b(d1) * f10; f9 = ei.b(d2) * f10; float f11 = (float)(d1 - ei.b(d1)); float f12 = (float)(d2 - ei.b(d2)); byte b1 = 8; byte b2 = 3; float f13 = 9.765625E-4F; GL11.glScalef(f2, 1.0F, f2); for (byte b3 = 0; b3 < 2; b3++) { if (b3 == 0) { GL11.glColorMask(false, false, false, false); } else { GL11.glColorMask(true, true, true, true); }  for (int k = -b2 + 1; k <= b2; k++) { for (int m = -b2 + 1; m <= b2; m++) { he.b(); float f14 = (k * b1); float f15 = (m * b1); float f16 = f14 - f11; float f17 = f15 - f12; if (f4 > -f3 - 1.0F) { he.a(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F); he.b(0.0F, -1.0F, 0.0F); he.a((f16 + 0.0F), (f4 + 0.0F), (f17 + b1), ((f14 + 0.0F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b1), (f4 + 0.0F), (f17 + b1), ((f14 + b1) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b1), (f4 + 0.0F), (f17 + 0.0F), ((f14 + b1) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); he.a((f16 + 0.0F), (f4 + 0.0F), (f17 + 0.0F), ((f14 + 0.0F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); }  if (f4 <= f3 + 1.0F) { he.a(f5, f6, f7, 0.8F); he.b(0.0F, 1.0F, 0.0F); he.a((f16 + 0.0F), (f4 + f3 - f13), (f17 + b1), ((f14 + 0.0F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b1), (f4 + f3 - f13), (f17 + b1), ((f14 + b1) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b1), (f4 + f3 - f13), (f17 + 0.0F), ((f14 + b1) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); he.a((f16 + 0.0F), (f4 + f3 - f13), (f17 + 0.0F), ((f14 + 0.0F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); }  he.a(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F); if (k > -1) { he.b(-1.0F, 0.0F, 0.0F); for (byte b = 0; b < b1; b++) { he.a((f16 + b + 0.0F), (f4 + 0.0F), (f17 + b1), ((f14 + b + 0.5F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b + 0.0F), (f4 + f3), (f17 + b1), ((f14 + b + 0.5F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b + 0.0F), (f4 + f3), (f17 + 0.0F), ((f14 + b + 0.5F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); he.a((f16 + b + 0.0F), (f4 + 0.0F), (f17 + 0.0F), ((f14 + b + 0.5F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); }  }  if (k <= 1) { he.b(1.0F, 0.0F, 0.0F); for (byte b = 0; b < b1; b++) { he.a((f16 + b + 1.0F - f13), (f4 + 0.0F), (f17 + b1), ((f14 + b + 0.5F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b + 1.0F - f13), (f4 + f3), (f17 + b1), ((f14 + b + 0.5F) * f10 + f8), ((f15 + b1) * f10 + f9)); he.a((f16 + b + 1.0F - f13), (f4 + f3), (f17 + 0.0F), ((f14 + b + 0.5F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); he.a((f16 + b + 1.0F - f13), (f4 + 0.0F), (f17 + 0.0F), ((f14 + b + 0.5F) * f10 + f8), ((f15 + 0.0F) * f10 + f9)); }  }  he.a(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F); if (m > -1) { he.b(0.0F, 0.0F, -1.0F); for (byte b = 0; b < b1; b++) { he.a((f16 + 0.0F), (f4 + f3), (f17 + b + 0.0F), ((f14 + 0.0F) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + b1), (f4 + f3), (f17 + b + 0.0F), ((f14 + b1) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + b1), (f4 + 0.0F), (f17 + b + 0.0F), ((f14 + b1) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + 0.0F), (f4 + 0.0F), (f17 + b + 0.0F), ((f14 + 0.0F) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); }  }  if (m <= 1) { he.b(0.0F, 0.0F, 1.0F); for (byte b = 0; b < b1; b++) { he.a((f16 + 0.0F), (f4 + f3), (f17 + b + 1.0F - f13), ((f14 + 0.0F) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + b1), (f4 + f3), (f17 + b + 1.0F - f13), ((f14 + b1) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + b1), (f4 + 0.0F), (f17 + b + 1.0F - f13), ((f14 + b1) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); he.a((f16 + 0.0F), (f4 + 0.0F), (f17 + b + 1.0F - f13), ((f14 + 0.0F) * f10 + f8), ((f15 + b + 0.5F) * f10 + f9)); }  }  he.a(); }  }  }  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); GL11.glDisable(3042); GL11.glEnable(2884); }
/*      */   public boolean a(dg paramdg, boolean paramBoolean) { Collections.sort(this.m, new gc(paramdg)); int i = this.m.size() - 1; int j = this.m.size(); for (byte b = 0; b < j; b++) { bj bj1 = this.m.get(i - b); if (!paramBoolean) { if (bj1.a(paramdg) > 1024.0F) if (bj1.o) { if (b >= 3) return false;  } else if (b >= 1) { return false; }   } else if (!bj1.o) { continue; }  bj1.a(); this.m.remove(bj1); bj1.u = false; continue; }  return (this.m.size() == 0); }
/* 1172 */   public void a(dg paramdg, lv paramlv, int paramInt, eo parameo, float paramFloat) { he he = he.a; GL11.glEnable(3042); GL11.glEnable(3008); GL11.glBlendFunc(770, 1); GL11.glColor4f(1.0F, 1.0F, 1.0F, (ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F); if (paramInt == 0) { if (this.i > 0.0F) { GL11.glBlendFunc(774, 768); int i = this.l.a("/terrain.png"); GL11.glBindTexture(3553, i); GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F); GL11.glPushMatrix(); int j = this.k.a(paramlv.b, paramlv.c, paramlv.d); ln ln = (j > 0) ? ln.n[j] : null; GL11.glDisable(3008); GL11.glPolygonOffset(-3.0F, -3.0F); GL11.glEnable(32823); he.b(); double d1 = paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat; double d2 = paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat; double d3 = paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat; he.b(-d1, -d2, -d3); he.c(); if (ln == null) ln = ln.t;  this.u.a(ln, paramlv.b, paramlv.c, paramlv.d, 240 + (int)(this.i * 10.0F)); he.a(); he.b(0.0D, 0.0D, 0.0D); GL11.glPolygonOffset(0.0F, 0.0F); GL11.glDisable(32823); GL11.glEnable(3008); GL11.glDepthMask(true); GL11.glPopMatrix(); }  } else if (parameo != null) { GL11.glBlendFunc(770, 771); float f = ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F; GL11.glColor4f(f, f, f, ei.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F); int i = this.l.a("/terrain.png"); GL11.glBindTexture(3553, i); int j = paramlv.b; int k = paramlv.c; int m = paramlv.d; if (paramlv.e == 0) k--;  if (paramlv.e == 1) k++;  if (paramlv.e == 2) m--;  if (paramlv.e == 3) m++;  if (paramlv.e == 4) j--;  if (paramlv.e == 5) j++;  }  GL11.glDisable(3042); GL11.glDisable(3008); } public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) { if (paramString != null) {
/* 1173 */       this.t.u.b("C418 - " + paramString);
/*      */     }
/* 1175 */     this.t.A.a(paramString, paramInt1, paramInt2, paramInt3, 1.0F, 1.0F); }
/*      */   public void b(dg paramdg, lv paramlv, int paramInt, eo parameo, float paramFloat) { if (paramInt == 0 && paramlv.a == 0) { GL11.glEnable(3042); GL11.glBlendFunc(770, 771); GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F); GL11.glLineWidth(2.0F); GL11.glDisable(3553); GL11.glDepthMask(false); float f = 0.002F; int i = this.k.a(paramlv.b, paramlv.c, paramlv.d); if (i > 0) { ln.n[i].a(this.k, paramlv.b, paramlv.c, paramlv.d); double d1 = paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat; double d2 = paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat; double d3 = paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat; a(ln.n[i].f(this.k, paramlv.b, paramlv.c, paramlv.d).b(f, f, f).c(-d1, -d2, -d3)); }  GL11.glDepthMask(true); GL11.glEnable(3553); GL11.glDisable(3042); }  }
/*      */   private void a(cb paramcb) { he he = he.a; he.a(3); he.a(paramcb.a, paramcb.b, paramcb.c); he.a(paramcb.d, paramcb.b, paramcb.c); he.a(paramcb.d, paramcb.b, paramcb.f); he.a(paramcb.a, paramcb.b, paramcb.f); he.a(paramcb.a, paramcb.b, paramcb.c); he.a(); he.a(3); he.a(paramcb.a, paramcb.e, paramcb.c); he.a(paramcb.d, paramcb.e, paramcb.c); he.a(paramcb.d, paramcb.e, paramcb.f); he.a(paramcb.a, paramcb.e, paramcb.f); he.a(paramcb.a, paramcb.e, paramcb.c); he.a(); he.a(1); he.a(paramcb.a, paramcb.b, paramcb.c); he.a(paramcb.a, paramcb.e, paramcb.c); he.a(paramcb.d, paramcb.b, paramcb.c); he.a(paramcb.d, paramcb.e, paramcb.c); he.a(paramcb.d, paramcb.b, paramcb.f); he.a(paramcb.d, paramcb.e, paramcb.f); he.a(paramcb.a, paramcb.b, paramcb.f); he.a(paramcb.a, paramcb.e, paramcb.f); he.a(); }
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { int i = ei.a(paramInt1, 16); int j = ei.a(paramInt2, 16); int k = ei.a(paramInt3, 16); int m = ei.a(paramInt4, 16); int n = ei.a(paramInt5, 16); int i1 = ei.a(paramInt6, 16); for (int i2 = i; i2 <= m; i2++) { int i3 = i2 % this.p; if (i3 < 0) i3 += this.p;  for (int i4 = j; i4 <= n; i4++) { int i5 = i4 % this.q; if (i5 < 0) i5 += this.q;  for (int i6 = k; i6 <= i1; i6++) { int i7 = i6 % this.r; if (i7 < 0) i7 += this.r;  int i8 = (i7 * this.q + i5) * this.p + i3; bj bj1 = this.o[i8]; if (!bj1.u) this.m.add(bj1);  bj1.f(); }  }  }  }
/* 1179 */   public void a(int paramInt1, int paramInt2, int paramInt3) { a(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1); } public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { a(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt4 + 1, paramInt5 + 1, paramInt6 + 1); } public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) { float f = 16.0F;
/* 1180 */     if (paramFloat1 > 1.0F) f *= paramFloat1; 
/* 1181 */     if (this.t.g.d(paramDouble1, paramDouble2, paramDouble3) < (f * f)) {
/* 1182 */       this.t.A.b(paramString, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramFloat1, paramFloat2);
/*      */     } }
/*      */ 
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 1187 */     double d1 = this.t.g.ah - paramDouble1;
/* 1188 */     double d2 = this.t.g.ai - paramDouble2;
/* 1189 */     double d3 = this.t.g.aj - paramDouble3;
/*      */     
/* 1191 */     if (d1 * d1 + d2 * d2 + d3 * d3 > 256.0D)
/*      */       return; 
/* 1193 */     if (paramString == "bubble") { this.t.h.a(new aw(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6)); }
/* 1194 */     else if (paramString == "smoke") { this.t.h.a(new my(this.k, paramDouble1, paramDouble2, paramDouble3)); }
/* 1195 */     else if (paramString == "explode") { this.t.h.a(new dj(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6)); }
/* 1196 */     else if (paramString == "flame") { this.t.h.a(new is(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6)); }
/* 1197 */     else if (paramString == "lava") { this.t.h.a(new cm(this.k, paramDouble1, paramDouble2, paramDouble3)); }
/* 1198 */     else if (paramString == "splash") { this.t.h.a(new kf(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6)); }
/* 1199 */     else if (paramString == "largesmoke") { this.t.h.a(new my(this.k, paramDouble1, paramDouble2, paramDouble3, 2.5F)); }
/* 1200 */     else if (paramString == "reddust") { this.t.h.a(new eh(this.k, paramDouble1, paramDouble2, paramDouble3)); }
/* 1201 */     else if (paramString == "snowballpoof") { this.t.h.a(new hw(this.k, paramDouble1, paramDouble2, paramDouble3, dd.aB)); }
/* 1202 */     else if (paramString == "slime") { this.t.h.a(new hw(this.k, paramDouble1, paramDouble2, paramDouble3, dd.aK)); }
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(jx paramjx) {
/* 1209 */     if (paramjx.aV != null) {
/* 1210 */       this.l.a(paramjx.aV, new jh());
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(jx paramjx) {
/* 1215 */     if (paramjx.aV != null) this.l.b(paramjx.aV); 
/*      */   }
/*      */   
/*      */   public void e() {
/* 1219 */     for (byte b = 0; b < this.o.length; b++) {
/* 1220 */       if ((this.o[b]).A) {
/* 1221 */         if (!(this.o[b]).u) {
/* 1222 */           this.m.add(this.o[b]);
/*      */         }
/* 1224 */         this.o[b].f();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */