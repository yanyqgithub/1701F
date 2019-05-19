/**
 * Create Date:2019年5月19日
 */
package com.yyq.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.yyq.entity.Student;

/**
 * <br>Title:TODO 类标题
 * <br>Description:
 * 序列化一个对象，反序列化另一个对象
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月19日
 */
public class XL2 {
  @SuppressWarnings("resource")
  public static void main(String[] args) throws Exception {
    Student student = new Student(2, "美丽", "女");
    //序列化
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://1701F//bbb.txt"));
    out.writeObject(student);//传的是对象
    //反序列化
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://1701F//bbb.txt"));
    Student student1 = (Student) in.readObject();
    System.out.println(student1);//传的是另一个对象
  }
}
