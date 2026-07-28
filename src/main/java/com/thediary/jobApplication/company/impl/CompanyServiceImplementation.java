package com.thediary.jobApplication.company.impl;

import com.thediary.jobApplication.company.Company;
import com.thediary.jobApplication.company.CompanyRepository;
import com.thediary.jobApplication.company.CompanyService;
import com.thediary.jobApplication.job.Job;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImplementation implements CompanyService {
    CompanyRepository companyRepository;

    public CompanyServiceImplementation(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Company getCompany(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
          if (companyRepository.existsById(id)){
                companyRepository.deleteById(id);
                return true;}
          else
              return false;

    }

    @Override
    public boolean updateCompany(Long id, Company company) {

        Optional<Company> companyOptional = companyRepository.findById(id);

        if(companyOptional.isPresent()){
            Company company1 = companyOptional.get();
            company1.setCompanyName(company.getCompanyName());
            company1.setDescription(company.getDescription());
            company1.setJobs(company.getJobs());
            companyRepository.save(company1);
            return true;
        }

        return false;    }
}
