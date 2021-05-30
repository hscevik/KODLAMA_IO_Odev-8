package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.Advert;

public interface AdvertDao extends JpaRepository<Advert, Integer>{

	DataResult<List<Advert>> getAllByIsActiveTrue();
	
	DataResult<List<Advert>> getAllSortedByDeadlineDateASC();
    DataResult<List<Advert>> getAllSortedByDeadlineDateDESC();
    DataResult<List<Advert>> getAllSortedByRelaseDateASC();
    DataResult<List<Advert>> getAllSortedByAdvertDateDESC();
}