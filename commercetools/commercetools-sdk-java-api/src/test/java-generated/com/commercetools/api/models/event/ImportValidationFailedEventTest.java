
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportValidationFailedEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportValidationFailedEventBuilder builder) {
        ImportValidationFailedEvent importValidationFailedEvent = builder.buildUnchecked();
        Assertions.assertThat(importValidationFailedEvent).isInstanceOf(ImportValidationFailedEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportValidationFailedEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("import-api")) },
                new Object[] { "data", ImportValidationFailedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportValidationFailedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportValidationFailedEvent value = ImportValidationFailedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportValidationFailedEvent value = ImportValidationFailedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportValidationFailedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportValidationFailedEventDataImpl());
    }
}
