package com.org;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorCodes {

	 	private String statusCode;
	 	private String ErrorMessage;
	 	
	 	
		public ErrorCodes() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ErrorCodes(String statusCode, String errorMessage) {
			super();
			this.statusCode = statusCode;
			ErrorMessage = errorMessage;
		}
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		public String getErrorMessage() {
			return ErrorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			ErrorMessage = errorMessage;
		}
	 	
}
