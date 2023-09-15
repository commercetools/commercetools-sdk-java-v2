
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
public class ChangeSubscriptionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeSubscriptionBuilder builder) {
        ChangeSubscription changeSubscription = builder.buildUnchecked();
        Assertions.assertThat(changeSubscription).isInstanceOf(ChangeSubscription.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeSubscription.builder()
                .resourceTypeId(com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId
                        .findEnum("associate-role")) } };
    }

    @Test
    public void resourceTypeId() {
        ChangeSubscription value = ChangeSubscription.of();
        value.setResourceTypeId(
            com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId
                        .findEnum("associate-role"));
    }
}
