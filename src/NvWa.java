
public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		System.out.println(">>>造白种人");
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println(">>>造黑种人");
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println(">>>造黄钟人");
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
