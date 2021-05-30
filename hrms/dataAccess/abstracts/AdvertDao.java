package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Advert;

public interface AdvertDao extends JpaRepository<Advert, Integer>{

	List<Advert> getAllByActiveTrue();
	List<Advert>  getAdvertAll();

	List<Advert> getAllSortedByDeadlineDateASC();
    List<Advert> getAllSortedByDeadlineDateDESC();
    List<Advert> getAllSortedByRelaseDateASC();
    List<Advert> getAllSortedByAdvertDateDESC();
}