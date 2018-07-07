package cloud.bastis.javaeight;

import org.junit.Assert;
import org.junit.Test;

public class JavaEightTest {

    @Test
    public void testCreation() {
        FileTools ft = new FileTools();
        Assert.assertNotNull(ft);
    }
}
