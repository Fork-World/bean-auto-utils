package net.vergien.beanautoutils.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestExtendingBean
{
   @Test
   public void testExtendingBean()
   {
      ClassExtendingBase classExtendingBase = new ClassExtendingBase();
      classExtendingBase.setId(123);
      classExtendingBase.setName("Bean-Name");
      String toString = ClassExtendingBaseBeanUtil
            .doToString(classExtendingBase);
      assertThat(toString, containsString("[id=123, name=Bean-Name]"));
   }
}
