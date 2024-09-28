package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(int miktar) {
		return (miktar *1.10);
	}
}
