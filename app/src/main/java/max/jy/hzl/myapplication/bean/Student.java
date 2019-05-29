package max.jy.hzl.myapplication.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by asus on 2019/5/29.
 */
@Entity
public class Student {
   @Id
    private Long id;
    private String name;
    private String sex;
   @Generated(hash = 1620742030)
   public Student(Long id, String name, String sex) {
       this.id = id;
       this.name = name;
       this.sex = sex;
   }
   @Generated(hash = 1556870573)
   public Student() {
   }
   public Long getId() {
       return this.id;
   }
   public void setId(Long id) {
       this.id = id;
   }
   public String getName() {
       return this.name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getSex() {
       return this.sex;
   }
   public void setSex(String sex) {
       this.sex = sex;
   }



}
