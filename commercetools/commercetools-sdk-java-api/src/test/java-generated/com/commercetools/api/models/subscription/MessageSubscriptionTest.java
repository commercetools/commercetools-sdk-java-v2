
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
public class MessageSubscriptionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MessageSubscriptionBuilder builder) {
        MessageSubscription messageSubscription = builder.buildUnchecked();
        Assertions.assertThat(messageSubscription).isInstanceOf(MessageSubscription.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MessageSubscription.builder()
                        .resourceTypeId(com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId
                                .findEnum("approval-flow")) },
                new Object[] { MessageSubscription.builder().types(Collections.singletonList("types")) } };
    }

    @Test
    public void resourceTypeId() {
        MessageSubscription value = MessageSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.subscription.MessageSubscriptionResourceTypeId
                        .findEnum("approval-flow"));
    }

    @Test
    public void types() {
        MessageSubscription value = MessageSubscription.of();
        value.setTypes(Collections.singletonList("types"));
        Assertions.assertThat(value.getTypes()).isEqualTo(Collections.singletonList("types"));
    }
}
