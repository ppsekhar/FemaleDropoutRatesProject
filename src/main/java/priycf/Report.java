package priycf;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Priyanka Sekhar
 *
 */
public class Report {

	Long Id;

	@NotNull
	@Size(min = 2, max = 30)
	String ReportName;

	@NotNull
	String Date;

	@NotNull
	@Size(min = 2, max = 30)
	String Country;

	String StateProvice;

	String City;

	@NotNull
	@Size(min = 2, max = 30)
	String SchoolName;

	@NotNull
	@Size(min = 1, max = 30)
	String YearlyDropOutNumber;

	@NotNull
	@Size(min = 1, max = 30)
	String GradeLevel;

	@Size(min = 2, max = 19)
	String AgeRange;

	@Size(min = 2, max = 30)
	String Reason;

	@Size(min = 2, max = 30)
	String DropOutContactInfo;

	@Size(min = 2, max = 30)
	String ReportingPersonContact;

	public String getReportName() {
		return ReportName;
	}

	public void setReportName(String reportName) {
		ReportName = reportName;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getStateProvice() {
		return StateProvice;
	}

	public void setStateProvice(String stateProvice) {
		StateProvice = stateProvice;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getYearlyDropOutNumber() {
		return YearlyDropOutNumber;
	}

	public void setYearlyDropOutNumber(String yearlyDropOutNumber) {
		YearlyDropOutNumber = yearlyDropOutNumber;
	}

	public String getGradeLevel() {
		return GradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		GradeLevel = gradeLevel;
	}

	public String getAgeRange() {
		return AgeRange;
	}

	public void setAgeRange(String ageRange) {
		AgeRange = ageRange;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getDropOutContactInfo() {
		return DropOutContactInfo;
	}

	public void setDropOutContactInfo(String dropOutContactInfo) {
		DropOutContactInfo = dropOutContactInfo;
	}

	public String getReportingPersonContact() {
		return ReportingPersonContact;
	}

	public void setReportingPersonContact(String reportingPersonContact) {
		ReportingPersonContact = reportingPersonContact;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
