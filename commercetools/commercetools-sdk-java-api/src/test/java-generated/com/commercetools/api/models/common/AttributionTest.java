
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AttributionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AttributionBuilder builder) {
        Attribution attribution = builder.buildUnchecked();
        Assertions.assertThat(attribution).isInstanceOf(Attribution.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "clientId", Attribution.builder().clientId("clientId") },
                new Object[] { "source", Attribution.builder()
                        .source(com.commercetools.api.models.common.AttributionSource.findEnum("Import")) } };
    }

    @Test
    public void clientId() {
        Attribution value = Attribution.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void source() {
        Attribution value = Attribution.of();
        value.setSource(com.commercetools.api.models.common.AttributionSource.findEnum("Import"));
        Assertions.assertThat(value.getSource())
                .isEqualTo(com.commercetools.api.models.common.AttributionSource.findEnum("Import"));
    }
}
