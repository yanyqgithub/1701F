/**
 * Create Date:2019年5月19日
 */
package com.yyq.entity;

import java.io.Serializable;

/**
 * <br>Title:学生类
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月19日
 */
public class Student implements Serializable {

  /**
   * <br>Description:生成序列化版本号，为了似的实体类修改后的反序列化能够顺利实现
   * <br>Author:闫永奇(744822241@qq.com)
   * <br>Date:2019年5月19日
   */
  // private static final long serialVersionUID = -5849828987524018080L;

  private int id;

  private String name;

  //修饰符后面加transient ——被transient修饰的类不能被序列化  String类型的，没值是null,int类型没值是0
  private transient String sex;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Student(int id, String name, String sex) {
    super();
    this.id = id;
    this.name = name;
    this.sex = sex;
  }

  //无参
  public Student() {
    super();
  }

  //给一个id的构造，后期用来验证 版本号来设置的
  public Student(int id) {
    super();
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
  }

}
