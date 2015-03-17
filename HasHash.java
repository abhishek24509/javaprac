package com.abhishek.march.collections;

public class HasHash {
	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
     
	@Override
	public boolean equals(Object x){
		boolean status = false;
		if((x instanceof HasHash) && ((HasHash)x).getX()== this.getX()){
			return true;
		}
		return status;
	}
	@Override
	public int hashCode(){
		int hash;
		hash = this.x*17+this.x*19;
		return hash;
	}
	
	public static void main(String ... args){
		HasHash h1 = new HasHash();
		h1.setX(11);
		HasHash h2 = new HasHash();
		h2.setX(10);
		if(h2.equals(h1) || h1.hashCode()==h2.hashCode()){
			System.out.println("Maidan jeet lia");
		}
		System.out.println(h1.hashCode()+"    "+h2.hashCode());
	}
}
