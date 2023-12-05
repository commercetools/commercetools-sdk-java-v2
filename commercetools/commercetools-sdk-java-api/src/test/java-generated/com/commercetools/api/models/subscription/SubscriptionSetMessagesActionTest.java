
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
public class SubscriptionSetMessagesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionSetMessagesActionBuilder builder) {
        SubscriptionSetMessagesAction subscriptionSetMessagesAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetMessagesAction).isInstanceOf(SubscriptionSetMessagesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionSetMessagesAction.builder()
                .messages(Collections
                        .singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl())) } };
    }

    @Test
    public void messages() {
        SubscriptionSetMessagesAction value = SubscriptionSetMessagesAction.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.MessageSubscriptionImpl()));
    }
}
