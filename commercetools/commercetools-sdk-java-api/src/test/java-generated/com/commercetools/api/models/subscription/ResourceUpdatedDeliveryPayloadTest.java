
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceUpdatedDeliveryPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceUpdatedDeliveryPayloadBuilder builder) {
        ResourceUpdatedDeliveryPayload resourceUpdatedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceUpdatedDeliveryPayload).isInstanceOf(ResourceUpdatedDeliveryPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ResourceUpdatedDeliveryPayload.builder().version(2L) },
                new Object[] { "oldVersion", ResourceUpdatedDeliveryPayload.builder().oldVersion(3L) },
                new Object[] { "modifiedAt", ResourceUpdatedDeliveryPayload.builder()
                        .modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void version() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void oldVersion() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setOldVersion(3L);
        Assertions.assertThat(value.getOldVersion()).isEqualTo(3L);
    }

    @Test
    public void modifiedAt() {
        ResourceUpdatedDeliveryPayload value = ResourceUpdatedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
