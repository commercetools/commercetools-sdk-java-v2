
package commercetools;

import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void testException() {
        Assertions.assertThatExceptionOfType(NotFoundException.class)
                .isThrownBy(() -> CommercetoolsTestUtils.getProjectApiRoot()
                        .categories()
                        .withKey("unknown-category")
                        .get()
                        .executeBlocking());
    }
}
