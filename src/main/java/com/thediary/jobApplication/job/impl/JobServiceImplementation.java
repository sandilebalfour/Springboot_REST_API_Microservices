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
    public Job getJob(long id) {
        for (Job job : jobs){
            if (job.getId().equals(id)){
                return job;

            }
        }
        return null;
    }
}
