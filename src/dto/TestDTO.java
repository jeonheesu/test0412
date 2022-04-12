package dto;

public class TestDTO {

	
	private int tNum;
	private String tName;
	private String tID;
	private String tPW;
	private String tAddress;
	/**
	 * @return the tNum
	 */
	public int gettNum() {
		return tNum;
	}
	/**
	 * @param tNum the tNum to set
	 */
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	/**
	 * @return the tName
	 */
	public String gettName() {
		return tName;
	}
	/**
	 * @param tName the tName to set
	 */
	public void settName(String tName) {
		this.tName = tName;
	}
	/**
	 * @return the tID
	 */
	public String gettID() {
		return tID;
	}
	/**
	 * @param tID the tID to set
	 */
	public void settID(String tID) {
		this.tID = tID;
	}
	/**
	 * @return the tPW
	 */
	public String gettPW() {
		return tPW;
	}
	/**
	 * @param tPW the tPW to set
	 */
	public void settPW(String tPW) {
		this.tPW = tPW;
	}
	/**
	 * @return the tAddress
	 */
	public String gettAddress() {
		return tAddress;
	}
	/**
	 * @param tAddress the tAddress to set
	 */
	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}
	@Override
	public String toString() {
		return "TestDB [tNum=" + tNum + ", tName=" + tName + ", tID=" + tID + ", tPW=" + tPW + ", tAddress=" + tAddress
				+ "]";
	}
	
	
	
}
