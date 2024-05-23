package com.zeron.sophon.domain;

import javax.annotation.Resource;

/**
 * Customer
 *
 */
@Entity
public class Customer {
    private String name;

    private Integer age;

    @Resource
    private PurchasePowerGateway purchasePowerGateway;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPurchasePowerScore(){
        return purchasePowerGateway.getScore();
    }
}
