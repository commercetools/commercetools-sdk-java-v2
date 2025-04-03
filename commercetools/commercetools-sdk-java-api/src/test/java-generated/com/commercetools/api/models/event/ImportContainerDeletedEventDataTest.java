
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
public class ImportContainerDeletedEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerDeletedEventDataBuilder builder) {
        ImportContainerDeletedEventData importContainerDeletedEventData = builder.buildUnchecked();
        Assertions.assertThat(importContainerDeletedEventData).isInstanceOf(ImportContainerDeletedEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainerDeletedEventData.builder().key("key") },
                new Object[] { ImportContainerDeletedEventData.builder().version(2) } };
    }

    @Test
    public void key() {
        ImportContainerDeletedEventData value = ImportContainerDeletedEventData.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        ImportContainerDeletedEventData value = ImportContainerDeletedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }
}
