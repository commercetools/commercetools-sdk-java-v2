
package com.commercetools.http.apachehttp;

import io.vrap.rmf.base.client.HttpClientSupplier;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SupplierTest {
    @Test
    public void testCreate() {
        Assertions.assertThat(HttpClientSupplier.of().get()).isInstanceOf(CtApacheHttpClient.class);
    }
}
