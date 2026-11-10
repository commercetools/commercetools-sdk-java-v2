
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceCreatedDeliveryPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceCreatedDeliveryPayloadBuilder builder) {
        ResourceCreatedDeliveryPayload resourceCreatedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceCreatedDeliveryPayload).isInstanceOf(ResourceCreatedDeliveryPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ResourceCreatedDeliveryPayload.builder().version(2L) },
                new Object[] { "modifiedAt", ResourceCreatedDeliveryPayload.builder()
                        .modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void version() {
        ResourceCreatedDeliveryPayload value = ResourceCreatedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void modifiedAt() {
        ResourceCreatedDeliveryPayload value = ResourceCreatedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
