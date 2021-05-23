package com.g5.tms.repository;

import com.g5.tms.entities.Report;
import com.g5.tms.exceptions.ReportNotFoundException;

public interface IReportRepository {
	
	
		public Report  addReport(Report report);
		public Report  deleteReport(int reportId) throws ReportNotFoundException;
		public Report  viewReport(int reportId) throws ReportNotFoundException;
		public Report  viewAllReports();
		
	
	
	

}
