package com.yin.jpa.pojo;/**
 * @author 17694
 * @date 2021/03/30
 **/

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName : Garage 
 * @Description :   
 */
@Entity
public class Garage {

    /**
     * many to one 多对一
     */
    private Integer gid;
    private String garagenum;
    private Set<Auto> autos = new HashSet<Auto>();

    @Id
    @GeneratedValue
    public Integer getGid() {
        return gid;
    }
    public void setGid(Integer gid) {
        this.gid = gid;
    }
    @Column(length=20)
    public String getGaragenum() {
        return garagenum;
    }
    public void setGaragenum(String garagenum) {
        this.garagenum = garagenum;
    }
    @OneToMany(mappedBy="garage")
    public Set<Auto> getAutos() {
        return autos;
    }
    public void setAutos(Set<Auto> autos) {
        this.autos = autos;
    }
    public void addGarageAuto(Auto auto) {
        auto.setGarage(this);
        this.autos.add(auto);
    }

}