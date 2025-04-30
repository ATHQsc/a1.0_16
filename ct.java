/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.util.glu.GLU;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ct
/*     */   extends bd
/*     */ {
/*  17 */   private static final Random h = new Random();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   String[] a = new String[] { " *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * " };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private js[][] i;
/*     */ 
/*     */ 
/*     */   
/*  50 */   private float k = 0.0F;
/*     */ 
/*     */   
/*     */   private String l;
/*     */ 
/*     */   
/*     */   public ct() {
/*  57 */     this.l = "missingno";
/*     */     try {
/*  59 */       ArrayList<String> arrayList = new ArrayList();
/*  60 */       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ct.class.getResourceAsStream("/title/splashes.txt")));
/*  61 */       String str = "";
/*  62 */       while ((str = bufferedReader.readLine()) != null) {
/*  63 */         str = str.trim();
/*  64 */         if (str.length() > 0) {
/*  65 */           arrayList.add(str);
/*     */         }
/*     */       } 
/*  68 */       this.l = arrayList.get(h.nextInt(arrayList.size()));
/*  69 */     } catch (Exception exception) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/*  74 */     this.k++;
/*  75 */     if (this.i != null) {
/*  76 */       for (byte b = 0; b < this.i.length; b++) {
/*  77 */         for (byte b1 = 0; b1 < (this.i[b]).length; b1++) {
/*  78 */           this.i[b][b1].a();
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {}
/*     */ 
/*     */   
/*     */   public void a() {
/*  89 */     Calendar calendar = Calendar.getInstance();
/*  90 */     calendar.setTime(new Date());
/*     */     
/*  92 */     if (this.b.i.b.equals("athna") && calendar.get(2) + 1 == 7 && calendar.get(5) == 26 && calendar.get(1) == 2010) {
/*  93 */       this.l = "Happy birthday! I love you! Alex x";
/*  94 */     } else if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
/*  95 */       this.l = "Happy birthday, ez!";
/*  96 */     } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
/*  97 */       this.l = "Happy birthday, Notch!";
/*  98 */     } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
/*  99 */       this.l = "Merry X-mas!";
/* 100 */     } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
/* 101 */       this.l = "Happy new year!";
/*     */     } 
/*     */     
/* 104 */     this.e.clear();
/* 105 */     this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 48, "Singleplayer"));
/* 106 */     this.e.add(new fb(2, this.c / 2 - 100, this.d / 4 + 72, "Multiplayer"));
/* 107 */     this.e.add(new fb(3, this.c / 2 - 100, this.d / 4 + 96, "Play tutorial level"));
/* 108 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Options..."));
/*     */     
/* 110 */     ((fb)this.e.get(2)).e = false;
/* 111 */     if (this.b.i == null) {
/* 112 */       ((fb)this.e.get(1)).e = false;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(fb paramfb) {
/* 117 */     if (paramfb.d == 0) {
/* 118 */       this.b.a(new au(this, this.b.y));
/*     */     }
/* 120 */     if (paramfb.d == 1) {
/* 121 */       this.b.a(new jg(this));
/*     */     }
/* 123 */     if (paramfb.d == 2) {
/* 124 */       this.b.a(new ft(this));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 134 */     i();
/* 135 */     he he = he.a;
/*     */ 
/*     */ 
/*     */     
/* 139 */     a(paramFloat);
/* 140 */     GL11.glBindTexture(3553, this.b.n.a("/gui/logo.png"));
/* 141 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 142 */     he.b(16777215);
/* 143 */     GL11.glPushMatrix();
/* 144 */     GL11.glTranslatef((this.c / 2 + 90), 70.0F, 0.0F);
/* 145 */     GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 146 */     float f = 1.8F - ei.e(ei.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
/*     */     
/* 148 */     f = f * 100.0F / (this.g.a(this.l) + 32);
/* 149 */     GL11.glScalef(f, f, f);
/* 150 */     a(this.g, this.l, 0, -8, 16776960);
/* 151 */     GL11.glPopMatrix();
/*     */ 
/*     */ 
/*     */     
/* 155 */     String str = "Copyright Mojang Specifications. Do not distribute.";
/* 156 */     b(this.g, str, this.c - this.g.a(str) - 2, this.d - 10, 16777215);
/*     */     
/* 158 */     long l1 = Runtime.getRuntime().maxMemory();
/* 159 */     long l2 = Runtime.getRuntime().totalMemory();
/* 160 */     long l3 = Runtime.getRuntime().freeMemory();
/* 161 */     long l4 = l1 - l3;
/* 162 */     str = "Free memory: " + (l4 * 100L / l1) + "% of " + (l1 / 1024L / 1024L) + "MB";
/* 163 */     b(this.g, str, this.c - this.g.a(str) - 2, 2, 8421504);
/* 164 */     str = "Allocated memory: " + (l2 * 100L / l1) + "% (" + (l2 / 1024L / 1024L) + "MB)";
/* 165 */     b(this.g, str, this.c - this.g.a(str) - 2, 12, 8421504);
/*     */     
/* 167 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat) {
/* 171 */     if (this.i == null) {
/* 172 */       this.i = new js[this.a[0].length()][this.a.length];
/* 173 */       for (byte b1 = 0; b1 < this.i.length; b1++) {
/* 174 */         for (byte b2 = 0; b2 < (this.i[b1]).length; b2++) {
/* 175 */           this.i[b1][b2] = new js(this, b1, b2);
/*     */         }
/*     */       } 
/*     */     } 
/* 179 */     GL11.glMatrixMode(5889);
/* 180 */     GL11.glPushMatrix();
/* 181 */     GL11.glLoadIdentity();
/*     */ 
/*     */     
/* 184 */     ip ip = new ip(this.b.c, this.b.d);
/*     */     
/* 186 */     int i = 120 * ip.a;
/* 187 */     GLU.gluPerspective(70.0F, this.b.c / i, 0.05F, 100.0F);
/*     */ 
/*     */     
/* 190 */     GL11.glViewport(0, this.b.d - i, this.b.c, i);
/* 191 */     GL11.glMatrixMode(5888);
/* 192 */     GL11.glPushMatrix();
/* 193 */     GL11.glLoadIdentity();
/* 194 */     GL11.glDisable(2884);
/* 195 */     GL11.glCullFace(1029);
/* 196 */     GL11.glDepthMask(true);
/*     */     
/* 198 */     for (byte b = 0; b < 3; b++) {
/*     */       
/* 200 */       GL11.glPushMatrix();
/* 201 */       GL11.glTranslatef(0.4F, 0.6F, -12.0F);
/* 202 */       if (b == 0) {
/* 203 */         GL11.glClear(256);
/* 204 */         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
/* 205 */         GL11.glScalef(0.98F, 1.0F, 1.0F);
/* 206 */         GL11.glEnable(3042);
/* 207 */         GL11.glBlendFunc(770, 771);
/*     */       } 
/* 209 */       if (b == 1) {
/* 210 */         GL11.glDisable(3042);
/* 211 */         GL11.glClear(256);
/*     */       } 
/* 213 */       if (b == 2) {
/* 214 */         GL11.glEnable(3042);
/* 215 */         GL11.glBlendFunc(768, 1);
/*     */       } 
/* 217 */       GL11.glScalef(1.0F, -1.0F, 1.0F);
/* 218 */       GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
/* 219 */       GL11.glScalef(0.89F, 1.0F, 0.4F);
/* 220 */       GL11.glTranslatef(-this.a[0].length() * 0.5F, -this.a.length * 0.5F, 0.0F);
/* 221 */       GL11.glBindTexture(3553, this.b.n.a("/terrain.png"));
/* 222 */       if (b == 0) {
/* 223 */         GL11.glBindTexture(3553, this.b.n.a("/title/black.png"));
/*     */       }
/* 225 */       ay ay = new ay();
/* 226 */       for (byte b1 = 0; b1 < this.a.length; b1++) {
/* 227 */         for (byte b2 = 0; b2 < this.a[b1].length(); b2++) {
/* 228 */           char c = this.a[b1].charAt(b2);
/* 229 */           if (c != ' ') {
/* 230 */             GL11.glPushMatrix();
/* 231 */             js js1 = this.i[b2][b1];
/* 232 */             float f1 = (float)(js1.b + (js1.a - js1.b) * paramFloat);
/* 233 */             float f2 = 1.0F;
/* 234 */             float f3 = 1.0F;
/* 235 */             float f4 = 0.0F;
/* 236 */             if (b == 0) {
/* 237 */               f2 = f1 * 0.04F + 1.0F;
/* 238 */               f3 = 1.0F / f2;
/* 239 */               f1 = 0.0F;
/*     */             } 
/* 241 */             GL11.glTranslatef(b2, b1, f1);
/* 242 */             GL11.glScalef(f2, f2, f2);
/* 243 */             GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
/* 244 */             ay.a(ln.t, f3);
/* 245 */             GL11.glPopMatrix();
/*     */           } 
/*     */         } 
/*     */       } 
/* 249 */       GL11.glPopMatrix();
/*     */     } 
/*     */ 
/*     */     
/* 253 */     GL11.glDisable(3042);
/* 254 */     GL11.glMatrixMode(5889);
/* 255 */     GL11.glPopMatrix();
/* 256 */     GL11.glMatrixMode(5888);
/* 257 */     GL11.glPopMatrix();
/* 258 */     GL11.glViewport(0, 0, this.b.c, this.b.d);
/* 259 */     GL11.glEnable(2884);
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\ct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */