/**
 * Create Date:2019年5月18日
 */
package com.yyq.util.test;

import java.io.File;

import com.yyq.util.FileUtil;

/**
 * <br>Title:测试代码就是写个主函数，用来输出到控制台的代码
 * <br>Description:
 * 
 * 
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月18日
 */
public class TestFileUtil {
  public static void main(String[] args) {
    File file = new File("d:/a");
    //主代码测试方法的直接调用
    //1.测试，把所有文件夹下的文件和文件夹名称都打印出来
    //FileUtil.listFile(file);
    //2.把是文件的删除掉
    FileUtil.delFile(file);
  }
}
