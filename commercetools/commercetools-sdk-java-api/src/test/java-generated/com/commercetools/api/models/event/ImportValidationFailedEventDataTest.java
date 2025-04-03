
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
public class ImportValidationFailedEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportValidationFailedEventDataBuilder builder) {
        ImportValidationFailedEventData importValidationFailedEventData = builder.buildUnchecked();
        Assertions.assertThat(importValidationFailedEventData).isInstanceOf(ImportValidationFailedEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportValidationFailedEventData.builder().id("id") },
                new Object[] { ImportValidationFailedEventData.builder().version(2) },
                new Object[] { ImportValidationFailedEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
