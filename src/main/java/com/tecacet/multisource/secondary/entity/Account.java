package com.tecacet.multisource.secondary.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @Column(name = "account_id")
    private long accountId;
    @Column(name = "district_id")
    private long districtId;
    private String frequency;
    private LocalDate date;
}
