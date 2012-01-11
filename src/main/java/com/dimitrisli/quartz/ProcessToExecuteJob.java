package com.dimitrisli.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ProcessToExecuteJob extends QuartzJobBean{

	private ProcessToExecute processToExecute;
	
	public void setProcessToExecute(ProcessToExecute processToExecute){
		this.processToExecute = processToExecute;
	}
	
	@Override
	protected void executeInternal(JobExecutionContext jobContext)	throws JobExecutionException {
		processToExecute.output();
	}

}
