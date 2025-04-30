/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fu
/*    */   extends li
/*    */ {
/* 13 */   private boolean[] e = new boolean[10];
/*    */   private fi f;
/*    */   
/*    */   public fu(fi paramfi) {
/* 17 */     this.f = paramfi;
/*    */   }
/*    */   
/*    */   public void a(int paramInt, boolean paramBoolean) {
/* 21 */     byte b = -1;
/* 22 */     if (paramInt == this.f.j.b) b = 0; 
/* 23 */     if (paramInt == this.f.l.b) b = 1; 
/* 24 */     if (paramInt == this.f.k.b) b = 2; 
/* 25 */     if (paramInt == this.f.m.b) b = 3; 
/* 26 */     if (paramInt == this.f.n.b) b = 4; 
/* 27 */     if (b >= 0) {
/* 28 */       this.e[b] = paramBoolean;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a() {
/* 33 */     for (byte b = 0; b < 10; b++) {
/* 34 */       this.e[b] = false;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(dg paramdg) {
/* 39 */     this.a = 0.0F;
/* 40 */     this.b = 0.0F;
/* 41 */     if (this.e[0]) this.b++; 
/* 42 */     if (this.e[1]) this.b--; 
/* 43 */     if (this.e[2]) this.a++; 
/* 44 */     if (this.e[3]) this.a--; 
/* 45 */     this.d = this.e[4];
/*    */   }
/*    */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\fu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */