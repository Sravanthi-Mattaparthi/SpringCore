package com.singleton;

public class Honda {
	
	private int vno;
	private String vname;
	
	//setters and getters
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	//to String

    @Override
    public String toString() {
	return "Honda [vno=" + vno + ", vname=" + vname + "]";
    }
	
	

}
