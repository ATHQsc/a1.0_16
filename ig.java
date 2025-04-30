/*     */ import java.nio.FloatBuffer;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ import org.lwjgl.util.glu.GLU;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ig
/*     */ {
/*     */   private Minecraft h;
/*  29 */   private float i = 0.0F;
/*     */   public iy a;
/*     */   private int j;
/*  32 */   private jx k = null; private long l; private Random m; volatile int b; volatile int c; FloatBuffer d;
/*     */   float e;
/*     */   float f;
/*     */   float g;
/*     */   private float n;
/*     */   private float o;
/*     */   
/*     */   public void a() {
/*  40 */     this.n = this.o;
/*     */     
/*  42 */     float f1 = this.h.e.c(ei.b(this.h.g.ah), ei.b(this.h.g.ai), ei.b(this.h.g.aj));
/*  43 */     float f2 = (3 - this.h.y.e) / 3.0F;
/*  44 */     float f3 = f1 * (1.0F - f2) + f2;
/*  45 */     this.o += (f3 - this.o) * 0.1F;
/*     */     
/*  47 */     this.j++;
/*     */     
/*  49 */     this.a.a();
/*  50 */     if (this.h.J) c();
/*     */   
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*  55 */     if (this.h.g == null)
/*     */       return; 
/*  57 */     double d1 = this.h.b.c();
/*  58 */     this.h.x = this.h.g.a(d1, paramFloat);
/*     */     
/*  60 */     double d2 = d1;
/*  61 */     ah ah1 = this.h.g.e(paramFloat);
/*  62 */     if (this.h.x != null) {
/*  63 */       d2 = this.h.x.f.c(ah1);
/*     */     }
/*     */ 
/*     */     
/*  67 */     d2 = d1 = 32.0D;
/*     */     
/*  69 */     if (d2 > 3.0D) d2 = 3.0D; 
/*  70 */     d1 = d2;
/*     */ 
/*     */     
/*  73 */     ah ah2 = this.h.g.f(paramFloat);
/*  74 */     ah ah3 = ah1.c(ah2.a * d1, ah2.b * d1, ah2.c * d1);
/*  75 */     this.k = null;
/*  76 */     List<jx> list = this.h.e.b(this.h.g, this.h.g.ar.a(ah2.a * d1, ah2.b * d1, ah2.c * d1));
/*  77 */     double d3 = 0.0D;
/*  78 */     for (byte b = 0; b < list.size(); b++) {
/*  79 */       jx jx1 = list.get(b);
/*  80 */       if (jx1.c_()) {
/*     */         
/*  82 */         float f = 0.1F;
/*  83 */         cb cb = jx1.ar.b(f, f, f);
/*  84 */         lv lv = cb.a(ah1, ah3);
/*  85 */         if (lv != null) {
/*  86 */           double d = ah1.c(lv.f);
/*  87 */           if (d < d3 || d3 == 0.0D) {
/*  88 */             this.k = jx1;
/*  89 */             d3 = d;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  94 */     if (this.k != null && 
/*  95 */       !(this.h.b instanceof ib))
/*     */     {
/*  97 */       this.h.x = new lv(this.k);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float d(float paramFloat) {
/* 110 */     be be = this.h.g;
/* 111 */     float f = 70.0F;
/* 112 */     if (be.a(fs.f)) f = 60.0F; 
/* 113 */     if (be.D <= 0) {
/* 114 */       float f1 = be.I + paramFloat;
/*     */       
/* 116 */       f /= (1.0F - 500.0F / (f1 + 500.0F)) * 2.0F + 1.0F;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     return f;
/*     */   }
/*     */   
/*     */   private void e(float paramFloat) {
/* 129 */     be be = this.h.g;
/*     */     
/* 131 */     float f1 = be.F - paramFloat;
/*     */     
/* 133 */     if (be.D <= 0) {
/* 134 */       float f = be.I + paramFloat;
/*     */       
/* 136 */       GL11.glRotatef(40.0F - 8000.0F / (f + 200.0F), 0.0F, 0.0F, 1.0F);
/*     */     } 
/*     */     
/* 139 */     if (f1 < 0.0F)
/* 140 */       return;  f1 /= be.G;
/* 141 */     f1 = ei.a(f1 * f1 * f1 * f1 * 3.1415927F);
/*     */     
/* 143 */     float f2 = be.H;
/*     */ 
/*     */     
/* 146 */     GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/* 147 */     GL11.glRotatef(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
/* 148 */     GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private void f(float paramFloat) {
/* 152 */     if (this.h.y.w)
/* 153 */       return;  be be = this.h.g;
/*     */     
/* 155 */     float f1 = be.aC - be.aB;
/* 156 */     float f2 = be.aC + f1 * paramFloat;
/* 157 */     float f3 = be.e + (be.f - be.e) * paramFloat;
/* 158 */     float f4 = be.K + (be.L - be.K) * paramFloat;
/* 159 */     GL11.glTranslatef(ei.a(f2 * 3.1415927F) * f3 * 0.5F, -Math.abs(ei.b(f2 * 3.1415927F) * f3), 0.0F);
/* 160 */     GL11.glRotatef(ei.a(f2 * 3.1415927F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
/* 161 */     GL11.glRotatef(Math.abs(ei.b(f2 * 3.1415927F + 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
/* 162 */     GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private void g(float paramFloat) {
/* 166 */     be be = this.h.g;
/*     */     
/* 168 */     double d1 = be.ae + (be.ah - be.ae) * paramFloat;
/* 169 */     double d2 = be.af + (be.ai - be.af) * paramFloat;
/* 170 */     double d3 = be.ag + (be.aj - be.ag) * paramFloat;
/*     */     
/* 172 */     if (this.h.y.w) {
/*     */       
/* 174 */       double d4 = 4.0D;
/*     */       
/* 176 */       float f1 = be.o + (be.n - be.o) * paramFloat;
/*     */       
/* 178 */       float f2 = be.an - 10.0F;
/* 179 */       float f3 = be.ao + 2.0F;
/* 180 */       double d5 = (-ei.a(f2 / 180.0F * 3.1415927F) * ei.b(f3 / 180.0F * 3.1415927F)) * d4;
/* 181 */       double d6 = (ei.b(f2 / 180.0F * 3.1415927F) * ei.b(f3 / 180.0F * 3.1415927F)) * d4;
/* 182 */       double d7 = -ei.a(f3 / 180.0F * 3.1415927F) * d4;
/*     */       
/* 184 */       for (byte b = 0; b < 8; b++) {
/* 185 */         float f4 = ((b & 0x1) * 2 - 1);
/* 186 */         float f5 = ((b >> 1 & 0x1) * 2 - 1);
/* 187 */         float f6 = ((b >> 2 & 0x1) * 2 - 1);
/*     */         
/* 189 */         f4 *= 0.1F;
/* 190 */         f5 *= 0.1F;
/* 191 */         f6 *= 0.1F;
/*     */         
/* 193 */         lv lv = this.h.e.a(ah.b(d1 + f4, d2 + f5, d3 + f6), ah.b(d1 - d5 + f4 + f6, d2 - d7 + f5, d3 - d6 + f6));
/* 194 */         if (lv != null) {
/* 195 */           double d = lv.f.c(ah.b(d1, d2, d3));
/* 196 */           if (d < d4) d4 = d; 
/*     */         } 
/*     */       } 
/* 199 */       GL11.glRotatef(be.ao - f3, 1.0F, 0.0F, 0.0F);
/* 200 */       GL11.glRotatef(be.an - f2, 0.0F, 1.0F, 0.0F);
/* 201 */       GL11.glTranslatef(0.0F, 0.0F, (float)-d4);
/* 202 */       GL11.glRotatef(f2 - be.an, 0.0F, 1.0F, 0.0F);
/* 203 */       GL11.glRotatef(f3 - be.ao, 1.0F, 0.0F, 0.0F);
/*     */     } else {
/* 205 */       GL11.glTranslatef(0.0F, 0.0F, -0.1F);
/*     */     } 
/*     */     
/* 208 */     GL11.glRotatef(be.aq + (be.ao - be.aq) * paramFloat, 1.0F, 0.0F, 0.0F);
/* 209 */     GL11.glRotatef(be.ap + (be.an - be.ap) * paramFloat + 180.0F, 0.0F, 1.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(float paramFloat, int paramInt) {
/* 215 */     this.i = (256 >> this.h.y.e);
/* 216 */     GL11.glMatrixMode(5889);
/* 217 */     GL11.glLoadIdentity();
/*     */     
/* 219 */     float f = 0.07F;
/* 220 */     if (this.h.y.g) GL11.glTranslatef(-(paramInt * 2 - 1) * f, 0.0F, 0.0F); 
/* 221 */     GLU.gluPerspective(d(paramFloat), this.h.c / this.h.d, 0.05F, this.i);
/* 222 */     GL11.glMatrixMode(5888);
/* 223 */     GL11.glLoadIdentity();
/* 224 */     if (this.h.y.g) GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*     */     
/* 226 */     e(paramFloat);
/* 227 */     if (this.h.y.f) f(paramFloat);
/*     */     
/* 229 */     g(paramFloat);
/*     */   }
/*     */   
/*     */   private void b(float paramFloat, int paramInt) {
/* 233 */     GL11.glLoadIdentity();
/* 234 */     if (this.h.y.g) GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*     */     
/* 236 */     GL11.glPushMatrix();
/* 237 */     e(paramFloat);
/* 238 */     if (this.h.y.f) f(paramFloat);
/*     */     
/* 240 */     if (!this.h.y.w) {
/* 241 */       this.a.a(paramFloat);
/*     */     }
/* 243 */     GL11.glPopMatrix();
/* 244 */     if (!this.h.y.w) {
/* 245 */       this.a.b(paramFloat);
/* 246 */       e(paramFloat);
/*     */     } 
/* 248 */     if (this.h.y.f) f(paramFloat); 
/*     */   }
/*     */   public void b(float paramFloat) { if (!Display.isActive()) { if (System.currentTimeMillis() - this.l > 500L) this.h.g();  } else { this.l = System.currentTimeMillis(); }  if (this.h.I) { this.h.B.c(); int n = this.h.B.a; int i1 = this.h.B.b; byte b = 1; if (this.h.y.c) b = -1;  this.h.g.d(n, (i1 * b)); }  if (this.h.v) return;  ip ip = new ip(this.h.c, this.h.d); int i = ip.a(); int j = ip.b(); int k = Mouse.getX() * i / this.h.c; int m = j - Mouse.getY() * j / this.h.d - 1; if (this.h.e != null) { c(paramFloat); this.h.u.a(paramFloat, (this.h.p != null), k, m); } else { GL11.glViewport(0, 0, this.h.c, this.h.d); GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F); GL11.glClear(16640); GL11.glMatrixMode(5889); GL11.glLoadIdentity(); GL11.glMatrixMode(5888); GL11.glLoadIdentity(); b(); }  if (this.h.p != null) { GL11.glClear(256); this.h.p.a(k, m, paramFloat); }  } public void c(float paramFloat) { a(paramFloat); be be = this.h.g; e e = this.h.f; bm bm = this.h.h; double d1 = be.aF + (be.ah - be.aF) * paramFloat; double d2 = be.aG + (be.ai - be.aG) * paramFloat; double d3 = be.aH + (be.aj - be.aH) * paramFloat; for (byte b = 0; b < 2; b++) { if (this.h.y.g) if (b == 0) { GL11.glColorMask(false, true, true, false); } else { GL11.glColorMask(true, false, false, false); }   GL11.glViewport(0, 0, this.h.c, this.h.d); j(paramFloat); GL11.glClear(16640); GL11.glEnable(2884); a(paramFloat, b); k.a(); if (this.h.y.e < 2) { a(-1); e.a(paramFloat); }  GL11.glEnable(2912); a(1); ka ka = new ka(); ka.a(d1, d2, d3); this.h.f.a(ka, paramFloat); this.h.f.a(be, false); a(0); GL11.glEnable(2912); GL11.glBindTexture(3553, this.h.n.a("/terrain.png")); j.a(); e.a(be, 0, paramFloat); j.b(); e.a(be.e(paramFloat), ka, paramFloat); bm.b(be, paramFloat); j.a(); a(0); bm.a(be, paramFloat); if (this.h.x != null && be.a(fs.f)) { GL11.glDisable(3008); e.a(be, this.h.x, 0, be.b.e(), paramFloat); e.b(be, this.h.x, 0, be.b.e(), paramFloat); GL11.glEnable(3008); }  GL11.glBlendFunc(770, 771); a(0); GL11.glEnable(3042); GL11.glDisable(2884); GL11.glBindTexture(3553, this.h.n.a("/terrain.png")); if (this.h.y.i) { GL11.glColorMask(false, false, false, false); int i = e.a(be, 1, paramFloat); GL11.glColorMask(true, true, true, true); if (this.h.y.g) if (b == 0) { GL11.glColorMask(false, true, true, false); } else { GL11.glColorMask(true, false, false, false); }   if (i > 0) e.a(1, paramFloat);  } else { e.a(be, 1, paramFloat); }  GL11.glDepthMask(true); GL11.glEnable(2884); GL11.glDisable(3042); if (this.h.x != null && !be.a(fs.f)) { GL11.glDisable(3008); e.a(be, this.h.x, 0, be.b.e(), paramFloat); e.b(be, this.h.x, 0, be.b.e(), paramFloat); GL11.glEnable(3008); }  GL11.glDisable(2912); if (this.h.e.c) h(paramFloat);  if (this.h.J) i(paramFloat);  if (this.k != null); a(0); GL11.glEnable(2912); e.b(paramFloat); GL11.glDisable(2912); a(1); GL11.glClear(256); b(paramFloat, b); if (!this.h.y.g)
/* 251 */         return;  }  GL11.glColorMask(true, true, true, false); } public ig(Minecraft paramMinecraft) { this.l = System.currentTimeMillis();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 428 */     this.m = new Random();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 590 */     this.b = 0;
/* 591 */     this.c = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 608 */     this.d = da.d(16); this.h = paramMinecraft; this.a = new iy(paramMinecraft); }
/*     */   private void c() { if (!this.h.y.i)
/*     */       return;  be be = this.h.g; cj cj = this.h.e; int i = ei.b(be.ah); int j = ei.b(be.ai); int k = ei.b(be.aj); byte b1 = 16; for (byte b2 = 0; b2 < ''; b2++) { int m = i + this.m.nextInt(b1) - this.m.nextInt(b1); int n = k + this.m.nextInt(b1) - this.m.nextInt(b1); int i1 = cj.e(m, n); int i2 = cj.a(m, i1 - 1, n); if (i1 <= j + b1 && i1 >= j - b1) {
/*     */         float f1 = this.m.nextFloat(); float f2 = this.m.nextFloat(); if (i2 > 0)
/*     */           this.h.h.a(new ms(cj, (m + f1), (i1 + 0.1F) - (ln.n[i2]).be, (n + f2))); 
/*     */       }  }
/* 614 */      } private void j(float paramFloat) { cj cj = this.h.e;
/* 615 */     be be = this.h.g;
/*     */     
/* 617 */     float f1 = 1.0F / (4 - this.h.y.e);
/* 618 */     f1 = 1.0F - (float)Math.pow(f1, 0.25D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 625 */     ah ah1 = cj.b(paramFloat);
/* 626 */     float f2 = (float)ah1.a;
/* 627 */     float f3 = (float)ah1.b;
/* 628 */     float f4 = (float)ah1.c;
/*     */     
/* 630 */     ah ah2 = cj.e(paramFloat);
/* 631 */     this.e = (float)ah2.a;
/* 632 */     this.f = (float)ah2.b;
/* 633 */     this.g = (float)ah2.c;
/*     */     
/* 635 */     this.e += (f2 - this.e) * f1;
/* 636 */     this.f += (f3 - this.f) * f1;
/* 637 */     this.g += (f4 - this.g) * f1;
/*     */     
/* 639 */     if (be.a(fs.f)) {
/* 640 */       this.e = 0.02F;
/* 641 */       this.f = 0.02F;
/* 642 */       this.g = 0.2F;
/* 643 */     } else if (be.a(fs.g)) {
/* 644 */       this.e = 0.6F;
/* 645 */       this.f = 0.1F;
/* 646 */       this.g = 0.0F;
/*     */     } 
/*     */     
/* 649 */     float f5 = this.n + (this.o - this.n) * paramFloat;
/* 650 */     this.e *= f5;
/* 651 */     this.f *= f5;
/* 652 */     this.g *= f5;
/*     */     
/* 654 */     if (this.h.y.g) {
/* 655 */       float f6 = (this.e * 30.0F + this.f * 59.0F + this.g * 11.0F) / 100.0F;
/* 656 */       float f7 = (this.e * 30.0F + this.f * 70.0F) / 100.0F;
/* 657 */       float f8 = (this.e * 30.0F + this.g * 70.0F) / 100.0F;
/*     */       
/* 659 */       this.e = f6;
/* 660 */       this.f = f7;
/* 661 */       this.g = f8;
/*     */     } 
/*     */     
/* 664 */     GL11.glClearColor(this.e, this.f, this.g, 0.0F); } private void h(float paramFloat) { be be = this.h.g; cj cj = this.h.e; int i = ei.b(be.ah); int j = ei.b(be.ai); int k = ei.b(be.aj); he he = he.a; GL11.glDisable(2884); GL11.glNormal3f(0.0F, 1.0F, 0.0F); GL11.glEnable(3042); GL11.glBlendFunc(770, 771); GL11.glBindTexture(3553, this.h.n.a("/snow.png")); double d1 = be.aF + (be.ah - be.aF) * paramFloat; double d2 = be.aG + (be.ai - be.aG) * paramFloat; double d3 = be.aH + (be.aj - be.aH) * paramFloat; byte b = 5; if (this.h.y.i) b = 10;  for (int m = i - b; m <= i + b; m++) { for (int n = k - b; n <= k + b; n++) { int i1 = cj.d(m, n); if (i1 < 0) i1 = 0;  int i2 = j - b; int i3 = j + b; if (i2 < i1) i2 = i1;  if (i3 < i1) i3 = i1;  float f = 2.0F; if (i2 != i3) { this.m.setSeed((m * m * 3121 + m * 45238971 + n * n * 418711 + n * 13761)); float f1 = this.j + paramFloat; float f2 = ((this.j & 0x1FF) + paramFloat) / 512.0F; float f3 = this.m.nextFloat() + f1 * 0.01F * (float)this.m.nextGaussian(); float f4 = this.m.nextFloat() + f1 * (float)this.m.nextGaussian() * 0.001F; double d4 = (m + 0.5F) - be.ah; double d5 = (n + 0.5F) - be.aj; float f5 = ei.a(d4 * d4 + d5 * d5) / b; he.b(); float f6 = cj.c(m, 128, n); GL11.glColor4f(f6, f6, f6, (1.0F - f5 * f5) * 0.7F); he.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D); he.a((m + 0), i2, (n + 0), (0.0F * f + f3), (i2 * f / 8.0F + f2 * f + f4)); he.a((m + 1), i2, (n + 1), (1.0F * f + f3), (i2 * f / 8.0F + f2 * f + f4)); he.a((m + 1), i3, (n + 1), (1.0F * f + f3), (i3 * f / 8.0F + f2 * f + f4)); he.a((m + 0), i3, (n + 0), (0.0F * f + f3), (i3 * f / 8.0F + f2 * f + f4)); he.a((m + 0), i2, (n + 1), (0.0F * f + f3), (i2 * f / 8.0F + f2 * f + f4)); he.a((m + 1), i2, (n + 0), (1.0F * f + f3), (i2 * f / 8.0F + f2 * f + f4)); he.a((m + 1), i3, (n + 0), (1.0F * f + f3), (i3 * f / 8.0F + f2 * f + f4)); he.a((m + 0), i3, (n + 1), (0.0F * f + f3), (i3 * f / 8.0F + f2 * f + f4)); he.b(0.0D, 0.0D, 0.0D); he.a(); }  }  }  GL11.glEnable(2884); GL11.glDisable(3042); }
/*     */   private void i(float paramFloat) { be be = this.h.g; cj cj = this.h.e; int i = ei.b(be.ah); int j = ei.b(be.ai); int k = ei.b(be.aj); he he = he.a; GL11.glDisable(2884); GL11.glNormal3f(0.0F, 1.0F, 0.0F); GL11.glEnable(3042); GL11.glBlendFunc(770, 771); GL11.glBindTexture(3553, this.h.n.a("/rain.png")); double d1 = be.aF + (be.ah - be.aF) * paramFloat; double d2 = be.aG + (be.ai - be.aG) * paramFloat; double d3 = be.aH + (be.aj - be.aH) * paramFloat; byte b = 5; if (this.h.y.i)
/*     */       b = 10;  for (int m = i - b; m <= i + b; m++) { for (int n = k - b; n <= k + b; n++) { int i1 = cj.e(m, n); int i2 = j - b; int i3 = j + b; if (i2 < i1)
/*     */           i2 = i1;  if (i3 < i1)
/*     */           i3 = i1;  float f = 2.0F; if (i2 != i3) { float f1 = ((this.j + m * m * 3121 + m * 45238971 + n * n * 418711 + n * 13761 & 0x1F) + paramFloat) / 32.0F; double d4 = (m + 0.5F) - be.ah; double d5 = (n + 0.5F) - be.aj; float f2 = ei.a(d4 * d4 + d5 * d5) / b; he.b(); float f3 = cj.c(m, 128, n); GL11.glColor4f(f3, f3, f3, (1.0F - f2 * f2) * 0.7F); he.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D); he.a((m + 0), i2, (n + 0), (0.0F * f), (i2 * f / 8.0F + f1 * f)); he.a((m + 1), i2, (n + 1), (1.0F * f), (i2 * f / 8.0F + f1 * f)); he.a((m + 1), i3, (n + 1), (1.0F * f), (i3 * f / 8.0F + f1 * f)); he.a((m + 0), i3, (n + 0), (0.0F * f), (i3 * f / 8.0F + f1 * f)); he.a((m + 0), i2, (n + 1), (0.0F * f), (i2 * f / 8.0F + f1 * f)); he.a((m + 1), i2, (n + 0), (1.0F * f), (i2 * f / 8.0F + f1 * f)); he.a((m + 1), i3, (n + 0), (1.0F * f), (i3 * f / 8.0F + f1 * f)); he.a((m + 0), i3, (n + 1), (0.0F * f), (i3 * f / 8.0F + f1 * f)); he.b(0.0D, 0.0D, 0.0D); he.a(); }  }  }  GL11.glEnable(2884); GL11.glDisable(3042); }
/*     */   public void b() { ip ip = new ip(this.h.c, this.h.d); int i = ip.a(); int j = ip.b(); GL11.glClear(256); GL11.glMatrixMode(5889); GL11.glLoadIdentity(); GL11.glOrtho(0.0D, i, j, 0.0D, 1000.0D, 3000.0D); GL11.glMatrixMode(5888); GL11.glLoadIdentity(); GL11.glTranslatef(0.0F, 0.0F, -2000.0F); }
/* 670 */   private void a(int paramInt) { be be = this.h.g;
/*     */     
/* 672 */     GL11.glFog(2918, a(this.e, this.f, this.g, 1.0F));
/* 673 */     GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 674 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */ 
/*     */     
/* 677 */     if (be.a(fs.f)) {
/* 678 */       GL11.glFogi(2917, 2048);
/* 679 */       GL11.glFogf(2914, 0.1F);
/*     */       
/* 681 */       float f1 = 0.4F;
/* 682 */       float f2 = 0.4F;
/* 683 */       float f3 = 0.9F;
/*     */       
/* 685 */       if (this.h.y.g) {
/* 686 */         float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 687 */         float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 688 */         float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*     */         
/* 690 */         f1 = f4;
/* 691 */         f2 = f5;
/* 692 */         f3 = f6;
/*     */       } 
/* 694 */     } else if (be.a(fs.g)) {
/* 695 */       GL11.glFogi(2917, 2048);
/* 696 */       GL11.glFogf(2914, 2.0F);
/* 697 */       float f1 = 0.4F;
/* 698 */       float f2 = 0.3F;
/* 699 */       float f3 = 0.3F;
/*     */       
/* 701 */       if (this.h.y.g) {
/* 702 */         float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 703 */         float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 704 */         float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*     */         
/* 706 */         f1 = f4;
/* 707 */         f2 = f5;
/* 708 */         f3 = f6;
/*     */       } 
/*     */     } else {
/* 711 */       GL11.glFogi(2917, 9729);
/* 712 */       GL11.glFogf(2915, this.i * 0.25F);
/* 713 */       GL11.glFogf(2916, this.i);
/* 714 */       if (paramInt < 0) {
/* 715 */         GL11.glFogf(2915, 0.0F);
/* 716 */         GL11.glFogf(2916, this.i * 0.8F);
/*     */       } 
/* 718 */       if ((GLContext.getCapabilities()).GL_NV_fog_distance) {
/* 719 */         GL11.glFogi(34138, 34139);
/*     */       }
/*     */     } 
/*     */     
/* 723 */     GL11.glEnable(2903);
/* 724 */     GL11.glColorMaterial(1028, 4608); }
/*     */ 
/*     */   
/*     */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 728 */     this.d.clear();
/* 729 */     this.d.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 730 */     this.d.flip();
/* 731 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\ig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */