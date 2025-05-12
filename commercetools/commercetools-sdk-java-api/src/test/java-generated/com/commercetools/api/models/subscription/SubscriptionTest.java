
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionBuilder builder) {
        Subscription subscription = builder.buildUnchecked();
        Assertions.assertThat(subscription).isInstanceOf(Subscription.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Subscription.builder().id("id") },
                new Object[] { "version", Subscription.builder().version(2L) },
                new Object[] { "createdAt",
                        Subscription.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Subscription.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Subscription.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Subscription.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "destination",
                        Subscription.builder()
                                .destination(new com.commercetools.api.models.subscription.DestinationImpl()) },
                new Object[] { "key", Subscription.builder().key("key") },
                new Object[] { "messages",
                        Subscription.builder()
                                .messages(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.MessageSubscriptionImpl())) },
                new Object[] { "changes",
                        Subscription.builder()
                                .changes(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.ChangeSubscriptionImpl())) },
                new Object[] { "events",
                        Subscription.builder()
                                .events(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.EventSubscriptionImpl())) },
                new Object[] { "format",
                        Subscription.builder()
                                .format(new com.commercetools.api.models.subscription.DeliveryFormatImpl()) },
                new Object[] { "status", Subscription.builder()
                        .status(
                            com.commercetools.api.models.subscription.SubscriptionHealthStatus.findEnum("Healthy")) } };
    }

    @Test
    public void id() {
        Subscription value = Subscription.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Subscription value = Subscription.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Subscription value = Subscription.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Subscription value = Subscription.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Subscription value = Subscription.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Subscription value = Subscription.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void destination() {
        Subscription value = Subscription.of();
        value.setDestination(new com.commercetools.api.models.subscription.DestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.subscription.DestinationImpl());
    }

    @Test
    public void key() {
        Subscription value = Subscription.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void messages() {
        Subscription value = Subscription.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
    }

    @Test
    public void changes() {
        Subscription value = Subscription.of();
        value.setChanges(
            Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
        Assertions.assertThat(value.getChanges())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
    }

    @Test
    public void events() {
        Subscription value = Subscription.of();
        value.setEvents(
            Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
        Assertions.assertThat(value.getEvents())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
    }

    @Test
    public void format() {
        Subscription value = Subscription.of();
        value.setFormat(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
        Assertions.assertThat(value.getFormat())
                .isEqualTo(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
    }

    @Test
    public void status() {
        Subscription value = Subscription.of();
        value.setStatus(com.commercetools.api.models.subscription.SubscriptionHealthStatus.findEnum("Healthy"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.subscription.SubscriptionHealthStatus.findEnum("Healthy"));
    }
}
