/**
 * Copyright(c) 2013 版权所有：广州远程教育中心 www.969300.com
 */
package soundsystem;

import org.springframework.stereotype.Component;

/**
 * 功能说明：
 * 
 * @author 王城
 * @Date 2017年5月23日
 * @version 1.0
 *
 */
@Component("sgtPappersId")
public class SgtPappers implements CompactDisc {
	private String title = "titile";

	public void play() {
		System.out.println("this is " + title);
	}

}
