package com.jpsmoura.datamodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Represents a Mortage Applicant")
public class Applicant  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private java.lang.Integer creditScore;
    private java.lang.Integer income;
    private java.lang.String name;
    private java.lang.Integer ssn;

    public Applicant() {
    }

    public Applicant(java.lang.String name, java.lang.Integer ssn, java.lang.Integer income, java.lang.Integer creditScore) {
        this.name = name;
        this.ssn = ssn;
        this.income = income;
        this.creditScore = creditScore;
    }

    public java.lang.Integer getCreditScore() {
        return this.creditScore;
    }
    
    @ApiModelProperty(value = "The credit Score of the Applicant", required = true)
    public void setCreditScore(  java.lang.Integer creditScore ) {
        this.creditScore = creditScore;
    }
    
    public java.lang.Integer getIncome() {
        return this.income;
    }

    public void setIncome(  java.lang.Integer income ) {
        this.income = income;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(  java.lang.String name ) {
        this.name = name;
    }
    
    public java.lang.Integer getSsn() {
        return this.ssn;
    }

    public void setSsn(  java.lang.Integer ssn ) {
        this.ssn = ssn;
    }

	@Override
	public String toString()
	{
		return "Applicant [creditScore=" + creditScore + ", income=" + income + ", name=" + name + ", ssn=" + ssn + "]";
	}




}