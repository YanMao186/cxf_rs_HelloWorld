package com.ym.cxf.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: common_parent
 * @description:
 * @author: Mr.Yan
 * @create: 2019-05-27 08:58
 **/

/**
 * @XmlRootElement指定序列化(转xml,json)对象名称
 */
@XmlRootElement(name = "Car")
public class Car {
    private Integer id;
    private String carName;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(Integer id, String carName, Double price) {
        this.id = id;
        this.carName = carName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
