package cn.sxt.dynamicproxy;

import cn.sxt.service.UserService;
import cn.sxt.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		ProxyInovationHandler pih = new ProxyInovationHandler();
		pih.setTarget(userService);
		UserService proxy = (UserService)pih.getProxy();
		proxy.delete();
		//666
	}
}
