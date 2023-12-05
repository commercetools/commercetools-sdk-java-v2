
package com.commercetools.importapi.models.importoperations;

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
public class ImportOperationStatusTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportOperationStatusBuilder builder) {
        ImportOperationStatus importOperationStatus = builder.buildUnchecked();
        Assertions.assertThat(importOperationStatus).isInstanceOf(ImportOperationStatus.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportOperationStatus.builder().operationId("operationId") },
                new Object[] { ImportOperationStatus.builder()
                        .state(com.commercetools.importapi.models.importoperations.ImportOperationState
                                .findEnum("processing")) },
                new Object[] { ImportOperationStatus.builder()
                        .errors(Collections
                                .singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl())) } };
    }

    @Test
    public void operationId() {
        ImportOperationStatus value = ImportOperationStatus.of();
        value.setOperationId("operationId");
        Assertions.assertThat(value.getOperationId()).isEqualTo("operationId");
    }

    @Test
    public void state() {
        ImportOperationStatus value = ImportOperationStatus.of();
        value.setState(com.commercetools.importapi.models.importoperations.ImportOperationState.findEnum("processing"));
        Assertions.assertThat(value.getState())
                .isEqualTo(
                    com.commercetools.importapi.models.importoperations.ImportOperationState.findEnum("processing"));
    }

    @Test
    public void errors() {
        ImportOperationStatus value = ImportOperationStatus.of();
        value.setErrors(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
    }
}
