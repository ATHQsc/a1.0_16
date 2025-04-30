/*     */ import java.io.File;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gj
/*     */   extends cj
/*     */ {
/*  29 */   private LinkedList v = new LinkedList(); private go w; private lp x;
/*     */   private ez y;
/*     */   private Set z;
/*     */   private Set A;
/*     */   
/*  34 */   public gj(go paramgo) { super("MpServer");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     this.y = new ez();
/* 107 */     this.z = new HashSet();
/* 108 */     this.A = new HashSet(); this.w = paramgo; this.m = 8; this.n = 64; this.o = 8; }
/*     */   public void g() { byte b; for (b = 0; b < 10 && !this.A.isEmpty(); b++) { jx jx = this.A.iterator().next(); a(jx); }  this.w.a(); for (b = 0; b < this.v.size(); b++) { kr kr = this.v.get(b); if (--kr.d == 0) { super.a(kr.a, kr.b, kr.c, kr.e, kr.f); h(kr.a, kr.b, kr.c); this.v.remove(b--); }  }  }
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { for (byte b = 0; b < this.v.size(); b++) { kr kr = this.v.get(b); if (kr.a >= paramInt1 && kr.b >= paramInt2 && kr.c >= paramInt3 && kr.a <= paramInt4 && kr.b <= paramInt5 && kr.c <= paramInt6) this.v.remove(b--);  }  }
/* 111 */   protected as a(File paramFile) { this.x = new lp(this); return this.x; } public void a() { this.m = 8; this.n = 64; this.o = 8; } public boolean a(jx paramjx) { boolean bool = super.a(paramjx);
/* 112 */     if (paramjx instanceof be) {
/* 113 */       this.z.add(paramjx);
/*     */     }
/* 115 */     return bool; }
/*     */   protected void h() {}
/*     */   public void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {} public boolean a(boolean paramBoolean) { return false; } public void a(int paramInt1, int paramInt2, boolean paramBoolean) { if (paramBoolean) { this.x.d(paramInt1, paramInt2); } else { this.x.c(paramInt1, paramInt2); }
/*     */      if (!paramBoolean)
/* 119 */       b(paramInt1 * 16, 0, paramInt2 * 16, paramInt1 * 16 + 15, 128, paramInt2 * 16 + 15);  } public void d(jx paramjx) { super.d(paramjx);
/* 120 */     if (paramjx instanceof be) {
/* 121 */       this.z.remove(paramjx);
/*     */     } }
/*     */ 
/*     */   
/*     */   protected void b(jx paramjx) {
/* 126 */     super.b(paramjx);
/* 127 */     if (this.A.contains(paramjx)) {
/* 128 */       this.A.remove(paramjx);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(jx paramjx) {
/* 133 */     super.c(paramjx);
/* 134 */     if (this.z.contains(paramjx)) {
/* 135 */       this.A.add(paramjx);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt, jx paramjx) {
/* 140 */     this.z.add(paramjx);
/* 141 */     if (!a(paramjx)) {
/* 142 */       this.A.add(paramjx);
/*     */     }
/* 144 */     this.y.a(paramInt, paramjx);
/*     */   }
/*     */   
/*     */   public jx b(int paramInt) {
/* 148 */     return (jx)this.y.a(paramInt);
/*     */   }
/*     */   
/*     */   public jx c(int paramInt) {
/* 152 */     jx jx = (jx)this.y.b(paramInt);
/* 153 */     if (jx != null) {
/* 154 */       this.z.remove(jx);
/* 155 */       d(jx);
/*     */     } 
/* 157 */     return jx;
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 161 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 162 */     int j = e(paramInt1, paramInt2, paramInt3);
/* 163 */     if (super.c(paramInt1, paramInt2, paramInt3, paramInt4)) {
/* 164 */       this.v.add(new kr(this, paramInt1, paramInt2, paramInt3, i, j));
/* 165 */       return true;
/*     */     } 
/* 167 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 171 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 172 */     int j = e(paramInt1, paramInt2, paramInt3);
/* 173 */     if (super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
/* 174 */       this.v.add(new kr(this, paramInt1, paramInt2, paramInt3, i, j));
/* 175 */       return true;
/*     */     } 
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 181 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 182 */     int j = e(paramInt1, paramInt2, paramInt3);
/* 183 */     if (super.a(paramInt1, paramInt2, paramInt3, paramInt4)) {
/* 184 */       this.v.add(new kr(this, paramInt1, paramInt2, paramInt3, i, j));
/* 185 */       return true;
/*     */     } 
/* 187 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 191 */     c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/* 192 */     if (super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
/*     */ 
/*     */       
/* 195 */       e(paramInt1, paramInt2, paramInt3, paramInt4);
/* 196 */       return true;
/*     */     } 
/* 198 */     return false;
/*     */   }
/*     */   
/*     */   public void k() {
/* 202 */     this.w.a(new nt("Quitting"));
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\gj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */