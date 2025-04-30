/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ public class bb
/*     */   extends Thread
/*     */ {
/*     */   public File a;
/*     */   private Minecraft b;
/*     */   private boolean c = false;
/*     */   
/*     */   public bb(File paramFile, Minecraft paramMinecraft) {
/*  20 */     this.b = paramMinecraft;
/*  21 */     setName("Resource download thread");
/*  22 */     setDaemon(true);
/*  23 */     this.a = new File(paramFile, "resources/");
/*  24 */     if (!this.a.exists() && !this.a.mkdirs()) throw new RuntimeException("The working directory could not be created: " + this.a); 
/*     */   }
/*     */   
/*     */   public void run() {
/*     */     try {
/*  29 */       ArrayList<String> arrayList = new ArrayList();
/*  30 */       URL uRL = new URL("http://www.minecraft.net/resources/");
/*  31 */       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
/*  32 */       String str = "";
/*  33 */       while ((str = bufferedReader.readLine()) != null)
/*  34 */         arrayList.add(str); 
/*  35 */       bufferedReader.close();
/*     */       
/*  37 */       for (byte b = 0; b < 2; b++) {
/*  38 */         for (byte b1 = 0; b1 < arrayList.size(); b1++)
/*  39 */         { a(uRL, arrayList.get(b1), b);
/*  40 */           if (this.c)
/*     */             return;  } 
/*     */       } 
/*  43 */     } catch (IOException iOException) {
/*  44 */       a(this.a, "");
/*  45 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(File paramFile, String paramString) {
/*  50 */     File[] arrayOfFile = paramFile.listFiles();
/*  51 */     for (byte b = 0; b < arrayOfFile.length; b++) {
/*  52 */       if (arrayOfFile[b].isDirectory()) {
/*  53 */         a(arrayOfFile[b], paramString + arrayOfFile[b].getName() + "/");
/*     */       } else {
/*  55 */         this.b.a(paramString + arrayOfFile[b].getName(), arrayOfFile[b]);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(URL paramURL, String paramString, int paramInt) {
/*     */     try {
/*  62 */       String[] arrayOfString = paramString.split(",");
/*  63 */       String str1 = arrayOfString[0];
/*     */       
/*  65 */       int i = str1.indexOf("/");
/*  66 */       String str2 = str1.substring(0, i);
/*     */       
/*  68 */       if (str2.equals("sound") || str2.equals("newsound")) {
/*  69 */         if (paramInt != 0)
/*     */           return; 
/*  71 */       } else if (paramInt != 1) {
/*     */         return;
/*     */       } 
/*  74 */       int j = Integer.parseInt(arrayOfString[1]);
/*  75 */       long l = Long.parseLong(arrayOfString[2]);
/*     */       
/*  77 */       l /= 2L;
/*     */       
/*  79 */       File file = new File(this.a, str1);
/*  80 */       if (!file.exists() || file.length() != j) {
/*  81 */         file.getParentFile().mkdirs();
/*  82 */         String str = str1.replaceAll(" ", "%20");
/*  83 */         a(new URL(paramURL, str), file, j);
/*  84 */         if (this.c)
/*     */           return; 
/*  86 */       }  this.b.a(str1, file);
/*  87 */     } catch (Exception exception) {
/*  88 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(URL paramURL, File paramFile, int paramInt) {
/*  93 */     byte[] arrayOfByte = new byte[4096];
/*  94 */     DataInputStream dataInputStream = new DataInputStream(paramURL.openStream());
/*  95 */     DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
/*     */     
/*  97 */     int i = 0;
/*  98 */     while ((i = dataInputStream.read(arrayOfByte)) >= 0) {
/*  99 */       dataOutputStream.write(arrayOfByte, 0, i);
/* 100 */       if (this.c)
/*     */         return; 
/* 102 */     }  dataInputStream.close();
/* 103 */     dataOutputStream.close();
/*     */   }
/*     */   
/*     */   public void a() {
/* 107 */     this.c = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\bb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */