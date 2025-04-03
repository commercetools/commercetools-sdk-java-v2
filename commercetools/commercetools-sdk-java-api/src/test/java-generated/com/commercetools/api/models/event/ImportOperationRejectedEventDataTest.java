
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
public class ImportOperationRejectedEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportOperationRejectedEventDataBuilder builder) {
        ImportOperationRejectedEventData importOperationRejectedEventData = builder.buildUnchecked();
        Assertions.assertThat(importOperationRejectedEventData).isInstanceOf(ImportOperationRejectedEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportOperationRejectedEventData.builder().id("id") } };
    }

    @Test
    public void id() {
        ImportOperationRejectedEventData value = ImportOperationRejectedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
