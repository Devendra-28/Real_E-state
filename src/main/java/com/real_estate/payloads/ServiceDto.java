package com.real_estate.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ServiceDto {



    private int id;

    private String serviceName;

    private String type;

    private String status;

    private String BrokerName;

   
}
