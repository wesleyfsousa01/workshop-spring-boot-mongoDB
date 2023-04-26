package com.projeto.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URL {
    public static String decodeParam(String text){
        try{
            return URLDecoder.decode(text,"UTF-8");
        }catch (UnsupportedEncodingException e){
            return "";
        }
    }

    public static Date convertDate(String textDate, Date defaultValue){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue;
        }
    }
}
