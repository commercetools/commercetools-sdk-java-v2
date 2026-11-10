
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerDeletedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerDeletedEventBuilder builder) {
        ImportContainerDeletedEvent importContainerDeletedEvent = builder.buildUnchecked();
        Assertions.assertThat(importContainerDeletedEvent).isInstanceOf(ImportContainerDeletedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportContainerDeletedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", ImportContainerDeletedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportContainerDeletedEvent value = ImportContainerDeletedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        ImportContainerDeletedEvent value = ImportContainerDeletedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl());
    }
}
