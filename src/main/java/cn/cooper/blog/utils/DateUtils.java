package cn.cooper.blog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils{
  /**
   * 定义统一Locale.CHINA,程序中所有和Locale相关操作均默认使用此Locale
   */
  public static final Locale LOCALE_CHINA = Locale.CHINA;

  private DateUtils(){
  }

  public static String currentDate(String pattern){
    return formatDate(pattern, new Date());
  }

  public static String formatDate(String pattern, Date date){
    SimpleDateFormat format = new SimpleDateFormat(pattern, LOCALE_CHINA);
    return format.format(date);
  }

  /**
   * 指定locale格式化日期
   * 
   * @param pattern
   * @param date
   * @param locale
   * @return
   */
  public static String formatDate(String pattern, Date date, Locale locale){
    SimpleDateFormat format = new SimpleDateFormat(pattern, locale);
    return format.format(date);
  }

  /**
   * 解析日期，注:此处为严格模式解析，即20151809这样的日期会解析错误
   * 
   * @param pattern
   * @param date
   * @return
   */
  public static Date parse(String pattern, String date){
    return parse(pattern, date, LOCALE_CHINA);
  }

  /**
   * 解析日期，注:此处为严格模式解析，即20151809这样的日期会解析错误
   * 
   * @param pattern
   * @param date
   * @param locale
   * @return
   */
  public static Date parse(String pattern, String date, Locale locale){
    SimpleDateFormat format = new SimpleDateFormat(pattern, locale);
    format.setLenient(false);
    Date result = null;
    try{
      result = format.parse(date);
    }catch(Exception e){
      e.printStackTrace();
    }

    return result;
  }

}
