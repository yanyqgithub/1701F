/**
 * Create Date:2019年5月20日
 */
package yanyongqi.common.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <br>Title:流处理工具测试类
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月20日
 */
public class StreamUtilTest {
  @SuppressWarnings("resource")
  public static void main(String[] args) throws Exception {
    //实例化对象
    Clazz clazz = new Clazz(1, "张三", "女");
    //序列化
    ObjectOutputStream out = new ObjectOutputStream(
      new FileOutputStream("C://Users//YYQ//Desktop//zk2//clazz.txt"));
    out.writeObject(clazz);
    //反序列化
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream("C://Users//YYQ//Desktop//zk2//clazz.txt"));
    Clazz clazz1 = (Clazz) in.readObject();
    System.out.println(clazz1);
  }
}
