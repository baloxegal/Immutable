
final class Currency {
    private String baseCode;
    private String code;
    private Float value;
    private String date;
	
    private Currency(String baseCode, String code, Float value, String date) {
		super();
		this.baseCode = baseCode;
		this.code = code;
		this.value = value;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Currency [baseCode=" + baseCode + ", code=" + code + ", value=" + value + ", date=" + date + "]";
	}

	public String getBaseCode() {
		return baseCode;
	}

	public Currency setBaseCode(String baseCode) throws CloneNotSupportedException {
		Currency clone = (Currency) this.clone();
		clone.baseCode = baseCode;
		return clone;
	}

	public String getCode() {
		return code;
	}

	public Currency setCode(String code) throws CloneNotSupportedException {
		Currency clone = (Currency) this.clone();
		clone.code = code;
		return clone;
	}

	public Float getValue() {
		return value;
	}

	public Currency setValue(Float value) throws CloneNotSupportedException {
		Currency clone = (Currency) this.clone();
		clone.value = value;
		return clone;
	}

	public String getDate() {
		return date;
	}

	public Currency setDate(String date) throws CloneNotSupportedException {
		Currency clone = (Currency) this.clone();
		clone.date = date;
		return clone;
	}
}