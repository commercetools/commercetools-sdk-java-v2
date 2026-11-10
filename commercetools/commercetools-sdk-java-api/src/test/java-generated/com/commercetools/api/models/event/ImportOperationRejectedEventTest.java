
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportOperationRejectedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportOperationRejectedEventBuilder builder) {
        ImportOperationRejectedEvent importOperationRejectedEvent = builder.buildUnchecked();
        Assertions.assertThat(importOperationRejectedEvent).isInstanceOf(ImportOperationRejectedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportOperationRejectedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", ImportOperationRejectedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportOperationRejectedEvent value = ImportOperationRejectedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        ImportOperationRejectedEvent value = ImportOperationRejectedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl());
    }
}
