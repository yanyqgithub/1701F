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
 * <br>Title:序列化和反序列化
 * <br>Description:
 * 
 * 1.序列化和反序列化可以操作任何的对象
 * 2.ObjectOutputStream  序列化   写
 * FileInputStream   反序列化    读
 * 3.先写然后读,先写然后才能读
 * 4.被transient修饰的类不能被序列化
 * 
 * 5.在执行反序列化的时候，不要去修改实体来，修改了实体类，
 * 对象在被执行反序列化的时候，就会找不到原来的类，而无法反序列化——报错
 * 
 * 6.但是如果让序列化的类，生成一个版本号，那么序列化后，修改实体类属性，在运行反序列化，则不会报错。
 * 
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月19日
 */
public class XlFxl {
  @SuppressWarnings("resource")
  public static void main(String[] args) throws Exception {
    //实例化对象
    Student stu = new Student(1, "西施", "女");

    /*序列化—— 实体类必须实现必须实现Serializable接口——写
     * 将路径写在本地   (new 对象也 只能new子类，
    ObjectOutputStream的子类是FileOutputStream)   
    stu.csd 后面的这个拓展名，不是人读的，愿意用啥用啥，因为不是人读的,但是乱写不报错，但是打不开*/
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://1701F//stu.txt"));
    out.writeObject(stu);

    //反序列化——读
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("d://1701F//stu.txt"));
    //in.readObject()返回的是Object类型的，需要返回的是Student类型的 强转一下
    Student stu1 = (Student) in.readObject();
    System.out.println(stu1);

    //序列化和反序列化得到的内容虽然一样，序列化和反序列化得到的不是同一个 对象
    // System.out.println(stu1 == stu);//结果是false
  }

}
