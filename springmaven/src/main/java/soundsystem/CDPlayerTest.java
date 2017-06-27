/**
 * Copyright(c) 2013 版权所有：广州远程教育中心 www.969300.com
 */
package soundsystem;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能说明：
 * 
 * @author 王城
 * @Date 2017年5月23日
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
