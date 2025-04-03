
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
public class ImportContainerDeletedEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerDeletedEventBuilder builder) {
        ImportContainerDeletedEvent importContainerDeletedEvent = builder.buildUnchecked();
        Assertions.assertThat(importContainerDeletedEvent).isInstanceOf(ImportContainerDeletedEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportContainerDeletedEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportContainerDeletedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportContainerDeletedEvent value = ImportContainerDeletedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportContainerDeletedEvent value = ImportContainerDeletedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportContainerDeletedEventDataImpl());
    }
}
