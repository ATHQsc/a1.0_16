/*    */ import java.io.File;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jg
/*    */   extends bd
/*    */ {
/*    */   protected bd a;
/* 12 */   protected String h = "Select world";
/*    */   
/*    */   private boolean i = false;
/*    */   
/*    */   public jg(bd parambd) {
/* 17 */     this.a = parambd;
/*    */   }
/*    */   
/*    */   public void a() {
/* 21 */     File file = Minecraft.b();
/*    */     
/* 23 */     for (byte b = 0; b < 5; b++) {
/* 24 */       hc hc = cj.a(file, "World" + (b + 1));
/* 25 */       if (hc == null) {
/* 26 */         this.e.add(new fb(b, this.c / 2 - 100, this.d / 6 + 24 * b, "- empty -"));
/*    */       } else {
/* 28 */         String str = "World " + (b + 1);
/* 29 */         long l = hc.f("SizeOnDisk");
/*    */         
/* 31 */         str = str + " (" + ((float)(l / 1024L * 100L / 1024L) / 100.0F) + " MB)";
/*    */         
/* 33 */         this.e.add(new fb(b, this.c / 2 - 100, this.d / 6 + 24 * b, str));
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     j();
/*    */   }
/*    */   
/*    */   protected String d(int paramInt) {
/* 41 */     File file = Minecraft.b(); return 
/* 42 */       (cj.a(file, "World" + paramInt) != null) ? ("World" + paramInt) : null;
/*    */   }
/*    */   
/*    */   public void j() {
/* 46 */     this.e.add(new fb(5, this.c / 2 - 100, this.d / 6 + 120 + 12, "Delete world..."));
/* 47 */     this.e.add(new fb(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
/*    */   }
/*    */   
/*    */   protected void a(fb paramfb) {
/* 51 */     if (!paramfb.e)
/* 52 */       return;  if (paramfb.d < 5) {
/* 53 */       c(paramfb.d + 1);
/* 54 */     } else if (paramfb.d == 5) {
/* 55 */       this.b.a(new hr(this));
/* 56 */     } else if (paramfb.d == 6) {
/* 57 */       this.b.a(this.a);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 62 */     this.b.a(null);
/* 63 */     if (this.i)
/* 64 */       return;  this.i = true;
/* 65 */     this.b.b("World" + paramInt);
/* 66 */     this.b.a(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 71 */     i();
/*    */     
/* 73 */     a(this.g, this.h, this.c / 2, 20, 16777215);
/*    */     
/* 75 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\jg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */