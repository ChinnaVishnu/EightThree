package com.jocata.star.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.jocata.star.ExportReports.BenchmarksReportExport;
import com.jocata.star.ExportReports.BenchmarksRunReportExport;
import com.jocata.star.ExportReports.CaseDetailsReportExport;
import com.jocata.star.ExportReports.RuleSummereyReportExport;
import com.jocata.star.ExportReports.UserDetailsReportExport;
import com.jocata.star.existingfuctions.AddBenchMarkReportsChanges2;
import com.jocata.star.existingfuctions.AddBenchMarkReportsChanges3;
import com.jocata.star.existingfuctions.AddruleChangesFuctionaltiy;
import com.jocata.star.exportexcels.CustomerPeerProfile;
import com.jocata.star.exportexcels.CustomerPeerProfile2;
import com.jocata.star.exportexcels.DashboardTask;
import com.jocata.star.exportexcels.NetworkExportGraph;
import com.jocata.star.exportexcels.TrancastionRulePopUpExport;
import com.jocata.star.grid.ADDRolesModify;
import com.jocata.star.grid.GridAddReport2;
import com.jocata.star.grid.GridAddReport3;
import com.jocata.star.grid.IncludingPermissions2;
import com.jocata.star.includeexculde.AdddeleteRbl;
import com.jocata.star.includeexculde.CLEARModules;
import com.jocata.star.includeexculde.GridModules;
import com.jocata.star.includeexculde.STARModules;
import com.jocata.star.misreports.AddBenchMarkBenchMarkRun;
import com.jocata.star.misreports.AddReportCaseDetailsReport;
import com.jocata.star.misreports.AddReportDashboard;
import com.jocata.star.misreports.AddReportEventDetailsReport;
import com.jocata.star.misreports.AddReportRuleSummary;
import com.jocata.star.misreports.AddReportUserCaseDetailsReport;
import com.jocata.star.misreports.AddReportsBenchMark;
import com.jocata.star.reportsdownload.MisReportsDownload;
import com.jocata.star.reportsdownload.MisReportsDownload2;
import com.jocata.star.screens.CustomerDetailsProfile;
import com.jocata.star.screens.ExclusionList;
import com.jocata.star.screens.FalsePositiveManager;
import com.jocata.star.scripts.AddBenchMarkJocata;
import com.jocata.star.scripts.AddBenchMarkJocata2;
import com.jocata.star.scripts.AdvanceSearchJocataSe;
import com.jocata.star.scripts.CustomerFieldsJocata;
import com.jocata.star.scripts.NewCreateRuleJocata;
import com.jocata.star.scripts.NewCreateRuleJocata2;
import com.jocata.star.scripts.SimpleSearchJocata;
import com.jocata.star.scripts.StarCase7Jocata;
import com.jocata.star.scripts.StarCase8Jocata;
import com.jocata.star.scripts.StarNavigationJocata;
import com.jocata.star.workflow.WorkFLowActionsReassign;
import com.jocata.star.workflow.WorkFLowActionsReassign2;
import com.jocata.star.workflow.WorkFLowAndDispActions;
import com.jocata.star.workflow.WorkFLowAndDispActions2;
import com.jocata.star.workflow.WorkFLowFalsePositive;
import com.jocata.star.workflow.WorkFLowFalsePositive2;
import com.jocata.star.workflow.WorkFllowActionSuggestFalsePostive;
import com.jocata.star.workflow.WorkFlowActionsForWard;
import com.jocata.star.workflow.WorkFlowActionsForWard2;
import com.jocata.star.workflow.WorkFlowClose;
import com.jocata.star.workflow.WorkFlowClose2;
import com.jocata.star.workflow.WorkFlowRaiseSTR;
import com.jocata.star.workflow.WorkFlowRaiseSTR2;

public class AllStarNewSevenone2 {

	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		Class[] classes = new Class[] {
				//run this one
				
				

				// .............................StarTestScripts.............................................................//
				AddBenchMark_01.class,
				AdvanceSearchStar2.class,

				CustomerFieldsJocata.class, NewCreateRuleJocata2.class, SimpleSearchJocata.class, StarCase7Jocata.class,
				StarCase8Jocata.class, StarNavigationJocata.class,

				// ...............................WorkFlow Actions.............................................................//

				WorkFlowClose2.class, WorkFLowFalsePositive2.class, WorkFlowRaiseSTR2.class,
				WorkFlowActionsForWard2.class,
				// WorkFllowActionSuggestFalsePostive.class,
				AdddeleteRbl.class,
				WorkFLowAndDispActions2.class, WorkFLowActionsReassign2.class,

				// ...........................Add Reports.....................................................................//

				AddBenchMarkBenchMarkRun.class, AddReportCaseDetailsReport.class, AddReportDashboard.class,
				AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
				AddReportUserCaseDetailsReport.class,

				
				
				//...............................ReportsExport................................................................//
				
				
				UserDetailsReportExport.class,
				RuleSummereyReportExport.class,
				CaseDetailsReportExport.class,
				BenchmarksReportExport.class,
				BenchmarksRunReportExport.class,
				
				
				
				
				
				
				
				// .................................Exisiting Functionality.................................................//

				AddruleChangesFuctionaltiy.class,

				AddBenchMarkReportsChanges3.class, 

				// ......................................Screens............................................................//

				// CustomerDetailsProfile.class,
				// ExclusionList.class,
				// FalsePositiveManager.class,

				// ......................................ExportExcels.....................................................//
				CustomerPeerProfile2.class,
				// CustomerPeerProfile.class,

				DashboardTask.class, NetworkExportGraph.class, TrancastionRulePopUpExport.class,

				// ..........................................Grid ...........................................................//

				GridAddReport3.class,
				// GridAddReport2.class,
				ADDRolesModify.class, 
				
				//CLEARModules.class,
				GridModules.class,
				STARModules.class,
				
				
				//IncludingPermissions2.class,

				// ................................Reports Download...........................................................//

				//MisReportsDownload2.class,

		};
		testng.setTestClasses(classes);
		testng.addListener(tla);
		testng.run();
	}

}
