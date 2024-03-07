package com.real_estate.service.impl;

import com.real_estate.entities.Services;
import com.real_estate.payloads.ServiceDto;
import com.real_estate.repository.ServiceRepo;
import com.real_estate.service.ServServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServServicesImpl implements ServServices {

    @Autowired
    private ServiceRepo serviceRepo;

    @Override
    public ServiceDto addService(ServiceDto serviceDto) {
       Services services= this.DtoToService(serviceDto);
       Services savedservices=this.serviceRepo.save(services);
        return this.ServiceToDto(savedservices);
    }

    @Override
    public ServiceDto updateService(ServiceDto services, Integer serviceId) {

        return null;
    }

    @Override
    public ServiceDto getServiceById(Integer serviceId) {
        return null;
    }

    @Override
    public List<ServiceDto> getAllServices() {
        return null;
    }

    @Override
    public void deleteService(Integer serviceId) {

    }

    private Services DtoToService(ServiceDto serviceDto){
        Services services=new Services();
        services.setId(serviceDto.getId());
        services.setServiceName(serviceDto.getServiceName());
        services.setBrokerName(serviceDto.getBrokerName());
        services.setType(serviceDto.getType());
        services.setStatus(serviceDto.getStatus());
        return services;
    }
    private ServiceDto ServiceToDto(Services services){
        ServiceDto serviceDto=new ServiceDto();
        serviceDto.setId(serviceDto.getId());
        serviceDto.setServiceName(serviceDto.getServiceName());
        serviceDto.setBrokerName(serviceDto.getBrokerName());
        serviceDto.setType(serviceDto.getType());
        serviceDto.setStatus(serviceDto.getStatus());
        return serviceDto;
    }
}
