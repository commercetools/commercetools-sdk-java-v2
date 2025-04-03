
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
public class ImportWaitForMasterVariantEventTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportWaitForMasterVariantEventBuilder builder) {
        ImportWaitForMasterVariantEvent importWaitForMasterVariantEvent = builder.buildUnchecked();
        Assertions.assertThat(importWaitForMasterVariantEvent).isInstanceOf(ImportWaitForMasterVariantEvent.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ImportWaitForMasterVariantEvent.builder()
                        .resourceType(com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId
                                .findEnum("import-api")) },
                new Object[] { ImportWaitForMasterVariantEvent.builder()
                        .data(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl()) } };
    }

    @Test
    public void resourceType() {
        ImportWaitForMasterVariantEvent value = ImportWaitForMasterVariantEvent.of();
        value.setResourceType(
            com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(
                    com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId.findEnum("import-api"));
    }

    @Test
    public void data() {
        ImportWaitForMasterVariantEvent value = ImportWaitForMasterVariantEvent.of();
        value.setData(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl());
        Assertions.assertThat(value.getData())
                .isEqualTo(new com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataImpl());
    }
}
