package br.com.cannoni.scheduler.jobs;

import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author patrizio
 * @since 07/07/2017
 */
@DisallowConcurrentExecution
public class SampleJob implements Job {

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		System.out.println(new Date() + " Execution OK");
	}

}
