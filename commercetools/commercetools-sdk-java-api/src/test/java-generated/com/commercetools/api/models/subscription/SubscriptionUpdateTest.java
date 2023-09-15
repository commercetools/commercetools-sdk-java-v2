
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
public class SubscriptionUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionUpdateBuilder builder) {
        SubscriptionUpdate subscriptionUpdate = builder.buildUnchecked();
        Assertions.assertThat(subscriptionUpdate).isInstanceOf(SubscriptionUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionUpdate.builder().version(2L) },
                new Object[] { SubscriptionUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        SubscriptionUpdate value = SubscriptionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        SubscriptionUpdate value = SubscriptionUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.subscription.SubscriptionUpdateActionImpl()));
    }
}
