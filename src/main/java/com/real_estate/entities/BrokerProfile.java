package com.real_estate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Broker_Profile")
public class BrokerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BrokerId;

    @Column(nullable = false)
    private String BrokerName;

    @Column(nullable = false)
    private String contact;

    private String rating;
}
