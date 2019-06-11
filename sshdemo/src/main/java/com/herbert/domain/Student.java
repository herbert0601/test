package com.herbert.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Herbert
 * @create 2019-06-09 15:12
 */
@Entity
@Table(name = "t_student", catalog = "organizationframework")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String Sno;
    @Temporal(TemporalType.DATE)
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Sno='" + Sno + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
