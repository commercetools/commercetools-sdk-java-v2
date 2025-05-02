
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MessageDeliveryPayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MessageDeliveryPayloadBuilder builder) {
        MessageDeliveryPayload messageDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(messageDeliveryPayload).isInstanceOf(MessageDeliveryPayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", MessageDeliveryPayload.builder().id("id") },
                new Object[] { "version", MessageDeliveryPayload.builder().version(2L) },
                new Object[] { "createdAt",
                        MessageDeliveryPayload.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        MessageDeliveryPayload.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "sequenceNumber", MessageDeliveryPayload.builder().sequenceNumber(2L) },
                new Object[] { "resourceVersion", MessageDeliveryPayload.builder().resourceVersion(9L) },
                new Object[] { "payloadNotIncluded", MessageDeliveryPayload.builder()
                        .payloadNotIncluded(new com.commercetools.api.models.subscription.PayloadNotIncludedImpl()) } };
    }

    @Test
    public void id() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void sequenceNumber() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setSequenceNumber(2L);
        Assertions.assertThat(value.getSequenceNumber()).isEqualTo(2L);
    }

    @Test
    public void resourceVersion() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setResourceVersion(9L);
        Assertions.assertThat(value.getResourceVersion()).isEqualTo(9L);
    }

    @Test
    public void payloadNotIncluded() {
        MessageDeliveryPayload value = MessageDeliveryPayload.of();
        value.setPayloadNotIncluded(new com.commercetools.api.models.subscription.PayloadNotIncludedImpl());
        Assertions.assertThat(value.getPayloadNotIncluded())
                .isEqualTo(new com.commercetools.api.models.subscription.PayloadNotIncludedImpl());
    }
}
