/*     */ package net.minecraft.client;
/*     */ 
/*     */ import df;
/*     */ import g;
/*     */ import h;
/*     */ import java.applet.Applet;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Canvas;
/*     */ 
/*     */ public class MinecraftApplet extends Applet {
/*     */   private Canvas a;
/*  12 */   private Thread c = null;
/*     */ 
/*     */   
/*     */   private Minecraft b;
/*     */ 
/*     */ 
/*     */   
/*     */   public void init() {
/*  20 */     this.a = (Canvas)new h(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     boolean bool = false;
/*  37 */     if (getParameter("fullscreen") != null) {
/*  38 */       bool = getParameter("fullscreen").equalsIgnoreCase("true");
/*     */     }
/*     */     
/*  41 */     this.b = (Minecraft)new g(this, this, this.a, this, getWidth(), getHeight(), bool);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.b.j = getDocumentBase().getHost();
/*  52 */     if (getDocumentBase().getPort() > 0) {
/*  53 */       this.b.j += ":" + getDocumentBase().getPort();
/*     */     }
/*  55 */     if (getParameter("username") != null && getParameter("sessionid") != null) {
/*  56 */       this.b.i = new df(getParameter("username"), getParameter("sessionid"));
/*  57 */       if (getParameter("mppass") != null) {
/*  58 */         this.b.i.d = getParameter("mppass");
/*     */       }
/*     */     } else {
/*  61 */       this.b.i = new df("Player", "");
/*     */     } 
/*     */     
/*  64 */     if (getParameter("loadmap_user") != null && getParameter("loadmap_id") != null) {
/*  65 */       this.b.s = getParameter("loadmap_user");
/*  66 */       this.b.t = Integer.parseInt(getParameter("loadmap_id"));
/*  67 */     } else if (getParameter("server") != null && getParameter("port") != null) {
/*  68 */       this.b.a(getParameter("server"), Integer.parseInt(getParameter("port")));
/*     */     } 
/*     */ 
/*     */     
/*  72 */     this.b.l = true;
/*  73 */     setLayout(new BorderLayout());
/*  74 */     add(this.a, "Center");
/*  75 */     this.a.setFocusable(true);
/*  76 */     validate();
/*     */   }
/*     */   
/*     */   public void a() {
/*  80 */     if (this.c != null)
/*  81 */       return;  this.c = new Thread(this.b, "Minecraft main thread");
/*  82 */     this.c.start();
/*     */   }
/*     */   
/*     */   public void start() {
/*  86 */     if (this.b != null) this.b.m = false; 
/*     */   }
/*     */   
/*     */   public void stop() {
/*  90 */     if (this.b != null) this.b.m = true; 
/*     */   }
/*     */   
/*     */   public void destroy() {
/*  94 */     b();
/*     */   }
/*     */   
/*     */   public void b() {
/*  98 */     if (this.c == null)
/*  99 */       return;  this.b.d();
/*     */     try {
/* 101 */       this.c.join(10000L);
/* 102 */     } catch (InterruptedException interruptedException) {
/*     */       try {
/* 104 */         this.b.c();
/* 105 */       } catch (Exception exception) {
/* 106 */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/* 109 */     this.c = null;
/*     */   }
/*     */   
/*     */   public void c() {
/* 113 */     this.a = null;
/* 114 */     this.b = null;
/* 115 */     this.c = null;
/*     */     try {
/* 117 */       removeAll();
/* 118 */       validate();
/* 119 */     } catch (Exception exception) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\net\minecraft\client\MinecraftApplet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */