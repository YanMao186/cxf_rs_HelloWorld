package com.ym.cxf.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: common_parent
 * @description:
 * @author: Mr.Yan
 * @create: 2019-05-27 08:56
 **/
@XmlRootElement(name = "User")
public class User {
    private Integer id;
    private String username;
    private String city;
    private List<Car> cars = new ArrayList<>();

    public User() {
    }

    public User(Integer id, String username, String city, List<Car> cars) {
        this.id = id;
        this.username = username;
        this.city = city;
        this.cars = cars;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }
}
