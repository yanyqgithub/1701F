/**
 * Create Date:2019年5月20日
 */
package com.yanyongqi.common.utils;

import java.util.Date;

/**
 * <br>Title:日期工具类
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月20日
 */
public class DateUtil {
  /*
  * 方法1：(5分)
  * 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
  * 则返回的结果为2019-05-01 00:00:00
  */
  public static Date getDateByInitMonth(Date src) {
    Date date = new Date();
    long time = date.getTime();
    return src;
    //TODO 实现代码
  }

  /*
  * 方法2：(5分)
  * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
  * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
  * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
  */
  public static Date getDateByFullMonth(Date src) {
    //new Date(Month.lastDay);
    return src;
    //TODO 实现代码
  }

}
