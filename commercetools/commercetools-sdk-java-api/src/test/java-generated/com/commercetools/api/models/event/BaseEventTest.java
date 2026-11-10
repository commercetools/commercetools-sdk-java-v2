
package com.commercetools.api.models.event;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BaseEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BaseEventBuilder builder) {
        BaseEvent baseEvent = builder.buildUnchecked();
        Assertions.assertThat(baseEvent).isInstanceOf(BaseEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", BaseEvent.builder().id("id") },
                new Object[] { "notificationType", BaseEvent.builder().notificationType("notificationType") },
                new Object[] { "resourceType",
                        BaseEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "type",
                        BaseEvent.builder()
                                .type(com.commercetools.api.models.subscription.EventType
                                        .findEnum("CheckoutOrderCreationFailed")) },
                new Object[] { "data", BaseEvent.builder().data("data") },
                new Object[] { "createdAt", BaseEvent.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        BaseEvent value = BaseEvent.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void notificationType() {
        BaseEvent value = BaseEvent.of();
        value.setNotificationType("notificationType");
        Assertions.assertThat(value.getNotificationType()).isEqualTo("notificationType");
    }

    @Test
    public void resourceType() {
        BaseEvent value = BaseEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void type() {
        BaseEvent value = BaseEvent.of();
        value.setType(com.commercetools.api.models.subscription.EventType.findEnum("CheckoutOrderCreationFailed"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.subscription.EventType.findEnum("CheckoutOrderCreationFailed"));
    }

    @Test
    public void data() {
        BaseEvent value = BaseEvent.of();
        value.setData("data");
        Assertions.assertThat(value.getData()).isEqualTo("data");
    }

    @Test
    public void createdAt() {
        BaseEvent value = BaseEvent.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
