
package com.commercetools.api.models.subscription;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SubscriptionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionDraftBuilder builder) {
        SubscriptionDraft subscriptionDraft = builder.buildUnchecked();
        Assertions.assertThat(subscriptionDraft).isInstanceOf(SubscriptionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SubscriptionDraft.builder()
                        .changes(Collections.singletonList(
                            new com.commercetools.api.models.subscription.ChangeSubscriptionImpl())) },
                new Object[] { SubscriptionDraft.builder()
                        .destination(new com.commercetools.api.models.subscription.DestinationImpl()) },
                new Object[] { SubscriptionDraft.builder().key("key") },
                new Object[] { SubscriptionDraft.builder()
                        .messages(Collections.singletonList(
                            new com.commercetools.api.models.subscription.MessageSubscriptionImpl())) },
                new Object[] { SubscriptionDraft.builder()
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
    public void format() {
        SubscriptionDraft value = SubscriptionDraft.of();
        value.setFormat(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
        Assertions.assertThat(value.getFormat())
                .isEqualTo(new com.commercetools.api.models.subscription.DeliveryFormatImpl());
    }
}
