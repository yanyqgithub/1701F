/**
 * Create Date:2019年5月20日
 */
package com.yanyongqi.common.utils;

import java.io.File;
import java.io.InputStream;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月20日
 */
public class StreamUtil {
  /*
  * 方法1：批量关闭流，参数能传无限个。(3分)
  * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
  */
  public static void closeAll() {
    File file = new File("C://Users//YYQ//Desktop//zk2//aaa.jpg");
    //file.close();

  }

  /*
  * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
  */
  public static String readTextFile(InputStream src) {

    return null;
    //TODO 实现代码
  }

  /*
  * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
  */
  public static String readTextFile(File txtFile) {

    return null;
    //TODO 实现代码
  }

}
