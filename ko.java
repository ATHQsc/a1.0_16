/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ko
/*    */   extends Thread
/*    */ {
/*    */   ko(by paramby, String paramString, gr paramgr) {}
/*    */   
/*    */   public void run() {
/* 17 */     HttpURLConnection httpURLConnection = null;
/*    */     try {
/* 19 */       URL uRL = new URL(this.a);
/* 20 */       httpURLConnection = (HttpURLConnection)uRL.openConnection();
/* 21 */       httpURLConnection.setDoInput(true);
/* 22 */       httpURLConnection.setDoOutput(false);
/* 23 */       httpURLConnection.connect();
/* 24 */       if (httpURLConnection.getResponseCode() == 404) {
/*    */         return;
/*    */       }
/*    */       
/* 28 */       if (this.b == null)
/* 29 */       { this.c.a = ImageIO.read(httpURLConnection.getInputStream()); }
/*    */       else
/* 31 */       { this.c.a = this.b.a(ImageIO.read(httpURLConnection.getInputStream())); } 
/* 32 */     } catch (Exception exception) {
/* 33 */       exception.printStackTrace();
/*    */     } finally {
/* 35 */       httpURLConnection.disconnect();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Stf\Desktop\a1.0.16.jar!\ko.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */