package com.real_estate.service;


import com.real_estate.payloads.ServiceDto;

import java.util.List;

public interface ServServices {

    ServiceDto addService(ServiceDto services);

    ServiceDto updateService(ServiceDto services,Integer serviceId);

    ServiceDto getServiceById(Integer serviceId );

    List<ServiceDto> getAllServices();

    void deleteService(Integer serviceId );
}
