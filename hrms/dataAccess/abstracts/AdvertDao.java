package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Advert;

public interface AdvertDao extends JpaRepository<Advert, Integer>{

	List<Advert> findByActive(boolean activeStatus);
}
