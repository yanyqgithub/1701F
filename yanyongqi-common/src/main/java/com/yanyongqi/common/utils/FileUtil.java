/**
 * Create Date:2019年5月20日
 */
package com.yanyongqi.common.utils;

import java.io.File;

/**
 * <br>Title:文件工具类
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月20日
 */
public class FileUtil {
  /*
  * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
  */
  public static String getExtendName(String fileName) {
    //创建一个file对象
    File file = new File("C://Users//YYQ//Desktop//zk2//aaa.jpg");
    //截取文件名的后缀
    if (file.getName().indexOf(".") != -1) {
      String substring = file.getName().substring(file.getName().indexOf("."), file.getName().length());
      System.out.println(substring);
    }
    return fileName;

  }

  /*
  * 方法2：返回操作系统临时目录(5分)
  */
  public static File getTempDirectory() {
    return null;
    //TODO 实现代码
  }

  /*
  * 方法3：返回操作系统用户目录(5分)
  * 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
  */
  public static File getUserDirectory() {
    return null;
    //TODO 实现代码
  }

}
