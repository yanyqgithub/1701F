/**
 * Create Date:2019年5月18日
 */
package com.yyq.util;

import java.io.File;

/**
 * <br>Title:TODO 类标题
 * <br>Description:
 *   递归：自身调用自身
 *   file delete  删除此抽象路径名表示的文件或目录。
 * 
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月18日
 */
public class FileUtil {
  //获取系统的临时目录
  /* public static void main(String[] args) {
    //新建一个文件对象，制定目录
    File file = new File("d:/a");
    listFile(file);
  }*/

  //递归遍历某个文件夹下的所有文件夹和文件
  public static void listFile(File file) {
    //遍历该文件下所有文件夹和文件
    File[] files = file.listFiles();
    for (File f : files) {
      //判断是否是目录 是目录得取名字；不是目录也得名字
      if (f.isDirectory()) {
        listFile(f);
        System.out.println(f.getName());
      } else {
        System.out.println(f.getName());
      }
    }

  }

  //删除d:/a下的所有文件和文件夹
  public static void delFile(File file) {
    if (file.isDirectory()) {
      File[] files = file.listFiles();
      for (File f : files) {
        //如果是目录，删除目录
        if (f.isDirectory()) {
          f.delete();

        } else if (f.isFile()) {
          //如果是文件，删除(不是目录的也删除)
          f.delete();
        }
      }
    }
  }
}
