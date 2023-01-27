package methodChaining;

public class Sample {
	int val;
	public void show() {
		System.out.println(val);
	}
	public Sample setVal(int val) {
		this.val = val;
		return this;
		
	}
	public Sample incVal() {
		this.val++;
		return this;
		
	}
	

}

