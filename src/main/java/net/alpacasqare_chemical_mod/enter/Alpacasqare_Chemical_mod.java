package net.alpacasqare_chemical_mod.enter;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Alpacasqare_Chemical_mod implements ModInitializer {

	Alpacasqare_Chemical_mod ACM1;//调用构造方法
	public static final Logger LOGGER = LogManager.getLogger("alpacasqare_chemical_mod");

	public Alpacasqare_Chemical_mod(){
		RegisterItemAll RIA1 = new RegisterItemAll();//调用RegisterItemAll类构造方法
		ACM1=null;
	}


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Chemistry world!");//显示加载已成功
	}
}
