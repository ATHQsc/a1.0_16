/*     */ import java.awt.Toolkit;
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bd
/*     */   extends lb
/*     */ {
/*     */   protected Minecraft b;
/*     */   public int c;
/*     */   public int d;
/*  21 */   protected List e = new ArrayList();
/*     */   
/*     */   public boolean f = false;
/*     */   protected jt g;
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/*  27 */     for (byte b = 0; b < this.e.size(); b++) {
/*  28 */       fb fb = this.e.get(b);
/*  29 */       fb.a(this.b, paramInt1, paramInt2);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {
/*  34 */     if (paramInt == 1) {
/*  35 */       this.b.a(null);
/*  36 */       this.b.e();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String c() {
/*     */     try {
/*  42 */       Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
/*  43 */       if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
/*  44 */         return (String)transferable.getTransferData(DataFlavor.stringFlavor);
/*     */       }
/*     */     }
/*  47 */     catch (Exception exception) {}
/*     */     
/*  49 */     return null;
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
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/*  61 */     if (paramInt3 == 0) {
/*  62 */       for (byte b = 0; b < this.e.size(); b++) {
/*  63 */         fb fb = this.e.get(b);
/*  64 */         if (fb.a(paramInt1, paramInt2)) {
/*  65 */           this.b.A.a("random.click", 1.0F, 1.0F);
/*  66 */           a(fb);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */   
/*     */   protected void a(fb paramfb) {}
/*     */   
/*     */   public void a(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
/*  79 */     this.b = paramMinecraft;
/*  80 */     this.g = paramMinecraft.o;
/*  81 */     this.c = paramInt1;
/*  82 */     this.d = paramInt2;
/*  83 */     a();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/*  95 */     while (Mouse.next()) {
/*  96 */       e();
/*     */     }
/*     */     
/*  99 */     while (Keyboard.next()) {
/* 100 */       f();
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 105 */     if (Mouse.getEventButtonState()) {
/* 106 */       int i = Mouse.getEventX() * this.c / this.b.c;
/* 107 */       int j = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
/* 108 */       a(i, j, Mouse.getEventButton());
/*     */     } else {
/* 110 */       int i = Mouse.getEventX() * this.c / this.b.c;
/* 111 */       int j = this.d - Mouse.getEventY() * this.d / this.b.d - 1;
/* 112 */       b(i, j, Mouse.getEventButton());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() {
/* 117 */     if (Keyboard.getEventKeyState()) {
/* 118 */       if (Keyboard.getEventKey() == 87) {
/* 119 */         this.b.h();
/*     */         return;
/*     */       } 
/* 122 */       a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {}
/*     */ 
/*     */   
/*     */   public void h() {}
/*     */   
/*     */   public void i() {
/* 133 */     a(0);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 137 */     if (this.b.e != null) {
/* 138 */       a(0, 0, this.c, this.d, -1072689136, -804253680);
/*     */     } else {
/* 140 */       b(paramInt);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 145 */     GL11.glDisable(2896);
/* 146 */     GL11.glDisable(2912);
/* 147 */     he he = he.a;
/* 148 */     GL11.glBindTexture(3553, this.b.n.a("/dirt.png"));
/* 149 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 150 */     float f = 32.0F;
/* 151 */     he.b();
/* 152 */     he.b(4210752);
/* 153 */     he.a(0.0D, this.d, 0.0D, 0.0D, (this.d / f + paramInt));
/* 154 */     he.a(this.c, this.d, 0.0D, (this.c / f), (this.d / f + paramInt));
/* 155 */     he.a(this.c, 0.0D, 0.0D, (this.c / f), (0 + paramInt));
/* 156 */     he.a(0.0D, 0.0D, 0.0D, 0.0D, (0 + paramInt));
/* 157 */     he.a();
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 161 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt) {}
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\bd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */