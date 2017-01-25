package com.jpsmoura.datamodel;

import org.apache.camel.Exchange;

public class MortageApplication  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
  
    private java.lang.Double apr;
    private java.lang.Integer mortgageAmount;
    private java.lang.Integer amortization;
    private java.lang.Integer downPayment;
    
    private Applicant applicant; 
    private Property property;
    
    public MortageApplication() {
    }

    public MortageApplication(Applicant applicant, Property property, Integer downPayment, Integer amortization, Integer mortgageAmount, Double apr) {
        this.applicant = applicant;
        this.property = property;
        this.downPayment = downPayment;
        this.amortization = amortization;
        this.mortgageAmount = mortgageAmount;
        this.apr = apr;
    }


    
  

    
    public java.lang.Double getApr() {
        return this.apr;
    }

    public void setApr(  java.lang.Double apr ) {
        this.apr = apr;
    }
    
    public java.lang.Integer getMortgageAmount() {
        return this.mortgageAmount;
    }

    public void setMortgageAmount(  java.lang.Integer mortgageAmount ) {
        this.mortgageAmount = mortgageAmount;
    }
    
    public Applicant getApplicant() {
        return this.applicant;
    }

    public void setApplicant( Applicant applicant ) {
        this.applicant = applicant;
    }
    
    public java.lang.Integer getAmortization() {
        return this.amortization;
    }

    public void setAmortization(  java.lang.Integer amortization ) {
        this.amortization = amortization;
    }
    
    public java.lang.Integer getDownPayment() {
        return this.downPayment;
    }

    public void setDownPayment(  java.lang.Integer downPayment ) {
        this.downPayment = downPayment;
    }
    
    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property ) {
        this.property = property;
    }
    
    public void getMortageApplicationSample(Exchange exchange) {
    	MortageApplication mortage = new MortageApplication();
  		mortage.setApr(8.00);
  		mortage.setAmortization(30);
  		mortage.setDownPayment(4000);
  		mortage.setMortgageAmount(40000);
	    exchange.getIn().setBody(mortage);
    }
   

	@Override
	public String toString()
	{
		return "Application [apr=" + apr + ", mortgageAmount=" + mortgageAmount + ", applicant="
				+ applicant + ", amortization=" + amortization + ", downPayment=" + downPayment + ", property=" + property 
				 + "]";
	}




}