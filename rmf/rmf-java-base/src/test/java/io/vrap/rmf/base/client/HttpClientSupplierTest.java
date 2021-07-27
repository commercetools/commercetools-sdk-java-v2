
package io.vrap.rmf.base.client;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HttpClientSupplierTest {
    @Test
    public void NoHttpClientSupplierFound() {
        Assertions.assertThatThrownBy(() -> {
            HttpClientSupplier.of().get();
        })
                .hasCauseInstanceOf(NoClassDefFoundError.class)
                .hasMessage(
                    "java.lang.NoClassDefFoundError: No io.vrap.rmf.base.client.HttpClientSupplier found. A dependency providing a compatible HTTP client may be missing e.g. commercetools-http-client.");
    }
}
