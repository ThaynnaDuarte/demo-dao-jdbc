package io.github.thaynnaduarte;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String email;
    private Date birthday;
    private Double salary;

    private Department department;

    public Seller() {
    }

    public Seller(int id, String name, String email, Date birthday, Double salary, Department department) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.salary = salary;
        this.department = department;

    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return id == seller.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller [" + "id = " + id + ", name = '" + name + '\'' + ", email = '" + email + '\'' + ", birthday = " + birthday + ", salary = " + salary + ", department = " + department + ']';
    }
}

