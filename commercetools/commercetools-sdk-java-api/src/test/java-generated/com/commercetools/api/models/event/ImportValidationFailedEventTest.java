
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
public class ImportValidationFailedEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportValidationFailedEventBuilder builder) {
        ImportValidationFailedEvent importValidationFailedEvent = builder.buildUnchecked();
        Assertions.assertThat(importValidationFailedEvent).isInstanceOf(ImportValidationFailedEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportValidationFailedEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportValidationFailedEvent.builder()
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
