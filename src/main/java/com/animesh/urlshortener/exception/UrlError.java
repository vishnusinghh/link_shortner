package com.animesh.urlshortener.exception;

public class UrlError {

	private String message;

	public UrlError(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
    public void vish(String str){
        int a=0;
    }

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UrlError [message=" + message + "]";
	}


}
