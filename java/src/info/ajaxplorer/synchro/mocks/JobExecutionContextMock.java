package info.ajaxplorer.synchro.mocks;

import java.util.Date;

import org.quartz.Calendar;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.Trigger;

public class JobExecutionContextMock implements JobExecutionContext {

	private JobDataMap dataMap;
	
	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calendar getCalendar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFireInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getFireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDetail getJobDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job getJobInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getJobRunTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JobDataMap getMergedJobDataMap() {
		return dataMap;
	}

	public void setDataMap(JobDataMap dataMap) {
		this.dataMap = dataMap;
	}
	
	@Override
	public Date getNextFireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getPreviousFireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRefireCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getScheduledFireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scheduler getScheduler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trigger getTrigger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRecovering() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setResult(Object arg0) {
		// TODO Auto-generated method stub

	}

}
