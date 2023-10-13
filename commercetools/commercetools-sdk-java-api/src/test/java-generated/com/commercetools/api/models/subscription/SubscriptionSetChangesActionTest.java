
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
public class SubscriptionSetChangesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SubscriptionSetChangesActionBuilder builder) {
        SubscriptionSetChangesAction subscriptionSetChangesAction = builder.buildUnchecked();
        Assertions.assertThat(subscriptionSetChangesAction).isInstanceOf(SubscriptionSetChangesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SubscriptionSetChangesAction.builder()
                .changes(Collections
                        .singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl())) } };
    }

    @Test
    public void changes() {
        SubscriptionSetChangesAction value = SubscriptionSetChangesAction.of();
        value.setChanges(
            Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
        Assertions.assertThat(value.getChanges())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.subscription.ChangeSubscriptionImpl()));
    }
}
