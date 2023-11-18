package com.required;

import org.springframework.beans.factory.annotation.Required;
import java.util.List;




public class Honda {
	
	private int vno;
	private List<String> models;
	
	
	public int getVno() {
		return vno;
	}
	
	
	@Required
	
	public void setVno(int vno) {
		this.vno = vno;
	}
	
	public List<String> getModels() {
		return models;
	}
	
	@Required
	
	public void setModels(List<String> models) {
		this.models = models;
	}
	
	
	//toString Method
	@Override
	public String toString() {
		return "Honda [vno=" + vno + ", models=" + models + "]";
	}
	
	

}
