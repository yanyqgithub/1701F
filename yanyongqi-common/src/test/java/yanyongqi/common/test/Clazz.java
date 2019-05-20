/**
 * Create Date:2019年5月20日
 */
package yanyongqi.common.test;

import java.io.Serializable;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:闫永奇(744822241@qq.com)
 * <br>Date:2019年5月20日
 */
public class Clazz implements Serializable {
  private int cid;

  private String cname;

  private String sex;

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Clazz(int cid, String cname, String sex) {
    super();
    this.cid = cid;
    this.cname = cname;
    this.sex = sex;
  }

  public Clazz() {
    super();
  }

  public Clazz(int cid) {
    super();
    this.cid = cid;
  }

  @Override
  public String toString() {
    return "Clazz [cid=" + cid + ", cname=" + cname + ", sex=" + sex + "]";
  }

}
