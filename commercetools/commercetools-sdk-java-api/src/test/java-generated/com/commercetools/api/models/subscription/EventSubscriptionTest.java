
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
public class EventSubscriptionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EventSubscriptionBuilder builder) {
        EventSubscription eventSubscription = builder.buildUnchecked();
        Assertions.assertThat(eventSubscription).isInstanceOf(EventSubscription.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { EventSubscription.builder()
                        .resourceTypeId(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { EventSubscription.builder()
                        .types(Collections.singletonList(com.commercetools.api.models.subscription.EventType
                                .findEnum("ImportContainerCreated"))) } };
    }

    @Test
    public void resourceTypeId() {
        EventSubscription value = EventSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void types() {
        EventSubscription value = EventSubscription.of();
        value.setTypes(Collections
                .singletonList(com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated")));
        Assertions.assertThat(value.getTypes())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.subscription.EventType.findEnum("ImportContainerCreated")));
    }
}
