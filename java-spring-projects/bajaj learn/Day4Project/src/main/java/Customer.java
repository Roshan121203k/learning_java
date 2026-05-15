
public class Customer {
	   
	public Customer(int custId, String custName, String custAddress, long custMobileNumber, BillBookEntity billRecord) {
		super();
		this.custId = custId;
		CustName = custName;
		this.custAddress = custAddress;
		this.custMobileNumber = custMobileNumber;
		this.billRecord = billRecord;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public long getCustMobileNumber() {
		return custMobileNumber;
	}
	public void setCustMobileNumber(long custMobileNumber) {
		this.custMobileNumber = custMobileNumber;
	}
	public BillBookEntity getBillRecord() {
		return billRecord;
	}
	public void setBillRecord(BillBookEntity billRecord) {
		this.billRecord = billRecord;
	}
	
}
