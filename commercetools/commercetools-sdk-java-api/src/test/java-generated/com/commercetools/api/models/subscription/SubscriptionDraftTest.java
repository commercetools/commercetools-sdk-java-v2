
package com.commercetools.api.models.subscription;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubscriptionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SubscriptionDraftBuilder builder) {
        SubscriptionDraft subscriptionDraft = builder.buildUnchecked();
        Assertions.assertThat(subscriptionDraft).isInstanceOf(SubscriptionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "changes",
                        SubscriptionDraft.builder()
                                .changes(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.ChangeSubscriptionImpl())) },
                new Object[] { "destination",
                        SubscriptionDraft.builder()
                                .destination(new com.commercetools.api.models.subscription.DestinationImpl()) },
                new Object[] { "key", SubscriptionDraft.builder().key("key") },
                new Object[] { "messages",
                        SubscriptionDraft.builder()
                                .messages(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.MessageSubscriptionImpl())) },
                new Object[] { "events",
                        SubscriptionDraft.builder()
                                .events(Collections.singletonList(
                                    new com.commercetools.api.models.subscription.EventSubscriptionImpl())) },
                new Object[] { "format", SubscriptionDraft.builder()
                        .format(new com.commercetools.api.models.subscription.DeliveryFormatImpl()) } };
    }

    @Test
    public void changes() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setChanges(
            Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
        Assertions.assertThat(value.getChanges())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
    }

    @Test
    public void destination() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setDestination(new com.commercetools.api.models.subscription.DestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.subscription.DestinationImpl());
    }

    @Test
    public void key() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void messages() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
    }

    @Test
    public void events() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setEvents(
            Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
        Assertions.assertThat(value.getEvents())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
    }

    @Test
    public void format() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setFormat(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
        Assertions.assertThat(value.getFormat())
                .isEqualTo(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
    }
}
