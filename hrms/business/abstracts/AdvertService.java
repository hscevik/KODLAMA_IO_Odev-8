package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Advert;

public interface AdvertService {

	DataResult<List<Advert>>  getAdvertAll();
	Result addAdvert(Advert advert);
	DataResult<List<Advert>>  getAllByActiveTrue();

}
