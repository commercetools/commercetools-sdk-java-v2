
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
public class ImportWaitForMasterVariantEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportWaitForMasterVariantEventDataBuilder builder) {
        ImportWaitForMasterVariantEventData importWaitForMasterVariantEventData = builder.buildUnchecked();
        Assertions.assertThat(importWaitForMasterVariantEventData)
                .isInstanceOf(ImportWaitForMasterVariantEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportWaitForMasterVariantEventData.builder().id("id") },
                new Object[] { ImportWaitForMasterVariantEventData.builder().version(2) }, new Object[] {
                        ImportWaitForMasterVariantEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
