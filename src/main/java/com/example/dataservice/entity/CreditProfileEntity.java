package com.example.dataservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "creditprofile")
public class CreditProfileEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profileID;

    @Column(name = "FullName", nullable = false, length = 255)
    private String fullName;

    @Temporal(TemporalType.DATE)
    @Column(name = "DateOfBirth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "IdentityNumber", unique = true, nullable = false, length = 50)
    private String identityNumber;

    @Column(name = "PermanentAddress", length = 500)
    private String permanentAddress;

    @Column(name = "PhoneNumber", length = 50)
    private String phoneNumber;

    @Column(name = "Email", length = 100)
    private String email;

    @Column(name = "MonthlyIncome", precision = 20, scale = 2)
    private BigDecimal monthlyIncome;

    @Column(name = "IncomeSource", length = 255)
    private String incomeSource;

    @Column(name = "TotalAssets", precision = 20, scale = 2)
    private BigDecimal totalAssets;

    @Column(name = "TotalLiabilities", precision = 20, scale = 2)
    private BigDecimal totalLiabilities;

    @Column(name = "CurrentCreditCardsOrLoans")
    private Integer currentCreditCardsOrLoans;

    @Column(name = "CompanyName", length = 255)
    private String companyName;

    @Column(name = "Occupation", length = 255)
    private String occupation;

    @Column(name = "JobPosition", length = 100)
    private String jobPosition;

    @Column(name = "JobDurationInMonths")
    private Integer jobDurationInMonths;

    @Column(name = "GuarantorName", length = 255)
    private String guarantorName;

    @Column(name = "GuarantorRelationship", length = 50)
    private String guarantorRelationship;

    @Column(name = "GuarantorPhone", length = 50)
    private String guarantorPhone;

    @Column(name = "GuarantorEmail", length = 100)
    private String guarantorEmail;

    @Column(name = "PaymentDeadline")
    private Date paymentDeadline;

	public Integer getProfileID() {
		return profileID;
	}

	public void setProfileID(Integer profileID) {
		this.profileID = profileID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public BigDecimal getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}

	public BigDecimal getTotalLiabilities() {
		return totalLiabilities;
	}

	public void setTotalLiabilities(BigDecimal totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	public Integer getCurrentCreditCardsOrLoans() {
		return currentCreditCardsOrLoans;
	}

	public void setCurrentCreditCardsOrLoans(Integer currentCreditCardsOrLoans) {
		this.currentCreditCardsOrLoans = currentCreditCardsOrLoans;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Integer getJobDurationInMonths() {
		return jobDurationInMonths;
	}

	public void setJobDurationInMonths(Integer jobDurationInMonths) {
		this.jobDurationInMonths = jobDurationInMonths;
	}

	public String getGuarantorName() {
		return guarantorName;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

	public String getGuarantorRelationship() {
		return guarantorRelationship;
	}

	public void setGuarantorRelationship(String guarantorRelationship) {
		this.guarantorRelationship = guarantorRelationship;
	}

	public String getGuarantorPhone() {
		return guarantorPhone;
	}

	public void setGuarantorPhone(String guarantorPhone) {
		this.guarantorPhone = guarantorPhone;
	}

	public String getGuarantorEmail() {
		return guarantorEmail;
	}

	public void setGuarantorEmail(String guarantorEmail) {
		this.guarantorEmail = guarantorEmail;
	}

	public Date getPaymentDeadline() {
		return paymentDeadline;
	}

	public void setPaymentDeadline(Date paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}
    
    
}
