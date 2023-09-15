
package com.commercetools.api.models.subscription;

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
public class SubscriptionChangeDestinationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionChangeDestinationActionBuilder builder) {
        SubscriptionChangeDestinationAction subscriptionChangeDestinationAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionChangeDestinationAction)
                .isInstanceOf(SubscriptionChangeDestinationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionChangeDestinationAction.builder()
                .destination(new com.commercetools.api.models.subscription.DestinationImpl()) } };
    }

    @Test
    public void destination() {
        SubscriptionChangeDestinationAction value = SubscriptionChangeDestinationAction.of();
        value.setDestination(new com.commercetools.api.models.subscription.DestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.subscription.DestinationImpl());
    }
}
