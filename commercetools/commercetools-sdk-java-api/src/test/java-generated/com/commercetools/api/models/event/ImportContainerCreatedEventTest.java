
package com.commercetools.api.models.event;

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
public class ImportContainerCreatedEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerCreatedEventBuilder builder) {
        ImportContainerCreatedEvent importContainerCreatedEvent = builder.buildUnchecked();
        Assertions.assertThat(importContainerCreatedEvent).isInstanceOf(ImportContainerCreatedEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportContainerCreatedEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportContainerCreatedEvent.builder()
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
