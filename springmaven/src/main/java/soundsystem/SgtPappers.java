/**
 * Copyright(c) 2013 ��Ȩ���У�����Զ�̽������� www.969300.com
 */
package soundsystem;

import org.springframework.stereotype.Component;

/**
 * ����˵����
 * 
 * @author ����
 * @Date 2017��5��23��
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
