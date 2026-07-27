package com.thediary.jobApplication.company;

import com.thediary.jobApplication.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> findAllCompanies();
    void createCompany(Company company);
    Company getCompany(Long id);
    boolean deleteCompanyById(Long id);

    boolean updateCompany(Long id, Company company);
}
