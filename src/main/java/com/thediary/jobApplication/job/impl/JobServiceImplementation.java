package com.thediary.jobApplication.job.impl;

import com.thediary.jobApplication.job.Job;
import com.thediary.jobApplication.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImplementation implements JobService {

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJob(Long id) {
        for (Job job : jobs){
            if (job.getId().equals(id)){
                return job;

            }
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {

        for (Job job: jobs){
            if (job.getId().equals(id)) {
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateJob(Long id, Job job) {

        for(Job j: jobs){
            if(j.getId().equals(id)){
                j.setTitle(job.getTitle());
                j.setDescription(job.getDescription());
                j.setMinSalary(job.getMinSalary());
                j.setMaxSalary(job.getMaxSalary());
                j.setLocation(job.getLocation());
                return true;
            }
        }
        return false;
    }

}
