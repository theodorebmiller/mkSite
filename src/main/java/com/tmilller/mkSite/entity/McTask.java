package com.tmilller.mkSite.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.Date;

public class McTask implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7733931497327947209L;
	private String subject;
	private String description;
	private OffsetDateTime startDate;
	private OffsetDateTime endDate;
	private String sampleDate;
	private final static String dtFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	
	
	public void setSampleDate(Date dt) {
		SimpleDateFormat ioFormat = new SimpleDateFormat(dtFormat);
		sampleDate = ioFormat.format(dt);
	}

	public Date getSampleDate() {
		SimpleDateFormat ioFormat = new SimpleDateFormat(dtFormat);

		try {
			return ioFormat.parse(sampleDate);
		} catch (ParseException e) {
			return null;		}
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public OffsetDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}
	public OffsetDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "McTask [subject=" + subject + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
}
