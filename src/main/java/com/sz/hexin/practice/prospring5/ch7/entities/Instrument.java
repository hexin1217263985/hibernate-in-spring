package com.sz.hexin.practice.prospring5.ch7.entities;
/**
 * @(#) 2018/7/14
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hexin
 * @version 1.0 2018/7/14
 */
@Entity
@Table(name = "instrument")
public class Instrument implements Serializable {
    private String instrumentId;

    private Set<Singer> singers = new HashSet<Singer>();

    @ManyToMany
    @JoinTable(name = "singer_instrument",
    joinColumns = @JoinColumn(name = "instrument_id"),
    inverseJoinColumns = @JoinColumn(name = "singer_id"))
    public Set<Singer> getSingers() {
        return singers;
    }

    public void setSingers(Set<Singer> singers) {
        this.singers = singers;
    }

    @Id
    @Column(name = "instrument_id")
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId='" + instrumentId + '\'' +
                '}';
    }
}
