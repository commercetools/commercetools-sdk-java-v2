
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
public class EventBridgeDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EventBridgeDestinationBuilder builder) {
        EventBridgeDestination eventBridgeDestination = builder.buildUnchecked();
        Assertions.assertThat(eventBridgeDestination).isInstanceOf(EventBridgeDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EventBridgeDestination.builder().region("region") },
                new Object[] { EventBridgeDestination.builder().accountId("accountId") } };
    }

    @Test
    public void region() {
        EventBridgeDestination value = EventBridgeDestination.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void accountId() {
        EventBridgeDestination value = EventBridgeDestination.of();
        value.setAccountId("accountId");
        Assertions.assertThat(value.getAccountId()).isEqualTo("accountId");
    }
}
