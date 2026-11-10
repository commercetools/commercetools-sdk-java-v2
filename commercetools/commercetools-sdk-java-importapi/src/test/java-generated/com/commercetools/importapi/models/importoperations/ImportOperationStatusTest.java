
package com.commercetools.importapi.models.importoperations;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportOperationStatusTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportOperationStatusBuilder builder) {
        ImportOperationStatus importOperationStatus = builder.buildUnchecked();
        Assertions.assertThat(importOperationStatus).isInstanceOf(ImportOperationStatus.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "operationId", ImportOperationStatus.builder().operationId("operationId") },
                new Object[] { "state",
                        ImportOperationStatus.builder()
                                .state(com.commercetools.importapi.models.importoperations.ImportOperationState
                                        .findEnum("processing")) },
                new Object[] { "errors",
                        ImportOperationStatus.builder()
                                .errors(Collections.singletonList(
                                    new com.commercetools.importapi.models.errors.ErrorObjectImpl())) } };
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
