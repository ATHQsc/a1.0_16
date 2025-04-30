/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bs
/*     */   extends ai
/*     */ {
/*  15 */   private Random d = new Random();
/*     */   
/*     */   public void a(it paramit, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  18 */     this.d.setSeed(187L);
/*     */     
/*  20 */     GL11.glPushMatrix();
/*  21 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*  22 */     GL11.glRotatef(paramFloat1, 0.0F, 1.0F, 0.0F);
/*  23 */     GL11.glEnable(32826);
/*  24 */     a("/art/kz.png");
/*     */     
/*  26 */     el el = paramit.b;
/*     */     
/*  28 */     float f = 0.0625F;
/*  29 */     GL11.glScalef(f, f, f);
/*  30 */     a(paramit, el.u, el.v, el.w, el.x);
/*  31 */     GL11.glDisable(32826);
/*  32 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   private void a(it paramit, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  36 */     float f1 = -paramInt1 / 2.0F;
/*  37 */     float f2 = -paramInt2 / 2.0F;
/*     */     
/*  39 */     float f3 = -0.5F;
/*  40 */     float f4 = 0.5F;
/*     */     
/*  42 */     for (byte b = 0; b < paramInt1 / 16; b++) {
/*  43 */       for (byte b1 = 0; b1 < paramInt2 / 16; b1++) {
/*  44 */         float f5 = f1 + ((b + 1) * 16);
/*  45 */         float f6 = f1 + (b * 16);
/*  46 */         float f7 = f2 + ((b1 + 1) * 16);
/*  47 */         float f8 = f2 + (b1 * 16);
/*     */         
/*  49 */         a(paramit, (f5 + f6) / 2.0F, (f7 + f8) / 2.0F);
/*     */         
/*  51 */         float f9 = (paramInt3 + paramInt1 - b * 16) / 256.0F;
/*  52 */         float f10 = (paramInt3 + paramInt1 - (b + 1) * 16) / 256.0F;
/*  53 */         float f11 = (paramInt4 + paramInt2 - b1 * 16) / 256.0F;
/*  54 */         float f12 = (paramInt4 + paramInt2 - (b1 + 1) * 16) / 256.0F;
/*     */         
/*  56 */         float f13 = 0.75F;
/*  57 */         float f14 = 0.8125F;
/*  58 */         float f15 = 0.0F;
/*  59 */         float f16 = 0.0625F;
/*     */         
/*  61 */         float f17 = 0.75F;
/*  62 */         float f18 = 0.8125F;
/*  63 */         float f19 = 0.001953125F;
/*  64 */         float f20 = 0.001953125F;
/*     */         
/*  66 */         float f21 = 0.7519531F;
/*  67 */         float f22 = 0.7519531F;
/*  68 */         float f23 = 0.0F;
/*  69 */         float f24 = 0.0625F;
/*     */         
/*  71 */         he he = he.a;
/*  72 */         he.b();
/*  73 */         he.b(0.0F, 0.0F, -1.0F);
/*  74 */         he.a(f5, f8, f3, f10, f11);
/*  75 */         he.a(f6, f8, f3, f9, f11);
/*  76 */         he.a(f6, f7, f3, f9, f12);
/*  77 */         he.a(f5, f7, f3, f10, f12);
/*     */         
/*  79 */         he.b(0.0F, 0.0F, 1.0F);
/*  80 */         he.a(f5, f7, f4, f13, f15);
/*  81 */         he.a(f6, f7, f4, f14, f15);
/*  82 */         he.a(f6, f8, f4, f14, f16);
/*  83 */         he.a(f5, f8, f4, f13, f16);
/*     */         
/*  85 */         he.b(0.0F, -1.0F, 0.0F);
/*  86 */         he.a(f5, f7, f3, f17, f19);
/*  87 */         he.a(f6, f7, f3, f18, f19);
/*  88 */         he.a(f6, f7, f4, f18, f20);
/*  89 */         he.a(f5, f7, f4, f17, f20);
/*     */         
/*  91 */         he.b(0.0F, 1.0F, 0.0F);
/*  92 */         he.a(f5, f8, f4, f17, f19);
/*  93 */         he.a(f6, f8, f4, f18, f19);
/*  94 */         he.a(f6, f8, f3, f18, f20);
/*  95 */         he.a(f5, f8, f3, f17, f20);
/*     */         
/*  97 */         he.b(-1.0F, 0.0F, 0.0F);
/*  98 */         he.a(f5, f7, f4, f22, f23);
/*  99 */         he.a(f5, f8, f4, f22, f24);
/* 100 */         he.a(f5, f8, f3, f21, f24);
/* 101 */         he.a(f5, f7, f3, f21, f23);
/*     */         
/* 103 */         he.b(1.0F, 0.0F, 0.0F);
/* 104 */         he.a(f6, f7, f3, f22, f23);
/* 105 */         he.a(f6, f8, f3, f22, f24);
/* 106 */         he.a(f6, f8, f4, f21, f24);
/* 107 */         he.a(f6, f7, f4, f21, f23);
/* 108 */         he.a();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private void a(it paramit, float paramFloat1, float paramFloat2) {
/* 113 */     int i = ei.b(paramit.ah);
/* 114 */     int j = ei.b(paramit.ai + (paramFloat2 / 16.0F));
/* 115 */     int k = ei.b(paramit.aj);
/* 116 */     if (paramit.a == 0) i = ei.b(paramit.ah + (paramFloat1 / 16.0F)); 
/* 117 */     if (paramit.a == 1) k = ei.b(paramit.aj - (paramFloat1 / 16.0F)); 
/* 118 */     if (paramit.a == 2) i = ei.b(paramit.ah - (paramFloat1 / 16.0F)); 
/* 119 */     if (paramit.a == 3) k = ei.b(paramit.aj + (paramFloat1 / 16.0F)); 
/* 120 */     float f = this.a.g.c(i, j, k);
/* 121 */     GL11.glColor3f(f, f, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\bs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */