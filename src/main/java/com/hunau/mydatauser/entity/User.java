package com.hunau.mydatauser.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String pwd;
    private boolean isuse;
    private String sexy;
    private String  birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name==null?null:name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd==null?null:pwd.trim();
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse)
    {
        this.isuse = isuse;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", isuse=" + isuse +
                ", sexy='" + sexy + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
