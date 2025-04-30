/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class js
/*    */ {
/*    */   public double a;
/*    */   public double b;
/*    */   public double c;
/*    */   
/*    */   public js(ct paramct, int paramInt1, int paramInt2) {
/* 24 */     this.a = this.b = (10 + paramInt2) + ct.j().nextDouble() * 32.0D + paramInt1;
/*    */   }
/*    */   
/*    */   public void a() {
/* 28 */     this.b = this.a;
/* 29 */     if (this.a > 0.0D) {
/* 30 */       this.c -= 0.6D;
/*    */     }
/* 32 */     this.a += this.c;
/* 33 */     this.c *= 0.9D;
/* 34 */     if (this.a < 0.0D) {
/* 35 */       this.a = 0.0D;
/* 36 */       this.c = 0.0D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\js.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */