package com.example.bond_finance.batch.bond;

import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration 
public class BondIssuanceJobConfig {
    @Bean 
    public Job bondIssuanceJob(
        JobRepository jobRepository,
        Step bondIssuanceStep
    ) {
        return new JobBuilder("bondIssuanceJob", jobRepository)
            .start(bondIssuanceStep)
            .build();
    }

    @Bean 
    public Step bondIssuanceStep(
        JobRepository jobRepository,
        PlatformTransactionManager transactionManager
    ) {
        return new StepBuilder("bondIssuanceStep", jobRepository)
            .tasklet((contribution, chunkContext) -> {
                System.out.println("채권 발행정보 Batch 실행");
                return null;
            })
            .build();
    }
}
