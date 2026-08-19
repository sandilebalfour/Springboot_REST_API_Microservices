package com.thediary.jobApplication.job.impl;


import com.thediary.jobApplication.job.Job;
import com.thediary.jobApplication.job.JobRepository;
import com.thediary.jobApplication.job.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImplementation implements JobService {

//    private List<Job> jobs = new ArrayList<>();
    JobRepository jobRepository;
//    private Long nextId = 1L;

    public JobServiceImplementation(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        job.setId(null);
        jobRepository.save(job);
    }

    @Override
    public Job getJob(Long id) {
//        for (Job job : jobRepository.findAll()){
//            if (job.getId().equals(id)){
//                return job;
//
//            }
//        }
//        return null;
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {

//        for (Job job: jobs){
//            if (job.getId().equals(id)) {
//                jobs.remove(job);
//                return true;
//            }
//        }
//        return false;
        try
        {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }

    }

    @Override
    public boolean updateJob(Long id, Job job) {
        Optional<Job> jobOptional = jobRepository.findById(id);

            if(jobOptional.isPresent()){
                Job j = jobOptional.get();
                j.setTitle(job.getTitle());
                j.setDescription(job.getDescription());
                j.setMinSalary(job.getMinSalary());
                j.setMaxSalary(job.getMaxSalary());
                j.setLocation(job.getLocation());
                jobRepository.save(j);
                return true;
            }

        return false;
    }

}
