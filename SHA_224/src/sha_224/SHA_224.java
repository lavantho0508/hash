/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sha_224;

/**
 *
 * @author DELL
 */
public class SHA_224 {

    public static  String SHA_224(String SHA_224) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-224");
        byte[] array = md.digest(SHA_224.getBytes());
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
