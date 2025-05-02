
package com.commercetools.api.models.subscription;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EventBridgeDestinationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EventBridgeDestinationBuilder builder) {
        EventBridgeDestination eventBridgeDestination = builder.buildUnchecked();
        Assertions.assertThat(eventBridgeDestination).isInstanceOf(EventBridgeDestination.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "region", EventBridgeDestination.builder().region("region") },
                new Object[] { "accountId", EventBridgeDestination.builder().accountId("accountId") },
                new Object[] { "source", EventBridgeDestination.builder().source("source") } };
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

    @Test
    public void source() {
        EventBridgeDestination value = EventBridgeDestination.of();
        value.setSource("source");
        Assertions.assertThat(value.getSource()).isEqualTo("source");
    }
}
