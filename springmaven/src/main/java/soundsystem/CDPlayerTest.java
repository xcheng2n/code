/**
 * Copyright(c) 2013 ��Ȩ���У�����Զ�̽������� www.969300.com
 */
package soundsystem;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����˵����
 * 
 * @author ����
 * @Date 2017��5��23��
 * @version 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;

	// @Test
	public void cdShouldNOtBeNull() {
		Assert.assertNotNull(cd);
		cd.play();
	}
}
