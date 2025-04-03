
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
public class ImportOperationRejectedEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportOperationRejectedEventBuilder builder) {
        ImportOperationRejectedEvent importOperationRejectedEvent = builder.buildUnchecked();
        Assertions.assertThat(importOperationRejectedEvent).isInstanceOf(ImportOperationRejectedEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportOperationRejectedEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportOperationRejectedEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportOperationRejectedEvent value = ImportOperationRejectedEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportOperationRejectedEvent value = ImportOperationRejectedEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportOperationRejectedEventDataImpl());
    }
}
