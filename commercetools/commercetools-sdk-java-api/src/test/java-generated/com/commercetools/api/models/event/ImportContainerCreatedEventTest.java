
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerCreatedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerCreatedEventBuilder builder) {
        ImportContainerCreatedEvent importContainerCreatedEvent = builder.buildUnchecked();
        Assertions.assertThat(importContainerCreatedEvent).isInstanceOf(ImportContainerCreatedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportContainerCreatedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("import-api")) },
                new Object[] { "data", ImportContainerCreatedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportContainerCreatedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportContainerCreatedEvent value = ImportContainerCreatedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportContainerCreatedEvent value = ImportContainerCreatedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportContainerCreatedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportContainerCreatedEventDataImpl());
    }
}
