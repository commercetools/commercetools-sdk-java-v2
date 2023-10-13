
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

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
public class ImportResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportResponseBuilder builder) {
        ImportResponse importResponse = builder.buildUnchecked();
        Assertions.assertThat(importResponse).isInstanceOf(ImportResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportResponse.builder()
                .operationStatus(Collections.singletonList(
                    new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl())) } };
    }

    @Test
    public void operationStatus() {
        ImportResponse value = ImportResponse.of();
        value.setOperationStatus(Collections
                .singletonList(new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl()));
        Assertions.assertThat(value.getOperationStatus())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.importoperations.ImportOperationStatusImpl()));
    }
}
