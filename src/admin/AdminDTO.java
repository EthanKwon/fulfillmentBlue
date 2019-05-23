package admin;

public class AdminDTO {
	private String iCode; //송장 번호(쇼핑몰, 운송사)
	private String pCode; //제품 번호
	private String sCode; //발주 코드(공급사)
	private String iDate; //송장 날짜
	private String sDate; //발주 날짜
	private String uName; //유저 이름(운송사이름)
	private String pName; //제품 이름
	private int iTotalPrice; //송장내 총 금액
	private int sTotalPrice; //발주물품 총 금액
	private int pQuantity; //재고 수량
	private int oQuantity; //송장 주문 수량
	private int sQuantity; //발주 수량
	private int pPrice; //제품가격
	private String iState;
	
	public AdminDTO() {}
	
	public AdminDTO(String iCode, String pCode, int oQuantity, int pPrice) {
		this.iCode = iCode;
		this.pCode = pCode;
		this.oQuantity = oQuantity;
		this.pPrice = pPrice;
	}

	public String getiCode() {
		return iCode;
	}

	public void setiCode(String iCode) {
		this.iCode = iCode;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public int getoQuantity() {
		return oQuantity;
	}

	public void setoQuantity(int oQuantity) {
		this.oQuantity = oQuantity;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getiDate() {
		return iDate;
	}

	public void setiDate(String iDate) {
		this.iDate = iDate.substring(0, 10);
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public int getiTotalPrice() {
		return iTotalPrice;
	}

	public void setiTotalPrice(int iTotalPrice) {
		this.iTotalPrice = iTotalPrice;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getsQuantity() {
		return sQuantity;
	}

	public void setsQuantity(int sQuantity) {
		this.sQuantity = sQuantity;
	}

	public String getsCode() {
		return sCode;
	}

	public void setsCode(String sCode) {
		this.sCode = sCode;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate.substring(0, 10);
	}

	public int getsTotalPrice() {
		return sTotalPrice;
	}

	public void setsTotalPrice(int sTotalPrice) {
		this.sTotalPrice = sTotalPrice;
	}

	public String getiState() {
		return iState;
	}

	public void setiState(int iState) {
		switch(iState) {
		case 1:
			this.iState = "승인 대기";
			break;
		case 3:
			this.iState = "재고 부족";
			break;
		default:
			this.iState = "오류";
			break;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iCode == null) ? 0 : iCode.hashCode());
		result = prime * result + ((iDate == null) ? 0 : iDate.hashCode());
		result = prime * result + ((iState == null) ? 0 : iState.hashCode());
		result = prime * result + iTotalPrice;
		result = prime * result + oQuantity;
		result = prime * result + ((pCode == null) ? 0 : pCode.hashCode());
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		result = prime * result + pPrice;
		result = prime * result + pQuantity;
		result = prime * result + ((sCode == null) ? 0 : sCode.hashCode());
		result = prime * result + ((sDate == null) ? 0 : sDate.hashCode());
		result = prime * result + sQuantity;
		result = prime * result + sTotalPrice;
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminDTO other = (AdminDTO) obj;
		if (iCode == null) {
			if (other.iCode != null)
				return false;
		} else if (!iCode.equals(other.iCode))
			return false;
		if (iDate == null) {
			if (other.iDate != null)
				return false;
		} else if (!iDate.equals(other.iDate))
			return false;
		if (iState == null) {
			if (other.iState != null)
				return false;
		} else if (!iState.equals(other.iState))
			return false;
		if (iTotalPrice != other.iTotalPrice)
			return false;
		if (oQuantity != other.oQuantity)
			return false;
		if (pCode == null) {
			if (other.pCode != null)
				return false;
		} else if (!pCode.equals(other.pCode))
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		if (pPrice != other.pPrice)
			return false;
		if (pQuantity != other.pQuantity)
			return false;
		if (sCode == null) {
			if (other.sCode != null)
				return false;
		} else if (!sCode.equals(other.sCode))
			return false;
		if (sDate == null) {
			if (other.sDate != null)
				return false;
		} else if (!sDate.equals(other.sDate))
			return false;
		if (sQuantity != other.sQuantity)
			return false;
		if (sTotalPrice != other.sTotalPrice)
			return false;
		if (uName == null) {
			if (other.uName != null)
				return false;
		} else if (!uName.equals(other.uName))
			return false;
		return true;
	}
	
	
	

}
