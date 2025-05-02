
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceDeletedDeliveryPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceDeletedDeliveryPayloadBuilder builder) {
        ResourceDeletedDeliveryPayload resourceDeletedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceDeletedDeliveryPayload).isInstanceOf(ResourceDeletedDeliveryPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ResourceDeletedDeliveryPayload.builder().version(2L) },
                new Object[] { "modifiedAt",
                        ResourceDeletedDeliveryPayload.builder().modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "dataErasure", ResourceDeletedDeliveryPayload.builder().dataErasure(true) } };
    }

    @Test
    public void version() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void modifiedAt() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void dataErasure() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setDataErasure(true);
        Assertions.assertThat(value.getDataErasure()).isEqualTo(true);
    }
}
