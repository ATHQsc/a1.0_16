/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ip
/*    */ {
/*    */   private int b;
/*    */   private int c;
/*    */   public int a;
/*    */   
/*    */   public ip(int paramInt1, int paramInt2) {
/* 12 */     this.b = paramInt1;
/* 13 */     this.c = paramInt2;
/* 14 */     this.a = 1;
/*    */     
/* 16 */     while (this.b / (this.a + 1) >= 320 && this.c / (this.a + 1) >= 240)
/*    */     {
/* 18 */       this.a++;
/*    */     }
/* 20 */     this.b /= this.a;
/* 21 */     this.c /= this.a;
/*    */   }
/*    */   
/*    */   public int a() {
/* 25 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 29 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\ip.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */