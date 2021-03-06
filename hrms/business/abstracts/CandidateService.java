package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;

public interface CandidateService {

	DataResult<List<Candidate>>  getCandidateAll();
	Result addCandidate(Candidate candidate);
}
