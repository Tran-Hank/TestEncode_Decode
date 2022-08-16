package com.example.demo;

import java.io.UnsupportedEncodingException;

import org.apache.axis.encoding.Base64;

public class Encode_decode {
	public static String encodeString(String text) throws UnsupportedEncodingException {
		byte[] result = text.getBytes("UTF-8");
		String encodeString = Base64.encode(result);
		return encodeString;
	}

	public static String decodeString(String encodeText) throws UnsupportedEncodingException {
		byte[] decodeBytes = Base64.decode(encodeText);
		String str = new String(decodeBytes, "UTF-8");
		return str;
	}
	   public static void main(String[] args) throws UnsupportedEncodingException  {
	       String text = "123";
	      
	       System.out.println("before encode: "+ text);
	      
	       String encodeText = encodeString(text);
	       System.out.println("Encode text: "+ encodeText);
	       
	       String decodeText =  decodeString(encodeText);
	       System.out.println("Decode text: "+ decodeText);        
	   }
}
