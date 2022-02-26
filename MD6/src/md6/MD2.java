/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md6;

/**
 *
 * @author DELL
 */
public class MD2 {
public static  String MD2(String md2) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD2");
        byte[] array = md.digest(md2.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        return sb.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}
   
   
    
}
