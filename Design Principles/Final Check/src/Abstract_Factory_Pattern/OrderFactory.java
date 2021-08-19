package Abstract_Factory_Pattern;

public class OrderFactory {
	public static Order buildOrder(ProductType productType, Channel channel)
	{
		switch (channel) {
		case ECOMMERCE:
			return new EcomOrderFactory().buildOrder(productType);
		case TELECALLER:
			return new TeleOrderFactory().buildOrder(productType);
	}
	return null;
	}
}
