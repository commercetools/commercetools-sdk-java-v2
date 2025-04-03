
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
public class SubscriptionSetEventsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionSetEventsActionBuilder builder) {
        SubscriptionSetEventsAction subscriptionSetEventsAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetEventsAction).isInstanceOf(SubscriptionSetEventsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionSetEventsAction.builder()
                .messages(Collections
                        .singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl())) } };
    }

    @Test
    public void messages() {
        SubscriptionSetEventsAction value = SubscriptionSetEventsAction.of();
        value.setMessages(
            Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
        Assertions.assertThat(value.getMessages())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.EventSubscriptionImpl()));
    }
}
