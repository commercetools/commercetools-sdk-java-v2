
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportWaitForMasterVariantEventTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportWaitForMasterVariantEventBuilder builder) {
        ImportWaitForMasterVariantEvent importWaitForMasterVariantEvent = builder.buildUnchecked();
        Assertions.assertThat(importWaitForMasterVariantEvent).isInstanceOf(ImportWaitForMasterVariantEvent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "resourceType",
                        ImportWaitForMasterVariantEvent.builder()
                                .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                        .findEnum("checkout")) },
                new Object[] { "data", ImportWaitForMasterVariantEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportWaitForMasterVariantEvent value = ImportWaitForMasterVariantEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("checkout"));
    }

    @Test
    public void data() {
        ImportWaitForMasterVariantEvent value = ImportWaitForMasterVariantEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl());
    }
}
