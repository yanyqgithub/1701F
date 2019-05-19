/**
 * Create Date:2019年5月19日
 */
package com.yyq.file;

import java.io.File;
import java.io.IOException;

/**
 * <br>Title:TODO 类标题
 * <br>Description:
 * 
 * 文件流的路径都是双斜杠的 //,比如"D://1701F//a.txt"
 * 
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月19日
 */
public class YyqFile {
  public static void main(String[] args) throws IOException {
    File file = new File("D://1701F");

    //  File file3 = new File("D://1701F//ccc.txt");

    /*System.out.println("该文件是一个文件吗:" + file.isFile());
    //isDirectory()是否是目录，是否是文件夹的意思
    System.out.println("改文件是一个文件夹吗:" + file.isDirectory());
    //文件是否删除成功！
    System.out.println("文件是否删除成功?" + file.delete());
    //创建文件   虽然a.txt删除了，但是调用的还是file的对象
    System.out.println("文件是否创建成功：" + file.createNewFile());
    //获取文件的名字   是简短的文字的名字，而不是全限定名
    System.out.println("文件的名字是:" + file.getName());
    //获取文件的绝对路径
    System.out.println("获取文件的绝对路径：" + file.getAbsolutePath());*/

    /* //创建文件件    ——创建单级文件夹
    System.out.println("该文件夹是否创建成功:" + file.mkdir());
    //创建多级文件夹
    System.out.println("创建多级文件夹是否成功:" + file.mkdirs());*/

    //获取文件夹下的每一个文件(文件夹和文件都可以被输出出来)
    /*  File[] files = file.listFiles();
    for (File file2 : files) {
      System.out.println(file2.getName());
    }*/

    //重命名
    /*  boolean renameTo = file.renameTo(file3);
    System.out.println("重命名是否成功:" + renameTo);*/

    //获取文件——获取文件夹内的“.mp4”文件

    File[] files = file.listFiles();
    for (File file2 : files) {
      //indexOf(元素)----->下标  substring(开始下标，结束下标)，截取的值含头不含尾
      //indexOf(),是放元素找下标，下标为-1,说明元素找不到 ,所以要!=-1
      //file2.getName().indexOf(".")是寻找小数点的下标
      if (file2.getName().indexOf(".") != -1) {
        //找到了.  那么开始继续往下截取字符串(小数点下标开始，文件名长度为止步)  
        String off = file2.getName().substring(file2.getName().indexOf("."), file2.getName().length());
        //截取的字符串，字符串的比较用.equals()
        if (off.equals(".mp4")) {
          System.out.println(file2.getName());
        }
      }
    }
  }
}
